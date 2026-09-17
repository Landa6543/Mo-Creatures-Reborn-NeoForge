package net.mocreatures.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.entity.CaveOgre1Entity;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class CaveOgre1Model extends GeoModel<CaveOgre1Entity> {
   public ResourceLocation getAnimationResource(CaveOgre1Entity entity) {
      return ResourceLocation.parse("mocreatures:animations/ogre1.animation.json");
   }

   public ResourceLocation getModelResource(CaveOgre1Entity entity) {
      return ResourceLocation.parse("mocreatures:geo/ogre1.geo.json");
   }

   public ResourceLocation getTextureResource(CaveOgre1Entity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/" + entity.getTexture() + ".png");
   }

   public void setCustomAnimations(CaveOgre1Entity animatable, long instanceId, AnimationState animationState) {
      GeoBone head = this.getAnimationProcessor().getBone("Head");
      if (head != null) {
         EntityModelData entityData = (EntityModelData)animationState.getData(DataTickets.ENTITY_MODEL_DATA);
         head.setRotX(entityData.headPitch() * (float) (Math.PI / 180.0));
         head.setRotY(entityData.netHeadYaw() * (float) (Math.PI / 180.0));
      }
   }
}
