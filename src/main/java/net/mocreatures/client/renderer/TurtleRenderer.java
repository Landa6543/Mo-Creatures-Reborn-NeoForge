package net.mocreatures.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.mocreatures.client.model.Modelturtle;
import net.mocreatures.client.model.animations.turtleAnimation;
import net.mocreatures.entity.TurtleEntity;
import net.mocreatures.procedures.TurtleDisplayCondition1Procedure;
import net.mocreatures.procedures.TurtleDisplayCondition2Procedure;
import net.mocreatures.procedures.TurtleDisplayCondition3Procedure;
import net.mocreatures.procedures.TurtleDisplayCondition4Procedure;

public class TurtleRenderer extends MobRenderer<TurtleEntity, Modelturtle<TurtleEntity>> {
   public TurtleRenderer(Context context) {
      super(context, new TurtleRenderer.AnimatedModel(context.bakeLayer(Modelturtle.LAYER_LOCATION)), 0.3F);
      this.addLayer(
         new RenderLayer<TurtleEntity, Modelturtle<TurtleEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/turtlel.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TurtleEntity entity,
               float limbSwing,
               float limbSwingAmount,
               float partialTicks,
               float ageInTicks,
               float netHeadYaw,
               float headPitch
            ) {
               Level world = entity.level();
               double x = entity.getX();
               double y = entity.getY();
               double z = entity.getZ();
               if (TurtleDisplayCondition1Procedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelturtle)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<TurtleEntity, Modelturtle<TurtleEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/turtled.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TurtleEntity entity,
               float limbSwing,
               float limbSwingAmount,
               float partialTicks,
               float ageInTicks,
               float netHeadYaw,
               float headPitch
            ) {
               Level world = entity.level();
               double x = entity.getX();
               double y = entity.getY();
               double z = entity.getZ();
               if (TurtleDisplayCondition2Procedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelturtle)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<TurtleEntity, Modelturtle<TurtleEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/turtler.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TurtleEntity entity,
               float limbSwing,
               float limbSwingAmount,
               float partialTicks,
               float ageInTicks,
               float netHeadYaw,
               float headPitch
            ) {
               Level world = entity.level();
               double x = entity.getX();
               double y = entity.getY();
               double z = entity.getZ();
               if (TurtleDisplayCondition3Procedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelturtle)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<TurtleEntity, Modelturtle<TurtleEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/turtlem.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               TurtleEntity entity,
               float limbSwing,
               float limbSwingAmount,
               float partialTicks,
               float ageInTicks,
               float netHeadYaw,
               float headPitch
            ) {
               Level world = entity.level();
               double x = entity.getX();
               double y = entity.getY();
               double z = entity.getZ();
               if (TurtleDisplayCondition4Procedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelturtle)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
   }

   public ResourceLocation getTextureLocation(TurtleEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/turtle.png");
   }

   private static final class AnimatedModel extends Modelturtle<TurtleEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<TurtleEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(TurtleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animate(entity.animationState0, turtleAnimation.idle, ageInTicks, 1.0F);
            this.animateWalk(turtleAnimation.walk, limbSwing, limbSwingAmount, 1.0F, 0.6F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(TurtleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
