package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.mocreatures.entity.BoarEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

public class BoarOnEntityTickUpdateProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof BoarEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(BoarEntity.DATA_Baby)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 0.5));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 0.5));
         }

         if (!(entity instanceof BoarEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(BoarEntity.DATA_Baby))) {
            for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
               type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
               type.getScaleData(entity).resetScale();
            }
         }

         if (entity instanceof BoarEntity _datEntL5 && (Boolean)_datEntL5.getEntityData().get(BoarEntity.DATA_Baby) && entity instanceof BoarEntity animatable) {
            animatable.setTexture("boar_baby");
         }

         if (!(entity instanceof BoarEntity _datEntL7 && (Boolean)_datEntL7.getEntityData().get(BoarEntity.DATA_Baby))
            && entity instanceof BoarEntity animatable) {
            animatable.setTexture("boar");
         }

         if (entity instanceof LivingEntity _livEnt9 && _livEnt9.isBaby() && entity instanceof BoarEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(BoarEntity.DATA_Baby, true);
         }

         if (!(entity instanceof LivingEntity _livEnt11 && _livEnt11.isBaby()) && entity instanceof BoarEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(BoarEntity.DATA_Baby, false);
         }
      }
   }
}
