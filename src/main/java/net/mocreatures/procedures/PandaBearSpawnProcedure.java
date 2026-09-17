package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.PandaBearEntity;

public class PandaBearSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof PandaBearEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(PandaBearEntity.DATA_Baby, true);
         }
      }
   }
}
