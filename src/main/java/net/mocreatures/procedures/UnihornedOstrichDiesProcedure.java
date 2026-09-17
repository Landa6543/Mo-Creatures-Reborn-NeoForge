package net.mocreatures.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.UnihornedOstrichEntity;
import net.mocreatures.init.MocreaturesModItems;

public class UnihornedOstrichDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof UnihornedOstrichEntity _datEntL0
            && (Boolean)_datEntL0.getEntityData().get(UnihornedOstrichEntity.DATA_Saddle)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL2
            && (Boolean)_datEntL2.getEntityData().get(UnihornedOstrichEntity.DATA_Chest)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CHEST));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL4
            && (Boolean)_datEntL4.getEntityData().get(UnihornedOstrichEntity.DATA_Diamond_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL6
            && (Boolean)_datEntL6.getEntityData().get(UnihornedOstrichEntity.DATA_Gold_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL8
            && (Boolean)_datEntL8.getEntityData().get(UnihornedOstrichEntity.DATA_Iron_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL10
            && (Boolean)_datEntL10.getEntityData().get(UnihornedOstrichEntity.DATA_Fur_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL12
            && (Boolean)_datEntL12.getEntityData().get(UnihornedOstrichEntity.DATA_Reptile_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL14
            && (Boolean)_datEntL14.getEntityData().get(UnihornedOstrichEntity.DATA_Hide_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL16
            && (Boolean)_datEntL16.getEntityData().get(UnihornedOstrichEntity.DATA_Leather_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL18
            && (Boolean)_datEntL18.getEntityData().get(UnihornedOstrichEntity.DATA_Frost_Scorpion_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL20
            && (Boolean)_datEntL20.getEntityData().get(UnihornedOstrichEntity.DATA_Dirt_Scorpion_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL22
            && (Boolean)_datEntL22.getEntityData().get(UnihornedOstrichEntity.DATA_Cave_Scorpion_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL24
            && (Boolean)_datEntL24.getEntityData().get(UnihornedOstrichEntity.DATA_Nether_Scorpion_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL26
            && (Boolean)_datEntL26.getEntityData().get(UnihornedOstrichEntity.DATA_Undead_Scorpion_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get()));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL28
            && (Boolean)_datEntL28.getEntityData().get(UnihornedOstrichEntity.DATA_Netherite_Helmet)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL30
            && (Boolean)_datEntL30.getEntityData().get(UnihornedOstrichEntity.DATA_Green_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL32
            && (Boolean)_datEntL32.getEntityData().get(UnihornedOstrichEntity.DATA_LightGreen_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL34
            && (Boolean)_datEntL34.getEntityData().get(UnihornedOstrichEntity.DATA_Blue_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL36
            && (Boolean)_datEntL36.getEntityData().get(UnihornedOstrichEntity.DATA_LightBlue_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL38
            && (Boolean)_datEntL38.getEntityData().get(UnihornedOstrichEntity.DATA_Pink_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL40
            && (Boolean)_datEntL40.getEntityData().get(UnihornedOstrichEntity.DATA_Magenta_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL42
            && (Boolean)_datEntL42.getEntityData().get(UnihornedOstrichEntity.DATA_Purple_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL44
            && (Boolean)_datEntL44.getEntityData().get(UnihornedOstrichEntity.DATA_Orange_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL46
            && (Boolean)_datEntL46.getEntityData().get(UnihornedOstrichEntity.DATA_Cyan_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL48
            && (Boolean)_datEntL48.getEntityData().get(UnihornedOstrichEntity.DATA_Red_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL50
            && (Boolean)_datEntL50.getEntityData().get(UnihornedOstrichEntity.DATA_Yellow_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL52
            && (Boolean)_datEntL52.getEntityData().get(UnihornedOstrichEntity.DATA_White_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL54
            && (Boolean)_datEntL54.getEntityData().get(UnihornedOstrichEntity.DATA_Grey_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL56
            && (Boolean)_datEntL56.getEntityData().get(UnihornedOstrichEntity.DATA_LightGrey_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL58
            && (Boolean)_datEntL58.getEntityData().get(UnihornedOstrichEntity.DATA_Black_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity instanceof UnihornedOstrichEntity _datEntL60
            && (Boolean)_datEntL60.getEntityData().get(UnihornedOstrichEntity.DATA_Brown_Flag)
            && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }
      }
   }
}
