package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.CricketEntity;

public class CricketOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof CricketEntity animatable) {
            animatable.setTexture("cricket_light_brown");
         }
      }
   }
}
