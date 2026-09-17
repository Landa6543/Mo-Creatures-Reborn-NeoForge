package net.mocreatures.procedures;

import javax.annotation.Nullable;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

@EventBusSubscriber
public class WerewolfAttackedProcedure {
   @SubscribeEvent
   public static void onEntityAttacked(LivingIncomingDamageEvent var0) {
      if (var0.getEntity() != null) {
         execute(var0, var0.getEntity(), var0.getSource().getEntity());
      }
   }

   public static void execute(Entity var0, Entity var1) {
      execute(null, var0, var1);
   }

   private static void execute(@Nullable Event var0, Entity var1, Entity var2) {
      if (var1 != null) {
         if (var1 instanceof LivingEntity var3) {
            if (var1.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("mocreatures:werewolf")))) {
               boolean var4 = false;
               if (var2 instanceof LivingEntity var5) {
                  ItemStack var6 = var5.getMainHandItem();
                  if (var6 != null && var6.is(ItemTags.create(ResourceLocation.parse("mocreatures:silvered_tools")))) {
                     var4 = true;
                  }
               }

               if (var3.getAttributes().hasAttribute(Attributes.ARMOR)) {
                  if (var4) {
                     var3.getAttribute(Attributes.ARMOR).setBaseValue(1.5);
                  } else {
                     var3.getAttribute(Attributes.ARMOR).setBaseValue(30.0);
                  }
               }
            }
         }
      }
   }
}
