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
import net.mocreatures.entity.UndeadOstrichEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class UndeadOstrichEquipmentProcedure {
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
         if (entity instanceof UndeadOstrichEntity && entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
            if (!(entity instanceof UndeadOstrichEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(UndeadOstrichEntity.DATA_Saddle))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.CRAFTED_SADDLE.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Saddle, true);
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL7 && (Boolean)_datEntL7.getEntityData().get(UndeadOstrichEntity.DATA_Chest))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHEST.asItem()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack(Blocks.CHEST);
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Chest, true);
               }
            }

            if (entity instanceof UndeadOstrichEntity _datEntL12
               && (Boolean)_datEntL12.getEntityData().get(UndeadOstrichEntity.DATA_Saddle)
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
               sourceentity.startRiding(entity);
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL15 && (Boolean)_datEntL15.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL23 && (Boolean)_datEntL23.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL26 && (Boolean)_datEntL26.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL29 && (Boolean)_datEntL29.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL32 && (Boolean)_datEntL32.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL35 && (Boolean)_datEntL35.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL38 && (Boolean)_datEntL38.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL41
                     && (Boolean)_datEntL41.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL44
                     && (Boolean)_datEntL44.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL47
                     && (Boolean)_datEntL47.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL50
                     && (Boolean)_datEntL50.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL53
                     && (Boolean)_datEntL53.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL56 && (Boolean)_datEntL56.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL59 && (Boolean)_datEntL59.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL67 && (Boolean)_datEntL67.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL70 && (Boolean)_datEntL70.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL73 && (Boolean)_datEntL73.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL76 && (Boolean)_datEntL76.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL79 && (Boolean)_datEntL79.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL82 && (Boolean)_datEntL82.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL85
                     && (Boolean)_datEntL85.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL88
                     && (Boolean)_datEntL88.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL91
                     && (Boolean)_datEntL91.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL94
                     && (Boolean)_datEntL94.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL97
                     && (Boolean)_datEntL97.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL100 && (Boolean)_datEntL100.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL103 && (Boolean)_datEntL103.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL111 && (Boolean)_datEntL111.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL114 && (Boolean)_datEntL114.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL117 && (Boolean)_datEntL117.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL120 && (Boolean)_datEntL120.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL123 && (Boolean)_datEntL123.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL126 && (Boolean)_datEntL126.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL129
                     && (Boolean)_datEntL129.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL132
                     && (Boolean)_datEntL132.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL135
                     && (Boolean)_datEntL135.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL138
                     && (Boolean)_datEntL138.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL141
                     && (Boolean)_datEntL141.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL144 && (Boolean)_datEntL144.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL147 && (Boolean)_datEntL147.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL155 && (Boolean)_datEntL155.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL158 && (Boolean)_datEntL158.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL161 && (Boolean)_datEntL161.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL164 && (Boolean)_datEntL164.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL167 && (Boolean)_datEntL167.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL170 && (Boolean)_datEntL170.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL173
                     && (Boolean)_datEntL173.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL176
                     && (Boolean)_datEntL176.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL179
                     && (Boolean)_datEntL179.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL182
                     && (Boolean)_datEntL182.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL185
                     && (Boolean)_datEntL185.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL188 && (Boolean)_datEntL188.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL191 && (Boolean)_datEntL191.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL199 && (Boolean)_datEntL199.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL202 && (Boolean)_datEntL202.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL205 && (Boolean)_datEntL205.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL208 && (Boolean)_datEntL208.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL211 && (Boolean)_datEntL211.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL214 && (Boolean)_datEntL214.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL217
                     && (Boolean)_datEntL217.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL220
                     && (Boolean)_datEntL220.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL223
                     && (Boolean)_datEntL223.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL226
                     && (Boolean)_datEntL226.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL229
                     && (Boolean)_datEntL229.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL232 && (Boolean)_datEntL232.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL235 && (Boolean)_datEntL235.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL243 && (Boolean)_datEntL243.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL246 && (Boolean)_datEntL246.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL249 && (Boolean)_datEntL249.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL252 && (Boolean)_datEntL252.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL255 && (Boolean)_datEntL255.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL258 && (Boolean)_datEntL258.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL261
                     && (Boolean)_datEntL261.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL264
                     && (Boolean)_datEntL264.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL267
                     && (Boolean)_datEntL267.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL270
                     && (Boolean)_datEntL270.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL273
                     && (Boolean)_datEntL273.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL276 && (Boolean)_datEntL276.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL279 && (Boolean)_datEntL279.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL287 && (Boolean)_datEntL287.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL290 && (Boolean)_datEntL290.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL293 && (Boolean)_datEntL293.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL296 && (Boolean)_datEntL296.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL299 && (Boolean)_datEntL299.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL302 && (Boolean)_datEntL302.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL305
                     && (Boolean)_datEntL305.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL308
                     && (Boolean)_datEntL308.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL311
                     && (Boolean)_datEntL311.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL314
                     && (Boolean)_datEntL314.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL317
                     && (Boolean)_datEntL317.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL320 && (Boolean)_datEntL320.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL323 && (Boolean)_datEntL323.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL331 && (Boolean)_datEntL331.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL334 && (Boolean)_datEntL334.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL337 && (Boolean)_datEntL337.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL340 && (Boolean)_datEntL340.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL343 && (Boolean)_datEntL343.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL346 && (Boolean)_datEntL346.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL349 && (Boolean)_datEntL349.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL352
                     && (Boolean)_datEntL352.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL355
                     && (Boolean)_datEntL355.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL358
                     && (Boolean)_datEntL358.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL361
                     && (Boolean)_datEntL361.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL364 && (Boolean)_datEntL364.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL367 && (Boolean)_datEntL367.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL375 && (Boolean)_datEntL375.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL378 && (Boolean)_datEntL378.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL381 && (Boolean)_datEntL381.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL384 && (Boolean)_datEntL384.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL387 && (Boolean)_datEntL387.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL390 && (Boolean)_datEntL390.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL393 && (Boolean)_datEntL393.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL396
                     && (Boolean)_datEntL396.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL399
                     && (Boolean)_datEntL399.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL402
                     && (Boolean)_datEntL402.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL405
                     && (Boolean)_datEntL405.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL408 && (Boolean)_datEntL408.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL411 && (Boolean)_datEntL411.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL419 && (Boolean)_datEntL419.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL422 && (Boolean)_datEntL422.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL425 && (Boolean)_datEntL425.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL428 && (Boolean)_datEntL428.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL431 && (Boolean)_datEntL431.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL434 && (Boolean)_datEntL434.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL437 && (Boolean)_datEntL437.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL440
                     && (Boolean)_datEntL440.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL443
                     && (Boolean)_datEntL443.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL446
                     && (Boolean)_datEntL446.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL449
                     && (Boolean)_datEntL449.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL452 && (Boolean)_datEntL452.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(
                  entity instanceof UndeadOstrichEntity _datEntL455
                     && (Boolean)_datEntL455.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL463 && (Boolean)_datEntL463.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL466 && (Boolean)_datEntL466.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL469 && (Boolean)_datEntL469.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL472 && (Boolean)_datEntL472.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL475 && (Boolean)_datEntL475.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL478 && (Boolean)_datEntL478.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL481 && (Boolean)_datEntL481.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL484
                     && (Boolean)_datEntL484.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL487
                     && (Boolean)_datEntL487.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL490
                     && (Boolean)_datEntL490.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL493
                     && (Boolean)_datEntL493.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL496 && (Boolean)_datEntL496.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(
                  entity instanceof UndeadOstrichEntity _datEntL499
                     && (Boolean)_datEntL499.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL507 && (Boolean)_datEntL507.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL510 && (Boolean)_datEntL510.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL513 && (Boolean)_datEntL513.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL516 && (Boolean)_datEntL516.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL519 && (Boolean)_datEntL519.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL522 && (Boolean)_datEntL522.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL525 && (Boolean)_datEntL525.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL528
                     && (Boolean)_datEntL528.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL531
                     && (Boolean)_datEntL531.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL534
                     && (Boolean)_datEntL534.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL537
                     && (Boolean)_datEntL537.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL540 && (Boolean)_datEntL540.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, false);
                     }
                  }
               }
            }

            if (!(entity instanceof UndeadOstrichEntity _datEntL543 && (Boolean)_datEntL543.getEntityData().get(UndeadOstrichEntity.DATA_Netherite_Helmet))
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
                  if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Netherite_Helmet, true);
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL551 && (Boolean)_datEntL551.getEntityData().get(UndeadOstrichEntity.DATA_Gold_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Gold_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL554 && (Boolean)_datEntL554.getEntityData().get(UndeadOstrichEntity.DATA_Diamond_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Diamond_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL557 && (Boolean)_datEntL557.getEntityData().get(UndeadOstrichEntity.DATA_Iron_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Iron_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL560 && (Boolean)_datEntL560.getEntityData().get(UndeadOstrichEntity.DATA_Fur_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FUR_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Fur_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL563 && (Boolean)_datEntL563.getEntityData().get(UndeadOstrichEntity.DATA_Reptile_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.REPTILE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Reptile_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL566 && (Boolean)_datEntL566.getEntityData().get(UndeadOstrichEntity.DATA_Hide_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.HIDE_ARMOR_HELMET.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Hide_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL569 && (Boolean)_datEntL569.getEntityData().get(UndeadOstrichEntity.DATA_Leather_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LEATHER_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Leather_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL572
                     && (Boolean)_datEntL572.getEntityData().get(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FROST_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL575
                     && (Boolean)_datEntL575.getEntityData().get(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.EARTH_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL578
                     && (Boolean)_datEntL578.getEntityData().get(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CAVE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL581
                     && (Boolean)_datEntL581.getEntityData().get(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.FIRE_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }

                  if (entity instanceof UndeadOstrichEntity _datEntL584
                     && (Boolean)_datEntL584.getEntityData().get(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet)) {
                     if (world instanceof ServerLevel _level) {
                        ItemEntity entityToSpawn = new ItemEntity(
                           _level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.UNDEAD_SCORPION_ARMOR_HELMET.get())
                        );
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                     }

                     if (entity instanceof UndeadOstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(UndeadOstrichEntity.DATA_Undead_Scorpion_Helmet, false);
                     }
                  }
               }
            }
         }
      }
   }
}
