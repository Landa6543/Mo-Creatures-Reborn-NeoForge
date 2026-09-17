package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FireManticoreEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class FireManticoreEggEntityModel extends GeoModel<FireManticoreEggEntityEntity> {
   public ResourceLocation getAnimationResource(FireManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(FireManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(FireManticoreEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
