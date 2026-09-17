package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.mocreatures.entity.PanthardEntity;
import virtuoel.pehkui.api.ScaleOperations;
import virtuoel.pehkui.api.ScaleTypes;

public class PanthardBabyProcedure {
   public static void execute(Entity var0) {
      if (var0 != null) {
         if (var0 instanceof PanthardEntity var1 && Boolean.TRUE.equals(var1.getEntityData().get(PanthardEntity.DATA_Baby))) {
            ScaleTypes.HEIGHT
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 0.6));
            ScaleTypes.WIDTH
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 0.6));
         } else if (var0 instanceof PanthardEntity) {
            ScaleTypes.HEIGHT
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.HEIGHT.getScaleData(var0).getTargetScale(), 1.0));
            ScaleTypes.WIDTH
               .getScaleData(var0)
               .setTargetScale((float)ScaleOperations.SET.applyAsDouble(ScaleTypes.WIDTH.getScaleData(var0).getTargetScale(), 1.0));
         }

         if (var0 instanceof LivingEntity var3 && var3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
            if (var0.isVehicle()) {
               var3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.2);
            } else {
               var3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.3);
            }
         }

         boolean var4 = var0 instanceof PanthardEntity var2 && Boolean.TRUE.equals(var2.getEntityData().get(PanthardEntity.DATA_Wings));
         if (var4) {
            FlightBoostProcedure.apply(var0);
         }
      }
   }
}
