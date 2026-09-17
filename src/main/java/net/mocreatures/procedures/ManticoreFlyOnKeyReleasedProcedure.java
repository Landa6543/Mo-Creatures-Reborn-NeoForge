package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.DarkManticoreEntity;
import net.mocreatures.entity.FireManticoreEntity;
import net.mocreatures.entity.FrostManticoreEntity;
import net.mocreatures.entity.ManticoreEntity;
import net.mocreatures.entity.ToxicManticoreEntity;

public class ManticoreFlyOnKeyReleasedProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (entity.getVehicle() instanceof ManticoreEntity) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }

         if (entity.getVehicle() instanceof DarkManticoreEntity) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }

         if (entity.getVehicle() instanceof FireManticoreEntity) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }

         if (entity.getVehicle() instanceof FrostManticoreEntity) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }

         if (entity.getVehicle() instanceof ToxicManticoreEntity) {
            entity.getVehicle().getPersistentData().putDouble("VerticalMovement", -1.0);
         }
      }
   }
}
