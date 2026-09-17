package net.mocreatures.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.client.model.ModelMocHorse;
import net.mocreatures.client.model.animations.MocHorseAnimation;
import net.mocreatures.entity.HostileSkeletonHorseEntity;

public class HostileSkeletonHorseRenderer extends MobRenderer<HostileSkeletonHorseEntity, ModelMocHorse<HostileSkeletonHorseEntity>> {
   public HostileSkeletonHorseRenderer(Context context) {
      super(context, new HostileSkeletonHorseRenderer.AnimatedModel(context.bakeLayer(ModelMocHorse.LAYER_LOCATION)), 0.5F);
   }

   protected void scale(HostileSkeletonHorseEntity entity, PoseStack poseStack, float f) {
      poseStack.scale(1.1F, 1.1F, 1.1F);
   }

   public ResourceLocation getTextureLocation(HostileSkeletonHorseEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/horseskeleton.png");
   }

   private static final class AnimatedModel extends ModelMocHorse<HostileSkeletonHorseEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<HostileSkeletonHorseEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(HostileSkeletonHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(MocHorseAnimation.walk, limbSwing, limbSwingAmount, 1.0F, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(HostileSkeletonHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
