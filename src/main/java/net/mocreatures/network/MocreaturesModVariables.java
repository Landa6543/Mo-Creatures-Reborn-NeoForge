package net.mocreatures.network;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.saveddata.SavedData.Factory;
import net.mocreatures.MocreaturesMod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerChangedDimensionEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries.Keys;

@EventBusSubscriber(bus = Bus.MOD)
public class MocreaturesModVariables {
   public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(Keys.ATTACHMENT_TYPES, "mocreatures");

   @SubscribeEvent
   public static void init(FMLCommonSetupEvent event) {
      MocreaturesMod.addNetworkMessage(
         MocreaturesModVariables.SavedDataSyncMessage.TYPE,
         MocreaturesModVariables.SavedDataSyncMessage.STREAM_CODEC,
         MocreaturesModVariables.SavedDataSyncMessage::handleData
      );
   }

   @EventBusSubscriber
   public static class EventBusVariableHandlers {
      @SubscribeEvent
      public static void onPlayerLoggedIn(PlayerLoggedInEvent event) {
         if (event.getEntity() instanceof ServerPlayer player) {
            SavedData mapdata = MocreaturesModVariables.MapVariables.get(event.getEntity().level());
            SavedData worlddata = MocreaturesModVariables.WorldVariables.get(event.getEntity().level());
            if (mapdata != null) {
               PacketDistributor.sendToPlayer(player, new MocreaturesModVariables.SavedDataSyncMessage(0, mapdata), new CustomPacketPayload[0]);
            }

            if (worlddata != null) {
               PacketDistributor.sendToPlayer(player, new MocreaturesModVariables.SavedDataSyncMessage(1, worlddata), new CustomPacketPayload[0]);
            }
         }
      }

      @SubscribeEvent
      public static void onPlayerChangedDimension(PlayerChangedDimensionEvent event) {
         if (event.getEntity() instanceof ServerPlayer player) {
            SavedData worlddata = MocreaturesModVariables.WorldVariables.get(event.getEntity().level());
            if (worlddata != null) {
               PacketDistributor.sendToPlayer(player, new MocreaturesModVariables.SavedDataSyncMessage(1, worlddata), new CustomPacketPayload[0]);
            }
         }
      }
   }

   public static class MapVariables extends SavedData {
      public static final String DATA_NAME = "mocreatures_mapvars";
      public double Feed = 0.0;
      public double GrowUp = 0.0;
      public double Money = 0.0;
      public double Turkey = 0.0;
      public double Hatch = 0.0;
      public double WyvernLairSleepMessage = 0.0;
      public double WyvernVariant = 0.0;
      static MocreaturesModVariables.MapVariables clientSide = new MocreaturesModVariables.MapVariables();

      public static MocreaturesModVariables.MapVariables load(CompoundTag tag, Provider lookupProvider) {
         MocreaturesModVariables.MapVariables data = new MocreaturesModVariables.MapVariables();
         data.read(tag, lookupProvider);
         return data;
      }

      public void read(CompoundTag nbt, Provider lookupProvider) {
         this.Feed = nbt.getDouble("Feed");
         this.GrowUp = nbt.getDouble("GrowUp");
         this.Money = nbt.getDouble("Money");
         this.Turkey = nbt.getDouble("Turkey");
         this.Hatch = nbt.getDouble("Hatch");
         this.WyvernLairSleepMessage = nbt.getDouble("WyvernLairSleepMessage");
         this.WyvernVariant = nbt.getDouble("WyvernVariant");
      }

      public CompoundTag save(CompoundTag nbt, Provider lookupProvider) {
         nbt.putDouble("Feed", this.Feed);
         nbt.putDouble("GrowUp", this.GrowUp);
         nbt.putDouble("Money", this.Money);
         nbt.putDouble("Turkey", this.Turkey);
         nbt.putDouble("Hatch", this.Hatch);
         nbt.putDouble("WyvernLairSleepMessage", this.WyvernLairSleepMessage);
         nbt.putDouble("WyvernVariant", this.WyvernVariant);
         return nbt;
      }

      public void syncData(LevelAccessor world) {
         this.setDirty();
         if (world instanceof Level && !world.isClientSide()) {
            PacketDistributor.sendToAllPlayers(new MocreaturesModVariables.SavedDataSyncMessage(0, this), new CustomPacketPayload[0]);
         }
      }

      public static MocreaturesModVariables.MapVariables get(LevelAccessor world) {
         return world instanceof ServerLevelAccessor serverLevelAcc
            ? (MocreaturesModVariables.MapVariables)serverLevelAcc.getLevel()
               .getServer()
               .getLevel(Level.OVERWORLD)
               .getDataStorage()
               .computeIfAbsent(new SavedData.Factory<>(MocreaturesModVariables.MapVariables::new, MocreaturesModVariables.MapVariables::load), "mocreatures_mapvars")
            : clientSide;
      }
   }

   public record SavedDataSyncMessage(int dataType, SavedData data) implements CustomPacketPayload {
      public static final Type<MocreaturesModVariables.SavedDataSyncMessage> TYPE = new Type(
         ResourceLocation.fromNamespaceAndPath("mocreatures", "saved_data_sync")
      );
      public static final StreamCodec<RegistryFriendlyByteBuf, MocreaturesModVariables.SavedDataSyncMessage> STREAM_CODEC = StreamCodec.of(
         (buffer, message) -> {
            buffer.writeInt(message.dataType);
            if (message.data != null) {
               buffer.writeNbt(message.data.save(new CompoundTag(), buffer.registryAccess()));
            }
         }, buffer -> {
            int dataType = buffer.readInt();
            CompoundTag nbt = buffer.readNbt();
            SavedData data = null;
            if (nbt != null) {
               data = (SavedData)(dataType == 0 ? new MocreaturesModVariables.MapVariables() : new MocreaturesModVariables.WorldVariables());
               if (data instanceof MocreaturesModVariables.MapVariables mapVariables) {
                  mapVariables.read(nbt, buffer.registryAccess());
               } else if (data instanceof MocreaturesModVariables.WorldVariables worldVariables) {
                  worldVariables.read(nbt, buffer.registryAccess());
               }
            }

            return new MocreaturesModVariables.SavedDataSyncMessage(dataType, data);
         }
      );

      public Type<MocreaturesModVariables.SavedDataSyncMessage> type() {
         return TYPE;
      }

      public static void handleData(MocreaturesModVariables.SavedDataSyncMessage message, IPayloadContext context) {
         if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
            context.enqueueWork(
                  () -> {
                     if (message.dataType == 0) {
                        MocreaturesModVariables.MapVariables.clientSide
                           .read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
                     } else {
                        MocreaturesModVariables.WorldVariables.clientSide
                           .read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
                     }
                  }
               )
               .exceptionally(e -> {
                  context.connection().disconnect(Component.literal(e.getMessage()));
                  return null;
               });
         }
      }
   }

   public static class WorldVariables extends SavedData {
      public static final String DATA_NAME = "mocreatures_worldvars";
      static MocreaturesModVariables.WorldVariables clientSide = new MocreaturesModVariables.WorldVariables();

      public static MocreaturesModVariables.WorldVariables load(CompoundTag tag, Provider lookupProvider) {
         MocreaturesModVariables.WorldVariables data = new MocreaturesModVariables.WorldVariables();
         data.read(tag, lookupProvider);
         return data;
      }

      public void read(CompoundTag nbt, Provider lookupProvider) {
      }

      public CompoundTag save(CompoundTag nbt, Provider lookupProvider) {
         return nbt;
      }

      public void syncData(LevelAccessor world) {
         this.setDirty();
         if (world instanceof ServerLevel level) {
            PacketDistributor.sendToPlayersInDimension(level, new MocreaturesModVariables.SavedDataSyncMessage(1, this), new CustomPacketPayload[0]);
         }
      }

      public static MocreaturesModVariables.WorldVariables get(LevelAccessor world) {
         return world instanceof ServerLevel level
            ? (MocreaturesModVariables.WorldVariables)level.getDataStorage()
               .computeIfAbsent(new SavedData.Factory<>(MocreaturesModVariables.WorldVariables::new, MocreaturesModVariables.WorldVariables::load), "mocreatures_worldvars")
            : clientSide;
      }
   }
}
