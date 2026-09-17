package net.mocreatures.network;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.MocreaturesMod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

@EventBusSubscriber(bus = Bus.MOD)
public record PetNameMessage(String name) implements CustomPacketPayload {
   public static final Type<PetNameMessage> TYPE = new Type(ResourceLocation.fromNamespaceAndPath("mocreatures", "pet_name"));
   public static final StreamCodec<RegistryFriendlyByteBuf, PetNameMessage> STREAM_CODEC = StreamCodec.composite(
      ByteBufCodecs.STRING_UTF8, PetNameMessage::name, PetNameMessage::new
   );

   public Type<PetNameMessage> type() {
      return TYPE;
   }

   public static void handleData(PetNameMessage var0, IPayloadContext var1) {
      if (var1.flow() == PacketFlow.SERVERBOUND) {
         var1.enqueueWork(() -> applyPetName(var1.player(), var0.name())).exceptionally(var1x -> {
            var1.connection().disconnect(Component.literal(var1x.getMessage()));
            return null;
         });
      }
   }

   public static void applyPetName(Player var0, String var1) {
      if (var0 instanceof ServerPlayer var2) {
         if (var1 != null) {
            String var3 = var1.trim();
            if (!var3.isEmpty()) {
               AbstractContainerMenu var4 = var2.containerMenu;
               double var5 = var2.getX();
               double var7 = var2.getY();
               double var9 = var2.getZ();
               if (var4 != null) {
                  try {
                     Field var11 = var4.getClass().getField("x");
                     Field var12 = var4.getClass().getField("y");
                     Field var13 = var4.getClass().getField("z");
                     var5 = var11.getInt(var4);
                     var7 = var12.getInt(var4);
                     var9 = var13.getInt(var4);
                  } catch (Exception var21) {
                  }

                  try {
                     Field var22 = var4.getClass().getField("guistate");
                     if (var22.get(null) instanceof Map var25) {
                        var25.put("text:Name", var3);
                     }
                  } catch (Exception var20) {
                  }
               }

               double var23 = var5;
               double var26 = var7;
               double var15 = var9;
               AABB var17 = AABB.ofSize(new Vec3(var23, var26, var15), 12.0, 12.0, 12.0);
               List<LivingEntity> var18 = var2.level().getEntitiesOfClass(LivingEntity.class, var17, var1x -> {
                  if (var1x == var2) {
                     return false;
                  } else {
                     return !(var1x instanceof TamableAnimal var2x) ? true : var2x.isTame() && var2x.isOwnedBy(var2);
                  }
               });
               LivingEntity var19 = var18.stream().min(Comparator.comparingDouble(var6 -> var6.distanceToSqr(var23, var26, var15))).orElse(null);
               if (var19 != null) {
                  var19.setCustomName(Component.literal(var3));
                  var19.setCustomNameVisible(true);
               }

               var2.closeContainer();
            }
         }
      }
   }

   @SubscribeEvent
   public static void registerMessage(FMLCommonSetupEvent var0) {
      MocreaturesMod.addNetworkMessage(TYPE, STREAM_CODEC, PetNameMessage::handleData);
   }
}
