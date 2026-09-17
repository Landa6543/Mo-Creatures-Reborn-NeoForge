package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.MandarinfishEntity;
import software.bernie.geckolib.model.GeoModel;

public class MandarinfishModel extends GeoModel<MandarinfishEntity> {
   public ResourceLocation getAnimationResource(MandarinfishEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/smallfish.animation.json");
   }

   public ResourceLocation getModelResource(MandarinfishEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/smallfish.geo.json");
   }

   public ResourceLocation getTextureResource(MandarinfishEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
