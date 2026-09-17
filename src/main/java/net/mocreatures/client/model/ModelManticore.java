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

public class ModelManticore<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
      ResourceLocation.fromNamespaceAndPath("mocreatures", "model_manticore"), "main"
   );
   public final ModelPart All;
   public final ModelPart Chest;
   public final ModelPart NeckBase;
   public final ModelPart NeckBase2;
   public final ModelPart Collar;
   public final ModelPart HeadBack;
   public final ModelPart NeckHarness;
   public final ModelPart HarnessStick;
   public final ModelPart Head;
   public final ModelPart Nose;
   public final ModelPart RightUpperLip;
   public final ModelPart LeftUpperLip;
   public final ModelPart UpperTeeth;
   public final ModelPart LeftFang;
   public final ModelPart RightFang;
   public final ModelPart InsideMouth;
   public final ModelPart LowerJaw;
   public final ModelPart LowerJawTeeth;
   public final ModelPart ChinHair;
   public final ModelPart LeftChinBeard;
   public final ModelPart RightChinBeard;
   public final ModelPart ForeheadHair;
   public final ModelPart Mane;
   public final ModelPart RightEar;
   public final ModelPart LeftEar;
   public final ModelPart NeckHair;
   public final ModelPart Abdomen;
   public final ModelPart Ass;
   public final ModelPart TailRoot;
   public final ModelPart Tail2;
   public final ModelPart Tail3;
   public final ModelPart Tail4;
   public final ModelPart TailTip;
   public final ModelPart TailTusk;
   public final ModelPart StorageChest;
   public final ModelPart LeftHindUpperLeg;
   public final ModelPart LeftAnkle;
   public final ModelPart LeftHindLowerLeg;
   public final ModelPart LeftHindFoot;
   public final ModelPart RightHindUpperLeg;
   public final ModelPart RightAnkle;
   public final ModelPart RightHindLowerLeg;
   public final ModelPart RightHindFoot;
   public final ModelPart Saddle;
   public final ModelPart SaddleFront;
   public final ModelPart SaddleBack;
   public final ModelPart LeftFootHarness;
   public final ModelPart LeftFootRing;
   public final ModelPart RightFootHarness;
   public final ModelPart RightFootRing;
   public final ModelPart LeftUpperLeg;
   public final ModelPart LeftLowerLeg;
   public final ModelPart LeftFrontFoot;
   public final ModelPart LeftClaw1;
   public final ModelPart LeftClaw2;
   public final ModelPart LeftClaw3;
   public final ModelPart RightUpperLeg;
   public final ModelPart RightLowerLeg;
   public final ModelPart RightFrontFoot;
   public final ModelPart RightClaw1;
   public final ModelPart RightClaw2;
   public final ModelPart RightClaw3;
   public final ModelPart RightHarness;
   public final ModelPart LeftHarness;
   public final ModelPart InnerWingR;
   public final ModelPart MidWingR;
   public final ModelPart OuterWingR;
   public final ModelPart InnerWing;
   public final ModelPart MidWing;
   public final ModelPart OuterWing;

   public ModelManticore(ModelPart root) {
      this.All = root.getChild("All");
      this.Chest = this.All.getChild("Chest");
      this.NeckBase = this.Chest.getChild("NeckBase");
      this.NeckBase2 = this.NeckBase.getChild("NeckBase2");
      this.Collar = this.NeckBase.getChild("Collar");
      this.HeadBack = this.NeckBase.getChild("HeadBack");
      this.NeckHarness = this.HeadBack.getChild("NeckHarness");
      this.HarnessStick = this.HeadBack.getChild("HarnessStick");
      this.Head = this.HeadBack.getChild("Head");
      this.Nose = this.Head.getChild("Nose");
      this.RightUpperLip = this.Head.getChild("RightUpperLip");
      this.LeftUpperLip = this.Head.getChild("LeftUpperLip");
      this.UpperTeeth = this.Head.getChild("UpperTeeth");
      this.LeftFang = this.Head.getChild("LeftFang");
      this.RightFang = this.Head.getChild("RightFang");
      this.InsideMouth = this.Head.getChild("InsideMouth");
      this.LowerJaw = this.Head.getChild("LowerJaw");
      this.LowerJawTeeth = this.LowerJaw.getChild("LowerJawTeeth");
      this.ChinHair = this.LowerJaw.getChild("ChinHair");
      this.LeftChinBeard = this.Head.getChild("LeftChinBeard");
      this.RightChinBeard = this.Head.getChild("RightChinBeard");
      this.ForeheadHair = this.Head.getChild("ForeheadHair");
      this.Mane = this.Head.getChild("Mane");
      this.RightEar = this.Head.getChild("RightEar");
      this.LeftEar = this.Head.getChild("LeftEar");
      this.NeckHair = this.NeckBase.getChild("NeckHair");
      this.Abdomen = this.Chest.getChild("Abdomen");
      this.Ass = this.Abdomen.getChild("Ass");
      this.TailRoot = this.Abdomen.getChild("TailRoot");
      this.Tail2 = this.TailRoot.getChild("Tail2");
      this.Tail3 = this.Tail2.getChild("Tail3");
      this.Tail4 = this.Tail3.getChild("Tail4");
      this.TailTip = this.Tail4.getChild("TailTip");
      this.TailTusk = this.Tail4.getChild("TailTusk");
      this.StorageChest = this.Abdomen.getChild("StorageChest");
      this.LeftHindUpperLeg = this.Abdomen.getChild("LeftHindUpperLeg");
      this.LeftAnkle = this.LeftHindUpperLeg.getChild("LeftAnkle");
      this.LeftHindLowerLeg = this.LeftAnkle.getChild("LeftHindLowerLeg");
      this.LeftHindFoot = this.LeftHindLowerLeg.getChild("LeftHindFoot");
      this.RightHindUpperLeg = this.Abdomen.getChild("RightHindUpperLeg");
      this.RightAnkle = this.RightHindUpperLeg.getChild("RightAnkle");
      this.RightHindLowerLeg = this.RightAnkle.getChild("RightHindLowerLeg");
      this.RightHindFoot = this.RightHindLowerLeg.getChild("RightHindFoot");
      this.Saddle = this.Chest.getChild("Saddle");
      this.SaddleFront = this.Saddle.getChild("SaddleFront");
      this.SaddleBack = this.Saddle.getChild("SaddleBack");
      this.LeftFootHarness = this.Saddle.getChild("LeftFootHarness");
      this.LeftFootRing = this.LeftFootHarness.getChild("LeftFootRing");
      this.RightFootHarness = this.Saddle.getChild("RightFootHarness");
      this.RightFootRing = this.RightFootHarness.getChild("RightFootRing");
      this.LeftUpperLeg = this.Chest.getChild("LeftUpperLeg");
      this.LeftLowerLeg = this.LeftUpperLeg.getChild("LeftLowerLeg");
      this.LeftFrontFoot = this.LeftLowerLeg.getChild("LeftFrontFoot");
      this.LeftClaw1 = this.LeftFrontFoot.getChild("LeftClaw1");
      this.LeftClaw2 = this.LeftFrontFoot.getChild("LeftClaw2");
      this.LeftClaw3 = this.LeftFrontFoot.getChild("LeftClaw3");
      this.RightUpperLeg = this.Chest.getChild("RightUpperLeg");
      this.RightLowerLeg = this.RightUpperLeg.getChild("RightLowerLeg");
      this.RightFrontFoot = this.RightLowerLeg.getChild("RightFrontFoot");
      this.RightClaw1 = this.RightFrontFoot.getChild("RightClaw1");
      this.RightClaw2 = this.RightFrontFoot.getChild("RightClaw2");
      this.RightClaw3 = this.RightFrontFoot.getChild("RightClaw3");
      this.RightHarness = this.All.getChild("RightHarness");
      this.LeftHarness = this.All.getChild("LeftHarness");
      this.InnerWingR = root.getChild("InnerWingR");
      this.MidWingR = this.InnerWingR.getChild("MidWingR");
      this.OuterWingR = this.MidWingR.getChild("OuterWingR");
      this.InnerWing = root.getChild("InnerWing");
      this.MidWing = this.InnerWing.getChild("MidWing");
      this.OuterWing = this.MidWing.getChild("OuterWing");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition All = partdefinition.addOrReplaceChild("All", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 0.0F));
      PartDefinition Chest = All.addOrReplaceChild(
         "Chest",
         CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, 0.0F, -8.0F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition NeckBase = Chest.addOrReplaceChild("NeckBase", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -8.0F));
      PartDefinition NeckBase2 = NeckBase.addOrReplaceChild(
         "NeckBase2",
         CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F)
      );
      PartDefinition Collar = NeckBase.addOrReplaceChild(
         "Collar",
         CubeListBuilder.create().texOffs(18, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 6.0F, -2.0F)
      );
      PartDefinition HeadBack = NeckBase.addOrReplaceChild(
         "HeadBack",
         CubeListBuilder.create().texOffs(0, 0).addBox(-2.51F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.7F, -2.9F)
      );
      PartDefinition NeckHarness = HeadBack.addOrReplaceChild(
         "NeckHarness",
         CubeListBuilder.create().texOffs(85, 32).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.95F)
      );
      PartDefinition HarnessStick = HeadBack.addOrReplaceChild(
         "HarnessStick",
         CubeListBuilder.create().texOffs(85, 42).addBox(-3.5F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -1.8F, 0.5F)
      );
      PartDefinition Head = HeadBack.addOrReplaceChild(
         "Head",
         CubeListBuilder.create().texOffs(32, 0).addBox(-3.5F, -3.0F, -2.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.2F, -2.2F)
      );
      PartDefinition Nose = Head.addOrReplaceChild(
         "Nose",
         CubeListBuilder.create().texOffs(46, 19).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.5236F, 0.0F, 0.0F)
      );
      PartDefinition RightUpperLip = Head.addOrReplaceChild(
         "RightUpperLip",
         CubeListBuilder.create().texOffs(34, 19).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.25F, 1.0F, -2.8F, 0.1265F, 0.0338F, -0.2597F)
      );
      PartDefinition LeftUpperLip = Head.addOrReplaceChild(
         "LeftUpperLip",
         CubeListBuilder.create().texOffs(34, 25).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.25F, 1.0F, -2.8F, 0.1265F, -0.0338F, 0.2597F)
      );
      PartDefinition UpperTeeth = Head.addOrReplaceChild(
         "UpperTeeth",
         CubeListBuilder.create().texOffs(20, 7).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, -2.5F)
      );
      PartDefinition LeftFang = Head.addOrReplaceChild(
         "LeftFang",
         CubeListBuilder.create().texOffs(44, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.2F, 2.8F, -3.4F, 0.1309F, 0.0F, 0.0F)
      );
      PartDefinition RightFang = Head.addOrReplaceChild(
         "RightFang",
         CubeListBuilder.create().texOffs(48, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.2F, 2.8F, -3.4F, 0.1309F, 0.0F, 0.0F)
      );
      PartDefinition InsideMouth = Head.addOrReplaceChild(
         "InsideMouth",
         CubeListBuilder.create().texOffs(50, 0).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, -1.0F)
      );
      PartDefinition LowerJaw = Head.addOrReplaceChild(
         "LowerJaw",
         CubeListBuilder.create().texOffs(46, 25).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.1F, 0.0F, -0.0873F, 0.0F, 0.0F)
      );
      PartDefinition LowerJawTeeth = LowerJaw.addOrReplaceChild(
         "LowerJawTeeth",
         CubeListBuilder.create().texOffs(20, 12).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(0.0F, -1.8F, -2.7F)
      );
      PartDefinition ChinHair = LowerJaw.addOrReplaceChild(
         "ChinHair",
         CubeListBuilder.create().texOffs(76, 7).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0873F, 0.0F, 0.0F)
      );
      PartDefinition LeftChinBeard = Head.addOrReplaceChild(
         "LeftChinBeard",
         CubeListBuilder.create().texOffs(48, 10).addBox(-1.0F, -2.5F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.6F, 0.0F, 0.25F, 0.0F, 0.48F, 0.0F)
      );
      PartDefinition RightChinBeard = Head.addOrReplaceChild(
         "RightChinBeard",
         CubeListBuilder.create().texOffs(36, 10).addBox(-1.0F, -2.5F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.6F, 0.0F, 0.25F, 0.0F, -0.48F, 0.0F)
      );
      PartDefinition ForeheadHair = Head.addOrReplaceChild(
         "ForeheadHair",
         CubeListBuilder.create().texOffs(88, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -3.2F, 0.0F, 0.2182F, 0.0F, 0.0F)
      );
      PartDefinition Mane = Head.addOrReplaceChild(
         "Mane",
         CubeListBuilder.create().texOffs(94, 0).addBox(-5.5F, -5.5F, -3.0F, 11.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.7F, 3.7F, -0.0873F, 0.0F, 0.0F)
      );
      PartDefinition RightEar = Head.addOrReplaceChild(
         "RightEar",
         CubeListBuilder.create().texOffs(54, 7).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.7F, -3.5F, 1.0F, 0.0F, 0.0F, -0.2182F)
      );
      PartDefinition LeftEar = Head.addOrReplaceChild(
         "LeftEar",
         CubeListBuilder.create().texOffs(54, 4).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.7F, -3.5F, 1.0F, 0.0F, 0.0F, 0.2182F)
      );
      PartDefinition NeckHair = NeckBase.addOrReplaceChild(
         "NeckHair",
         CubeListBuilder.create().texOffs(108, 17).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.55F, 3.0F, -0.3054F, 0.0F, 0.0F)
      );
      PartDefinition Abdomen = Chest.addOrReplaceChild(
         "Abdomen",
         CubeListBuilder.create().texOffs(0, 35).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Ass = Abdomen.addOrReplaceChild(
         "Ass",
         CubeListBuilder.create().texOffs(0, 49).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition TailRoot = Abdomen.addOrReplaceChild(
         "TailRoot",
         CubeListBuilder.create().texOffs(96, 83).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 1.0F, 7.0F, 1.5708F, 0.0F, 0.0F)
      );
      PartDefinition Tail2 = TailRoot.addOrReplaceChild(
         "Tail2",
         CubeListBuilder.create().texOffs(96, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.01F, 3.5F, 0.0F, -0.5236F, 0.0F, 0.0F)
      );
      PartDefinition Tail3 = Tail2.addOrReplaceChild(
         "Tail3",
         CubeListBuilder.create().texOffs(96, 67).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.01F, 5.5F, 0.0F, -0.3054F, 0.0F, 0.0F)
      );
      PartDefinition Tail4 = Tail3.addOrReplaceChild(
         "Tail4",
         CubeListBuilder.create().texOffs(96, 61).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.01F, 5.5F, 0.0F, 0.3927F, 0.0F, 0.0F)
      );
      PartDefinition TailTip = Tail4.addOrReplaceChild(
         "TailTip",
         CubeListBuilder.create().texOffs(96, 55).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.01F, 3.5F, 0.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition TailTusk = Tail4.addOrReplaceChild(
         "TailTusk",
         CubeListBuilder.create().texOffs(96, 49).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition StorageChest = Abdomen.addOrReplaceChild(
         "StorageChest",
         CubeListBuilder.create().texOffs(32, 59).addBox(-5.0F, -2.0F, -2.5F, 10.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -2.0F, 5.5F)
      );
      PartDefinition LeftHindUpperLeg = Abdomen.addOrReplaceChild(
         "LeftHindUpperLeg",
         CubeListBuilder.create().texOffs(0, 67).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.0F, 3.0F, 6.8F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition LeftAnkle = LeftHindUpperLeg.addOrReplaceChild(
         "LeftAnkle",
         CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 4.0F, 5.0F)
      );
      PartDefinition LeftHindLowerLeg = LeftAnkle.addOrReplaceChild(
         "LeftHindLowerLeg",
         CubeListBuilder.create().texOffs(0, 86).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 3.0F, 0.5F)
      );
      PartDefinition LeftHindFoot = LeftHindLowerLeg.addOrReplaceChild(
         "LeftHindFoot",
         CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.6F, -0.8F, 0.48F, 0.0F, 0.0F)
      );
      PartDefinition RightHindUpperLeg = Abdomen.addOrReplaceChild(
         "RightHindUpperLeg",
         CubeListBuilder.create().texOffs(16, 67).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, 3.0F, 6.8F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition RightAnkle = RightHindUpperLeg.addOrReplaceChild(
         "RightAnkle",
         CubeListBuilder.create().texOffs(10, 80).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 4.0F, 5.0F)
      );
      PartDefinition RightHindLowerLeg = RightAnkle.addOrReplaceChild(
         "RightHindLowerLeg",
         CubeListBuilder.create().texOffs(8, 86).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 3.0F, 0.5F)
      );
      PartDefinition RightHindFoot = RightHindLowerLeg.addOrReplaceChild(
         "RightHindFoot",
         CubeListBuilder.create().texOffs(12, 91).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.6F, -0.8F, 0.48F, 0.0F, 0.0F)
      );
      PartDefinition Saddle = Chest.addOrReplaceChild(
         "Saddle",
         CubeListBuilder.create().texOffs(79, 18).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.5F, -1.0F)
      );
      PartDefinition SaddleFront = Saddle.addOrReplaceChild(
         "SaddleFront",
         CubeListBuilder.create().texOffs(101, 26).addBox(-2.5F, -1.0F, -1.5F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -1.0F, -1.5F)
      );
      PartDefinition SaddleBack = Saddle.addOrReplaceChild(
         "SaddleBack",
         CubeListBuilder.create().texOffs(77, 26).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.7F, 4.0F)
      );
      PartDefinition LeftFootHarness = Saddle.addOrReplaceChild(
         "LeftFootHarness",
         CubeListBuilder.create().texOffs(81, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, 0.0F, 0.5F)
      );
      PartDefinition LeftFootRing = LeftFootHarness.addOrReplaceChild(
         "LeftFootRing",
         CubeListBuilder.create().texOffs(107, 31).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 5.0F, -1.0F)
      );
      PartDefinition RightFootHarness = Saddle.addOrReplaceChild(
         "RightFootHarness",
         CubeListBuilder.create().texOffs(101, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, 0.0F, 0.5F)
      );
      PartDefinition RightFootRing = RightFootHarness.addOrReplaceChild(
         "RightFootRing",
         CubeListBuilder.create().texOffs(101, 31).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 5.0F, -1.0F)
      );
      PartDefinition LeftUpperLeg = Chest.addOrReplaceChild(
         "LeftUpperLeg",
         CubeListBuilder.create().texOffs(0, 96).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.99F, 3.0F, -7.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition LeftLowerLeg = LeftUpperLeg.addOrReplaceChild(
         "LeftLowerLeg",
         CubeListBuilder.create().texOffs(0, 107).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.01F, 6.5F, 0.2F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition LeftFrontFoot = LeftLowerLeg.addOrReplaceChild(
         "LeftFrontFoot",
         CubeListBuilder.create().texOffs(0, 116).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0873F, 0.0F, 0.0F)
      );
      PartDefinition LeftClaw1 = LeftFrontFoot.addOrReplaceChild(
         "LeftClaw1",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.3F, 1.2F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition LeftClaw2 = LeftFrontFoot.addOrReplaceChild(
         "LeftClaw2",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 1.1F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition LeftClaw3 = LeftFrontFoot.addOrReplaceChild(
         "LeftClaw3",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.3F, 1.2F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition RightUpperLeg = Chest.addOrReplaceChild(
         "RightUpperLeg",
         CubeListBuilder.create().texOffs(14, 96).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.99F, 3.0F, -7.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition RightLowerLeg = RightUpperLeg.addOrReplaceChild(
         "RightLowerLeg",
         CubeListBuilder.create().texOffs(12, 107).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.01F, 6.5F, 0.2F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition RightFrontFoot = RightLowerLeg.addOrReplaceChild(
         "RightFrontFoot",
         CubeListBuilder.create().texOffs(0, 122).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0873F, 0.0F, 0.0F)
      );
      PartDefinition RightClaw1 = RightFrontFoot.addOrReplaceChild(
         "RightClaw1",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.3F, 1.2F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition RightClaw2 = RightFrontFoot.addOrReplaceChild(
         "RightClaw2",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 1.1F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition RightClaw3 = RightFrontFoot.addOrReplaceChild(
         "RightClaw3",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.3F, 1.2F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition RightHarness = All.addOrReplaceChild(
         "RightHarness",
         CubeListBuilder.create().texOffs(85, 31).addBox(-3.2F, -0.6F, 1.5F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.6F, -13.0F)
      );
      PartDefinition LeftHarness = All.addOrReplaceChild(
         "LeftHarness",
         CubeListBuilder.create().texOffs(85, 32).addBox(3.2F, -0.6F, 1.5F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.6F, -13.0F)
      );
      PartDefinition InnerWingR = partdefinition.addOrReplaceChild(
         "InnerWingR",
         CubeListBuilder.create().texOffs(26, 102).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, 9.0F, -7.0F)
      );
      PartDefinition MidWingR = InnerWingR.addOrReplaceChild(
         "MidWingR",
         CubeListBuilder.create().texOffs(82, 89).addBox(-13.0F, 0.1F, 1.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition OuterWingR = MidWingR.addOrReplaceChild(
         "OuterWingR",
         CubeListBuilder.create().texOffs(62, 102).addBox(-22.0F, 0.0F, 0.0F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-12.0F, 0.0F, 0.0F)
      );
      PartDefinition InnerWing = partdefinition.addOrReplaceChild(
         "InnerWing",
         CubeListBuilder.create().texOffs(26, 115).addBox(0.0F, 0.0F, 0.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, 9.0F, -7.0F)
      );
      PartDefinition MidWing = InnerWing.addOrReplaceChild(
         "MidWing",
         CubeListBuilder.create().texOffs(36, 89).addBox(1.0F, 0.1F, 1.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, -1.0F)
      );
      PartDefinition OuterWing = MidWing.addOrReplaceChild(
         "OuterWing",
         CubeListBuilder.create().texOffs(62, 115).addBox(0.0F, 0.0F, 0.0F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(12.0F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.All.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.InnerWingR.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
      this.InnerWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.Head.yRot = netHeadYaw / (180.0F / (float)Math.PI);
      this.Head.xRot = headPitch / (180.0F / (float)Math.PI);
   }
}
