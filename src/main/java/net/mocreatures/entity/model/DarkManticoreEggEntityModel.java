package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.DarkManticoreEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class DarkManticoreEggEntityModel extends GeoModel<DarkManticoreEggEntityEntity> {
   public ResourceLocation getAnimationResource(DarkManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(DarkManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(DarkManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
