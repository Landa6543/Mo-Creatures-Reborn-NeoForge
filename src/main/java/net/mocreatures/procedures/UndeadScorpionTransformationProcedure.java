package net.mocreatures.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.mocreatures.MocreaturesMod;
import net.mocreatures.entity.CaveScorpionEntity;
import net.mocreatures.entity.DirtScorpionEntity;
import net.mocreatures.entity.FireScorpionEntity;
import net.mocreatures.entity.FrostScorpionEntity;
import net.mocreatures.entity.UndeadScorpionEntity;
import net.mocreatures.init.MocreaturesModEntities;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.EntityInteract;

@EventBusSubscriber
public class UndeadScorpionTransformationProcedure {
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
         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()
               == MocreaturesModItems.ESSENCE_OF_UNDEAD.get()
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:living_scorpions")))
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()) {
            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.ESSENCE_OF_UNDEAD.get());
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (entity instanceof DirtScorpionEntity) {
               ((DirtScorpionEntity)entity).setAnimation("transform");
            }

            if (entity instanceof FireScorpionEntity) {
               ((FireScorpionEntity)entity).setAnimation("transform");
            }

            if (entity instanceof CaveScorpionEntity) {
               ((CaveScorpionEntity)entity).setAnimation("transform");
            }

            if (entity instanceof FrostScorpionEntity) {
               ((FrostScorpionEntity)entity).setAnimation("transform");
            }

            if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED)) {
               _livingEntity9.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.0);
            }

            MocreaturesMod.queueServerWork(
               50,
               () -> {
                  if (!entity.level().isClientSide()) {
                     entity.discard();
                  }

                  if (world instanceof Level _level) {
                     if (!_level.isClientSide()) {
                        _level.playSound(
                           null,
                           BlockPos.containing(x, y, z),
                           (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.zombie_villager.converted")),
                           SoundSource.NEUTRAL,
                           1.0F,
                           1.0F
                        );
                     } else {
                        _level.playLocalSound(
                           x,
                           y,
                           z,
                           (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.zombie_villager.converted")),
                           SoundSource.NEUTRAL,
                           1.0F,
                           1.0F,
                           false
                        );
                     }
                  }

                  if (world instanceof ServerLevel _level) {
                     Entity entityToSpawn = (MocreaturesModEntities.UNDEAD_SCORPION.get())
                        .spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
                     if (entityToSpawn != null) {
                        entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
                     }
                  }

                  Entity patt0$temp = world.getEntitiesOfClass(UndeadScorpionEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0, 4.0, 4.0), e -> true)
                     .stream()
                     .sorted((new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                        }
                     }).compareDistOf(x, y, z))
                     .findFirst()
                     .orElse(null);
                  if (patt0$temp instanceof UndeadScorpionEntity _datEntSetLx) {
                     _datEntSetLx.getEntityData().set(UndeadScorpionEntity.DATA_Baby, true);
                  }
               }
            );
         }

         if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.CRAFTED_SADDLE.get()
            && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:undead_scorpion")))
            && entity instanceof TamableAnimal _tamEnt
            && _tamEnt.isTame()) {
            if (sourceentity instanceof Player _player) {
               ItemStack _stktoremove = new ItemStack((ItemLike)MocreaturesModItems.CRAFTED_SADDLE.get());
               _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }

            if (entity instanceof UndeadScorpionEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(UndeadScorpionEntity.DATA_Saddled, true);
            }
         }
      }
   }
}
