package net.mocreatures.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.context.UseOnContext;
import net.mocreatures.procedures.GoldFishEggRightClickedOnBlockProcedure;

public class GoldFishEggItem extends Item {
   public GoldFishEggItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   public InteractionResult useOn(UseOnContext context) {
      super.useOn(context);
      GoldFishEggRightClickedOnBlockProcedure.execute(context.getLevel(), context.getPlayer());
      return InteractionResult.SUCCESS;
   }
}
