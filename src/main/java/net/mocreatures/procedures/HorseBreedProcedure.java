package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.HorseEntity;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class HorseBreedProcedure {
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
         if (entity instanceof HorseEntity
            && (
               (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PUMPKIN.asItem()
                  || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MUSHROOM_STEW
            )
            && sourceentity.getPersistentData().getDouble("MocHorseParent1") == 0.0
            && sourceentity.getPersistentData().getDouble("MocHorseParent2") == 0.0) {
            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove;
               ItemStack var28 = _stktoremove = sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY;
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:eat")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:eat")), SoundSource.NEUTRAL, 1.0F, 1.0F, false
                  );
               }
            }

            if (world instanceof ServerLevel _level) {
               _level.sendParticles(ParticleTypes.HEART, x, y, z, 5, 2.0, 2.0, 2.0, 1.0);
            }

            if (entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, true);
            }

            MocreaturesMod.queueServerWork(
               1,
               () -> sourceentity.getPersistentData()
                  .putDouble(
                     "MocHorseParent1",
                     entity instanceof HorseEntity _datEntIx ? ((Integer)_datEntIx.getEntityData().get(HorseEntity.DATA_Variant)).intValue() : 0.0
                  )
            );
         }

         if (entity instanceof HorseEntity
            && (
               (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PUMPKIN.asItem()
                  || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MUSHROOM_STEW
            )
            && sourceentity.getPersistentData().getDouble("MocHorseParent1") != 0.0
            && sourceentity.getPersistentData().getDouble("MocHorseParent2") == 0.0) {
            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove;
               ItemStack var31 = _stktoremove = sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY;
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(x, y, z),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:eat")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("mocreatures:eat")), SoundSource.NEUTRAL, 1.0F, 1.0F, false
                  );
               }
            }

            if (world instanceof ServerLevel _level) {
               _level.sendParticles(ParticleTypes.HEART, x, y, z, 5, 2.0, 2.0, 2.0, 1.0);
            }

            if (entity instanceof HorseEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(HorseEntity.DATA_Breed, true);
            }

            sourceentity.getPersistentData()
               .putDouble(
                  "MocHorseParent2",
                  entity instanceof HorseEntity _datEntI ? ((Integer)_datEntI.getEntityData().get(HorseEntity.DATA_Variant)).intValue() : 0.0
               );
         }
      }
   }
}
