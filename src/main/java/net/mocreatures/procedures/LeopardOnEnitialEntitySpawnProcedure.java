package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.LeopardEntity;

public class LeopardOnEnitialEntitySpawnProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("mocreatures:snowy")))
            && entity instanceof LeopardEntity _datEntSetI) {
            _datEntSetI.getEntityData().set(LeopardEntity.DATA_Color, 2);
         }

         if (Math.random() < 0.3 && entity instanceof LeopardEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(LeopardEntity.DATA_Baby, true);
         }
      }
   }
}
