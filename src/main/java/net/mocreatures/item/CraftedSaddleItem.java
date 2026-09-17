package net.mocreatures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class CraftedSaddleItem extends Item {
   public CraftedSaddleItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }
}
