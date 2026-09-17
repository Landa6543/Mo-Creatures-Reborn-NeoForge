package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.CaveScorpionEntity;

public class CaveScorpionSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() <= 0.5
            && !(entity instanceof CaveScorpionEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(CaveScorpionEntity.DATA_Baby))
            && entity instanceof CaveScorpionEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(CaveScorpionEntity.DATA_Larva, true);
         }
      }
   }
}
