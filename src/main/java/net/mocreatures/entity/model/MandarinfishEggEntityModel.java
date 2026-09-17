package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.MandarinfishEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class MandarinfishEggEntityModel extends GeoModel<MandarinfishEggEntityEntity> {
   public ResourceLocation getAnimationResource(MandarinfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(MandarinfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(MandarinfishEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
