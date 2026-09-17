package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.ArcticWyvernEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class ArcticWyvernEggEntityModel extends GeoModel<ArcticWyvernEggEntityEntity> {
   public ResourceLocation getAnimationResource(ArcticWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(ArcticWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(ArcticWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
