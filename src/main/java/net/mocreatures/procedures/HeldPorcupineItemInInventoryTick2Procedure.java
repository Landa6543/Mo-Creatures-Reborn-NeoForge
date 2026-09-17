package net.mocreatures.procedures;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.mocreatures.init.MocreaturesModItems;

public class HeldPorcupineItemInInventoryTick2Procedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         ItemStack mainHand = entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY;
         if (mainHand.getItem() == MocreaturesModItems.HELD_PORCUPINE.get()) {
            double fireAspect = mainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FIRE_ASPECT));
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupineFireAspect", fireAspect));

            double sharpness = mainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS));
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupineSharpness", sharpness));

            double unbreaking = mainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING));
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupineUnbreaking", unbreaking));

            double mending = mainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING));
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupineMending", mending));

            double power = mainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER));
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupinePower", power));

            double smite = mainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SMITE));
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupineSmite", smite));

            double bane = mainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BANE_OF_ARTHROPODS));
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupineBaneOfArthropods", bane));

            double thorns = mainHand.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.THORNS));
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupineThorns", thorns));

            double durability = mainHand.getDamageValue();
            CustomData.update(DataComponents.CUSTOM_DATA, mainHand, tag -> tag.putDouble("PorcupineDurability", durability));
         }

         if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MocreaturesModItems.HELD_PORCUPINE.get()) {
            entity.getPersistentData()
               .putString(
                  "PorcupineName",
                  ((CustomData)(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                        .getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY))
                     .copyTag()
                     .getString("PorcupineName")
               );
            entity.getPersistentData()
               .putDouble(
                  "PorcupineFireAspect",
                  (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FIRE_ASPECT))
               );
            entity.getPersistentData()
               .putDouble(
                  "PorcupineSharpness",
                  (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS))
               );
            entity.getPersistentData()
               .putDouble(
                  "PorcupineUnbreaking",
                  (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING))
               );
            entity.getPersistentData()
               .putDouble(
                  "PorcupineMending",
                  (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING))
               );
            entity.getPersistentData()
               .putDouble(
                  "PorcupinePower",
                  (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER))
               );
            entity.getPersistentData()
               .putDouble(
                  "PorcupineSmite",
                  (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SMITE))
               );
            entity.getPersistentData()
               .putDouble(
                  "PorcupineBaneOfArthropods",
                  (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.BANE_OF_ARTHROPODS))
               );
            entity.getPersistentData()
               .putDouble(
                  "PorcupineThorns",
                  (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
                     .getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.THORNS))
               );
            entity.getPersistentData()
               .putDouble("PorcupineDurability", (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue());
         }
      }
   }
}
