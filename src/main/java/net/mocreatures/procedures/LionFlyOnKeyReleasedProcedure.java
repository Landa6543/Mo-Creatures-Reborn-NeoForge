package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.LionEntity;

public class LionFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof LionEntity
            && entity.getVehicle() instanceof LionEntity _datEntL3
            && (Boolean)_datEntL3.getEntityData().get(LionEntity.DATA_Wings)) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
