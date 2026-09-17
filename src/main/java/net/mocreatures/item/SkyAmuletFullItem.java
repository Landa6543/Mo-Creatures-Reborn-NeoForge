package net.mocreatures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class SkyAmuletFullItem extends Item {
   public SkyAmuletFullItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }
}
