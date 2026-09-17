package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.FrostManticoreEntity;

public class FrostManticorePassiveBabyProcedure {
   public static boolean execute(Entity entity) {
      return entity == null
         ? false
         : !(entity instanceof FrostManticoreEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(FrostManticoreEntity.DATA_Baby));
   }
}
