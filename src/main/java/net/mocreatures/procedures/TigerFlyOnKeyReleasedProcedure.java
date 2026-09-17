package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.TigerEntity;

public class TigerFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof TigerEntity
            && entity.getVehicle() instanceof TigerEntity _datEntL3
            && (Boolean)_datEntL3.getEntityData().get(TigerEntity.DATA_Wings)) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
