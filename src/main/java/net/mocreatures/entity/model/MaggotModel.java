package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.MaggotEntity;
import software.bernie.geckolib.model.GeoModel;

public class MaggotModel extends GeoModel<MaggotEntity> {
   public ResourceLocation getAnimationResource(MaggotEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/maggot.animation.json");
   }

   public ResourceLocation getModelResource(MaggotEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/maggot.geo.json");
   }

   public ResourceLocation getTextureResource(MaggotEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
