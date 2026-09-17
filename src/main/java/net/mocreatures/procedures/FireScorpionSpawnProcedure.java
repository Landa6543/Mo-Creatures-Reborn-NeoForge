package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.FireScorpionEntity;

public class FireScorpionSpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() <= 0.5
            && !(entity instanceof FireScorpionEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(FireScorpionEntity.DATA_Baby))
            && entity instanceof FireScorpionEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(FireScorpionEntity.DATA_Larva, true);
         }
      }
   }
}
