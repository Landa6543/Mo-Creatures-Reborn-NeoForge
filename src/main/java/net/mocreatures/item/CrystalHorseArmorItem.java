package net.mocreatures.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class CrystalHorseArmorItem extends Item {
   public CrystalHorseArmorItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.RARE));
   }
}
