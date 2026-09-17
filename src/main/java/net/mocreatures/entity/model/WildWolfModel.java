package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.WildWolfEntity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class WildWolfModel extends GeoModel<WildWolfEntity> {
   public ResourceLocation getAnimationResource(WildWolfEntity entity) {
      return ResourceLocation.parse("mocreatures:animations/wildwolf.animation.json");
   }

   public ResourceLocation getModelResource(WildWolfEntity entity) {
      return ResourceLocation.parse("mocreatures:geo/wildwolf.geo.json");
   }

   public ResourceLocation getTextureResource(WildWolfEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(WildWolfEntity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("AllHead");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
