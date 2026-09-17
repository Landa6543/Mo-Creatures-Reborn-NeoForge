package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.ElephantEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleTypes;

public class ElephantBabyProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof ElephantEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(ElephantEntity.DATA_African)
            && entity instanceof ElephantEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(ElephantEntity.DATA_Asian, false);
         }

         if (entity instanceof ElephantEntity _datEntL2
            && (Boolean)_datEntL2.getEntityData().get(ElephantEntity.DATA_Asian)
            && entity instanceof ElephantEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(ElephantEntity.DATA_African, false);
         }

         if (entity instanceof ElephantEntity _datEntL4 && (Boolean)_datEntL4.getEntityData().get(ElephantEntity.DATA_African)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 1.2));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 1.2));
         }

         if (entity instanceof ElephantEntity _datEntL7 && (Boolean)_datEntL7.getEntityData().get(ElephantEntity.DATA_Songhua)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 1.2));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 1.2));
         }

         if (entity instanceof ElephantEntity _datEntL10 && (Boolean)_datEntL10.getEntityData().get(ElephantEntity.DATA_Woolly)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 1.4));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 1.4));
         }

         if (entity instanceof ElephantEntity _datEntL13 && (Boolean)_datEntL13.getEntityData().get(ElephantEntity.DATA_Baby)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 0.6));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 0.6));
         }
      }
   }
}
