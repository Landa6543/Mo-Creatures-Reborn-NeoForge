package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.ToxicManticoreEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class ToxicManticoreEggEntityModel extends GeoModel<ToxicManticoreEggEntityEntity> {
   public ResourceLocation getAnimationResource(ToxicManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(ToxicManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(ToxicManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
