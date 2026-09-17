package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.HippoTangEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class HippoTangEggEntityModel extends GeoModel<HippoTangEggEntityEntity> {
   public ResourceLocation getAnimationResource(HippoTangEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(HippoTangEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(HippoTangEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
