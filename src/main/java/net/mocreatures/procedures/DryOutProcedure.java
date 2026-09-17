package net.mocreatures.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.MocreaturesMod;

public class DryOutProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         MocreaturesMod.queueServerWork(150, () -> {
            if (!entity.isInWater()) {
               entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.DRY_OUT)), 1.0F);
            }
         });
      }
   }
}
