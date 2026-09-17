package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.WyvernOstrichEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;

public class WyvernOstrichBabyProcedure {
   public static void execute(Entity var0) {
      if (var0 != null) {
         if (var0 instanceof WyvernOstrichEntity var1 && Boolean.TRUE.equals(var1.getEntityData().get(WyvernOstrichEntity.DATA_Baby))) {
            ScaleTypes.HEIGHT
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 0.5));
            ScaleTypes.WIDTH
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 0.5));
         } else if (var0 instanceof WyvernOstrichEntity) {
            for (ScaleType var3 : ScaleRegistries.SCALE_TYPES.values()) {
               var3.getScaleData(var0).resetScale();
            }
         }

         FlightBoostProcedure.apply(var0);
      }
   }
}
