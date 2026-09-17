package net.mocreatures.procedures;

import io.netty.buffer.Unpooled;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.PorcupineEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.mocreatures.world.inventory.NaminingPorcupineMenu;

public class PorcupineRightClickedOnEntityProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
      if (entity != null && sourceentity != null) {
         if (!(entity instanceof TamableAnimal _tamEnt && _tamEnt.isTame())
            && !sourceentity.isShiftKeyDown()
            && ((PorcupineEntity)entity).animationprocedure.equals("frightened")) {
            if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner) {
               _toTame.tame(_owner);
            }

            if (sourceentity instanceof ServerPlayer _ent) {
               final BlockPos _bpos = BlockPos.containing(x, y, z);
               _ent.openMenu(new MenuProvider() {
                  public Component getDisplayName() {
                     return Component.literal("NaminingPorcupine");
                  }

                  public boolean shouldTriggerClientSideContainerClosingOnOpen() {
                     return false;
                  }

                  public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                     return new NaminingPorcupineMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                  }
               }, _bpos);
            }

            if (entity instanceof PorcupineEntity) {
               ((PorcupineEntity)entity).setAnimation("empty");
            }
         }

         if (sourceentity.isShiftKeyDown()
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
            && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
            if (sourceentity instanceof LivingEntity _entity) {
               ItemStack _setstack = new ItemStack((ItemLike)MocreaturesModItems.HELD_PORCUPINE.get()).copy();
               _setstack.setCount(1);
               _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
               if (_entity instanceof Player _player) {
                  _player.getInventory().setChanged();
               }
            }

            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .set(DataComponents.CUSTOM_NAME, Component.literal(entity.getDisplayName().getString()));
            String _tagName = "PorcupineName";
            String _tagValue = entity.getDisplayName().getString();
            CustomData.update(
               DataComponents.CUSTOM_DATA,
               sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY,
               tag -> tag.putString("PorcupineName", _tagValue)
            );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FIRE_ASPECT),
                  (int)entity.getPersistentData().getDouble("PorcupineFireAspect")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS),
                  (int)entity.getPersistentData().getDouble("PorcupineSharpness")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING),
                  (int)entity.getPersistentData().getDouble("PorcupineUnbreaking")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING),
                  (int)entity.getPersistentData().getDouble("PorcupineMending")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER),
                  (int)entity.getPersistentData().getDouble("PorcupinePower")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOOTING),
                  (int)entity.getPersistentData().getDouble("PorcupineLooting")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SMITE),
                  (int)entity.getPersistentData().getDouble("PorcupineSmite")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BANE_OF_ARTHROPODS),
                  (int)entity.getPersistentData().getDouble("PorcupineBaneOfArthropods")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .enchant(
                  world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.THORNS),
                  (int)entity.getPersistentData().getDouble("PorcupineThorns")
               );
            (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
               .setDamageValue((int)entity.getPersistentData().getDouble("PorcupineDurability"));
            MocreaturesMod.queueServerWork(1, () -> {
               if (!entity.level().isClientSide()) {
                  entity.discard();
               }
            });
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
            .is(ItemTags.create(ResourceLocation.parse("mocreatures:plants")))) {
            entity.getPersistentData().putDouble("PorcupineDurability", entity.getPersistentData().getDouble("PorcupineDurability") - 100.0);
            if (world instanceof ServerLevel _level) {
               _level.sendParticles(ParticleTypes.HEART, x, y, z, 6, 0.5, 0.5, 0.5, 1.0);
            }

            if (entity instanceof LivingEntity _entity) {
               _entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1.0F) + 4.0F);
            }

            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove;
               ItemStack var54 = _stktoremove = sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY;
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
         }
      }
   }
}
