package net.mocreatures.procedures;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class OakEntEntityIsHurtProcedure {
   public static void execute(LevelAccessor var0, Entity var1, Entity var2) {
      if (var1 != null && var2 != null) {
         boolean var3 = false;
         if (var2 instanceof LivingEntity var4) {
            ItemStack var5 = var4.getMainHandItem();
            ItemStack var6 = var4.getOffhandItem();
            if (var5 != null && var5.is(ItemTags.create(ResourceLocation.parse("minecraft:axes")))
               || var6 != null && var6.is(ItemTags.create(ResourceLocation.parse("minecraft:axes")))) {
               var3 = true;
            }
         }

         if (var3) {
            var1.hurt(new DamageSource(var0.holderOrThrow(DamageTypes.GENERIC)), 9.0F);
         }
      }
   }
}
