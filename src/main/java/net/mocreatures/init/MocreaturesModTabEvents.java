package net.mocreatures.init;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

@EventBusSubscriber(bus = Bus.MOD)
public class MocreaturesModTabEvents {
   @SubscribeEvent
   public static void buildContents(BuildCreativeModeTabContentsEvent var0) {
      if (var0.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
         for (DeferredHolder var2 : MocreaturesModItems.REGISTRY.getEntries()) {
            if (var2.getId().getPath().endsWith("_spawn_egg")) {
               var0.accept((ItemLike)var2.get());
            }
         }
      }
   }
}
