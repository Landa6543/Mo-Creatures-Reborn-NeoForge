package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FlyEntity;
import software.bernie.geckolib.model.GeoModel;

public class FlyModel extends GeoModel<FlyEntity> {
   public ResourceLocation getAnimationResource(FlyEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/fly.animation.json");
   }

   public ResourceLocation getModelResource(FlyEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/fly.geo.json");
   }

   public ResourceLocation getTextureResource(FlyEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
