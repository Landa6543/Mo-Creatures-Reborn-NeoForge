package net.mocreatures.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.FireScorpionEntity;
import net.mocreatures.init.MocreaturesModItems;

public class FireScorpionEntityDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof FireScorpionEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(FireScorpionEntity.DATA_Larva)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_EGG.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof FireScorpionEntity _datEntL2
            && (Boolean)_datEntL2.getEntityData().get(FireScorpionEntity.DATA_Saddled)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }
      }
   }
}
