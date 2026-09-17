package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.OstrichEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class OstrichOnEntityTickUpdateProcedure {
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
         if (entity instanceof OstrichEntity) {
            if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
               if (!(entity instanceof OstrichEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(OstrichEntity.DATA_Saddle))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                     == MocreaturesModItems.CRAFTED_SADDLE.get()
                  && !(entity instanceof OstrichEntity _datEntL5 && (Boolean)_datEntL5.getEntityData().get(OstrichEntity.DATA_Baby))) {
                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Saddle, true);
                  }

                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get());
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }
               }

               if (entity instanceof OstrichEntity _datEntL8
                  && (Boolean)_datEntL8.getEntityData().get(OstrichEntity.DATA_Saddle)
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
                  && !(entity instanceof OstrichEntity _datEntL10 && (Boolean)_datEntL10.getEntityData().get(OstrichEntity.DATA_Baby))) {
                  sourceentity.startRiding(entity);
               }

               if (!(entity instanceof OstrichEntity _datEntL12 && (Boolean)_datEntL12.getEntityData().get(OstrichEntity.DATA_Chest))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHEST.asItem()
                  && !(entity instanceof OstrichEntity _datEntL15 && (Boolean)_datEntL15.getEntityData().get(OstrichEntity.DATA_Baby))) {
                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Chest, true);
                  }

                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.CHEST);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL18 && (Boolean)_datEntL18.getEntityData().get(OstrichEntity.DATA_Diamond_Helmet))
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
                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Diamond_Helmet, true);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Gold_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Iron_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Fur_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Reptile_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Hide_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Leather_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL36 && (Boolean)_datEntL36.getEntityData().get(OstrichEntity.DATA_Gold_Helmet))
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
                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Gold_Helmet, true);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Diamond_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Iron_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Fur_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Reptile_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Hide_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Leather_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL54 && (Boolean)_datEntL54.getEntityData().get(OstrichEntity.DATA_Iron_Helmet))
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
                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Gold_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Diamond_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Iron_Helmet, true);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Fur_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Reptile_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Hide_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Leather_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL72 && (Boolean)_datEntL72.getEntityData().get(OstrichEntity.DATA_Fur_Helmet))
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
                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Gold_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Diamond_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Iron_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Fur_Helmet, true);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Reptile_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Hide_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Leather_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL90 && (Boolean)_datEntL90.getEntityData().get(OstrichEntity.DATA_Reptile_Helmet))
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
                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Gold_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Diamond_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Iron_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Fur_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Reptile_Helmet, true);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Hide_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Leather_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL108 && (Boolean)_datEntL108.getEntityData().get(OstrichEntity.DATA_Hide_Helmet))
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
                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Gold_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Diamond_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Iron_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Fur_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Reptile_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Hide_Helmet, true);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Leather_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL126 && (Boolean)_datEntL126.getEntityData().get(OstrichEntity.DATA_Leather_Helmet))
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
                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Gold_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Diamond_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Iron_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Fur_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Reptile_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Hide_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Leather_Helmet, true);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Frost_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Dirt_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cave_Scorpion_Helmet, false);
                     }

                     if (entity instanceof OstrichEntity _datEntSetL) {
                        _datEntSetL.getEntityData().set(OstrichEntity.DATA_Nether_Scorpion_Helmet, false);
                     }
                  }
               }
            }

            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && entity instanceof OstrichEntity _datEntL145
               && (Boolean)_datEntL145.getEntityData().get(OstrichEntity.DATA_Chest)) {
               if (!(entity instanceof OstrichEntity _datEntL146 && (Boolean)_datEntL146.getEntityData().get(OstrichEntity.DATA_Green_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GREEN_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.GREEN_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL166 && (Boolean)_datEntL166.getEntityData().get(OstrichEntity.DATA_LightGreen_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIME_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.LIME_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL186 && (Boolean)_datEntL186.getEntityData().get(OstrichEntity.DATA_Blue_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BLUE_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.BLUE_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL206 && (Boolean)_datEntL206.getEntityData().get(OstrichEntity.DATA_LightBlue_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_BLUE_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.LIGHT_BLUE_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL226 && (Boolean)_datEntL226.getEntityData().get(OstrichEntity.DATA_Pink_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PINK_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.PINK_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL246 && (Boolean)_datEntL246.getEntityData().get(OstrichEntity.DATA_Magenta_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MAGENTA_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.MAGENTA_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL266 && (Boolean)_datEntL266.getEntityData().get(OstrichEntity.DATA_Purple_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PURPLE_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.PURPLE_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL286 && (Boolean)_datEntL286.getEntityData().get(OstrichEntity.DATA_Orange_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ORANGE_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.ORANGE_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL306 && (Boolean)_datEntL306.getEntityData().get(OstrichEntity.DATA_Cyan_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CYAN_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.CYAN_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL326 && (Boolean)_datEntL326.getEntityData().get(OstrichEntity.DATA_Red_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.RED_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.RED_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL346 && (Boolean)_datEntL346.getEntityData().get(OstrichEntity.DATA_Yellow_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.YELLOW_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.YELLOW_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL366 && (Boolean)_datEntL366.getEntityData().get(OstrichEntity.DATA_White_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.WHITE_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL386 && (Boolean)_datEntL386.getEntityData().get(OstrichEntity.DATA_Grey_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRAY_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.GRAY_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL406 && (Boolean)_datEntL406.getEntityData().get(OstrichEntity.DATA_LightGrey_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_GRAY_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.LIGHT_GRAY_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL426 && (Boolean)_datEntL426.getEntityData().get(OstrichEntity.DATA_Black_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BLACK_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.BLACK_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, true);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, false);
                  }
               }

               if (!(entity instanceof OstrichEntity _datEntL446 && (Boolean)_datEntL446.getEntityData().get(OstrichEntity.DATA_Brown_Flag))
                  && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_WOOL.asItem()) {
                  if (sourceentity instanceof Player _player) {
                     ItemStack _stktoremove = new ItemStack(Blocks.BROWN_WOOL);
                     _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Green_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGreen_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Blue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightBlue_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Pink_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Magenta_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Purple_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Orange_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Cyan_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Red_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Yellow_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_White_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Grey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_LightGrey_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Black_Flag, false);
                  }

                  if (entity instanceof OstrichEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(OstrichEntity.DATA_Brown_Flag, true);
                  }
               }
            }
         }
      }
   }
}
