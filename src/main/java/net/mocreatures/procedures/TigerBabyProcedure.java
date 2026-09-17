package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.entity.TigerEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleTypes;

public class TigerBabyProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof TigerEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(TigerEntity.DATA_Baby)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 0.6));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 0.6));
         }

         if (!(entity instanceof TigerEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(TigerEntity.DATA_Baby))) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 1.0));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 1.0));
         }

         if (entity.isVehicle()) {
            if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
               _livingEntity7.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.2);
            }
         } else if (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
            _livingEntity8.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.3);
         }

         if (entity.getPersistentData().getDouble("VerticalMovement") == 1.0) {
            entity.setDeltaMovement(new Vec3(entity.getLookAngle().x, 0.3, entity.getLookAngle().z));
         } else if (entity.getPersistentData().getDouble("VerticalMovement") == -1.0) {
            entity.setDeltaMovement(new Vec3(entity.getDeltaMovement().x(), -0.3, entity.getDeltaMovement().z()));
         }

         if (entity.getPersistentData().getDouble("VerticalMovement") == 1.0 && !entity.isVehicle()) {
            entity.getPersistentData().putDouble("VerticalMovement", 0.0);
         }
      }
   }
}
