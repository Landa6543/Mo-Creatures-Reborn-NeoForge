package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.LigerEntity;

public class LigerFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof LigerEntity
            && entity.getVehicle() instanceof LigerEntity _datEntL3
            && (Boolean)_datEntL3.getEntityData().get(LigerEntity.DATA_Wings)) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
