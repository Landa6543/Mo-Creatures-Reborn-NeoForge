package net.mocreatures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class WyvernPortalStaffItem extends Item {
   public WyvernPortalStaffItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }
}
