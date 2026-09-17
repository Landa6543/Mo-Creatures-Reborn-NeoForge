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
import net.mocreatures.client.model.Modelostrich2;
import net.mocreatures.client.model.animations.ostrich2Animation;
import net.mocreatures.entity.UnihornedOstrichEntity;
import net.mocreatures.procedures.UnihornedOstrichBlackFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichBlueFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichBrownFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichCaveScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichChestDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichCyanFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichDiamondHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichEarthScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichFireScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichFrostScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichFurHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichGoldHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichGreenFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichGreyFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichHideHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichIronHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichLeatherHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichLightBlueFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichLightGreenFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichLightGreyFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichMagentaFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichNetheriteHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichOrangeFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichPinkFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichPurpleFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichRedFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichReptileHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichSaddleDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichUndeadScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichWhiteFlagDisplayConditionProcedure;
import net.mocreatures.procedures.UnihornedOstrichYellowFlagDisplayConditionProcedure;

public class UnihornedOstrichRenderer extends MobRenderer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>> {
   public UnihornedOstrichRenderer(Context context) {
      super(context, new UnihornedOstrichRenderer.AnimatedModel(context.bakeLayer(Modelostrich2.LAYER_LOCATION)), 0.5F);
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_saddled.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichSaddleDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_chest.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichChestDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_diamond_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichDiamondHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_golden_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichGoldHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_fur_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichFurHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_leather_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichLeatherHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_hide_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichHideHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_iron_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichIronHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_reptile_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichReptileHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_blackflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichBlackFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_blueflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichBlueFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_brownflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichBrownFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_cyanflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichCyanFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_greenflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichGreenFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_greyflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichGreyFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightblueflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichLightBlueFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightgreenflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichLightGreenFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightgreyflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichLightGreyFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_magentaflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichMagentaFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_orangeflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichOrangeFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_pinkflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichPinkFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_purpleflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichPurpleFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_redflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichRedFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_whiteflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichWhiteFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_yellowflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichYellowFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_earth_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichEarthScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_fire_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichFireScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_cave_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichCaveScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_frost_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichFrostScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_undead_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichUndeadScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<UnihornedOstrichEntity, Modelostrich2<UnihornedOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_netherite_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               UnihornedOstrichEntity entity,
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
               if (UnihornedOstrichNetheriteHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
   }

   public ResourceLocation getTextureLocation(UnihornedOstrichEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/ostrich_light_bare.png");
   }

   private static final class AnimatedModel extends Modelostrich2<UnihornedOstrichEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<UnihornedOstrichEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(UnihornedOstrichEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(ostrich2Animation.walk, limbSwing, limbSwingAmount, 1.0F, 1.3F);
            this.animate(entity.animationState1, ostrich2Animation.idle, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(UnihornedOstrichEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
