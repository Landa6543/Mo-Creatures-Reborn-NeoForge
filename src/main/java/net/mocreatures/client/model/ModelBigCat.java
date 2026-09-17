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

public class ModelBigCat<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mocreatures", "model_big_cat"), "main");
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

   public ModelBigCat(ModelPart var1) {
      this.All = var1.getChild("All");
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
      this.InnerWingR = var1.getChild("InnerWingR");
      this.MidWingR = this.InnerWingR.getChild("MidWingR");
      this.OuterWingR = this.MidWingR.getChild("OuterWingR");
      this.InnerWing = var1.getChild("InnerWing");
      this.MidWing = this.InnerWing.getChild("MidWing");
      this.OuterWing = this.MidWing.getChild("OuterWing");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition var0 = new MeshDefinition();
      PartDefinition var1 = var0.getRoot();
      PartDefinition var2 = var1.addOrReplaceChild("All", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 0.0F));
      PartDefinition var3 = var2.addOrReplaceChild(
         "Chest",
         CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, 0.0F, -8.0F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition var4 = var3.addOrReplaceChild("NeckBase", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -8.0F));
      PartDefinition var5 = var4.addOrReplaceChild(
         "NeckBase2",
         CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F)
      );
      PartDefinition var6 = var4.addOrReplaceChild(
         "Collar",
         CubeListBuilder.create().texOffs(18, 0).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 6.0F, -2.0F)
      );
      PartDefinition var7 = var4.addOrReplaceChild(
         "HeadBack",
         CubeListBuilder.create().texOffs(0, 0).addBox(-2.51F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.7F, -2.9F)
      );
      PartDefinition var8 = var7.addOrReplaceChild(
         "NeckHarness",
         CubeListBuilder.create().texOffs(85, 32).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.95F)
      );
      PartDefinition var9 = var7.addOrReplaceChild(
         "HarnessStick",
         CubeListBuilder.create().texOffs(85, 42).addBox(-3.5F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -1.8F, 0.5F)
      );
      PartDefinition var10 = var7.addOrReplaceChild(
         "Head",
         CubeListBuilder.create().texOffs(32, 0).addBox(-3.5F, -3.0F, -2.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.2F, -2.2F)
      );
      PartDefinition var11 = var10.addOrReplaceChild(
         "Nose",
         CubeListBuilder.create().texOffs(46, 19).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.5236F, 0.0F, 0.0F)
      );
      PartDefinition var12 = var10.addOrReplaceChild(
         "RightUpperLip",
         CubeListBuilder.create().texOffs(34, 19).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.25F, 1.0F, -2.8F, 0.1265F, 0.0338F, -0.2597F)
      );
      PartDefinition var13 = var10.addOrReplaceChild(
         "LeftUpperLip",
         CubeListBuilder.create().texOffs(34, 25).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.25F, 1.0F, -2.8F, 0.1265F, -0.0338F, 0.2597F)
      );
      PartDefinition var14 = var10.addOrReplaceChild(
         "UpperTeeth",
         CubeListBuilder.create().texOffs(20, 7).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, -2.5F)
      );
      PartDefinition var15 = var10.addOrReplaceChild(
         "LeftFang",
         CubeListBuilder.create().texOffs(44, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.2F, 2.8F, -3.4F, 0.1309F, 0.0F, 0.0F)
      );
      PartDefinition var16 = var10.addOrReplaceChild(
         "RightFang",
         CubeListBuilder.create().texOffs(48, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.2F, 2.8F, -3.4F, 0.1309F, 0.0F, 0.0F)
      );
      PartDefinition var17 = var10.addOrReplaceChild(
         "InsideMouth",
         CubeListBuilder.create().texOffs(50, 0).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, -1.0F)
      );
      PartDefinition var18 = var10.addOrReplaceChild(
         "LowerJaw",
         CubeListBuilder.create().texOffs(46, 25).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.1F, 0.0F, -0.0873F, 0.0F, 0.0F)
      );
      PartDefinition var19 = var18.addOrReplaceChild(
         "LowerJawTeeth",
         CubeListBuilder.create().texOffs(20, 12).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(0.0F, -1.8F, -2.7F)
      );
      PartDefinition var20 = var18.addOrReplaceChild(
         "ChinHair",
         CubeListBuilder.create().texOffs(76, 7).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0873F, 0.0F, 0.0F)
      );
      PartDefinition var21 = var10.addOrReplaceChild(
         "LeftChinBeard",
         CubeListBuilder.create().texOffs(48, 10).addBox(-1.0F, -2.5F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.6F, 0.0F, 0.25F, 0.0F, 0.48F, 0.0F)
      );
      PartDefinition var22 = var10.addOrReplaceChild(
         "RightChinBeard",
         CubeListBuilder.create().texOffs(36, 10).addBox(-1.0F, -2.5F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.6F, 0.0F, 0.25F, 0.0F, -0.48F, 0.0F)
      );
      PartDefinition var23 = var10.addOrReplaceChild(
         "ForeheadHair",
         CubeListBuilder.create().texOffs(88, 0).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -3.2F, 0.0F, 0.2182F, 0.0F, 0.0F)
      );
      PartDefinition var24 = var10.addOrReplaceChild(
         "Mane",
         CubeListBuilder.create().texOffs(94, 0).addBox(-5.5F, -5.5F, -3.0F, 11.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.7F, 3.7F, -0.0873F, 0.0F, 0.0F)
      );
      PartDefinition var25 = var10.addOrReplaceChild(
         "RightEar",
         CubeListBuilder.create().texOffs(54, 7).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.7F, -3.5F, 1.0F, 0.0F, 0.0F, -0.2182F)
      );
      PartDefinition var26 = var10.addOrReplaceChild(
         "LeftEar",
         CubeListBuilder.create().texOffs(54, 4).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.7F, -3.5F, 1.0F, 0.0F, 0.0F, 0.2182F)
      );
      PartDefinition var27 = var4.addOrReplaceChild(
         "NeckHair",
         CubeListBuilder.create().texOffs(108, 17).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.55F, 3.0F, -0.3054F, 0.0F, 0.0F)
      );
      PartDefinition var28 = var3.addOrReplaceChild(
         "Abdomen",
         CubeListBuilder.create().texOffs(0, 35).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition var29 = var28.addOrReplaceChild(
         "Ass",
         CubeListBuilder.create().texOffs(0, 49).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition var30 = var28.addOrReplaceChild(
         "TailRoot",
         CubeListBuilder.create().texOffs(96, 83).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 1.0F, 7.0F, 1.5708F, 0.0F, 0.0F)
      );
      PartDefinition var31 = var30.addOrReplaceChild(
         "Tail2",
         CubeListBuilder.create().texOffs(96, 75).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.01F, 3.5F, 0.0F, -0.5236F, 0.0F, 0.0F)
      );
      PartDefinition var32 = var31.addOrReplaceChild(
         "Tail3",
         CubeListBuilder.create().texOffs(96, 67).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.01F, 5.5F, 0.0F, -0.3054F, 0.0F, 0.0F)
      );
      PartDefinition var33 = var32.addOrReplaceChild(
         "Tail4",
         CubeListBuilder.create().texOffs(96, 61).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.01F, 5.5F, 0.0F, 0.3927F, 0.0F, 0.0F)
      );
      PartDefinition var34 = var33.addOrReplaceChild(
         "TailTip",
         CubeListBuilder.create().texOffs(96, 55).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.01F, 3.5F, 0.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition var35 = var33.addOrReplaceChild(
         "TailTusk",
         CubeListBuilder.create().texOffs(96, 49).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition var36 = var28.addOrReplaceChild(
         "StorageChest",
         CubeListBuilder.create().texOffs(32, 59).addBox(-5.0F, -2.0F, -2.5F, 10.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.0F, 5.5F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition var37 = var28.addOrReplaceChild(
         "LeftHindUpperLeg",
         CubeListBuilder.create().texOffs(0, 67).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.0F, 3.0F, 6.8F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition var38 = var37.addOrReplaceChild(
         "LeftAnkle",
         CubeListBuilder.create().texOffs(0, 80).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 4.0F, 5.0F)
      );
      PartDefinition var39 = var38.addOrReplaceChild(
         "LeftHindLowerLeg",
         CubeListBuilder.create().texOffs(0, 86).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 3.0F, 0.5F)
      );
      PartDefinition var40 = var39.addOrReplaceChild(
         "LeftHindFoot",
         CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.6F, -0.8F, 0.48F, 0.0F, 0.0F)
      );
      PartDefinition var41 = var28.addOrReplaceChild(
         "RightHindUpperLeg",
         CubeListBuilder.create().texOffs(16, 67).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, 3.0F, 6.8F, -0.48F, 0.0F, 0.0F)
      );
      PartDefinition var42 = var41.addOrReplaceChild(
         "RightAnkle",
         CubeListBuilder.create().texOffs(10, 80).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 4.0F, 5.0F)
      );
      PartDefinition var43 = var42.addOrReplaceChild(
         "RightHindLowerLeg",
         CubeListBuilder.create().texOffs(8, 86).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 3.0F, 0.5F)
      );
      PartDefinition var44 = var43.addOrReplaceChild(
         "RightHindFoot",
         CubeListBuilder.create().texOffs(12, 91).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.6F, -0.8F, 0.48F, 0.0F, 0.0F)
      );
      PartDefinition var45 = var3.addOrReplaceChild(
         "Saddle",
         CubeListBuilder.create().texOffs(79, 18).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.5F, -1.0F)
      );
      PartDefinition var46 = var45.addOrReplaceChild(
         "SaddleFront",
         CubeListBuilder.create().texOffs(101, 26).addBox(-2.5F, -1.0F, -1.5F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -1.0F, -1.5F)
      );
      PartDefinition var47 = var45.addOrReplaceChild(
         "SaddleBack",
         CubeListBuilder.create().texOffs(77, 26).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.7F, 4.0F, 0.1309F, 0.0F, 0.0F)
      );
      PartDefinition var48 = var45.addOrReplaceChild(
         "LeftFootHarness",
         CubeListBuilder.create().texOffs(81, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, 0.0F, 0.5F)
      );
      PartDefinition var49 = var48.addOrReplaceChild(
         "LeftFootRing",
         CubeListBuilder.create().texOffs(107, 31).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 5.0F, -1.0F)
      );
      PartDefinition var50 = var45.addOrReplaceChild(
         "RightFootHarness",
         CubeListBuilder.create().texOffs(101, 18).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, 0.0F, 0.5F)
      );
      PartDefinition var51 = var50.addOrReplaceChild(
         "RightFootRing",
         CubeListBuilder.create().texOffs(101, 31).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 5.0F, -1.0F)
      );
      PartDefinition var52 = var3.addOrReplaceChild(
         "LeftUpperLeg",
         CubeListBuilder.create().texOffs(0, 96).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.99F, 3.0F, -7.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition var53 = var52.addOrReplaceChild(
         "LeftLowerLeg",
         CubeListBuilder.create().texOffs(0, 107).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.01F, 6.5F, 0.2F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition var54 = var53.addOrReplaceChild(
         "LeftFrontFoot",
         CubeListBuilder.create().texOffs(0, 116).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0873F, 0.0F, 0.0F)
      );
      PartDefinition var55 = var54.addOrReplaceChild(
         "LeftClaw1",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.3F, 1.2F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition var56 = var54.addOrReplaceChild(
         "LeftClaw2",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 1.1F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition var57 = var54.addOrReplaceChild(
         "LeftClaw3",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.3F, 1.2F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition var58 = var3.addOrReplaceChild(
         "RightUpperLeg",
         CubeListBuilder.create().texOffs(14, 96).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.99F, 3.0F, -7.0F, 0.2618F, 0.0F, 0.0F)
      );
      PartDefinition var59 = var58.addOrReplaceChild(
         "RightLowerLeg",
         CubeListBuilder.create().texOffs(12, 107).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.01F, 6.5F, 0.2F, -0.3491F, 0.0F, 0.0F)
      );
      PartDefinition var60 = var59.addOrReplaceChild(
         "RightFrontFoot",
         CubeListBuilder.create().texOffs(0, 122).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0873F, 0.0F, 0.0F)
      );
      PartDefinition var61 = var60.addOrReplaceChild(
         "RightClaw1",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.3F, 1.2F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition var62 = var60.addOrReplaceChild(
         "RightClaw2",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 1.1F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition var63 = var60.addOrReplaceChild(
         "RightClaw3",
         CubeListBuilder.create().texOffs(16, 125).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(1.3F, 1.2F, -3.0F, 0.829F, 0.0F, 0.0F)
      );
      PartDefinition var64 = var2.addOrReplaceChild(
         "RightHarness",
         CubeListBuilder.create().texOffs(85, 31).addBox(-3.2F, -0.6F, 1.5F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.6F, -13.0F)
      );
      PartDefinition var65 = var2.addOrReplaceChild(
         "LeftHarness",
         CubeListBuilder.create().texOffs(85, 32).addBox(3.2F, -0.6F, 1.5F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.6F, -13.0F)
      );
      PartDefinition var66 = var1.addOrReplaceChild(
         "InnerWingR",
         CubeListBuilder.create().texOffs(26, 102).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.0F, 9.0F, -7.0F)
      );
      PartDefinition var67 = var66.addOrReplaceChild(
         "MidWingR",
         CubeListBuilder.create().texOffs(82, 89).addBox(-13.0F, 0.1F, 1.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition var68 = var67.addOrReplaceChild(
         "OuterWingR",
         CubeListBuilder.create().texOffs(62, 102).addBox(-22.0F, 0.0F, 0.0F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-12.0F, 0.0F, 0.0F)
      );
      PartDefinition var69 = var1.addOrReplaceChild(
         "InnerWing",
         CubeListBuilder.create().texOffs(26, 115).addBox(0.0F, 0.0F, 0.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.0F, 9.0F, -7.0F)
      );
      PartDefinition var70 = var69.addOrReplaceChild(
         "MidWing",
         CubeListBuilder.create().texOffs(36, 89).addBox(1.0F, 0.1F, 1.0F, 12.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, -1.0F)
      );
      PartDefinition var71 = var70.addOrReplaceChild(
         "OuterWing",
         CubeListBuilder.create().texOffs(62, 115).addBox(0.0F, 0.0F, 0.0F, 22.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(12.0F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(var0, 128, 128);
   }

   public void renderToBuffer(PoseStack var1, VertexConsumer var2, int var3, int var4, int var5) {
      this.All.render(var1, var2, var3, var4, var5);
      this.InnerWingR.render(var1, var2, var3, var4, var5);
      this.InnerWing.render(var1, var2, var3, var4, var5);
   }

   public void setupAnim(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var5 / (180.0F / (float)Math.PI);
      float var8 = var6 / (180.0F / (float)Math.PI);
      this.NeckBase.yRot = var7 * 0.35F;
      this.NeckBase.xRot = var8 * 0.35F;
      this.HeadBack.yRot = var7 * 0.65F;
      this.HeadBack.xRot = var8 * 0.65F;
      this.Head.yRot = 0.0F;
      this.Head.xRot = 0.0F;
   }
}
