package net.mocreatures.procedures;

import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.HorseEntity;

public class HorseOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (Math.random() < 0.9) {
            if (entity instanceof HorseEntity _datEntSetI) {
               _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, Mth.nextInt(RandomSource.create(), 1, 3));
            }
         } else if (entity instanceof HorseEntity _datEntSetI) {
            _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 100);
         }
      }
   }
}
