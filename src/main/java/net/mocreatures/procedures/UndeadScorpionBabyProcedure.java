package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.UndeadScorpionEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

public class UndeadScorpionBabyProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof UndeadScorpionEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(UndeadScorpionEntity.DATA_Baby)) {
            ScaleTypes.HEIGHT
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(entity).getTargetScale(), 0.3));
            ScaleTypes.WIDTH
               .getScaleData(entity)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(entity).getTargetScale(), 0.3));
         }

         if (!(entity instanceof UndeadScorpionEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(UndeadScorpionEntity.DATA_Baby))) {
            for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
               type.getScaleData(entity).setPersistence(type.getScaleData(entity).getPersistence());
               type.getScaleData(entity).resetScale();
            }
         }

         if (entity instanceof UndeadScorpionEntity _datEntL5
            && (Boolean)_datEntL5.getEntityData().get(UndeadScorpionEntity.DATA_Larva)
            && entity instanceof UndeadScorpionEntity animatable) {
            animatable.setTexture("scorpion_undead");
         }

         if (entity instanceof UndeadScorpionEntity _datEntL7
            && (Boolean)_datEntL7.getEntityData().get(UndeadScorpionEntity.DATA_Saddled)
            && entity instanceof UndeadScorpionEntity animatable) {
            animatable.setTexture("scorpion_undead_saddled");
         }

         if (entity instanceof UndeadScorpionEntity _datEntL9
            && (Boolean)_datEntL9.getEntityData().get(UndeadScorpionEntity.DATA_Baby)
            && !(entity instanceof UndeadScorpionEntity _datEntL10 && (Boolean)_datEntL10.getEntityData().get(UndeadScorpionEntity.DATA_Larva))
            && entity instanceof UndeadScorpionEntity animatable) {
            animatable.setTexture("scorpion_undead_2");
         }

         if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))
            && world instanceof Level _lvl13
            && _lvl13.isDay()
            && entity.getRemainingFireTicks() < 0
            && !world.getLevelData().isRaining()) {
            entity.igniteForSeconds(5.0F);
         }
      }
   }
}
