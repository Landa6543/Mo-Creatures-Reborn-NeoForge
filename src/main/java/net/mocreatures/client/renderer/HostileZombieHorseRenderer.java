package net.mocreatures.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.client.model.ModelMocHorse;
import net.mocreatures.client.model.animations.MocHorseAnimation;
import net.mocreatures.entity.HostileZombieHorseEntity;

public class HostileZombieHorseRenderer extends MobRenderer<HostileZombieHorseEntity, ModelMocHorse<HostileZombieHorseEntity>> {
   public HostileZombieHorseRenderer(Context context) {
      super(context, new HostileZombieHorseRenderer.AnimatedModel(context.bakeLayer(ModelMocHorse.LAYER_LOCATION)), 0.5F);
   }

   protected void scale(HostileZombieHorseEntity entity, PoseStack poseStack, float f) {
      poseStack.scale(1.1F, 1.1F, 1.1F);
   }

   public ResourceLocation getTextureLocation(HostileZombieHorseEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/horseundead.png");
   }

   private static final class AnimatedModel extends ModelMocHorse<HostileZombieHorseEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<HostileZombieHorseEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(HostileZombieHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(MocHorseAnimation.walk, limbSwing, limbSwingAmount, 1.0F, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(HostileZombieHorseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
