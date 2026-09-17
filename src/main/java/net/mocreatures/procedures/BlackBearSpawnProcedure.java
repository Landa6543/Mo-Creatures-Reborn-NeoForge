package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.BlackBearEntity;

public class BlackBearSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof BlackBearEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(BlackBearEntity.DATA_Baby, true);
         }
      }
   }
}
