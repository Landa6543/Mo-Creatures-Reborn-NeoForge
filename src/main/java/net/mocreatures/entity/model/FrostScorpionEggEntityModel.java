package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FrostScorpionEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class FrostScorpionEggEntityModel extends GeoModel<FrostScorpionEggEntityEntity> {
   public ResourceLocation getAnimationResource(FrostScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(FrostScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(FrostScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
