package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.DirtScorpionEntity;

public class DirtScorpionSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() <= 0.5
            && !(entity instanceof DirtScorpionEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(DirtScorpionEntity.DATA_Baby))
            && entity instanceof DirtScorpionEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(DirtScorpionEntity.DATA_Larva, true);
         }
      }
   }
}
