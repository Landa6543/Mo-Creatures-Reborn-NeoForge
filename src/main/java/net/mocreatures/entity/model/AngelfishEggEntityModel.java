package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.AngelfishEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class AngelfishEggEntityModel extends GeoModel<AngelfishEggEntityEntity> {
   public ResourceLocation getAnimationResource(AngelfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(AngelfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(AngelfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
