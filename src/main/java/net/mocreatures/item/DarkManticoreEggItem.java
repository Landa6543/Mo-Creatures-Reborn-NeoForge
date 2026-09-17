package net.mocreatures.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.mocreatures.procedures.DarkManticoreEggRightClickedOnBlockProcedure;

public class DarkManticoreEggItem extends Item {
   public DarkManticoreEggItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      DarkManticoreEggRightClickedOnBlockProcedure.execute(context.getLevel(), context.getPlayer());
      return InteractionResult.SUCCESS;
   }
}
