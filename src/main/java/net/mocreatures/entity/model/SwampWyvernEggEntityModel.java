package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.SwampWyvernEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class SwampWyvernEggEntityModel extends GeoModel<SwampWyvernEggEntityEntity> {
   public ResourceLocation getAnimationResource(SwampWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(SwampWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(SwampWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
