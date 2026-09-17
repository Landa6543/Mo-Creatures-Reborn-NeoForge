package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.LionEntity;

public class LionOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.5 && entity instanceof LionEntity _datEntSetI) {
            _datEntSetI.getEntityData().set(LionEntity.DATA_LionGender, 2);
         }

         if (Math.random() < 0.05 && entity instanceof LionEntity _datEntSetI) {
            _datEntSetI.getEntityData().set(LionEntity.DATA_LionColor, 2);
         }

         if (Math.random() < 0.3 && entity instanceof LionEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(LionEntity.DATA_Baby, true);
         }
      }
   }
}
