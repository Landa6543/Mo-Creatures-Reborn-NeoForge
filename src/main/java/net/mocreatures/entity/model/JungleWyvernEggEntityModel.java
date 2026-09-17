package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.JungleWyvernEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class JungleWyvernEggEntityModel extends GeoModel<JungleWyvernEggEntityEntity> {
   public ResourceLocation getAnimationResource(JungleWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(JungleWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(JungleWyvernEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
