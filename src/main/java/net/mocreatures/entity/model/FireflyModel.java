package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FireflyEntity;
import software.bernie.geckolib.model.GeoModel;

public class FireflyModel extends GeoModel<FireflyEntity> {
   public ResourceLocation getAnimationResource(FireflyEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/firefly.animation.json");
   }

   public ResourceLocation getModelResource(FireflyEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/firefly.geo.json");
   }

   public ResourceLocation getTextureResource(FireflyEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
