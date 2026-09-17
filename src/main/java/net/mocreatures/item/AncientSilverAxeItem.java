package net.mocreatures.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.mocreatures.init.MocreaturesModItems;

public class AncientSilverAxeItem extends AxeItem {
   private static final Tier TOOL_TIER = new Tier() {
      public int getUses() {
         return 400;
      }

      public float getSpeed() {
         return 6.0F;
      }

      public float getAttackDamageBonus() {
         return 0.0F;
      }

      public TagKey<Block> getIncorrectBlocksForDrops() {
         return BlockTags.INCORRECT_FOR_IRON_TOOL;
      }

      public int getEnchantmentValue() {
         return 14;
      }

      public Ingredient getRepairIngredient() {
         return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)MocreaturesModItems.ANCIENT_SILVER_INGOT.get())});
      }
   };

   public AncientSilverAxeItem() {
      super(TOOL_TIER, new Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 8.0F, -3.0F)));
   }
}
