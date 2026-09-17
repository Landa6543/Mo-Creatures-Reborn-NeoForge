package net.mocreatures.item;

import com.google.common.collect.Iterables;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial.Layer;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.mocreatures.init.MocreaturesModItems;
import net.mocreatures.procedures.EarthScorpionArmorSpeedProcedure;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.RegisterEvent;

@EventBusSubscriber(bus = Bus.MOD)
public abstract class EarthScorpionArmorItem extends ArmorItem {
   public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

   @SubscribeEvent
   public static void registerArmorMaterial(RegisterEvent event) {
      event.register(
         Registries.ARMOR_MATERIAL,
         registerHelper -> {
            ArmorMaterial armorMaterial = new ArmorMaterial(
               (Map)Util.make(new EnumMap(Type.class), map -> {
                  map.put(Type.BOOTS, 2);
                  map.put(Type.LEGGINGS, 6);
                  map.put(Type.CHESTPLATE, 7);
                  map.put(Type.HELMET, 2);
                  map.put(Type.BODY, 7);
               }),
               9,
               DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_chain")),
               () -> Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)MocreaturesModItems.EARTH_CHITIN.get())}),
               List.of(new Layer(ResourceLocation.parse("mocreatures:scorpd_1"))),
               1.0F,
               0.0F
            );
            registerHelper.register(ResourceLocation.parse("mocreatures:earth_scorpion_armor"), armorMaterial);
            ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
         }
      );
   }

   public EarthScorpionArmorItem(Type type, Properties properties) {
      super(ARMOR_MATERIAL, type, properties);
   }

   public static class Boots extends EarthScorpionArmorItem {
      public Boots() {
         super(Type.BOOTS, new Properties().durability(Type.BOOTS.getDurability(15)));
      }

      @OnlyIn(Dist.CLIENT)
      public void appendHoverText(ItemStack itemstack, TooltipContext context, List<Component> list, TooltipFlag flag) {
         super.appendHoverText(itemstack, context, list, flag);
         list.add(Component.translatable("item.mocreatures.earth_scorpion_armor_boots.description_0"));
      }
   }

   public static class Chestplate extends EarthScorpionArmorItem {
      public Chestplate() {
         super(Type.CHESTPLATE, new Properties().durability(Type.CHESTPLATE.getDurability(15)));
      }

      @OnlyIn(Dist.CLIENT)
      public void appendHoverText(ItemStack itemstack, TooltipContext context, List<Component> list, TooltipFlag flag) {
         super.appendHoverText(itemstack, context, list, flag);
         list.add(Component.translatable("item.mocreatures.earth_scorpion_armor_chestplate.description_0"));
      }
   }

   public static class Helmet extends EarthScorpionArmorItem {
      public Helmet() {
         super(Type.HELMET, new Properties().durability(Type.HELMET.getDurability(15)));
      }

      @OnlyIn(Dist.CLIENT)
      public void appendHoverText(ItemStack itemstack, TooltipContext context, List<Component> list, TooltipFlag flag) {
         super.appendHoverText(itemstack, context, list, flag);
         list.add(Component.translatable("item.mocreatures.earth_scorpion_armor_helmet.description_0"));
      }

      public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
         super.inventoryTick(itemstack, world, entity, slot, selected);
         if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            EarthScorpionArmorSpeedProcedure.execute(entity);
         }
      }
   }

   public static class Leggings extends EarthScorpionArmorItem {
      public Leggings() {
         super(Type.LEGGINGS, new Properties().durability(Type.LEGGINGS.getDurability(15)));
      }

      @OnlyIn(Dist.CLIENT)
      public void appendHoverText(ItemStack itemstack, TooltipContext context, List<Component> list, TooltipFlag flag) {
         super.appendHoverText(itemstack, context, list, flag);
         list.add(Component.translatable("item.mocreatures.earth_scorpion_armor_leggings.description_0"));
      }
   }
}
