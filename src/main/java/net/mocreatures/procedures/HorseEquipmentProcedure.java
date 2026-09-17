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
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class HorseEquipmentProcedure {
   @SubscribeEvent
   public static void onRightClickEntity(EntityInteract var0) {
      if (var0.getHand() == var0.getEntity().getUsedItemHand()) {
         execute(var0, var0.getLevel(), var0.getTarget(), var0.getEntity());
      }
   }

   public static void execute(LevelAccessor var0, Entity var1, Entity var2) {
      execute(null, var0, var1, var2);
   }

   private static void execute(@Nullable Event var0, LevelAccessor var1, Entity var2, Entity var3) {
      if (var2 != null && var3 != null && var2 instanceof HorseEntity && var2 instanceof TamableAnimal var4 && var4.isTame()) {
         boolean var5;
         if (var2 instanceof HorseEntity var6 && (Boolean)var6.getEntityData().get(HorseEntity.DATA_Baby)) {
            var5 = true;
         } else {
            var5 = false;
         }

         if (!var5) {
            if (var2 instanceof HorseEntity var41 && (Boolean)var41.getEntityData().get(HorseEntity.DATA_Saddle)) {
               var5 = true;
            } else {
               var5 = false;
            }

            ItemStack var42 = var3 instanceof LivingEntity var7 ? var7.getMainHandItem() : ItemStack.EMPTY;
            if (!var5 && (var42.getItem() == MocreaturesModItems.CRAFTED_SADDLE.get() || var42.getItem() == Items.SADDLE)) {
               if (var3 instanceof Player var43 && !var43.getAbilities().instabuild) {
                  var42.shrink(1);
               }

               if (var2 instanceof HorseEntity var44) {
                  var44.getEntityData().set(HorseEntity.DATA_Saddle, true);
               }
            }

            if ((var2 instanceof HorseEntity var45 ? (Integer)var45.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 105
               || (var2 instanceof HorseEntity var8 ? (Integer)var8.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 106
               || (var2 instanceof HorseEntity var9 ? (Integer)var9.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 111
               || (var2 instanceof HorseEntity var10 ? (Integer)var10.getEntityData().get(HorseEntity.DATA_Variant) : 0) == 112) {
               if (var2 instanceof HorseEntity var11 && (Boolean)var11.getEntityData().get(HorseEntity.DATA_Special)) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (var5) {
                  if (var2 instanceof HorseEntity var104 && (Boolean)var104.getEntityData().get(HorseEntity.DATA_Chest)) {
                     var5 = true;
                  } else {
                     var5 = false;
                  }

                  if (!var5 && (var3 instanceof LivingEntity var105 ? var105.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHEST.asItem()) {
                     if (var3 instanceof Player var12) {
                        ItemStack var13 = new ItemStack(Blocks.CHEST);
                        var12.getInventory().clearOrCountMatchingItems(var1x -> var13.getItem() == var1x.getItem(), 1, var12.inventoryMenu.getCraftSlots());
                     }

                     if (var2 instanceof HorseEntity var107) {
                        var107.getEntityData().set(HorseEntity.DATA_Chest, true);
                     }
                  }
               }
            }

            if (var2 instanceof HorseEntity var46 && (Boolean)var46.getEntityData().get(HorseEntity.DATA_Fairy)) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (var5) {
               if (var2 instanceof HorseEntity var47 && (Boolean)var47.getEntityData().get(HorseEntity.DATA_Chest)) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (!var5 && (var3 instanceof LivingEntity var48 ? var48.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHEST.asItem()) {
                  if (var3 instanceof Player var64) {
                     ItemStack var92 = new ItemStack(Blocks.CHEST);
                     var64.getInventory().clearOrCountMatchingItems(var1x -> var92.getItem() == var1x.getItem(), 1, var64.inventoryMenu.getCraftSlots());
                  }

                  if (var2 instanceof HorseEntity var65) {
                     var65.getEntityData().set(HorseEntity.DATA_Chest, true);
                  }
               }
            }

            if (var2 instanceof HorseEntity var49 && (Boolean)var49.getEntityData().get(HorseEntity.DATA_Special)) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (!var5) {
               if (var2 instanceof HorseEntity var50 && (Boolean)var50.getEntityData().get(HorseEntity.DATA_Fairy)) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (!var5) {
                  if (var2 instanceof HorseEntity var51 && (Boolean)var51.getEntityData().get(HorseEntity.DATA_MetalArmored)) {
                     var5 = true;
                  } else {
                     var5 = false;
                  }

                  if (!var5 && (var3 instanceof LivingEntity var52 ? var52.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_HORSE_ARMOR) {
                     if (var3 instanceof Player var66) {
                        ItemStack var93 = new ItemStack(Items.IRON_HORSE_ARMOR);
                        var66.getInventory().clearOrCountMatchingItems(var1x -> var93.getItem() == var1x.getItem(), 1, var66.inventoryMenu.getCraftSlots());
                     }

                     if (var2 instanceof HorseEntity var67) {
                        var67.getEntityData().set(HorseEntity.DATA_MetalArmored, true);
                     }

                     if (var2 instanceof HorseEntity var68 && (Boolean)var68.getEntityData().get(HorseEntity.DATA_GoldenArmored)) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     if (var5) {
                        if (var2 instanceof HorseEntity var69) {
                           var69.getEntityData().set(HorseEntity.DATA_GoldenArmored, false);
                        }

                        if (var1 instanceof ServerLevel var70) {
                           ItemEntity var94 = new ItemEntity(var70, var2.getX(), var2.getY(), var2.getZ(), new ItemStack(Items.GOLDEN_HORSE_ARMOR));
                           var94.setPickUpDelay(10);
                           var70.addFreshEntity(var94);
                        }
                     }

                     if (var2 instanceof HorseEntity var71 && (Boolean)var71.getEntityData().get(HorseEntity.DATA_DiamondArmored)) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     if (var5) {
                        if (var2 instanceof HorseEntity var72) {
                           var72.getEntityData().set(HorseEntity.DATA_DiamondArmored, false);
                        }

                        if (var1 instanceof ServerLevel var73) {
                           ItemEntity var95 = new ItemEntity(var73, var2.getX(), var2.getY(), var2.getZ(), new ItemStack(Items.DIAMOND_HORSE_ARMOR));
                           var95.setPickUpDelay(10);
                           var73.addFreshEntity(var95);
                        }
                     }
                  }
               }
            }

            if (var2 instanceof HorseEntity var53 && (Boolean)var53.getEntityData().get(HorseEntity.DATA_Special)) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (!var5) {
               if (var2 instanceof HorseEntity var54 && (Boolean)var54.getEntityData().get(HorseEntity.DATA_Fairy)) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (!var5) {
                  if (var2 instanceof HorseEntity var55 && (Boolean)var55.getEntityData().get(HorseEntity.DATA_GoldenArmored)) {
                     var5 = true;
                  } else {
                     var5 = false;
                  }

                  if (!var5 && (var3 instanceof LivingEntity var56 ? var56.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_HORSE_ARMOR) {
                     if (var3 instanceof Player var74) {
                        ItemStack var96 = new ItemStack(Items.GOLDEN_HORSE_ARMOR);
                        var74.getInventory().clearOrCountMatchingItems(var1x -> var96.getItem() == var1x.getItem(), 1, var74.inventoryMenu.getCraftSlots());
                     }

                     if (var2 instanceof HorseEntity var75) {
                        var75.getEntityData().set(HorseEntity.DATA_GoldenArmored, true);
                     }

                     if (var2 instanceof HorseEntity var76 && (Boolean)var76.getEntityData().get(HorseEntity.DATA_MetalArmored)) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     if (var5) {
                        if (var2 instanceof HorseEntity var77) {
                           var77.getEntityData().set(HorseEntity.DATA_MetalArmored, false);
                        }

                        if (var1 instanceof ServerLevel var78) {
                           ItemEntity var97 = new ItemEntity(var78, var2.getX(), var2.getY(), var2.getZ(), new ItemStack(Items.IRON_HORSE_ARMOR));
                           var97.setPickUpDelay(10);
                           var78.addFreshEntity(var97);
                        }
                     }

                     if (var2 instanceof HorseEntity var79 && (Boolean)var79.getEntityData().get(HorseEntity.DATA_DiamondArmored)) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     if (var5) {
                        if (var2 instanceof HorseEntity var80) {
                           var80.getEntityData().set(HorseEntity.DATA_DiamondArmored, false);
                        }

                        if (var1 instanceof ServerLevel var81) {
                           ItemEntity var98 = new ItemEntity(var81, var2.getX(), var2.getY(), var2.getZ(), new ItemStack(Items.DIAMOND_HORSE_ARMOR));
                           var98.setPickUpDelay(10);
                           var81.addFreshEntity(var98);
                        }
                     }
                  }
               }
            }

            if (var2 instanceof HorseEntity var57 && (Boolean)var57.getEntityData().get(HorseEntity.DATA_Special)) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (!var5) {
               if (var2 instanceof HorseEntity var58 && (Boolean)var58.getEntityData().get(HorseEntity.DATA_Fairy)) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (!var5) {
                  if (var2 instanceof HorseEntity var59 && (Boolean)var59.getEntityData().get(HorseEntity.DATA_DiamondArmored)) {
                     var5 = true;
                  } else {
                     var5 = false;
                  }

                  if (!var5 && (var3 instanceof LivingEntity var60 ? var60.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND_HORSE_ARMOR) {
                     if (var3 instanceof Player var82) {
                        ItemStack var99 = new ItemStack(Items.DIAMOND_HORSE_ARMOR);
                        var82.getInventory().clearOrCountMatchingItems(var1x -> var99.getItem() == var1x.getItem(), 1, var82.inventoryMenu.getCraftSlots());
                     }

                     if (var2 instanceof HorseEntity var83) {
                        var83.getEntityData().set(HorseEntity.DATA_DiamondArmored, true);
                     }

                     if (var2 instanceof HorseEntity var84 && (Boolean)var84.getEntityData().get(HorseEntity.DATA_MetalArmored)) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     if (var5) {
                        if (var2 instanceof HorseEntity var85) {
                           var85.getEntityData().set(HorseEntity.DATA_MetalArmored, false);
                        }

                        if (var1 instanceof ServerLevel var86) {
                           ItemEntity var100 = new ItemEntity(var86, var2.getX(), var2.getY(), var2.getZ(), new ItemStack(Items.IRON_HORSE_ARMOR));
                           var100.setPickUpDelay(10);
                           var86.addFreshEntity(var100);
                        }
                     }

                     if (var2 instanceof HorseEntity var87 && (Boolean)var87.getEntityData().get(HorseEntity.DATA_GoldenArmored)) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     if (var5) {
                        if (var2 instanceof HorseEntity var88) {
                           var88.getEntityData().set(HorseEntity.DATA_GoldenArmored, false);
                        }

                        if (var1 instanceof ServerLevel var89) {
                           ItemEntity var101 = new ItemEntity(var89, var2.getX(), var2.getY(), var2.getZ(), new ItemStack(Items.GOLDEN_HORSE_ARMOR));
                           var101.setPickUpDelay(10);
                           var89.addFreshEntity(var101);
                        }
                     }
                  }
               }
            }

            label363:
            if ((var2 instanceof HorseEntity var61 ? (Integer)var61.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 102
               || (var2 instanceof HorseEntity var90 ? (Integer)var90.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 107
               || (var2 instanceof HorseEntity var102 ? (Integer)var102.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 110
               || (var2 instanceof HorseEntity var103 ? (Integer)var103.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 111
               || (var2 instanceof HorseEntity var106 ? (Integer)var106.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 112
               || (var2 instanceof HorseEntity var108 ? (Integer)var108.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 113
               || (var2 instanceof HorseEntity var109 ? (Integer)var109.getEntityData().get(HorseEntity.DATA_Variant) : 0) != 114) {
               if (var2 instanceof HorseEntity var14 && (Boolean)var14.getEntityData().get(HorseEntity.DATA_Special)) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (!var5) {
                  if (var2 instanceof HorseEntity var110 && (Boolean)var110.getEntityData().get(HorseEntity.DATA_Fairy)) {
                     var5 = true;
                  } else {
                     var5 = false;
                  }

                  if (!var5) {
                     break label363;
                  }
               }

               if (var2 instanceof HorseEntity var111 && (Boolean)var111.getEntityData().get(HorseEntity.DATA_CrystalineArmored)) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (!var5
                  && (var3 instanceof LivingEntity var112 ? var112.getMainHandItem() : ItemStack.EMPTY).getItem()
                     == MocreaturesModItems.CRYSTAL_HORSE_ARMOR.get()) {
                  if (var3 instanceof Player var15) {
                     ItemStack var16 = new ItemStack((ItemLike)MocreaturesModItems.CRYSTAL_HORSE_ARMOR.get());
                     var15.getInventory().clearOrCountMatchingItems(var1x -> var16.getItem() == var1x.getItem(), 1, var15.inventoryMenu.getCraftSlots());
                  }

                  if (var2 instanceof HorseEntity var113) {
                     var113.getEntityData().set(HorseEntity.DATA_CrystalineArmored, true);
                  }
               }
            }

            if (var2 instanceof HorseEntity var62 && (Boolean)var62.getEntityData().get(HorseEntity.DATA_Saddle)) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (var5
               && (var3 instanceof LivingEntity var63 ? var63.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
               && !(var3 instanceof Player var91 && var91.isSecondaryUseActive())) {
               var3.startRiding(var2);
            }
         }
      }
   }
}
