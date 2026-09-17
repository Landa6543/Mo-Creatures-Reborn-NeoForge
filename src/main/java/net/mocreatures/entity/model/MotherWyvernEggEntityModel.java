package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.MotherWyvernEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class MotherWyvernEggEntityModel extends GeoModel<MotherWyvernEggEntityEntity> {
   public ResourceLocation getAnimationResource(MotherWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(MotherWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(MotherWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
