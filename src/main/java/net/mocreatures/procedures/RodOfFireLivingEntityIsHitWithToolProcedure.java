package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;

public class RodOfFireLivingEntityIsHitWithToolProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         entity.igniteForSeconds(5.0F);
      }
   }
}
