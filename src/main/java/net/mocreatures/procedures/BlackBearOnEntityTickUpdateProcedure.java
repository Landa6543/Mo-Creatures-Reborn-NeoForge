package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.mocreatures.entity.BlackBearEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

public class BlackBearOnEntityTickUpdateProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof BlackBearEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(BlackBearEntity.DATA_Baby)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 0.5));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 0.5));
         }

         if (!(entity instanceof BlackBearEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(BlackBearEntity.DATA_Baby))) {
            for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
               type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
               type.getScaleData(entity).resetScale();
            }
         }

         if (entity instanceof BlackBearEntity _datEntL5 && (Boolean)_datEntL5.getEntityData().get(BlackBearEntity.DATA_Sit)) {
            if (entity instanceof BlackBearEntity) {
               ((BlackBearEntity)entity).setAnimation("sit");
            }

            if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
               _livingEntity7.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.0);
            }
         }

         if (entity instanceof BlackBearEntity _datEntL8
            && (Boolean)_datEntL8.getEntityData().get(BlackBearEntity.DATA_Saddled)
            && entity instanceof BlackBearEntity animatable) {
            animatable.setTexture("bear_black");
         }
      }
   }
}
