package net.mocreatures.procedures;

import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.WyvernEntity;

public class WyvernOnInitialEntitySpawnProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof WyvernEntity _datEntSetI) {
            _datEntSetI.getEntityData().set(WyvernEntity.DATA_WyvernVariant, Mth.nextInt(RandomSource.create(), 1, 9));
         }
      }
   }
}
