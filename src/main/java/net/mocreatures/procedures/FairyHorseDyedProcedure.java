package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class FairyHorseDyedProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getTarget(), event.getEntity());
      }
   }

   public static void execute(Entity entity, Entity sourceentity) {
      execute(null, entity, sourceentity);
   }

   private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (entity instanceof HorseEntity
            && (entity instanceof HorseEntity _datEntI ? (Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 117) {
            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PURPLE_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 118);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.PURPLE_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PINK_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 119);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.PINK_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.RED_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 120);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.RED_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ORANGE_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 121);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.ORANGE_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.YELLOW_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 122);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.YELLOW_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIME_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 123);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.LIME_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GREEN_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 124);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.GREEN_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CYAN_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 125);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.CYAN_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LIGHT_BLUE_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 126);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.LIGHT_BLUE_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BLUE_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 127);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.BLUE_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }

            if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BLACK_DYE) {
               if (entity instanceof HorseEntity _datEntSetI) {
                  _datEntSetI.getEntityData().set(HorseEntity.DATA_Variant, 128);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.BLACK_DYE);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }
            }
         }
      }
   }
}
