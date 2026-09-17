package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class WyvernLairPlayerEntersDimensionProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         Entity _ent = entity;
         _ent.teleportTo(0.0, 63.0, 0.0);
         if (_ent instanceof ServerPlayer _serverPlayer) {
            _serverPlayer.connection.teleport(0.0, 63.0, 0.0, _ent.getYRot(), _ent.getXRot());
         }

         if (world instanceof ServerLevel _serverworld) {
            StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("mocreatures", "wyvernspawn"));
            if (template != null) {
               template.placeInWorld(
                  _serverworld,
                  new BlockPos(-3, 60, -3),
                  new BlockPos(-3, 60, -3),
                  new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
                  _serverworld.random,
                  3
               );
            }
         }
      }
   }
}
