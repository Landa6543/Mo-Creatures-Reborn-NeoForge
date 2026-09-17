package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.WyvernOstrichEntity;

public class WyvernOstrichFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof WyvernOstrichEntity) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
