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
import net.mocreatures.entity.WyvernOstrichEntity;
import net.mocreatures.procedures.WyvernOstrichBlackFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichBlueFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichBrownFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichCaveScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichChestDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichCyanFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichDiamondHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichEarthScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichFireScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichFrostScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichFurHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichGoldHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichGreenFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichGreyFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichHideHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichIronHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichLeatherHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichLightBlueFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichLightGreenFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichLightGreyFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichMagentaFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichNetheriteHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichOrangeFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichPinkFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichPurpleFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichRedFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichReptileHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichSaddleDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichUndeadScorpionHelmetDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichWhiteFlagDisplayConditionProcedure;
import net.mocreatures.procedures.WyvernOstrichYellowFlagDisplayConditionProcedure;

public class WyvernOstrichRenderer extends MobRenderer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>> {
   public WyvernOstrichRenderer(Context context) {
      super(context, new WyvernOstrichRenderer.AnimatedModel(context.bakeLayer(Modelostrich2.LAYER_LOCATION)), 0.5F);
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_saddled.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichSaddleDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_chest.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichChestDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_diamond_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichDiamondHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_golden_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichGoldHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_fur_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichFurHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_leather_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichLeatherHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_hide_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichHideHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_iron_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichIronHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_reptile_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichReptileHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_blackflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichBlackFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_blueflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichBlueFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_brownflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichBrownFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_cyanflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichCyanFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_greenflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichGreenFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_greyflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichGreyFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightblueflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichLightBlueFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightgreenflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichLightGreenFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_lightgreyflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichLightGreyFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_magentaflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichMagentaFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_orangeflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichOrangeFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_pinkflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichPinkFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_purpleflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichPurpleFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_redflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichRedFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_whiteflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichWhiteFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_yellowflag.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichYellowFlagDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_earth_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichEarthScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_fire_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichFireScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_cave_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichCaveScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_frost_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichFrostScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_undead_scorpion_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichUndeadScorpionHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
      this.addLayer(
         new RenderLayer<WyvernOstrichEntity, Modelostrich2<WyvernOstrichEntity>>(this) {
            final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mocreatures:textures/entities/ostrich_netherite_helmet.png");

            public void render(
               PoseStack poseStack,
               MultiBufferSource bufferSource,
               int light,
               WyvernOstrichEntity entity,
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
               if (WyvernOstrichNetheriteHelmetDisplayConditionProcedure.execute(entity)) {
                  VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(this.LAYER_TEXTURE));
                  ((Modelostrich2)this.getParentModel()).renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
               }
            }
         }
      );
   }

   public ResourceLocation getTextureLocation(WyvernOstrichEntity entity) {
      return ResourceLocation.parse("mocreatures:textures/entities/ostrich_dark_bare.png");
   }

   private static final class AnimatedModel extends Modelostrich2<WyvernOstrichEntity> {
      private final ModelPart root;
      private final HierarchicalModel animator = new HierarchicalModel<WyvernOstrichEntity>() {
         public ModelPart root() {
            return AnimatedModel.this.root;
         }

         public void setupAnim(WyvernOstrichEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.animateWalk(ostrich2Animation.walk, limbSwing, limbSwingAmount, 1.0F, 1.3F);
            this.animate(entity.animationState1, ostrich2Animation.idle, ageInTicks, 1.0F);
         }
      };

      public AnimatedModel(ModelPart root) {
         super(root);
         this.root = root;
      }

      public void setupAnim(WyvernOstrichEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
         this.animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
         super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
      }
   }
}
