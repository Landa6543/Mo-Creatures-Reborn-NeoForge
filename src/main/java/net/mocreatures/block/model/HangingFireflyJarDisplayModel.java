package net.mocreatures.block.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.block.display.HangingFireflyJarDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class HangingFireflyJarDisplayModel extends GeoModel<HangingFireflyJarDisplayItem> {
   public ResourceLocation getAnimationResource(HangingFireflyJarDisplayItem animatable) {
      return ResourceLocation.parse("mocreatures:animations/fireflyjarhanging.animation.json");
   }

   public ResourceLocation getModelResource(HangingFireflyJarDisplayItem animatable) {
      return ResourceLocation.parse("mocreatures:geo/fireflyjarhanging.geo.json");
   }

   public ResourceLocation getTextureResource(HangingFireflyJarDisplayItem entity) {
      return ResourceLocation.parse("mocreatures:textures/block/fireflyjar.png");
   }
}
