package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

public class TurkeySlowFallProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         if (!entity.onGround()) {
            entity.setDeltaMovement(new Vec3(entity.getDeltaMovement().x(), -0.1, entity.getDeltaMovement().z()));
         }
      }
   }
}
