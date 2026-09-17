package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.CaveOgre2Entity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CaveOgre2Model extends GeoModel<CaveOgre2Entity> {
   public ResourceLocation getAnimationResource(CaveOgre2Entity entity) {
      return ResourceLocation.parse("mocreatures:animations/ogre2.animation.json");
   }

   public ResourceLocation getModelResource(CaveOgre2Entity entity) {
      return ResourceLocation.parse("mocreatures:geo/ogre2.geo.json");
   }

   public ResourceLocation getTextureResource(CaveOgre2Entity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(CaveOgre2Entity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
