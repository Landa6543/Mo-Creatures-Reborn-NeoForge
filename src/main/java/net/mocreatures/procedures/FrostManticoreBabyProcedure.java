package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.mocreatures.entity.FrostManticoreEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

public class FrostManticoreBabyProcedure {
   public static void execute(Entity var0) {
      if (var0 != null) {
         boolean var1;
         if (var0 instanceof FrostManticoreEntity var2 && (Boolean)var2.getEntityData().get(FrostManticoreEntity.DATA_Baby)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1) {
            ScaleTypes.HEIGHT
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 0.3));
            ScaleTypes.WIDTH
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 0.3));
         }

         if (var0 instanceof FrostManticoreEntity var5 && (Boolean)var5.getEntityData().get(FrostManticoreEntity.DATA_Baby)) {
            var1 = true;
         } else {
            var1 = false;
         }

         if (!var1) {
            for (ScaleType var3 : ScaleRegistries.SCALE_TYPES.values()) {
               var3.getScaleData(var0).setPersistence(var3.getScaleData(var0).getPersistence());
               var3.getScaleData(var0).resetScale();
            }
         }

         if (var0 instanceof FrostManticoreEntity var7) {
            if (Boolean.TRUE.equals(var7.getEntityData().get(FrostManticoreEntity.DATA_Saddled))) {
               var7.setTexture("manticore_frost_saddled");
            } else {
               var7.setTexture("manticore_frost_bare");
            }
         }

         FlightBoostProcedure.apply(var0);
         if (var0 instanceof LivingEntity var8 && var8.getAttributes().hasAttribute(Attributes.FLYING_SPEED)) {
            var8.getAttribute(Attributes.FLYING_SPEED).setBaseValue(0.48);
         }
      }
   }
}
