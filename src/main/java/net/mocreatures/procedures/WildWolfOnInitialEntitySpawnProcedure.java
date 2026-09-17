package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.WildWolfEntity;

public class WildWolfOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.2) {
            if (entity instanceof WildWolfEntity animatable) {
               animatable.setTexture("wild_wolf_black");
            }
         } else if (Math.random() < 0.3) {
            if (entity instanceof WildWolfEntity animatable) {
               animatable.setTexture("wild_wolf_bright");
            }
         } else if (Math.random() < 0.4) {
            if (entity instanceof WildWolfEntity animatable) {
               animatable.setTexture("wild_wolf_dark");
            }
         } else if (Math.random() < 0.5) {
            if (entity instanceof WildWolfEntity animatable) {
               animatable.setTexture("wild_wolf_timber");
            }
         } else if (Math.random() < 0.6 && entity instanceof WildWolfEntity animatable) {
            animatable.setTexture("wild_wolf_classic");
         }
      }
   }
}
