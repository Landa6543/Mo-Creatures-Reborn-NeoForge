package net.mocreatures.client.gui;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.mocreatures.world.inventory.NamingPlainManticoreMenu;

public class NamingPlainManticoreScreen extends PetNamingBaseScreen<NamingPlainManticoreMenu> {
   public NamingPlainManticoreScreen(NamingPlainManticoreMenu var1, Inventory var2, Component var3) {
      super(var1, var2, var3, "gui.mocreatures.naming_plain_manticore.label_choose_your_pets_name");
   }
}
