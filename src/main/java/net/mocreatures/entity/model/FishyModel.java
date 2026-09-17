package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FishyEntity;
import software.bernie.geckolib.model.GeoModel;

public class FishyModel extends GeoModel<FishyEntity> {
   public ResourceLocation getAnimationResource(FishyEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/fishy.animation.json");
   }

   public ResourceLocation getModelResource(FishyEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/fishy.geo.json");
   }

   public ResourceLocation getTextureResource(FishyEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
