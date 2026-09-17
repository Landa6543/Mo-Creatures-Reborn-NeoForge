package net.mocreatures.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Modeldeer<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mocreatures", "modeldeer"), "main");
   public final ModelPart Body;
   public final ModelPart Neck;
   public final ModelPart Head;
   public final ModelPart LEar;
   public final ModelPart REar;
   public final ModelPart LeftAntler;
   public final ModelPart RightAntler;
   public final ModelPart Leg1;
   public final ModelPart Leg2;
   public final ModelPart Leg3;
   public final ModelPart Leg4;
   public final ModelPart Tail;

   public Modeldeer(ModelPart root) {
      this.Body = root.getChild("Body");
      this.Neck = this.Body.getChild("Neck");
      this.Head = this.Neck.getChild("Head");
      this.LEar = this.Head.getChild("LEar");
      this.REar = this.Head.getChild("REar");
      this.LeftAntler = this.Head.getChild("LeftAntler");
      this.RightAntler = this.Head.getChild("RightAntler");
      this.Leg1 = this.Body.getChild("Leg1");
      this.Leg2 = this.Body.getChild("Leg2");
      this.Leg3 = this.Body.getChild("Leg3");
      this.Leg4 = this.Body.getChild("Leg4");
      this.Tail = this.Body.getChild("Tail");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create().texOffs(24, 12).addBox(-2.0F, -3.0F, -6.0F, 6.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.0F, 13.0F, 0.0F)
      );
      PartDefinition Neck = Body.addOrReplaceChild(
         "Neck",
         CubeListBuilder.create().texOffs(0, 9).addBox(-3.0F, -2.0F, -6.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.0F, -1.5F, -4.5F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition Head = Neck.addOrReplaceChild(
         "Head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -6.0F, -9.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F)
      );
      PartDefinition LEar = Head.addOrReplaceChild(
         "LEar",
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.7071F, -6.7929F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F)
      );
      PartDefinition REar = Head.addOrReplaceChild(
         "REar",
         CubeListBuilder.create().texOffs(0, 0).addBox(1.2929F, -8.2071F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F)
      );
      PartDefinition LeftAntler = Head.addOrReplaceChild(
         "LeftAntler",
         CubeListBuilder.create().texOffs(54, 0).addBox(-0.9781F, -13.7921F, -7.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2094F)
      );
      PartDefinition RightAntler = Head.addOrReplaceChild(
         "RightAntler",
         CubeListBuilder.create().texOffs(54, 0).addBox(-0.9781F, -14.2079F, -7.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2094F)
      );
      PartDefinition Leg1 = Body.addOrReplaceChild(
         "Leg1",
         CubeListBuilder.create().texOffs(9, 20).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, 3.0F, -4.0F)
      );
      PartDefinition Leg2 = Body.addOrReplaceChild(
         "Leg2",
         CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 3.0F, -4.0F)
      );
      PartDefinition Leg3 = Body.addOrReplaceChild(
         "Leg3",
         CubeListBuilder.create().texOffs(9, 20).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, 3.0F, 6.0F)
      );
      PartDefinition Leg4 = Body.addOrReplaceChild(
         "Leg4",
         CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 3.0F, 6.0F)
      );
      PartDefinition Tail = Body.addOrReplaceChild(
         "Tail",
         CubeListBuilder.create().texOffs(50, 20).addBox(-2.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.0F, -2.0F, 7.0F, 0.7854F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 32);
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
