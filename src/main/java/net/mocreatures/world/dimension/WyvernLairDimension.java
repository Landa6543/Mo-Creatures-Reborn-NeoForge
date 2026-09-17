package net.mocreatures.world.dimension;

import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.client.renderer.DimensionSpecialEffects.SkyType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.procedures.WyvernLairPlayerEntersDimensionProcedure;
import net.mocreatures.procedures.WyvernLairPlayerLeavesDimensionProcedure;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.RegisterDimensionSpecialEffectsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerChangedDimensionEvent;

@EventBusSubscriber
public class WyvernLairDimension {
   @SubscribeEvent
   public static void onPlayerChangedDimensionEvent(PlayerChangedDimensionEvent event) {
      Entity entity = event.getEntity();
      Level world = entity.level();
      double x = entity.getX();
      double y = entity.getY();
      double z = entity.getZ();
      if (event.getFrom() == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mocreatures:wyvern_lair"))) {
         WyvernLairPlayerLeavesDimensionProcedure.execute(entity);
      }

      if (event.getTo() == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mocreatures:wyvern_lair"))) {
         WyvernLairPlayerEntersDimensionProcedure.execute(world, entity);
      }
   }

   @EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
   public static class WyvernLairSpecialEffectsHandler {
      @SubscribeEvent
      public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
         DimensionSpecialEffects customEffect = new DimensionSpecialEffects(20.0F, true, SkyType.NONE, false, false) {
            public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
               return new Vec3(0.8784313725, 0.9490196078, 0.8039215686);
            }

            public boolean isFoggyAt(int x, int y) {
               return false;
            }
         };
         event.register(ResourceLocation.parse("mocreatures:wyvern_lair"), customEffect);
      }
   }
}
