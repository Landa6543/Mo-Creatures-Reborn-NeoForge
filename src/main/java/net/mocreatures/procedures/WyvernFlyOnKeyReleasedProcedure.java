package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.WyvernEntity;

public class WyvernFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof WyvernEntity) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
