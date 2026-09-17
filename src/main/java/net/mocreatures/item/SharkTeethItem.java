package net.mocreatures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class SharkTeethItem extends Item {
   public SharkTeethItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }
}
