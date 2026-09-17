package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;

public class FlightBoostProcedure {
   public static void apply(Entity var0) {
      if (var0 != null) {
         if ((!var0.isVehicle() || var0.onGround()) && var0.getPersistentData().getDouble("VerticalMovement") != 0.0) {
            var0.getPersistentData().putDouble("VerticalMovement", 0.0);
         }
      }
   }
}
