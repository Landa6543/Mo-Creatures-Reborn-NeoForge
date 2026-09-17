package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.SunWyvernEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class SunWyvernEggEntityModel extends GeoModel<SunWyvernEggEntityEntity> {
   public ResourceLocation getAnimationResource(SunWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(SunWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(SunWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
