package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.GreenOgre2Entity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GreenOgre2Model extends GeoModel<GreenOgre2Entity> {
   public ResourceLocation getAnimationResource(GreenOgre2Entity entity) {
      return ResourceLocation.parse("mocreatures:animations/ogre2.animation.json");
   }

   public ResourceLocation getModelResource(GreenOgre2Entity entity) {
      return ResourceLocation.parse("mocreatures:geo/ogre2.geo.json");
   }

   public ResourceLocation getTextureResource(GreenOgre2Entity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(GreenOgre2Entity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
