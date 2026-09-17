package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FireScorpionEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class FireScorpionEggEntityModel extends GeoModel<FireScorpionEggEntityEntity> {
   public ResourceLocation getAnimationResource(FireScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(FireScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(FireScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
