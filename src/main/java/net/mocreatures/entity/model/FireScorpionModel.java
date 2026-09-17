package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FireScorpionEntity;
import software.bernie.geckolib.model.GeoModel;

public class FireScorpionModel extends GeoModel<FireScorpionEntity> {
   public ResourceLocation getAnimationResource(FireScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/scorpion.animation.json");
   }

   public ResourceLocation getModelResource(FireScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/scorpion.geo.json");
   }

   public ResourceLocation getTextureResource(FireScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
