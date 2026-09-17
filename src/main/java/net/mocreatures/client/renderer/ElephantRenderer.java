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
import net.mocreatures.client.model.ModelElephant;
import net.mocreatures.client.model.animations.ElephantAnimation;
import net.mocreatures.entity.ElephantEntity;
import net.mocreatures.procedures.ElephantAfricanDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantAsianDecoratedDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantAsianDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantChestDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantDecoratedChestDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantDiamondTusksDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantHarnessDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantHowdahDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantIronTusksDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantNetheriteTusksDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantPlatformDisplayConditionProcedure;
import net.mocreatures.procedures.ElephantWoodenTusksDisplayConditionProcedure;
import net.mocreatures.procedures.MammothSonghuaDisplayConditionProcedure;
import net.mocreatures.procedures.MammothWoollyDisplayConditionProcedure;

public class ElephantRenderer extends MobRenderer<ElephantEntity, ModelElephant<ElephantEntity>> {
   public ElephantRenderer(Context context) {
      super(context, new ElephantRenderer.AnimatedModel(context.bakeLayer(ModelElephant.LAYER_LOCATION)), 1.0F);
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/mammoth_songhua.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (MammothSonghuaDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/mammoth_woolly.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (MammothWoollyDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_african.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantAfricanDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_asian.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantAsianDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_harness.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantHarnessDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_chest.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantChestDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_decorated_chest.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantDecoratedChestDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_asian_decorated.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantAsianDecoratedDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_howdah.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantHowdahDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/mammoth_platform.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantPlatformDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_wooden_tusks.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantWoodenTusksDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_iron_tusks.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantIronTusksDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_diamond_tusks.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantDiamondTusksDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<ElephantEntity, ModelElephant<ElephantEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/elephant_netherite_tusks.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               ElephantEntity entity,
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
               if (ElephantNetheriteTusksDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((ModelElephant)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
   }

   public ResourceLocation getTextureLocation(ElephantEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/blank_elephant.png");
   }

   private static final class AnimatedModel extends ModelElephant<ElephantEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<ElephantEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(ElephantEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animate(entity.animationState0, ElephantAnimation.idle, ageInTicks, 1.0F);
            this.animateWalk(ElephantAnimation.walk, limbSwing, limbSwingAmount, 1.0F, 4.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(ElephantEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
