package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.SmallBeeEntity;
import software.bernie.geckolib.model.GeoModel;

public class SmallBeeModel extends GeoModel<SmallBeeEntity> {
   public ResourceLocation getAnimationResource(SmallBeeEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/smallbee.animation.json");
   }

   public ResourceLocation getModelResource(SmallBeeEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/smallbee.geo.json");
   }

   public ResourceLocation getTextureResource(SmallBeeEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }
}
