package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.ElephantEntity;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class ElephantTusksProcedure {
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
         if (entity instanceof ElephantEntity
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()
            && !(entity instanceof ElephantEntity _datEntL2 && (Boolean)_datEntL2.getEntityData().get(ElephantEntity.DATA_Baby))) {
            if (!(entity instanceof ElephantEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(ElephantEntity.DATA_Wood_Tusks))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.WOODEN_TUSKS.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.WOODEN_TUSKS.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (world instanceof Level _level) {
                  if (!_level.isClientSide()) {
                     _level.playSound(
                        null,
                        BlockPos.containing(x, y, z),
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_leather")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F
                     );
                  } else {
                     _level.playLocalSound(
                        x,
                        y,
                        z,
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_leather")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F,
                        false
                     );
                  }
               }

               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Wood_Tusks, true);
               }

               if (entity instanceof ElephantEntity _datEntL9 && (Boolean)_datEntL9.getEntityData().get(ElephantEntity.DATA_Iron_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Iron_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.IRON_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if (entity instanceof ElephantEntity _datEntL12 && (Boolean)_datEntL12.getEntityData().get(ElephantEntity.DATA_Diamond_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Diamond_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.DIAMOND_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if (entity instanceof ElephantEntity _datEntL15 && (Boolean)_datEntL15.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Netherite_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.NETHERITE_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }
            }

            if (!(entity instanceof ElephantEntity _datEntL18 && (Boolean)_datEntL18.getEntityData().get(ElephantEntity.DATA_Iron_Tusks))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.IRON_TUSKS.get()) {
               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.IRON_TUSKS.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (world instanceof Level _level) {
                  if (!_level.isClientSide()) {
                     _level.playSound(
                        null,
                        BlockPos.containing(x, y, z),
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_iron")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F
                     );
                  } else {
                     _level.playLocalSound(
                        x,
                        y,
                        z,
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_iron")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F,
                        false
                     );
                  }
               }

               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Iron_Tusks, true);
               }

               if (entity instanceof ElephantEntity _datEntL24 && (Boolean)_datEntL24.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Netherite_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.NETHERITE_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if (entity instanceof ElephantEntity _datEntL27 && (Boolean)_datEntL27.getEntityData().get(ElephantEntity.DATA_Diamond_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Diamond_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.DIAMOND_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if (entity instanceof ElephantEntity _datEntL30 && (Boolean)_datEntL30.getEntityData().get(ElephantEntity.DATA_Wood_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Wood_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.WOODEN_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }
            }

            if (!(entity instanceof ElephantEntity _datEntL33 && (Boolean)_datEntL33.getEntityData().get(ElephantEntity.DATA_Diamond_Tusks))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.DIAMOND_TUSKS.get()) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Diamond_Tusks, true);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.DIAMOND_TUSKS.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (world instanceof Level _level) {
                  if (!_level.isClientSide()) {
                     _level.playSound(
                        null,
                        BlockPos.containing(x, y, z),
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_diamond")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F
                     );
                  } else {
                     _level.playLocalSound(
                        x,
                        y,
                        z,
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_diamond")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F,
                        false
                     );
                  }
               }

               if (entity instanceof ElephantEntity _datEntL39 && (Boolean)_datEntL39.getEntityData().get(ElephantEntity.DATA_Iron_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Iron_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.IRON_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if (entity instanceof ElephantEntity _datEntL42 && (Boolean)_datEntL42.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Netherite_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.NETHERITE_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if (entity instanceof ElephantEntity _datEntL45 && (Boolean)_datEntL45.getEntityData().get(ElephantEntity.DATA_Wood_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Wood_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.WOODEN_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }
            }

            if (!(entity instanceof ElephantEntity _datEntL48 && (Boolean)_datEntL48.getEntityData().get(ElephantEntity.DATA_Netherite_Tusks))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.NETHERITE_TUSKS.get()) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Netherite_Tusks, true);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.NETHERITE_TUSKS.get());
                  _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
               }

               if (world instanceof Level _level) {
                  if (!_level.isClientSide()) {
                     _level.playSound(
                        null,
                        BlockPos.containing(x, y, z),
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_netherite")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F
                     );
                  } else {
                     _level.playLocalSound(
                        x,
                        y,
                        z,
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_netherite")),
                        SoundSource.NEUTRAL,
                        1.0F,
                        1.0F,
                        false
                     );
                  }
               }

               if (entity instanceof ElephantEntity _datEntL54 && (Boolean)_datEntL54.getEntityData().get(ElephantEntity.DATA_Wood_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Wood_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.WOODEN_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if (entity instanceof ElephantEntity _datEntL57 && (Boolean)_datEntL57.getEntityData().get(ElephantEntity.DATA_Iron_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Iron_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.IRON_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }

               if (entity instanceof ElephantEntity _datEntL60 && (Boolean)_datEntL60.getEntityData().get(ElephantEntity.DATA_Diamond_Tusks)) {
                  if (entity instanceof ElephantEntity _datEntSetL) {
                     _datEntSetL.getEntityData().set(ElephantEntity.DATA_Diamond_Tusks, false);
                  }

                  if (world instanceof ServerLevel _level) {
                     ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)MocreaturesModItems.DIAMOND_TUSKS.get()));
                     entityToSpawn.setPickUpDelay(10);
                     _level.addFreshEntity(entityToSpawn);
                  }
               }
            }
         }
      }
   }
}
