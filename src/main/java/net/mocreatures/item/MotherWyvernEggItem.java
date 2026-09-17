package net.mocreatures.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.mocreatures.procedures.MotherWyvernEggRightClickedOnBlockProcedure;

public class MotherWyvernEggItem extends Item {
   public MotherWyvernEggItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      MotherWyvernEggRightClickedOnBlockProcedure.execute(context.getLevel(), context.getPlayer());
      return InteractionResult.SUCCESS;
   }
}
