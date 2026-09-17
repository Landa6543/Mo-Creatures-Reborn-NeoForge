package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.init.MocreaturesModItems;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickItem;

@EventBusSubscriber
public class TravelToWyvernLairProcedure {
   @SubscribeEvent
   public static void onRightClickItem(RightClickItem event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, Entity entity) {
      execute(null, world, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
      if (entity != null) {
         if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.WYVERN_PORTAL_STAFF.get()) {
            if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))
               .is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_overworld")))) {
               if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
                  ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mocreatures:wyvern_lair"));
                  if (_player.level().dimension() == destinationType) {
                     return;
                  }

                  ServerLevel nextLevel = _player.server.getLevel(destinationType);
                  if (nextLevel != null) {
                     _player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
                     _player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
                     _player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));

                     for (MobEffectInstance _effectinstance : _player.getActiveEffects()) {
                        _player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
                     }

                     _player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
                  }
               }
            } else if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))
                  .is(TagKey.create(Registries.BIOME, ResourceLocation.parse("mocreatures:wyvern_lair")))
               && entity instanceof ServerPlayer _player
               && !_player.level().isClientSide()) {
               ResourceKey<Level> destinationType = Level.OVERWORLD;
               if (_player.level().dimension() == destinationType) {
                  return;
               }

               ServerLevel nextLevel = _player.server.getLevel(destinationType);
               if (nextLevel != null) {
                  _player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
                  _player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
                  _player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));

                  for (MobEffectInstance _effectinstance : _player.getActiveEffects()) {
                     _player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
                  }

                  _player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
               }
            }
         }
      }
   }
}
