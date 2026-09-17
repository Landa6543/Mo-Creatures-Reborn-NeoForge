package net.mocreatures.client.gui;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.mocreatures.world.inventory.NamingRedBirdMenu;

public class NamingRedBirdScreen extends PetNamingBaseScreen<NamingRedBirdMenu> {
   public NamingRedBirdScreen(NamingRedBirdMenu var1, Inventory var2, Component var3) {
      super(var1, var2, var3, "gui.mocreatures.naming_red_bird.label_choose_your_pets_name");
   }
}
