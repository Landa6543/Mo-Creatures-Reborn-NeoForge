package net.mocreatures.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.entity.ElephantEntity;

public class ElephantSpawnProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("mocreatures:snowy")))) {
            if (Math.random() < 0.6 && entity instanceof ElephantEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(ElephantEntity.DATA_Woolly, true);
            }

            if (Math.random() < 0.9 && entity instanceof ElephantEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(ElephantEntity.DATA_Songhua, true);
            }
         }

         if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("mocreatures:savanna")))) {
            if (Math.random() < 0.6) {
               if (entity instanceof ElephantEntity _datEntSetL) {
                  _datEntSetL.getEntityData().set(ElephantEntity.DATA_African, true);
               }
            } else if (entity instanceof ElephantEntity _datEntSetL) {
               _datEntSetL.getEntityData().set(ElephantEntity.DATA_Asian, true);
            }
         }

         if (Math.random() < 0.4 && entity instanceof ElephantEntity _datEntSetL) {
            _datEntSetL.getEntityData().set(ElephantEntity.DATA_Baby, true);
         }
      }
   }
}
