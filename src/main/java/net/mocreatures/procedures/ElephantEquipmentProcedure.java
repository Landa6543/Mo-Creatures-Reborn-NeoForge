package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
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
public class ElephantEquipmentProcedure {
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
            if (!(entity instanceof ElephantEntity _datEntL3 && (Boolean)_datEntL3.getEntityData().get(ElephantEntity.DATA_Harness))
               && !(entity instanceof ElephantEntity _datEntL4 && (Boolean)_datEntL4.getEntityData().get(ElephantEntity.DATA_Asian_Decorated))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.ELEPHANT_HARNESS.get()) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Harness, true);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.ELEPHANT_HARNESS.get());
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
            }

            if (!(entity instanceof ElephantEntity _datEntL10 && (Boolean)_datEntL10.getEntityData().get(ElephantEntity.DATA_Chest))
               && entity instanceof ElephantEntity _datEntL11
               && (Boolean)_datEntL11.getEntityData().get(ElephantEntity.DATA_Harness)
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.ELEPHANT_CHEST.get()) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Chest, true);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.ELEPHANT_CHEST.get());
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
            }

            if (!(entity instanceof ElephantEntity _datEntL17 && (Boolean)_datEntL17.getEntityData().get(ElephantEntity.DATA_Asian_Decorated))
               && entity instanceof ElephantEntity _datEntL18
               && (Boolean)_datEntL18.getEntityData().get(ElephantEntity.DATA_Harness)
               && entity instanceof ElephantEntity _datEntL19
               && (Boolean)_datEntL19.getEntityData().get(ElephantEntity.DATA_Asian)
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.ELEPHANT_GARMENT.get()) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Asian_Decorated, true);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.ELEPHANT_GARMENT.get());
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
            }

            if (entity instanceof ElephantEntity _datEntL25
               && (Boolean)_datEntL25.getEntityData().get(ElephantEntity.DATA_Asian_Decorated)
               && !(entity instanceof ElephantEntity _datEntL26 && (Boolean)_datEntL26.getEntityData().get(ElephantEntity.DATA_Howdah))
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.ELEPHANT_HOWDAH.get()) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Howdah, true);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.ELEPHANT_HOWDAH.get());
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
            }

            if (entity instanceof ElephantEntity _datEntL32
               && (Boolean)_datEntL32.getEntityData().get(ElephantEntity.DATA_Harness)
               && !(entity instanceof ElephantEntity _datEntL33 && (Boolean)_datEntL33.getEntityData().get(ElephantEntity.DATA_Platform))
               && entity instanceof ElephantEntity _datEntL34
               && (Boolean)_datEntL34.getEntityData().get(ElephantEntity.DATA_Songhua)
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.MAMMOTH_PLATFORM.get()) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Platform, true);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.MAMMOTH_PLATFORM.get());
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
            }

            if (entity instanceof ElephantEntity _datEntL40
               && (Boolean)_datEntL40.getEntityData().get(ElephantEntity.DATA_Harness)
               && !(entity instanceof ElephantEntity _datEntL41 && (Boolean)_datEntL41.getEntityData().get(ElephantEntity.DATA_Platform))
               && entity instanceof ElephantEntity _datEntL42
               && (Boolean)_datEntL42.getEntityData().get(ElephantEntity.DATA_Woolly)
               && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
                  == MocreaturesModItems.MAMMOTH_PLATFORM.get()) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_Platform, true);
               }

               if (sourceentity instanceof Player _player) {
                  ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.MAMMOTH_PLATFORM.get());
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
            }
         }

         if (entity instanceof ElephantEntity _datEntL48
            && (Boolean)_datEntL48.getEntityData().get(ElephantEntity.DATA_Harness)
            && !(entity instanceof ElephantEntity _datEntL49 && (Boolean)_datEntL49.getEntityData().get(ElephantEntity.DATA_Baby))
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()) {
            sourceentity.startRiding(entity);
         }
      }
   }
}
