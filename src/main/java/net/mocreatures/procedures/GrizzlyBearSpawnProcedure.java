package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.GrizzlyBearEntity;

public class GrizzlyBearSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof GrizzlyBearEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(GrizzlyBearEntity.DATA_Baby, true);
         }
      }
   }
}
