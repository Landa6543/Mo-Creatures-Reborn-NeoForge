package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.BlackBearEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class BlackBearModel extends GeoModel<BlackBearEntity> {
   public ResourceLocation getAnimationResource(BlackBearEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/bear.animation.json");
   }

   public ResourceLocation getModelResource(BlackBearEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/bear.geo.json");
   }

   public ResourceLocation getTextureResource(BlackBearEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(BlackBearEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
