package net.mocreatures.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.WyvernEntity;
import net.mocreatures.init.MocreaturesModItems;

public class WyvernDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof WyvernEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(WyvernEntity.DATA_Saddle)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof WyvernEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(WyvernEntity.DATA_Chest) && world instanceof ServerLevel _level
            )
          {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CHEST));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof WyvernEntity _datEntL4
            && (Boolean)_datEntL4.getEntityData().get(WyvernEntity.DATA_Diamond_Armor)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HORSE_ARMOR));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof WyvernEntity _datEntL6
            && (Boolean)_datEntL6.getEntityData().get(WyvernEntity.DATA_Golden_Armor)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HORSE_ARMOR));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof WyvernEntity _datEntL8
            && (Boolean)_datEntL8.getEntityData().get(WyvernEntity.DATA_Iron_Armor)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HORSE_ARMOR));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (Math.random() < 0.1) {
            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 1
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.ARCTIC_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 2
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 3
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.JUNGLE_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 4
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.MOUNTAIN_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 5
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.SAND_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 6
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.SEA_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 7
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.SUN_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 8
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.SWAMP_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if ((entity instanceof WyvernEntity _datEntI ? (Integer)_datEntI.getEntityData().get(WyvernEntity.DATA_WyvernVariant) : 0) == 9
               && world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.MOTHER_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }
         }

         if (entity instanceof WyvernEntity _datEntL28 && (Boolean)_datEntL28.getEntityData().get(WyvernEntity.DATA_Boss)) {
            if (world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.MOTHER_WYVERN_EGG.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }

            if (world instanceof ServerLevel _level) {
               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HEART_OF_FIRE.get()));
               entityToSpawn.setPickUpDelay(10);
               _level.addFreshEntity(entityToSpawn);
            }
         }
      }
   }
}
