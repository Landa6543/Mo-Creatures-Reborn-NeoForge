package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;

public class RaySwimProcedure {
   public static boolean execute(Entity entity) {
      return entity == null ? false : entity.isInWater();
   }
}
