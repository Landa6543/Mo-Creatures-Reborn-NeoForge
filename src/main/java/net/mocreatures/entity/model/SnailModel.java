package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.SnailEntity;
import software.bernie.geckolib.model.GeoModel;

public class SnailModel extends GeoModel<SnailEntity> {
   public ResourceLocation getAnimationResource(SnailEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/snail.animation.json");
   }

   public ResourceLocation getModelResource(SnailEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/snail.geo.json");
   }

   public ResourceLocation getTextureResource(SnailEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
