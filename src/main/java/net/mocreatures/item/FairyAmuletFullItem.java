package net.mocreatures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class FairyAmuletFullItem extends Item {
   public FairyAmuletFullItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }
}
