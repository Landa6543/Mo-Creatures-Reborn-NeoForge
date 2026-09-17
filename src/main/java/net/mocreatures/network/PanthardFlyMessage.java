package net.mocreatures.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload.Type;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.procedures.PanthardFlyOnKeyPressedProcedure;
import net.mocreatures.procedures.PanthardFlyOnKeyReleasedProcedure;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

@EventBusSubscriber(bus = Bus.MOD)
public record PanthardFlyMessage(int eventType, int pressedms) implements CustomPacketPayload {
   public static final Type<PanthardFlyMessage> TYPE = new Type(ResourceLocation.fromNamespaceAndPath("mocreatures", "key_panthard_fly"));
   public static final StreamCodec<RegistryFriendlyByteBuf, PanthardFlyMessage> STREAM_CODEC = StreamCodec.of((buffer, message) -> {
      buffer.writeInt(message.eventType);
      buffer.writeInt(message.pressedms);
   }, buffer -> new PanthardFlyMessage(buffer.readInt(), buffer.readInt()));

   public Type<PanthardFlyMessage> type() {
      return TYPE;
   }

   public static void handleData(PanthardFlyMessage message, IPayloadContext context) {
      if (context.flow() == PacketFlow.SERVERBOUND) {
         context.enqueueWork(() -> pressAction(context.player(), message.eventType, message.pressedms)).exceptionally(e -> {
            context.connection().disconnect(Component.literal(e.getMessage()));
            return null;
         });
      }
   }

   public static void pressAction(Player entity, int type, int pressedms) {
      Level world = entity.level();
      double x = entity.getX();
      double y = entity.getY();
      double z = entity.getZ();
      if (world.hasChunkAt(entity.blockPosition())) {
         if (type == 0) {
            PanthardFlyOnKeyPressedProcedure.execute(world, x, y, z, entity);
         }

         if (type == 1) {
            PanthardFlyOnKeyReleasedProcedure.execute(entity);
         }
      }
   }

   @SubscribeEvent
   public static void registerMessage(FMLCommonSetupEvent event) {
      MocreaturesMod.addNetworkMessage(TYPE, STREAM_CODEC, PanthardFlyMessage::handleData);
   }
}
