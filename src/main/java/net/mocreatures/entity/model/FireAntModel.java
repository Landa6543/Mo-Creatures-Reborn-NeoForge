package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.FireAntEntity;
import software.bernie.geckolib.model.GeoModel;

public class FireAntModel extends GeoModel<FireAntEntity> {
   public ResourceLocation getAnimationResource(FireAntEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/ant.animation.json");
   }

   public ResourceLocation getModelResource(FireAntEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/ant.geo.json");
   }

   public ResourceLocation getTextureResource(FireAntEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
