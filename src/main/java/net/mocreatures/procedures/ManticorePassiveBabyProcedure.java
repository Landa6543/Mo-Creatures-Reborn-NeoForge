package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.ManticoreEntity;

public class ManticorePassiveBabyProcedure {
   public static boolean execute(Entity entity) {
      return entity == null ? false : !(entity instanceof ManticoreEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(ManticoreEntity.DATA_Baby));
   }
}
