package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.LeopardEntity;

public class SnowLeopardDisplayConditionProcedure {
   public static boolean execute(Entity entity) {
      return entity == null ? false : (entity instanceof LeopardEntity _datEntI ? (Integer)_datEntI.getEntityData().get(LeopardEntity.DATA_Color) : 0) == 2;
   }
}
