package net.mocreatures.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.client.model.Modeldeer;
import net.mocreatures.client.model.animations.deerAnimation;
import net.mocreatures.entity.DeerFawnEntity;

public class DeerFawnRenderer extends MobRenderer<DeerFawnEntity, Modeldeer<DeerFawnEntity>> {
   public DeerFawnRenderer(Context context) {
      super(context, new DeerFawnRenderer.AnimatedModel(context.bakeLayer(Modeldeer.LAYER_LOCATION)), 0.5F);
   }

   protected void scale(DeerFawnEntity entity, PoseStack poseStack, float f) {
      poseStack.scale(0.5F, 0.5F, 0.5F);
   }

   public ResourceLocation getTextureLocation(DeerFawnEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/deer_fawn.png");
   }

   private static final class AnimatedModel extends Modeldeer<DeerFawnEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<DeerFawnEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(DeerFawnEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(deerAnimation.walk, limbSwing, limbSwingAmount, 1.0F, 1.0F);
            this.animate(entity.animationState1, deerAnimation.idle, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(DeerFawnEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
