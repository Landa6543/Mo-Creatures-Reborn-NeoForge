package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.TurkeyEntity;

public class TurkeySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof TurkeyEntity animatable) {
            animatable.setTexture("turkeyfemale");
         }
      }
   }
}
