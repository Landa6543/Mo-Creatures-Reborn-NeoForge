package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.FrostScorpionEntity;

public class FrostScorpionSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() <= 0.5
            && !(entity instanceof FrostScorpionEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(FrostScorpionEntity.DATA_Baby))
            && entity instanceof FrostScorpionEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(FrostScorpionEntity.DATA_Larva, true);
         }
      }
   }
}
