package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.SandWyvernEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class SandWyvernEggEntityModel extends GeoModel<SandWyvernEggEntityEntity> {
   public ResourceLocation getAnimationResource(SandWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(SandWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(SandWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
