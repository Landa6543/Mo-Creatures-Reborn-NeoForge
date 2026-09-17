package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.TigerEntity;

public class TigerOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.05 && entity instanceof TigerEntity _datEntSetI) {
            _datEntSetI.getEntityData().set(TigerEntity.DATA_Color, 2);
         }

         if (Math.random() < 0.3 && entity instanceof TigerEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(TigerEntity.DATA_Baby, true);
         }
      }
   }
}
