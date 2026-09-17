package net.mocreatures.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.MandarinfishEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

public class MandarinfishBabyProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         MocreaturesMod.queueServerWork(150, () -> {
            if (!entity.isInWater()) {
               entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.DRY_OUT)), 1.0F);
            }
         });
         if (entity instanceof MandarinfishEntity _datEntL4 && (Boolean)_datEntL4.getEntityData().get(MandarinfishEntity.DATA_Baby)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 0.3));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 0.3));
         }

         if (!(entity instanceof MandarinfishEntity _datEntL7 && (Boolean)_datEntL7.getEntityData().get(MandarinfishEntity.DATA_Baby))) {
            for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
               type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
               type.getScaleData(entity).resetScale();
            }
         }
      }
   }
}
