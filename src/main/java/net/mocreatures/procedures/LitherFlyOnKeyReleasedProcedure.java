package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.LitherEntity;

public class LitherFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof LitherEntity
            && entity.getVehicle() instanceof LitherEntity _datEntL3
            && (Boolean)_datEntL3.getEntityData().get(LitherEntity.DATA_Wings)) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
