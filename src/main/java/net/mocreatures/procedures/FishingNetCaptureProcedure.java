package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.ItemLike;
import net.mocreatures.entity.AnchovyEntity;
import net.mocreatures.entity.AngelfishEntity;
import net.mocreatures.entity.AnglerfishEntity;
import net.mocreatures.entity.BassEntity;
import net.mocreatures.entity.FishyEntity;
import net.mocreatures.entity.GoldFishEntity;
import net.mocreatures.entity.HippoTangEntity;
import net.mocreatures.entity.MandarinfishEntity;
import net.mocreatures.entity.PiranhaEntity;
import net.mocreatures.entity.SharkEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class FishingNetCaptureProcedure {
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
         boolean canCapture = false;
         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:shark")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof SharkEntity _datEntL4 && (Boolean)_datEntL4.getEntityData().get(SharkEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:shark";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:shark")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var542 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var543 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var544 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:shark"))) && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:fishy")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof FishyEntity _datEntL53 && (Boolean)_datEntL53.getEntityData().get(FishyEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:fishy";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:fishy")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var548 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var549 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var550 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var551 = entity instanceof FishyEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var551)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:fishy"))) && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:anchovy")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof AnchovyEntity _datEntL105 && (Boolean)_datEntL105.getEntityData().get(AnchovyEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:anchovy";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:anchovy")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var555 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var556 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var557 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var558 = entity instanceof AnchovyEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var558)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:anchovy"))) && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:gold_fish")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof GoldFishEntity _datEntL157 && (Boolean)_datEntL157.getEntityData().get(GoldFishEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:gold_fish";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:gold_fish")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var562 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var563 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var564 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var565 = entity instanceof GoldFishEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var565)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:gold_fish")))
                  && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:anglerfish")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof AnglerfishEntity _datEntL209 && (Boolean)_datEntL209.getEntityData().get(AnglerfishEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:anglerfish";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:anglerfish")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var569 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var570 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var571 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var572 = entity instanceof AnglerfishEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var572)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:anglerfish")))
                  && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:angelfish")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof AngelfishEntity _datEntL261 && (Boolean)_datEntL261.getEntityData().get(AngelfishEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:angelfish";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:angelfish")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var576 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var577 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var578 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var579 = entity instanceof AngelfishEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var579)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:angelfish")))
                  && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:hippo_tang")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof HippoTangEntity _datEntL313 && (Boolean)_datEntL313.getEntityData().get(HippoTangEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:hippo_tang";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:hippo_tang")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var583 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var584 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var585 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var586 = entity instanceof HippoTangEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var586)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:hippo_tang")))
                  && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:mandarinfish")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof MandarinfishEntity _datEntL365 && (Boolean)_datEntL365.getEntityData().get(MandarinfishEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:mandarinfish";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:mandarinfish")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var590 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var591 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var592 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var593 = entity instanceof MandarinfishEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var593)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:mandarinfish")))
                  && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:piranha")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof PiranhaEntity _datEntL417 && (Boolean)_datEntL417.getEntityData().get(PiranhaEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:piranha";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:piranha")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var597 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var598 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var599 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var600 = entity instanceof PiranhaEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var600)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:piranha"))) && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .is(ItemTags.create(ResourceLocation.parse("mocreatures:net/empty")))
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:bass")))) {
            if (entity instanceof TamableAnimal _tamEnt
               && _tamEnt.isTame()
               && !(entity instanceof BassEntity _datEntL469 && (Boolean)_datEntL469.getEntityData().get(BassEntity.DATA_Baby))) {
               if ((entity instanceof TamableAnimal _tamEntx ? _tamEntx.getOwner() : null) == sourceentity) {
                  canCapture = true;
               } else {
                  canCapture = false;
               }
            }

            if (canCapture) {
               if (sourceentity instanceof LivingEntity _entity) {
                  ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.FISHING_NET_FULL.get()).copy();
                  _setstack.setCount(1);
                  _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                  if (_entity instanceof Player _player) {
                     _player.getInventory().setChanged();
                  }
               }

               String _tagName = "Mob";
               String _tagValue = "mocreatures:bass";
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putString("Mob", "mocreatures:bass")
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
                     tag -> tag.putString("Owner", sourceentity.getDisplayName().getString())
                  );
               }

               _tagName = "Leashed";
               boolean _tagValuex;
               boolean var604 = _tagValuex = entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("Leashed", entity instanceof Mob _mobEnt ? _mobEnt.isLeashed() : false)
               );
               _tagName = "NoGravity";
               boolean _tagValuexx = entity.isNoGravity();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putBoolean("NoGravity", entity.isNoGravity())
               );
               _tagName = "MaxHealth";
               double _tagValuexxx;
               double var605 = _tagValuexxx = entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MaxHealth", entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1.0)
               );
               _tagName = "Health";
               double _tagValuexxxx;
               double var606 = _tagValuexxxx = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0;
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Health", entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0)
               );
               _tagName = "Air";
               double _tagValuexxxxx = entity.getAirSupply();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("Air", (double) entity.getAirSupply())
               );
               _tagName = "MotionX";
               double _tagValuexxxxxx = entity.getDeltaMovement().x();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionX", entity.getDeltaMovement().x())
               );
               _tagName = "MotionY";
               double _tagValuexxxxxxx = entity.getDeltaMovement().y();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionY", entity.getDeltaMovement().y())
               );
               _tagName = "MotionZ";
               double _tagValuexxxxxxxx = entity.getDeltaMovement().z();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("MotionZ", entity.getDeltaMovement().z())
               );
               _tagName = "RotationYaw";
               double _tagValuexxxxxxxxx = entity.getYRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationYaw", (double) entity.getYRot())
               );
               _tagName = "RotationPitch";
               double _tagValuexxxxxxxxxx = entity.getXRot();
               CustomData.update(
                  DataComponents.CUSTOM_DATA,
                  sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                  tag -> tag.putDouble("RotationPitch", (double) entity.getXRot())
               );
               _tagName = "Variant";
               String var607 = entity instanceof BassEntity animatable ? animatable.getTexture() : "null";
                CustomData.update(
                   DataComponents.CUSTOM_DATA,
                   sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
                   tag -> tag.putString("Variant", var607)
                );
               if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:bass"))) && !entity.level().isClientSide()) {
                  entity.discard();
               }
            }
         }
      }
   }
}
