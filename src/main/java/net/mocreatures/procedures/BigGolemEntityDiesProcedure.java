package net.mocreatures.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.mocreatures.MocreaturesMod;

public class BigGolemEntityDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      if (world instanceof Level _level && !_level.isClientSide()) {
         _level.explode(null, x, y, z, 3.0F, ExplosionInteraction.MOB);
      }

      MocreaturesMod.queueServerWork(1, () -> {
         if (world instanceof ServerLevel _levelxx) {
            ItemEntity entityToSpawn = new ItemEntity(_levelxx, x, y, z, new ItemStack(Items.DIAMOND));
            entityToSpawn.setPickUpDelay(10);
            _levelxx.addFreshEntity(entityToSpawn);
         }

         if (world instanceof ServerLevel _levelx) {
            ItemEntity entityToSpawn = new ItemEntity(_levelx, x, y, z, new ItemStack(Items.DIAMOND));
            entityToSpawn.setPickUpDelay(10);
            _levelx.addFreshEntity(entityToSpawn);
         }
      });
   }
}
