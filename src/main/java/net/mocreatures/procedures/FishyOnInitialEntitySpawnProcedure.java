package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.FishyEntity;

public class FishyOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 1.0 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_cyan");
         }

         if (Math.random() < 0.9 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_green");
         }

         if (Math.random() < 0.8 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_light_blue");
         }

         if (Math.random() < 0.7 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_lime");
         }

         if (Math.random() < 0.6 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_orange");
         }

         if (Math.random() < 0.5 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_purple");
         }

         if (Math.random() < 0.4 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_red");
         }

         if (Math.random() < 0.3 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_blue");
         }

         if (Math.random() < 0.2 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_striped");
         }

         if (Math.random() < 0.1 && entity instanceof FishyEntity animatable) {
            animatable.setTexture("fishy_yellow");
         }
      }
   }
}
