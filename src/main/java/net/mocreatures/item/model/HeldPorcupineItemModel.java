package net.mocreatures.item.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.item.HeldPorcupineItem;
import software.bernie.geckolib.model.GeoModel;

public class HeldPorcupineItemModel extends GeoModel<HeldPorcupineItem> {
   public ResourceLocation getAnimationResource(HeldPorcupineItem animatable) {
      return ResourceLocation.parse("mocreatures:animations/heldporcupine.animation.json");
   }

   public ResourceLocation getModelResource(HeldPorcupineItem animatable) {
      return ResourceLocation.parse("mocreatures:geo/heldporcupine.geo.json");
   }

   public ResourceLocation getTextureResource(HeldPorcupineItem animatable) {
      return ResourceLocation.parse("mocreatures:textures/item/porcupineitem.png");
   }
}
