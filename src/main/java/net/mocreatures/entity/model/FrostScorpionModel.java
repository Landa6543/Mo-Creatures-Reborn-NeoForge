package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FrostScorpionEntity;
import software.bernie.geckolib.model.GeoModel;

public class FrostScorpionModel extends GeoModel<FrostScorpionEntity> {
   public ResourceLocation getAnimationResource(FrostScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/scorpion.animation.json");
   }

   public ResourceLocation getModelResource(FrostScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/scorpion.geo.json");
   }

   public ResourceLocation getTextureResource(FrostScorpionEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
