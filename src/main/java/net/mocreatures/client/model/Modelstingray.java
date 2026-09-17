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

public class Modelstingray<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mocreatures", "modelstingray"), "main");
   public final ModelPart Tail;
   public final ModelPart Body;
   public final ModelPart Right;
   public final ModelPart Left;
   public final ModelPart BodyU;
   public final ModelPart RWingA;
   public final ModelPart RWingB;
   public final ModelPart RWingC;
   public final ModelPart RWingD;
   public final ModelPart RWingE;
   public final ModelPart RWingF;
   public final ModelPart RWingG;
   public final ModelPart BodyTail;
   public final ModelPart LWingA;
   public final ModelPart LWingB;
   public final ModelPart LWingC;
   public final ModelPart LWingD;
   public final ModelPart LWingE;
   public final ModelPart LWingF;
   public final ModelPart LWingG;
   public final ModelPart LEye;
   public final ModelPart REye;

   public Modelstingray(ModelPart root) {
      this.Tail = root.getChild("Tail");
      this.Body = root.getChild("Body");
      this.Right = root.getChild("Right");
      this.Left = root.getChild("Left");
      this.BodyU = root.getChild("BodyU");
      this.RWingA = root.getChild("RWingA");
      this.RWingB = this.RWingA.getChild("RWingB");
      this.RWingC = this.RWingB.getChild("RWingC");
      this.RWingD = this.RWingC.getChild("RWingD");
      this.RWingE = this.RWingD.getChild("RWingE");
      this.RWingF = this.RWingE.getChild("RWingF");
      this.RWingG = this.RWingF.getChild("RWingG");
      this.BodyTail = root.getChild("BodyTail");
      this.LWingA = root.getChild("LWingA");
      this.LWingB = this.LWingA.getChild("LWingB");
      this.LWingC = this.LWingB.getChild("LWingC");
      this.LWingD = this.LWingC.getChild("LWingD");
      this.LWingE = this.LWingD.getChild("LWingE");
      this.LWingF = this.LWingE.getChild("LWingF");
      this.LWingG = this.LWingF.getChild("LWingG");
      this.LEye = root.getChild("LEye");
      this.REye = root.getChild("REye");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition Tail = partdefinition.addOrReplaceChild(
         "Tail",
         CubeListBuilder.create().texOffs(30, 15).addBox(-0.525F, -0.5F, 0.5F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 22.0F, 8.0F)
      );
      PartDefinition Body = partdefinition.addOrReplaceChild(
         "Body",
         CubeListBuilder.create().texOffs(26, 0).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 22.0F, -5.0F)
      );
      PartDefinition Right = partdefinition.addOrReplaceChild(
         "Right",
         CubeListBuilder.create().texOffs(10, 26).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-3.0F, 22.0F, -4.8F)
      );
      PartDefinition Left = partdefinition.addOrReplaceChild(
         "Left",
         CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(3.0F, 22.0F, -4.8F)
      );
      PartDefinition BodyU = partdefinition.addOrReplaceChild(
         "BodyU",
         CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 21.0F, -4.0F)
      );
      PartDefinition RWingA = partdefinition.addOrReplaceChild(
         "RWingA",
         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.5F, -5.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, 22.0F, 1.0F)
      );
      PartDefinition RWingB = RWingA.addOrReplaceChild(
         "RWingB",
         CubeListBuilder.create().texOffs(2, 2).addBox(-3.0F, -0.5F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-3.0F, 0.0F, 0.0F)
      );
      PartDefinition RWingC = RWingB.addOrReplaceChild(
         "RWingC",
         CubeListBuilder.create().texOffs(27, 19).addBox(-2.0F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-3.0F, 0.0F, 0.0F)
      );
      PartDefinition RWingD = RWingC.addOrReplaceChild(
         "RWingD",
         CubeListBuilder.create().texOffs(28, 20).addBox(-2.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 0.0F, 0.0F)
      );
      PartDefinition RWingE = RWingD.addOrReplaceChild(
         "RWingE",
         CubeListBuilder.create().texOffs(30, 22).addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 0.0F, 0.0F)
      );
      PartDefinition RWingF = RWingE.addOrReplaceChild(
         "RWingF",
         CubeListBuilder.create().texOffs(35, 21).addBox(-2.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 0.0F, 0.0F)
      );
      PartDefinition RWingG = RWingF.addOrReplaceChild(
         "RWingG",
         CubeListBuilder.create().texOffs(31, 20).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.0F, 0.0F, 0.0F)
      );
      PartDefinition BodyTail = partdefinition.addOrReplaceChild("BodyTail", CubeListBuilder.create(), PartPose.offset(-0.5F, 22.0F, 7.0F));
      PartDefinition BodyTail_r1 = BodyTail.addOrReplaceChild(
         "BodyTail_r1",
         CubeListBuilder.create().texOffs(0, 20).addBox(-1.8F, -2.5F, 3.8F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(4.5F, 2.0F, -6.25F, 0.0F, -0.7854F, 0.0F)
      );
      PartDefinition LWingA = partdefinition.addOrReplaceChild(
         "LWingA",
         CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, -0.5F, -5.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(4.0F, 22.0F, 1.0F)
      );
      PartDefinition LWingB = LWingA.addOrReplaceChild(
         "LWingB",
         CubeListBuilder.create().texOffs(2, 2).mirror().addBox(0.0F, -0.5F, -4.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(3.0F, 0.0F, 0.0F)
      );
      PartDefinition LWingC = LWingB.addOrReplaceChild(
         "LWingC",
         CubeListBuilder.create().texOffs(28, 21).mirror().addBox(0.0F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(3.0F, 0.0F, 0.0F)
      );
      PartDefinition LWingD = LWingC.addOrReplaceChild(
         "LWingD",
         CubeListBuilder.create().texOffs(30, 20).mirror().addBox(0.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(2.0F, 0.0F, 0.0F)
      );
      PartDefinition LWingE = LWingD.addOrReplaceChild(
         "LWingE",
         CubeListBuilder.create().texOffs(30, 22).mirror().addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(2.0F, 0.0F, 0.0F)
      );
      PartDefinition LWingF = LWingE.addOrReplaceChild(
         "LWingF",
         CubeListBuilder.create().texOffs(32, 22).mirror().addBox(0.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(2.0F, 0.0F, 0.0F)
      );
      PartDefinition LWingG = LWingF.addOrReplaceChild(
         "LWingG",
         CubeListBuilder.create().texOffs(33, 22).mirror().addBox(0.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(2.0F, 0.0F, 0.0F)
      );
      PartDefinition LEye = partdefinition.addOrReplaceChild(
         "LEye",
         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 21.0F, -4.0F)
      );
      PartDefinition REye = partdefinition.addOrReplaceChild(
         "REye",
         CubeListBuilder.create().texOffs(0, 3).addBox(2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 21.0F, -4.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 32);
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Right.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.Left.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.BodyU.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.RWingA.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.BodyTail.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.LWingA.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.LEye.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.REye.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }
}
