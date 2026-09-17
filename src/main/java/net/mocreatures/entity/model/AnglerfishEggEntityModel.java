package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.AnglerfishEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class AnglerfishEggEntityModel extends GeoModel<AnglerfishEggEntityEntity> {
   public ResourceLocation getAnimationResource(AnglerfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(AnglerfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(AnglerfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
