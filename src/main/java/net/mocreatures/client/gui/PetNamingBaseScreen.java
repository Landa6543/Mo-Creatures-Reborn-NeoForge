package net.mocreatures.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.mocreatures.network.PetNameMessage;
import net.neoforged.neoforge.network.PacketDistributor;

public abstract class PetNamingBaseScreen<T extends AbstractContainerMenu> extends AbstractContainerScreen<T> {
   private static final ResourceLocation TEXTURE = ResourceLocation.parse("mocreatures:textures/screens/pet_naming.png");
   protected EditBox Name;
   private final String labelKey;

   public PetNamingBaseScreen(T var1, Inventory var2, Component var3, String var4) {
      super(var1, var2, var3);
      this.imageWidth = 176;
      this.imageHeight = 166;
      this.labelKey = var4;
   }

   public boolean isPauseScreen() {
      return true;
   }

   public void render(GuiGraphics var1, int var2, int var3, float var4) {
      this.renderBackground(var1, var2, var3, var4);
      super.render(var1, var2, var3, var4);
      if (this.Name != null) {
         this.Name.render(var1, var2, var3, var4);
      }

      this.renderTooltip(var1, var2, var3);
   }

   protected void renderBg(GuiGraphics var1, float var2, int var3, int var4) {
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      var1.blit(TEXTURE, this.leftPos - 39, this.topPos - 11, 0.0F, 0.0F, 256, 256, 256, 256);
      RenderSystem.disableBlend();
   }

   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 == 256) {
         if (this.minecraft != null && this.minecraft.player != null) {
            this.minecraft.player.closeContainer();
         }

         return true;
      } else if (var1 == 257 || var1 == 335) {
         this.confirmName();
         return true;
      } else {
         return this.Name != null && this.Name.isFocused() ? this.Name.keyPressed(var1, var2, var3) : super.keyPressed(var1, var2, var3);
      }
   }

   protected void confirmName() {
      if (this.Name != null) {
         String var1 = this.Name.getValue().trim();
         if (!var1.isEmpty()) {
            PacketDistributor.sendToServer(new PetNameMessage(var1), new CustomPacketPayload[0]);
         }
      }

      if (this.minecraft != null && this.minecraft.player != null) {
         this.minecraft.player.closeContainer();
      }
   }

   public void resize(Minecraft var1, int var2, int var3) {
      String var4 = this.Name != null ? this.Name.getValue() : "";
      super.resize(var1, var2, var3);
      if (this.Name != null) {
         this.Name.setValue(var4);
      }
   }

   protected void renderLabels(GuiGraphics var1, int var2, int var3) {
      var1.drawString(this.font, Component.translatable(this.labelKey), 30, 16, 4139031, false);
   }

   public void init() {
      super.init();
      this.Name = new EditBox(this.font, this.leftPos + 29, this.topPos + 58, 118, 18, Component.translatable("gui.mocreatures.pet_naming.name"));
      this.Name.setMaxLength(32);
      this.Name.setFocused(true);
      this.setInitialFocus(this.Name);
      this.addWidget(this.Name);
      this.addRenderableWidget(
         Button.builder(Component.translatable("gui.done"), var1 -> this.confirmName()).bounds(this.leftPos + 48, this.topPos + 85, 80, 20).build()
      );
   }
}
