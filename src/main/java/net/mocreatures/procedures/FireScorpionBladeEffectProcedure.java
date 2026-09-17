package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;

public class FireScorpionBladeEffectProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         entity.igniteForSeconds(8.0F);
      }
   }
}
