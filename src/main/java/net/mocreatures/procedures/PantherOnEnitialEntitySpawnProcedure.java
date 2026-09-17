package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.PantherEntity;

public class PantherOnEnitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.3 && entity instanceof PantherEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(PantherEntity.DATA_Baby, true);
         }
      }
   }
}
