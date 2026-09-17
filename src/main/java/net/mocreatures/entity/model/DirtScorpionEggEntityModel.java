package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.DirtScorpionEggEntityEntity;
import software.bernie.geckolib.model.GeoModel;

public class DirtScorpionEggEntityModel extends GeoModel<DirtScorpionEggEntityEntity> {
   public ResourceLocation getAnimationResource(DirtScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/egg.animation.json");
   }

   public ResourceLocation getModelResource(DirtScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/egg.geo.json");
   }

   public ResourceLocation getTextureResource(DirtScorpionEggEntityEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
