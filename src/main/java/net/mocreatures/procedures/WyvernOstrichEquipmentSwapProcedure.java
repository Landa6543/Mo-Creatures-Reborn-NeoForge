package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.WyvernOstrichEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class WyvernOstrichEquipmentSwapProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      execute(null, world, x, y, z, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof WyvernOstrichEntity
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()
            && entity instanceof WyvernOstrichEntity _datEntL2
            && (Boolean)_datEntL2.getEntityData().get(WyvernOstrichEntity.DATA_Chest)) {
            if (!(entity instanceof WyvernOstrichEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.GREEN_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.GREEN_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL8 && (Boolean)_datEntL8.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL11 && (Boolean)_datEntL11.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL14 && (Boolean)_datEntL14.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL17 && (Boolean)_datEntL17.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL20 && (Boolean)_datEntL20.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL23 && (Boolean)_datEntL23.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL26 && (Boolean)_datEntL26.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL29 && (Boolean)_datEntL29.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL32 && (Boolean)_datEntL32.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL35 && (Boolean)_datEntL35.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL38 && (Boolean)_datEntL38.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL41 && (Boolean)_datEntL41.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL44 && (Boolean)_datEntL44.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL47 && (Boolean)_datEntL47.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL50 && (Boolean)_datEntL50.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL53 && (Boolean)_datEntL53.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.LIME_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.LIME_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL58 && (Boolean)_datEntL58.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL61 && (Boolean)_datEntL61.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL64 && (Boolean)_datEntL64.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL67 && (Boolean)_datEntL67.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL70 && (Boolean)_datEntL70.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL73 && (Boolean)_datEntL73.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL76 && (Boolean)_datEntL76.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL79 && (Boolean)_datEntL79.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL82 && (Boolean)_datEntL82.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL85 && (Boolean)_datEntL85.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL88 && (Boolean)_datEntL88.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL91 && (Boolean)_datEntL91.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL94 && (Boolean)_datEntL94.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL97 && (Boolean)_datEntL97.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL100 && (Boolean)_datEntL100.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL103 && (Boolean)_datEntL103.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.BLUE_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.BLUE_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL108 && (Boolean)_datEntL108.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL111 && (Boolean)_datEntL111.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL114 && (Boolean)_datEntL114.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL117 && (Boolean)_datEntL117.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL120 && (Boolean)_datEntL120.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL123 && (Boolean)_datEntL123.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL126 && (Boolean)_datEntL126.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL129 && (Boolean)_datEntL129.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL132 && (Boolean)_datEntL132.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL135 && (Boolean)_datEntL135.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL138 && (Boolean)_datEntL138.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL141 && (Boolean)_datEntL141.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL144 && (Boolean)_datEntL144.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL147 && (Boolean)_datEntL147.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL150 && (Boolean)_datEntL150.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL153 && (Boolean)_datEntL153.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.LIGHT_BLUE_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.LIGHT_BLUE_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL158 && (Boolean)_datEntL158.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL161 && (Boolean)_datEntL161.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL164 && (Boolean)_datEntL164.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL167 && (Boolean)_datEntL167.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL170 && (Boolean)_datEntL170.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL173 && (Boolean)_datEntL173.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL176 && (Boolean)_datEntL176.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL179 && (Boolean)_datEntL179.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL182 && (Boolean)_datEntL182.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL185 && (Boolean)_datEntL185.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL188 && (Boolean)_datEntL188.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL191 && (Boolean)_datEntL191.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL194 && (Boolean)_datEntL194.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL197 && (Boolean)_datEntL197.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL200 && (Boolean)_datEntL200.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL203 && (Boolean)_datEntL203.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.PINK_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.PINK_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL208 && (Boolean)_datEntL208.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL211 && (Boolean)_datEntL211.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL214 && (Boolean)_datEntL214.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL217 && (Boolean)_datEntL217.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL220 && (Boolean)_datEntL220.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL223 && (Boolean)_datEntL223.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL226 && (Boolean)_datEntL226.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL229 && (Boolean)_datEntL229.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL232 && (Boolean)_datEntL232.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL235 && (Boolean)_datEntL235.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL238 && (Boolean)_datEntL238.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL241 && (Boolean)_datEntL241.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL244 && (Boolean)_datEntL244.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL247 && (Boolean)_datEntL247.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL250 && (Boolean)_datEntL250.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL253 && (Boolean)_datEntL253.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.MAGENTA_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.MAGENTA_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL258 && (Boolean)_datEntL258.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL261 && (Boolean)_datEntL261.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL264 && (Boolean)_datEntL264.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL267 && (Boolean)_datEntL267.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL270 && (Boolean)_datEntL270.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL273 && (Boolean)_datEntL273.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL276 && (Boolean)_datEntL276.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL279 && (Boolean)_datEntL279.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL282 && (Boolean)_datEntL282.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL285 && (Boolean)_datEntL285.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL288 && (Boolean)_datEntL288.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL291 && (Boolean)_datEntL291.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL294 && (Boolean)_datEntL294.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL297 && (Boolean)_datEntL297.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL300 && (Boolean)_datEntL300.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL303 && (Boolean)_datEntL303.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.PURPLE_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.PURPLE_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL308 && (Boolean)_datEntL308.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL311 && (Boolean)_datEntL311.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL314 && (Boolean)_datEntL314.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL317 && (Boolean)_datEntL317.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL320 && (Boolean)_datEntL320.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL323 && (Boolean)_datEntL323.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL326 && (Boolean)_datEntL326.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL329 && (Boolean)_datEntL329.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL332 && (Boolean)_datEntL332.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL335 && (Boolean)_datEntL335.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL338 && (Boolean)_datEntL338.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL341 && (Boolean)_datEntL341.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL344 && (Boolean)_datEntL344.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL347 && (Boolean)_datEntL347.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL350 && (Boolean)_datEntL350.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL353 && (Boolean)_datEntL353.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.ORANGE_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.ORANGE_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL358 && (Boolean)_datEntL358.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL361 && (Boolean)_datEntL361.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL364 && (Boolean)_datEntL364.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL367 && (Boolean)_datEntL367.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL370 && (Boolean)_datEntL370.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL373 && (Boolean)_datEntL373.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL376 && (Boolean)_datEntL376.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL379 && (Boolean)_datEntL379.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL382 && (Boolean)_datEntL382.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL385 && (Boolean)_datEntL385.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL388 && (Boolean)_datEntL388.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL391 && (Boolean)_datEntL391.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL394 && (Boolean)_datEntL394.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL397 && (Boolean)_datEntL397.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL400 && (Boolean)_datEntL400.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL403 && (Boolean)_datEntL403.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.CYAN_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.CYAN_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL408 && (Boolean)_datEntL408.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL411 && (Boolean)_datEntL411.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL414 && (Boolean)_datEntL414.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL417 && (Boolean)_datEntL417.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL420 && (Boolean)_datEntL420.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL423 && (Boolean)_datEntL423.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL426 && (Boolean)_datEntL426.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL429 && (Boolean)_datEntL429.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL432 && (Boolean)_datEntL432.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL435 && (Boolean)_datEntL435.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL438 && (Boolean)_datEntL438.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL441 && (Boolean)_datEntL441.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL444 && (Boolean)_datEntL444.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL447 && (Boolean)_datEntL447.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL450 && (Boolean)_datEntL450.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL453 && (Boolean)_datEntL453.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.RED_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.RED_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL458 && (Boolean)_datEntL458.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL461 && (Boolean)_datEntL461.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL464 && (Boolean)_datEntL464.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL467 && (Boolean)_datEntL467.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL470 && (Boolean)_datEntL470.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL473 && (Boolean)_datEntL473.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL476 && (Boolean)_datEntL476.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL479 && (Boolean)_datEntL479.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL482 && (Boolean)_datEntL482.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL485 && (Boolean)_datEntL485.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL488 && (Boolean)_datEntL488.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL491 && (Boolean)_datEntL491.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL494 && (Boolean)_datEntL494.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL497 && (Boolean)_datEntL497.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL500 && (Boolean)_datEntL500.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL503 && (Boolean)_datEntL503.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.YELLOW_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.YELLOW_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL508 && (Boolean)_datEntL508.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL511 && (Boolean)_datEntL511.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL514 && (Boolean)_datEntL514.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL517 && (Boolean)_datEntL517.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL520 && (Boolean)_datEntL520.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL523 && (Boolean)_datEntL523.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL526 && (Boolean)_datEntL526.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL529 && (Boolean)_datEntL529.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL532 && (Boolean)_datEntL532.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL535 && (Boolean)_datEntL535.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL538 && (Boolean)_datEntL538.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL541 && (Boolean)_datEntL541.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL544 && (Boolean)_datEntL544.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL547 && (Boolean)_datEntL547.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL550 && (Boolean)_datEntL550.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL553 && (Boolean)_datEntL553.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.WHITE_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.WHITE_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL558 && (Boolean)_datEntL558.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL561 && (Boolean)_datEntL561.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL564 && (Boolean)_datEntL564.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL567 && (Boolean)_datEntL567.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL570 && (Boolean)_datEntL570.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL573 && (Boolean)_datEntL573.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL576 && (Boolean)_datEntL576.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL579 && (Boolean)_datEntL579.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL582 && (Boolean)_datEntL582.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL585 && (Boolean)_datEntL585.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL588 && (Boolean)_datEntL588.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL591 && (Boolean)_datEntL591.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL594 && (Boolean)_datEntL594.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL597 && (Boolean)_datEntL597.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL600 && (Boolean)_datEntL600.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL603 && (Boolean)_datEntL603.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.GRAY_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.GRAY_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL608 && (Boolean)_datEntL608.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL611 && (Boolean)_datEntL611.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL614 && (Boolean)_datEntL614.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL617 && (Boolean)_datEntL617.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL620 && (Boolean)_datEntL620.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL623 && (Boolean)_datEntL623.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL626 && (Boolean)_datEntL626.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL629 && (Boolean)_datEntL629.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL632 && (Boolean)_datEntL632.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL635 && (Boolean)_datEntL635.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL638 && (Boolean)_datEntL638.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL641 && (Boolean)_datEntL641.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL644 && (Boolean)_datEntL644.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL647 && (Boolean)_datEntL647.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL650 && (Boolean)_datEntL650.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL653 && (Boolean)_datEntL653.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.LIGHT_GRAY_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.LIGHT_GRAY_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL658 && (Boolean)_datEntL658.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL661 && (Boolean)_datEntL661.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL664 && (Boolean)_datEntL664.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL667 && (Boolean)_datEntL667.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL670 && (Boolean)_datEntL670.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL673 && (Boolean)_datEntL673.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL676 && (Boolean)_datEntL676.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL679 && (Boolean)_datEntL679.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL682 && (Boolean)_datEntL682.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL685 && (Boolean)_datEntL685.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL688 && (Boolean)_datEntL688.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL691 && (Boolean)_datEntL691.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL694 && (Boolean)_datEntL694.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL697 && (Boolean)_datEntL697.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL700 && (Boolean)_datEntL700.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL703 && (Boolean)_datEntL703.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.BLACK_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.BLACK_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL708 && (Boolean)_datEntL708.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL711 && (Boolean)_datEntL711.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL714 && (Boolean)_datEntL714.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL717 && (Boolean)_datEntL717.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL720 && (Boolean)_datEntL720.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL723 && (Boolean)_datEntL723.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL726 && (Boolean)_datEntL726.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL729 && (Boolean)_datEntL729.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL732 && (Boolean)_datEntL732.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL735 && (Boolean)_datEntL735.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL738 && (Boolean)_datEntL738.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL741 && (Boolean)_datEntL741.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL744 && (Boolean)_datEntL744.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL747 && (Boolean)_datEntL747.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL750 && (Boolean)_datEntL750.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BROWN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, false);
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL753 && (Boolean)_datEntL753.getEntityData().get(WyvernOstrichEntity.DATA_Brown_Flag))
               && (!(sourceentity instanceof LivingEntity _livEnt) ? ItemStack.EMPTY : _livEnt.getMainHandItem()).getItem() == Blocks.BROWN_WOOL.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.BROWN_WOOL);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Brown_Flag, true);
               }

               if (entity instanceof WyvernOstrichEntity _datEntL758 && (Boolean)_datEntL758.getEntityData().get(WyvernOstrichEntity.DATA_Green_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GREEN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Green_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL761 && (Boolean)_datEntL761.getEntityData().get(WyvernOstrichEntity.DATA_LightGreen_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIME_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGreen_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL764 && (Boolean)_datEntL764.getEntityData().get(WyvernOstrichEntity.DATA_Blue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Blue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL767 && (Boolean)_datEntL767.getEntityData().get(WyvernOstrichEntity.DATA_LightBlue_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_BLUE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightBlue_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL770 && (Boolean)_datEntL770.getEntityData().get(WyvernOstrichEntity.DATA_Pink_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PINK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Pink_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL773 && (Boolean)_datEntL773.getEntityData().get(WyvernOstrichEntity.DATA_Magenta_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.MAGENTA_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Magenta_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL776 && (Boolean)_datEntL776.getEntityData().get(WyvernOstrichEntity.DATA_Purple_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PURPLE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Purple_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL779 && (Boolean)_datEntL779.getEntityData().get(WyvernOstrichEntity.DATA_Orange_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.ORANGE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Orange_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL782 && (Boolean)_datEntL782.getEntityData().get(WyvernOstrichEntity.DATA_Cyan_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CYAN_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cyan_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL785 && (Boolean)_datEntL785.getEntityData().get(WyvernOstrichEntity.DATA_Red_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.RED_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Red_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL788 && (Boolean)_datEntL788.getEntityData().get(WyvernOstrichEntity.DATA_Yellow_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.YELLOW_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Yellow_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL791 && (Boolean)_datEntL791.getEntityData().get(WyvernOstrichEntity.DATA_White_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.WHITE_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_White_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL794 && (Boolean)_datEntL794.getEntityData().get(WyvernOstrichEntity.DATA_Grey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Grey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL797 && (Boolean)_datEntL797.getEntityData().get(WyvernOstrichEntity.DATA_LightGrey_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.LIGHT_GRAY_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_LightGrey_Flag, false);
                  }
               }

               if (entity instanceof WyvernOstrichEntity _datEntL800 && (Boolean)_datEntL800.getEntityData().get(WyvernOstrichEntity.DATA_Black_Flag)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BLACK_WOOL));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Black_Flag, false);
                  }
               }
            }
         }
      }
   }
}
