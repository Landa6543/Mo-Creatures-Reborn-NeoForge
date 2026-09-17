package net.mocreatures.procedures;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.init.MocreaturesModItems;

public class TurtleDiesProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (entity.getDisplayName().getString().equals("Leonardo") && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(
               _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.NINJA_KATANA.get())
            );
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity.getDisplayName().getString().equals("Donatello") && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(
               _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.NINJA_BO_STAFF.get())
            );
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity.getDisplayName().getString().equals("Raphael") && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(
               _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.NINJA_SAI.get())
            );
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }

         if (entity.getDisplayName().getString().equals("Michelangelo") && world instanceof ServerLevel _level) {
            ItemEntity entityToSpawn = new ItemEntity(
               _level, entity.getX(), entity.getY(), entity.getZ(), new ItemStack((ItemLike)MocreaturesModItems.NINJA_NUNCHAKU.get())
            );
            entityToSpawn.setPickUpDelay(10);
            _level.addFreshEntity(entityToSpawn);
         }
      }
   }
}
