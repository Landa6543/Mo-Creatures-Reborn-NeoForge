package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.AnglerfishEntity;
import software.bernie.geckolib.model.GeoModel;

public class AnglerfishModel extends GeoModel<AnglerfishEntity> {
   public ResourceLocation getAnimationResource(AnglerfishEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/smallfish.animation.json");
   }

   public ResourceLocation getModelResource(AnglerfishEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/smallfish.geo.json");
   }

   public ResourceLocation getTextureResource(AnglerfishEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
