package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.CrabEntity;
import software.bernie.geckolib.model.GeoModel;

public class CrabModel extends GeoModel<CrabEntity> {
   public ResourceLocation getAnimationResource(CrabEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/crab.animation.json");
   }

   public ResourceLocation getModelResource(CrabEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/crab.geo.json");
   }

   public ResourceLocation getTextureResource(CrabEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
