package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.RaccoonEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class RaccoonModel extends GeoModel<RaccoonEntity> {
   public ResourceLocation getAnimationResource(RaccoonEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/raccoon.animation.json");
   }

   public ResourceLocation getModelResource(RaccoonEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/raccoon.geo.json");
   }

   public ResourceLocation getTextureResource(RaccoonEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(RaccoonEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
