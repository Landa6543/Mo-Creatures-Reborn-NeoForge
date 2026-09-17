package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.PlainManticoreEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class PlainManticoreEggEntityModel extends GeoModel<PlainManticoreEggEntityEntity> {
   public ResourceLocation getAnimationResource(PlainManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(PlainManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(PlainManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
