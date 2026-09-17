package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.MothEntity;
import software.bernie.geckolib.model.GeoModel;

public class MothModel extends GeoModel<MothEntity> {
   public ResourceLocation getAnimationResource(MothEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/moth.animation.json");
   }

   public ResourceLocation getModelResource(MothEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/moth.geo.json");
   }

   public ResourceLocation getTextureResource(MothEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
