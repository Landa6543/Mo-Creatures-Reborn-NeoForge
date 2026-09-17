package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.OstrichEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

public class BrownOstrichBabyProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof OstrichEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(OstrichEntity.DATA_Baby)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 0.5));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 0.5));
         }

         if (!(entity instanceof OstrichEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(OstrichEntity.DATA_Baby))) {
            for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
               type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
               type.getScaleData(entity).resetScale();
            }
         }
      }
   }
}
