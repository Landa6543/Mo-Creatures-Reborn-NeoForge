package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.WyvernEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class WyvernEquipmentProcedure {
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
         if (entity instanceof WyvernEntity && entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
            if (!(entity instanceof WyvernEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(WyvernEntity.DATA_Saddle))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.CRAFTED_SADDLE.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernEntity.DATA_Saddle, true);
               }
            }

            if (!(entity instanceof WyvernEntity _datEntL7 && (Boolean)_datEntL7.getEntityData().get(WyvernEntity.DATA_Chest))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHEST.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.CHEST);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernEntity.DATA_Chest, true);
               }
            }

            if (entity instanceof WyvernEntity _datEntL12
               && (Boolean)_datEntL12.getEntityData().get(WyvernEntity.DATA_Saddle)
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
               sourceentity.startRiding(entity);
            }

            if (!(entity instanceof WyvernEntity _datEntL15 && (Boolean)_datEntL15.getEntityData().get(WyvernEntity.DATA_Diamond_Armor))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND_HORSE_ARMOR) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.DIAMOND_HORSE_ARMOR);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernEntity.DATA_Diamond_Armor, true);
               }

               if (entity instanceof WyvernEntity _datEntL20 && (Boolean)_datEntL20.getEntityData().get(WyvernEntity.DATA_Golden_Armor)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernEntity.DATA_Golden_Armor, false);
                  }
               }

               if (entity instanceof WyvernEntity _datEntL23 && (Boolean)_datEntL23.getEntityData().get(WyvernEntity.DATA_Iron_Armor)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernEntity.DATA_Iron_Armor, false);
                  }
               }
            }

            if (!(entity instanceof WyvernEntity _datEntL26 && (Boolean)_datEntL26.getEntityData().get(WyvernEntity.DATA_Golden_Armor))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_HORSE_ARMOR) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.GOLDEN_HORSE_ARMOR);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernEntity.DATA_Golden_Armor, true);
               }

               if (entity instanceof WyvernEntity _datEntL31 && (Boolean)_datEntL31.getEntityData().get(WyvernEntity.DATA_Diamond_Armor)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernEntity.DATA_Diamond_Armor, false);
                  }
               }

               if (entity instanceof WyvernEntity _datEntL34 && (Boolean)_datEntL34.getEntityData().get(WyvernEntity.DATA_Iron_Armor)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernEntity.DATA_Iron_Armor, false);
                  }
               }
            }

            if (!(entity instanceof WyvernEntity _datEntL37 && (Boolean)_datEntL37.getEntityData().get(WyvernEntity.DATA_Iron_Armor))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_HORSE_ARMOR) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.IRON_HORSE_ARMOR);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernEntity.DATA_Iron_Armor, true);
               }

               if (entity instanceof WyvernEntity _datEntL42 && (Boolean)_datEntL42.getEntityData().get(WyvernEntity.DATA_Diamond_Armor)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernEntity.DATA_Diamond_Armor, false);
                  }
               }

               if (entity instanceof WyvernEntity _datEntL45 && (Boolean)_datEntL45.getEntityData().get(WyvernEntity.DATA_Golden_Armor)) {
                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof WyvernEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernEntity.DATA_Golden_Armor, false);
                  }
               }
            }
         }
      }
   }
}
