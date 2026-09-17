package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FrostManticoreEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class FrostManticoreEggEntityModel extends GeoModel<FrostManticoreEggEntityEntity> {
   public ResourceLocation getAnimationResource(FrostManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(FrostManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(FrostManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
