package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.BigGolemEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class BigGolemModel extends GeoModel<BigGolemEntity> {
   public ResourceLocation getAnimationResource(BigGolemEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/biggolem.animation.json");
   }

   public ResourceLocation getModelResource(BigGolemEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/biggolem.geo.json");
   }

   public ResourceLocation getTextureResource(BigGolemEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(BigGolemEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
