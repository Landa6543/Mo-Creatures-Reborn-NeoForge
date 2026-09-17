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
import net.mocreatures.procedures.WyvernOstrichFlyOnKeyPressedProcedure;
import net.mocreatures.procedures.WyvernOstrichFlyOnKeyReleasedProcedure;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

@EventBusSubscriber(bus = Bus.MOD)
public record WyvernOstrichFlyMessage(int eventType, int pressedms) implements CustomPacketPayload {
   public static final Type<WyvernOstrichFlyMessage> TYPE = new Type(ResourceLocation.fromNamespaceAndPath("mocreatures", "key_wyvern_ostrich_fly"));
   public static final StreamCodec<RegistryFriendlyByteBuf, WyvernOstrichFlyMessage> STREAM_CODEC = StreamCodec.of((buffer, message) -> {
      buffer.writeInt(message.eventType);
      buffer.writeInt(message.pressedms);
   }, buffer -> new WyvernOstrichFlyMessage(buffer.readInt(), buffer.readInt()));

   public Type<WyvernOstrichFlyMessage> type() {
      return TYPE;
   }

   public static void handleData(WyvernOstrichFlyMessage message, IPayloadContext context) {
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
            WyvernOstrichFlyOnKeyPressedProcedure.execute(entity);
         }

         if (type == 1) {
            WyvernOstrichFlyOnKeyReleasedProcedure.execute(entity);
         }
      }
   }

   @SubscribeEvent
   public static void registerMessage(FMLCommonSetupEvent event) {
      MocreaturesMod.addNetworkMessage(TYPE, STREAM_CODEC, WyvernOstrichFlyMessage::handleData);
   }
}
