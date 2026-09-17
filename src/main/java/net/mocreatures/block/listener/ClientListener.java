package net.mocreatures.block.listener;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.mocreatures.block.renderer.FireflyJarTileRenderer;
import net.mocreatures.block.renderer.HangingFireflyJarTileRenderer;
import net.mocreatures.init.MocreaturesModBlockEntities;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;

@EventBusSubscriber(modid = "mocreatures", value = Dist.CLIENT, bus = Bus.MOD)
public class ClientListener {
   @OnlyIn(Dist.CLIENT)
   @SubscribeEvent
   public static void registerRenderers(RegisterRenderers event) {
      event.registerBlockEntityRenderer((BlockEntityType)MocreaturesModBlockEntities.FIREFLY_JAR.get(), context -> new FireflyJarTileRenderer());
      event.registerBlockEntityRenderer((BlockEntityType)MocreaturesModBlockEntities.HANGING_FIREFLY_JAR.get(), context -> new HangingFireflyJarTileRenderer());
   }
}
