package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.BrownAntEntity;
import software.bernie.geckolib.model.GeoModel;

public class BrownAntModel extends GeoModel<BrownAntEntity> {
   public ResourceLocation getAnimationResource(BrownAntEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/ant.animation.json");
   }

   public ResourceLocation getModelResource(BrownAntEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/ant.geo.json");
   }

   public ResourceLocation getTextureResource(BrownAntEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
