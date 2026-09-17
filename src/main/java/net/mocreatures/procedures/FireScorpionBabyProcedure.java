package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.FireScorpionEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

public class FireScorpionBabyProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity instanceof FireScorpionEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(FireScorpionEntity.DATA_Baby)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 0.3));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 0.3));
         }

         if (!(entity instanceof FireScorpionEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(FireScorpionEntity.DATA_Baby))) {
            for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
               type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
               type.getScaleData(entity).resetScale();
            }
         }

         if (entity instanceof FireScorpionEntity _datEntL5
            && (Boolean)_datEntL5.getEntityData().get(FireScorpionEntity.DATA_Larva)
            && entity instanceof FireScorpionEntity animatable) {
            animatable.setTexture("scorpion_fire");
         }

         if (entity instanceof FireScorpionEntity _datEntL7
            && (Boolean)_datEntL7.getEntityData().get(FireScorpionEntity.DATA_Saddled)
            && entity instanceof FireScorpionEntity animatable) {
            animatable.setTexture("scorpion_fire_saddled");
         }

         if (entity instanceof FireScorpionEntity _datEntL9
            && (Boolean)_datEntL9.getEntityData().get(FireScorpionEntity.DATA_Baby)
            && !(entity instanceof FireScorpionEntity _datEntL10 && (Boolean)_datEntL10.getEntityData().get(FireScorpionEntity.DATA_Larva))
            && entity instanceof FireScorpionEntity animatable) {
            animatable.setTexture("scorpion_fire_2");
         }
      }
   }
}
