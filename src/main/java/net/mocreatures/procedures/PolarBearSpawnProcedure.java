package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.PolarBearEntity;

public class PolarBearSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof PolarBearEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(PolarBearEntity.DATA_Baby, true);
         }
      }
   }
}
