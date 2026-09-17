package net.mocreatures.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.CaveScorpionEntity;
import net.mocreatures.init.MocreaturesModItems;

public class CaveScorpionEntityDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof CaveScorpionEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(CaveScorpionEntity.DATA_Larva)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_EGG.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof CaveScorpionEntity _datEntL2
            && (Boolean)_datEntL2.getEntityData().get(CaveScorpionEntity.DATA_Saddled)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }
      }
   }
}
