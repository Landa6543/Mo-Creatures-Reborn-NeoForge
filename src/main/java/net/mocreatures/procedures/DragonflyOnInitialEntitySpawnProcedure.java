package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.DragonflyEntity;

public class DragonflyOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof DragonflyEntity animatable) {
            animatable.setTexture("dragonfly_blue");
         }

         if (Math.random() < 0.5 && entity instanceof DragonflyEntity animatable) {
            animatable.setTexture("dragonfly_cyan");
         }

         if (Math.random() < 0.5 && entity instanceof DragonflyEntity animatable) {
            animatable.setTexture("dragonfly_green");
         }

         if (Math.random() < 0.5 && entity instanceof DragonflyEntity animatable) {
            animatable.setTexture("dragonfly_red");
         }
      }
   }
}
