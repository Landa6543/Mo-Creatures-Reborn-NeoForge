package net.mocreatures.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;

public class WyvernLairPlayerLeavesDimensionProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         Entity _ent = entity;
         _ent.teleportTo(
            entity instanceof ServerPlayer _player && !_player.level().isClientSide()
               ? (
                  _player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null
                     ? _player.getRespawnPosition().getX()
                     : _player.level().getLevelData().getSpawnPos().getX()
               )
               : 0.0,
            entity instanceof ServerPlayer _player && !_player.level().isClientSide()
               ? (
                  _player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null
                     ? _player.getRespawnPosition().getY()
                     : _player.level().getLevelData().getSpawnPos().getY()
               )
               : 0.0,
            entity instanceof ServerPlayer _player && !_player.level().isClientSide()
               ? (
                  _player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null
                     ? _player.getRespawnPosition().getZ()
                     : _player.level().getLevelData().getSpawnPos().getZ()
               )
               : 0.0
         );
         if (_ent instanceof ServerPlayer _serverPlayer) {
            _serverPlayer.connection
               .teleport(
                  entity instanceof ServerPlayer _player && !_player.level().isClientSide()
                     ? (
                        _player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null
                           ? _player.getRespawnPosition().getX()
                           : _player.level().getLevelData().getSpawnPos().getX()
                     )
                     : 0.0,
                  entity instanceof ServerPlayer _player && !_player.level().isClientSide()
                     ? (
                        _player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null
                           ? _player.getRespawnPosition().getY()
                           : _player.level().getLevelData().getSpawnPos().getY()
                     )
                     : 0.0,
                  entity instanceof ServerPlayer _player && !_player.level().isClientSide()
                     ? (
                        _player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null
                           ? _player.getRespawnPosition().getZ()
                           : _player.level().getLevelData().getSpawnPos().getZ()
                     )
                     : 0.0,
                  _ent.getYRot(),
                  _ent.getXRot()
               );
         }
      }
   }
}
