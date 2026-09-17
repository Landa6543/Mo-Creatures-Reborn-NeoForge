package net.mocreatures.client.gui;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.mocreatures.world.inventory.NamingGoldFishMenu;

public class NamingGoldFishScreen extends PetNamingBaseScreen<NamingGoldFishMenu> {
   public NamingGoldFishScreen(NamingGoldFishMenu var1, Inventory var2, Component var3) {
      super(var1, var2, var3, "gui.mocreatures.naming_gold_fish.label_choose_your_pets_name");
   }
}
