package net.mocreatures.procedures;

import net.minecraft.world.entity.Entity;
import net.mocreatures.entity.ElephantEntity;

public class ElephantNetheriteTusksDisplayConditionProcedure {
   public static boolean execute(Entity entity) {
      return entity == null ? false : entity instanceof ElephantEntity _datEntL0 && (Boolean)_datEntL0.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks);
   }
}
