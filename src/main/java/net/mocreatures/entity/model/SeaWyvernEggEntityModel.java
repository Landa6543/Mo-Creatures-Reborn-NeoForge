package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.SeaWyvernEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class SeaWyvernEggEntityModel extends GeoModel<SeaWyvernEggEntityEntity> {
   public ResourceLocation getAnimationResource(SeaWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(SeaWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(SeaWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
