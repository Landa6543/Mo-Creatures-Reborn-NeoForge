package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.PantherEntity;

public class PantherFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof PantherEntity
            && entity.getVehicle() instanceof PantherEntity _datEntL3
            && (Boolean)_datEntL3.getEntityData().get(PantherEntity.DATA_Wings)) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
