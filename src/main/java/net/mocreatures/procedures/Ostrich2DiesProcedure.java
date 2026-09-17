package net.mocreatures.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.BlackOstrichEntity;
import net.mocreatures.init.MocreaturesModItems;

public class Ostrich2DiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof BlackOstrichEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(BlackOstrichEntity.DATA_Saddle)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL2
            && (Boolean)_datEntL2.getEntityData().get(BlackOstrichEntity.DATA_Chest)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CHEST));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL4
            && (Boolean)_datEntL4.getEntityData().get(BlackOstrichEntity.DATA_Diamond_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL6
            && (Boolean)_datEntL6.getEntityData().get(BlackOstrichEntity.DATA_Gold_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL8
            && (Boolean)_datEntL8.getEntityData().get(BlackOstrichEntity.DATA_Iron_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL10
            && (Boolean)_datEntL10.getEntityData().get(BlackOstrichEntity.DATA_Fur_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL12
            && (Boolean)_datEntL12.getEntityData().get(BlackOstrichEntity.DATA_Reptile_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL14
            && (Boolean)_datEntL14.getEntityData().get(BlackOstrichEntity.DATA_Hide_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL16
            && (Boolean)_datEntL16.getEntityData().get(BlackOstrichEntity.DATA_Leather_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL18
            && (Boolean)_datEntL18.getEntityData().get(BlackOstrichEntity.DATA_Green_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL20
            && (Boolean)_datEntL20.getEntityData().get(BlackOstrichEntity.DATA_LightGreen_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL22
            && (Boolean)_datEntL22.getEntityData().get(BlackOstrichEntity.DATA_Blue_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL24
            && (Boolean)_datEntL24.getEntityData().get(BlackOstrichEntity.DATA_LightBlue_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL26
            && (Boolean)_datEntL26.getEntityData().get(BlackOstrichEntity.DATA_Pink_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL28
            && (Boolean)_datEntL28.getEntityData().get(BlackOstrichEntity.DATA_Magenta_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL30
            && (Boolean)_datEntL30.getEntityData().get(BlackOstrichEntity.DATA_Purple_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL32
            && (Boolean)_datEntL32.getEntityData().get(BlackOstrichEntity.DATA_Orange_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL34
            && (Boolean)_datEntL34.getEntityData().get(BlackOstrichEntity.DATA_Cyan_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL36
            && (Boolean)_datEntL36.getEntityData().get(BlackOstrichEntity.DATA_Red_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL38
            && (Boolean)_datEntL38.getEntityData().get(BlackOstrichEntity.DATA_Yellow_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL40
            && (Boolean)_datEntL40.getEntityData().get(BlackOstrichEntity.DATA_White_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL42
            && (Boolean)_datEntL42.getEntityData().get(BlackOstrichEntity.DATA_Grey_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL44
            && (Boolean)_datEntL44.getEntityData().get(BlackOstrichEntity.DATA_LightGrey_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL46
            && (Boolean)_datEntL46.getEntityData().get(BlackOstrichEntity.DATA_Black_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof BlackOstrichEntity _datEntL48
            && (Boolean)_datEntL48.getEntityData().get(BlackOstrichEntity.DATA_Brown_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }
      }
   }
}
