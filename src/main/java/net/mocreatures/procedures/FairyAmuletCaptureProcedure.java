package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.entity.HorseEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.Capabilities.ItemHandler;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.neoforged.neoforge.items.IItemHandlerModifiable;

@EventBusSubscriber
public class FairyAmuletCaptureProcedure {
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
         boolean canCapture = false;
         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:fairy_amulet/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:moc_horse")))) {
            if (entity instanceof HorseEntity _datEntL3
               && (Boolean)_datEntL3.getEntityData().get(HorseEntity.DATA_Fairy)
               && entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof HorseEntity _datEntL5 && (Boolean)_datEntL5.getEntityData().get(HorseEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FAIRY_AMULET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:horse";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:horse")
               );
               _tagName = "Name";
               _tagValue = entity.getDisplayName().getString();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Name", entity.getDisplayName().getString())
               );
               if (entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame()) {
                  _tagValue = "Owner";
                  String _tagValuex = sourceentity.getDisplayName().getString();
                  CustomData.update(
                     DataComponents.CUSTOM_DATA,
                     sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                     tag -> tag.putString("Owner", _tagValuex)
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var123 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", _tagValuex)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", _tagValuexx)
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var124 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", _tagValuexxx)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var125 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", _tagValuexxxx)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", _tagValuexxxxx)
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", _tagValuexxxxxx)
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", _tagValuexxxxxxx)
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", _tagValuexxxxxxxx)
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", _tagValuexxxxxxxxx)
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", _tagValuexxxxxxxxxx)
               );
               _tagName = "Variant";
               double _tagValuexxxxxxxxxxx;
               double var126 = _tagValuexxxxxxxxxxx = entity instanceof HorseEntity _datEntI
                  ? ((Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant)).intValue()
                  : 0.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Variant", _tagValuexxxxxxxxxxx)
               );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:moc_horse")))) {
                  if (entity instanceof HorseEntity _datEntL52
                     && (Boolean)_datEntL52.getEntityData().get(HorseEntity.DATA_Saddle)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof HorseEntity _datEntL54
                     && (Boolean)_datEntL54.getEntityData().get(HorseEntity.DATA_Chest)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CHEST));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof HorseEntity _datEntL56
                     && (Boolean)_datEntL56.getEntityData().get(HorseEntity.DATA_MetalArmored)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof HorseEntity _datEntL58
                     && (Boolean)_datEntL58.getEntityData().get(HorseEntity.DATA_GoldenArmored)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof HorseEntity _datEntL60
                     && (Boolean)_datEntL60.getEntityData().get(HorseEntity.DATA_DiamondArmored)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND_HORSE_ARMOR));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (entity instanceof HorseEntity _datEntL62
                     && (Boolean)_datEntL62.getEntityData().get(HorseEntity.DATA_CrystalineArmored)
                     && world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.CRYSTAL_HORSE_ARMOR.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entityx) {
                                 return entityx.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(0, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(1, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(2, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(3, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(4, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(5, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(6, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(7, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(8, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(9, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(10, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(11, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(12, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(13, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(14, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(15, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(16, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(
                        _level,
                        x,
                        y,
                        z,
                        (new Object() {
                              public ItemStack getItemStack(int sltid, Entity entity) {
                                 return entity.getCapability(ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler
                                    ? _modHandler.getStackInSlot(sltid).copy()
                                    : ItemStack.EMPTY;
                              }
                           })
                           .getItemStack(17, entity)
                     );
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }

                  if (!entity.level().isClientSide()) {
                     entity.discard();
                  }
               }
            }
         }
      }
   }
}
