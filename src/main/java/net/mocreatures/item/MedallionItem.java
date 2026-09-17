package net.mocreatures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class MedallionItem extends Item {
   public MedallionItem() {
      super(new Properties().stacksTo(64).rarity(Rarity.COMMON));
   }
}
