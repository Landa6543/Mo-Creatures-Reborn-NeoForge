package net.mocreatures.block.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.block.display.FireflyJarDisplayItem;
import software.bernie.geckolib.model.GeoModel;

public class FireflyJarDisplayModel extends GeoModel<FireflyJarDisplayItem> {
   public ResourceLocation getAnimationResource(FireflyJarDisplayItem animatable) {
      return ResourceLocation.parse("mocreatures:animations/fireflyjar.animation.json");
   }

   public ResourceLocation getModelResource(FireflyJarDisplayItem animatable) {
      return ResourceLocation.parse("mocreatures:geo/fireflyjar.geo.json");
   }

   public ResourceLocation getTextureResource(FireflyJarDisplayItem entity) {
      return ResourceLocation.parse("mocreatures:textures/block/fireflyjar.png");
   }
}
