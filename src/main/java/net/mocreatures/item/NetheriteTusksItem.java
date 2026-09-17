package net.mocreatures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class NetheriteTusksItem extends Item {
   public NetheriteTusksItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }
}
