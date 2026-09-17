package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.PanthgerEntity;

public class PanthgerFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof PanthgerEntity
            && entity.getVehicle() instanceof PanthgerEntity _datEntL3
            && (Boolean)_datEntL3.getEntityData().get(PanthgerEntity.DATA_Wings)) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
