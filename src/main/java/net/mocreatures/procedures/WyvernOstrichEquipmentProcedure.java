package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.WyvernOstrichEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class WyvernOstrichEquipmentProcedure {
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
         if (entity instanceof WyvernOstrichEntity && entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
            if (!(entity instanceof WyvernOstrichEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(WyvernOstrichEntity.DATA_Saddle))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.CRAFTED_SADDLE.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Saddle, true);
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL7 && (Boolean)_datEntL7.getEntityData().get(WyvernOstrichEntity.DATA_Chest))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHEST.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.CHEST);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Chest, true);
               }
            }

            if (entity instanceof WyvernOstrichEntity _datEntL12
               && (Boolean)_datEntL12.getEntityData().get(WyvernOstrichEntity.DATA_Saddle)
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
               sourceentity.startRiding(entity);
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL15 && (Boolean)_datEntL15.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_HELMET) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.GOLDEN_HELMET);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(Items.GOLDEN_HELMET));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.GOLDEN_HELMET));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == Items.GOLDEN_HELMET) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL23 && (Boolean)_datEntL23.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL26 && (Boolean)_datEntL26.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL29 && (Boolean)_datEntL29.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL32 && (Boolean)_datEntL32.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL35 && (Boolean)_datEntL35.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL38 && (Boolean)_datEntL38.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL41
                     && (Boolean)_datEntL41.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL44
                     && (Boolean)_datEntL44.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL47
                     && (Boolean)_datEntL47.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL50
                     && (Boolean)_datEntL50.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL53
                     && (Boolean)_datEntL53.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL56 && (Boolean)_datEntL56.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL59 && (Boolean)_datEntL59.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND_HELMET) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.DIAMOND_HELMET);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(Items.DIAMOND_HELMET));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.DIAMOND_HELMET));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == Items.DIAMOND_HELMET) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL67 && (Boolean)_datEntL67.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL70 && (Boolean)_datEntL70.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL73 && (Boolean)_datEntL73.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL76 && (Boolean)_datEntL76.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL79 && (Boolean)_datEntL79.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL82 && (Boolean)_datEntL82.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL85
                     && (Boolean)_datEntL85.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL88
                     && (Boolean)_datEntL88.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL91
                     && (Boolean)_datEntL91.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL94
                     && (Boolean)_datEntL94.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL97
                     && (Boolean)_datEntL97.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL100 && (Boolean)_datEntL100.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL103 && (Boolean)_datEntL103.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_HELMET) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.IRON_HELMET);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(Items.IRON_HELMET));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.IRON_HELMET));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == Items.IRON_HELMET) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL111 && (Boolean)_datEntL111.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL114 && (Boolean)_datEntL114.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL117 && (Boolean)_datEntL117.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL120 && (Boolean)_datEntL120.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL123 && (Boolean)_datEntL123.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL126 && (Boolean)_datEntL126.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL129
                     && (Boolean)_datEntL129.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL132
                     && (Boolean)_datEntL132.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL135
                     && (Boolean)_datEntL135.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL138
                     && (Boolean)_datEntL138.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL141
                     && (Boolean)_datEntL141.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL144 && (Boolean)_datEntL144.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL147 && (Boolean)_datEntL147.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.FUR_ARMOR_HELMET.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.FUR_ARMOR_HELMET.get()) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL155 && (Boolean)_datEntL155.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL158 && (Boolean)_datEntL158.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL161 && (Boolean)_datEntL161.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL164 && (Boolean)_datEntL164.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL167 && (Boolean)_datEntL167.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL170 && (Boolean)_datEntL170.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL173
                     && (Boolean)_datEntL173.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL176
                     && (Boolean)_datEntL176.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL179
                     && (Boolean)_datEntL179.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL182
                     && (Boolean)_datEntL182.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL185
                     && (Boolean)_datEntL185.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL188 && (Boolean)_datEntL188.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL191 && (Boolean)_datEntL191.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.REPTILE_ARMOR_HELMET.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.REPTILE_ARMOR_HELMET.get()) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL199 && (Boolean)_datEntL199.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL202 && (Boolean)_datEntL202.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL205 && (Boolean)_datEntL205.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL208 && (Boolean)_datEntL208.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL211 && (Boolean)_datEntL211.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL214 && (Boolean)_datEntL214.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL217
                     && (Boolean)_datEntL217.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL220
                     && (Boolean)_datEntL220.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL223
                     && (Boolean)_datEntL223.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL226
                     && (Boolean)_datEntL226.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL229
                     && (Boolean)_datEntL229.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL232 && (Boolean)_datEntL232.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL235 && (Boolean)_datEntL235.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.HIDE_ARMOR_HELMET.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.HIDE_ARMOR_HELMET.get()) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL243 && (Boolean)_datEntL243.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL246 && (Boolean)_datEntL246.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL249 && (Boolean)_datEntL249.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL252 && (Boolean)_datEntL252.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL255 && (Boolean)_datEntL255.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL258 && (Boolean)_datEntL258.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL261
                     && (Boolean)_datEntL261.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL264
                     && (Boolean)_datEntL264.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL267
                     && (Boolean)_datEntL267.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL270
                     && (Boolean)_datEntL270.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL273
                     && (Boolean)_datEntL273.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL276 && (Boolean)_datEntL276.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL279 && (Boolean)_datEntL279.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.LEATHER_HELMET) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.LEATHER_HELMET);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(Items.LEATHER_HELMET));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.LEATHER_HELMET));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == Items.LEATHER_HELMET) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL287 && (Boolean)_datEntL287.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL290 && (Boolean)_datEntL290.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL293 && (Boolean)_datEntL293.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL296 && (Boolean)_datEntL296.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL299 && (Boolean)_datEntL299.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL302 && (Boolean)_datEntL302.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL305
                     && (Boolean)_datEntL305.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL308
                     && (Boolean)_datEntL308.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL311
                     && (Boolean)_datEntL311.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL314
                     && (Boolean)_datEntL314.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL317
                     && (Boolean)_datEntL317.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL320 && (Boolean)_datEntL320.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL323 && (Boolean)_datEntL323.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get()));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get()) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL331 && (Boolean)_datEntL331.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL334 && (Boolean)_datEntL334.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL337 && (Boolean)_datEntL337.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL340 && (Boolean)_datEntL340.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL343 && (Boolean)_datEntL343.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL346 && (Boolean)_datEntL346.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL349 && (Boolean)_datEntL349.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL352
                     && (Boolean)_datEntL352.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL355
                     && (Boolean)_datEntL355.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL358
                     && (Boolean)_datEntL358.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL361
                     && (Boolean)_datEntL361.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL364 && (Boolean)_datEntL364.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL367 && (Boolean)_datEntL367.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get()));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get()) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL375 && (Boolean)_datEntL375.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL378 && (Boolean)_datEntL378.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL381 && (Boolean)_datEntL381.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL384 && (Boolean)_datEntL384.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL387 && (Boolean)_datEntL387.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL390 && (Boolean)_datEntL390.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL393 && (Boolean)_datEntL393.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL396
                     && (Boolean)_datEntL396.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL399
                     && (Boolean)_datEntL399.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL402
                     && (Boolean)_datEntL402.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL405
                     && (Boolean)_datEntL405.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL408 && (Boolean)_datEntL408.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL411 && (Boolean)_datEntL411.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get()));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get()) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL419 && (Boolean)_datEntL419.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL422 && (Boolean)_datEntL422.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL425 && (Boolean)_datEntL425.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL428 && (Boolean)_datEntL428.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL431 && (Boolean)_datEntL431.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL434 && (Boolean)_datEntL434.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL437 && (Boolean)_datEntL437.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL440
                     && (Boolean)_datEntL440.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL443
                     && (Boolean)_datEntL443.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL446
                     && (Boolean)_datEntL446.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL449
                     && (Boolean)_datEntL449.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL452 && (Boolean)_datEntL452.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(
                  entity instanceof WyvernOstrichEntity _datEntL455
                     && (Boolean)_datEntL455.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)
               )
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get()));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get()) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL463 && (Boolean)_datEntL463.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL466 && (Boolean)_datEntL466.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL469 && (Boolean)_datEntL469.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL472 && (Boolean)_datEntL472.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL475 && (Boolean)_datEntL475.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL478 && (Boolean)_datEntL478.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL481 && (Boolean)_datEntL481.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL484
                     && (Boolean)_datEntL484.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL487
                     && (Boolean)_datEntL487.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL490
                     && (Boolean)_datEntL490.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL493
                     && (Boolean)_datEntL493.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL496 && (Boolean)_datEntL496.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(
                  entity instanceof WyvernOstrichEntity _datEntL499
                     && (Boolean)_datEntL499.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)
               )
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get()));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get()));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get()) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL507 && (Boolean)_datEntL507.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL510 && (Boolean)_datEntL510.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL513 && (Boolean)_datEntL513.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL516 && (Boolean)_datEntL516.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL519 && (Boolean)_datEntL519.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL522 && (Boolean)_datEntL522.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL525 && (Boolean)_datEntL525.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL528
                     && (Boolean)_datEntL528.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL531
                     && (Boolean)_datEntL531.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL534
                     && (Boolean)_datEntL534.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL537
                     && (Boolean)_datEntL537.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL540 && (Boolean)_datEntL540.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof WyvernOstrichEntity _datEntL543 && (Boolean)_datEntL543.getEntityData().get(WyvernOstrichEntity.DATA_Netherite_Helmet))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_HELMET) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Items.NETHERITE_HELMET);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               Entity _entity = entity;
               if (_entity instanceof Player _player) {
                  _player.getInventory().armor.set(0, new ItemStack(Items.NETHERITE_HELMET));
                  _player.getInventory().setChanged();
               } else if (_entity instanceof LivingEntity _living) {
                  _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.NETHERITE_HELMET));
               }

               if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()
                  == Items.NETHERITE_HELMET) {
                  if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Netherite_Helmet, true);
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL551 && (Boolean)_datEntL551.getEntityData().get(WyvernOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL554 && (Boolean)_datEntL554.getEntityData().get(WyvernOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL557 && (Boolean)_datEntL557.getEntityData().get(WyvernOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL560 && (Boolean)_datEntL560.getEntityData().get(WyvernOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL563 && (Boolean)_datEntL563.getEntityData().get(WyvernOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL566 && (Boolean)_datEntL566.getEntityData().get(WyvernOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL569 && (Boolean)_datEntL569.getEntityData().get(WyvernOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL572
                     && (Boolean)_datEntL572.getEntityData().get(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL575
                     && (Boolean)_datEntL575.getEntityData().get(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL578
                     && (Boolean)_datEntL578.getEntityData().get(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL581
                     && (Boolean)_datEntL581.getEntityData().get(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof WyvernOstrichEntity _datEntL584
                     && (Boolean)_datEntL584.getEntityData().get(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof WyvernOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(WyvernOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }
               }
            }
         }
      }
   }
}
