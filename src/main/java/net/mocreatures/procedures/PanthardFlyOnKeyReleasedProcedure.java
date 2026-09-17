package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.PanthardEntity;

public class PanthardFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof PanthardEntity
            && entity.getVehicle() instanceof PanthardEntity _datEntL3
            && (Boolean)_datEntL3.getEntityData().get(PanthardEntity.DATA_Wings)) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
