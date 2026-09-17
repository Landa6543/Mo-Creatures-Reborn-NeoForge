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

public class ModelElephant<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
      ResourceLocation.fromNamespaceAndPath("mocreatures", "model_elephant"), "main"
   );
   public final ModelPart All;
   public final ModelPart Head;
   public final ModelPart Neck;
   public final ModelPart HeadBump;
   public final ModelPart Chin;
   public final ModelPart LowerLip;
   public final ModelPart Back;
   public final ModelPart LeftSmallEar;
   public final ModelPart LeftBigEar;
   public final ModelPart RightSmallEar;
   public final ModelPart RightBigEar;
   public final ModelPart Hump;
   public final ModelPart Body;
   public final ModelPart Skirt;
   public final ModelPart RightTuskA;
   public final ModelPart RightTuskB;
   public final ModelPart RightTuskC;
   public final ModelPart RightTuskD;
   public final ModelPart TuskRW3;
   public final ModelPart TuskRW5;
   public final ModelPart TuskRW2;
   public final ModelPart TuskRW4;
   public final ModelPart TuskRW1;
   public final ModelPart LeftTuskA;
   public final ModelPart LeftTuskB;
   public final ModelPart LeftTuskC;
   public final ModelPart LeftTuskD;
   public final ModelPart TuskLW3;
   public final ModelPart TuskLW5;
   public final ModelPart TuskLW2;
   public final ModelPart TuskLW4;
   public final ModelPart TuskLW1;
   public final ModelPart TrunkA;
   public final ModelPart TrunkB;
   public final ModelPart TrunkC;
   public final ModelPart TrunkD;
   public final ModelPart TrunkE;
   public final ModelPart FrontRightUpperLeg;
   public final ModelPart FrontRightLowerLeg;
   public final ModelPart FrontLeftUpperLeg;
   public final ModelPart FrontLeftLowerLeg;
   public final ModelPart BackRightUpperLeg;
   public final ModelPart BackRightLowerLeg;
   public final ModelPart BackLeftUpperLeg;
   public final ModelPart BackLeftLowerLeg;
   public final ModelPart TailRoot;
   public final ModelPart Tail;
   public final ModelPart TailPlush;
   public final ModelPart StorageRightBedroll;
   public final ModelPart StorageLeftBedroll;
   public final ModelPart StorageFrontRightChest;
   public final ModelPart StorageBackRightChest;
   public final ModelPart StorageFrontLeftChest;
   public final ModelPart StorageBackLeftChest;
   public final ModelPart StorageRightBlankets;
   public final ModelPart StorageLeftBlankets;
   public final ModelPart HarnessBlanket;
   public final ModelPart HarnessUpperBelt;
   public final ModelPart HarnessLowerBelt;
   public final ModelPart CabinPillow;
   public final ModelPart CabinLeftRail;
   public final ModelPart Cabin;
   public final ModelPart CabinRightRail;
   public final ModelPart CabinBackRail;
   public final ModelPart CabinRoof;
   public final ModelPart FortNeckBeam;
   public final ModelPart FortBackBeam;
   public final ModelPart FortFloor4;
   public final ModelPart FortFloor1;
   public final ModelPart FortFloor2;
   public final ModelPart FortFloor3;
   public final ModelPart FortBackWall;
   public final ModelPart FortBackLeftWall;
   public final ModelPart FortBackRightWall;

   public ModelElephant(ModelPart root) {
      this.All = root.getChild("All");
      this.Head = this.All.getChild("Head");
      this.Neck = this.All.getChild("Neck");
      this.HeadBump = this.All.getChild("HeadBump");
      this.Chin = this.All.getChild("Chin");
      this.LowerLip = this.All.getChild("LowerLip");
      this.Back = this.All.getChild("Back");
      this.LeftSmallEar = this.All.getChild("LeftSmallEar");
      this.LeftBigEar = this.All.getChild("LeftBigEar");
      this.RightSmallEar = this.All.getChild("RightSmallEar");
      this.RightBigEar = this.All.getChild("RightBigEar");
      this.Hump = this.All.getChild("Hump");
      this.Body = this.All.getChild("Body");
      this.Skirt = this.All.getChild("Skirt");
      this.RightTuskA = this.All.getChild("RightTuskA");
      this.RightTuskB = this.RightTuskA.getChild("RightTuskB");
      this.RightTuskC = this.RightTuskB.getChild("RightTuskC");
      this.RightTuskD = this.RightTuskC.getChild("RightTuskD");
      this.TuskRW3 = this.RightTuskD.getChild("TuskRW3");
      this.TuskRW5 = this.TuskRW3.getChild("TuskRW5");
      this.TuskRW2 = this.RightTuskC.getChild("TuskRW2");
      this.TuskRW4 = this.TuskRW2.getChild("TuskRW4");
      this.TuskRW1 = this.RightTuskB.getChild("TuskRW1");
      this.LeftTuskA = this.All.getChild("LeftTuskA");
      this.LeftTuskB = this.LeftTuskA.getChild("LeftTuskB");
      this.LeftTuskC = this.LeftTuskB.getChild("LeftTuskC");
      this.LeftTuskD = this.LeftTuskC.getChild("LeftTuskD");
      this.TuskLW3 = this.LeftTuskD.getChild("TuskLW3");
      this.TuskLW5 = this.TuskLW3.getChild("TuskLW5");
      this.TuskLW2 = this.LeftTuskC.getChild("TuskLW2");
      this.TuskLW4 = this.TuskLW2.getChild("TuskLW4");
      this.TuskLW1 = this.LeftTuskB.getChild("TuskLW1");
      this.TrunkA = this.All.getChild("TrunkA");
      this.TrunkB = this.TrunkA.getChild("TrunkB");
      this.TrunkC = this.TrunkB.getChild("TrunkC");
      this.TrunkD = this.TrunkC.getChild("TrunkD");
      this.TrunkE = this.TrunkD.getChild("TrunkE");
      this.FrontRightUpperLeg = this.All.getChild("FrontRightUpperLeg");
      this.FrontRightLowerLeg = this.FrontRightUpperLeg.getChild("FrontRightLowerLeg");
      this.FrontLeftUpperLeg = this.All.getChild("FrontLeftUpperLeg");
      this.FrontLeftLowerLeg = this.FrontLeftUpperLeg.getChild("FrontLeftLowerLeg");
      this.BackRightUpperLeg = this.All.getChild("BackRightUpperLeg");
      this.BackRightLowerLeg = this.BackRightUpperLeg.getChild("BackRightLowerLeg");
      this.BackLeftUpperLeg = this.All.getChild("BackLeftUpperLeg");
      this.BackLeftLowerLeg = this.BackLeftUpperLeg.getChild("BackLeftLowerLeg");
      this.TailRoot = this.All.getChild("TailRoot");
      this.Tail = this.TailRoot.getChild("Tail");
      this.TailPlush = this.Tail.getChild("TailPlush");
      this.StorageRightBedroll = this.All.getChild("StorageRightBedroll");
      this.StorageLeftBedroll = this.All.getChild("StorageLeftBedroll");
      this.StorageFrontRightChest = this.All.getChild("StorageFrontRightChest");
      this.StorageBackRightChest = this.All.getChild("StorageBackRightChest");
      this.StorageFrontLeftChest = this.All.getChild("StorageFrontLeftChest");
      this.StorageBackLeftChest = this.All.getChild("StorageBackLeftChest");
      this.StorageRightBlankets = this.All.getChild("StorageRightBlankets");
      this.StorageLeftBlankets = this.All.getChild("StorageLeftBlankets");
      this.HarnessBlanket = this.All.getChild("HarnessBlanket");
      this.HarnessUpperBelt = this.All.getChild("HarnessUpperBelt");
      this.HarnessLowerBelt = this.All.getChild("HarnessLowerBelt");
      this.CabinPillow = this.All.getChild("CabinPillow");
      this.CabinLeftRail = this.All.getChild("CabinLeftRail");
      this.Cabin = this.All.getChild("Cabin");
      this.CabinRightRail = this.All.getChild("CabinRightRail");
      this.CabinBackRail = this.All.getChild("CabinBackRail");
      this.CabinRoof = this.All.getChild("CabinRoof");
      this.FortNeckBeam = this.All.getChild("FortNeckBeam");
      this.FortBackBeam = this.All.getChild("FortBackBeam");
      this.FortFloor4 = this.All.getChild("FortFloor4");
      this.FortFloor1 = this.FortFloor4.getChild("FortFloor1");
      this.FortFloor2 = this.FortFloor4.getChild("FortFloor2");
      this.FortFloor3 = this.FortFloor4.getChild("FortFloor3");
      this.FortBackWall = this.All.getChild("FortBackWall");
      this.FortBackLeftWall = this.All.getChild("FortBackLeftWall");
      this.FortBackRightWall = this.All.getChild("FortBackRightWall");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition All = partdefinition.addOrReplaceChild("All", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, -16.5F));
      PartDefinition Head = All.addOrReplaceChild(
         "Head",
         CubeListBuilder.create().texOffs(60, 0).addBox(-5.5F, -6.0F, -8.0F, 11.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition Neck = All.addOrReplaceChild(
         "Neck",
         CubeListBuilder.create().texOffs(46, 48).addBox(-4.95F, -6.0F, -8.0F, 10.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.0F, 6.5F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition HeadBump = All.addOrReplaceChild(
         "HeadBump",
         CubeListBuilder.create().texOffs(104, 41).addBox(-3.0F, -9.0F, -6.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition Chin = All.addOrReplaceChild(
         "Chin",
         CubeListBuilder.create().texOffs(86, 56).addBox(-1.5F, -6.0F, -10.7F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 0.0F)
      );
      PartDefinition LowerLip = All.addOrReplaceChild(
         "LowerLip",
         CubeListBuilder.create().texOffs(80, 65).addBox(-2.0F, -2.0F, -14.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 0.0F, 0.0F)
      );
      PartDefinition Back = All.addOrReplaceChild(
         "Back",
         CubeListBuilder.create().texOffs(0, 48).addBox(-5.0F, -10.0F, -10.0F, 10.0F, 2.0F, 26.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 6.0F, 13.5F)
      );
      PartDefinition LeftSmallEar = All.addOrReplaceChild(
         "LeftSmallEar",
         CubeListBuilder.create().texOffs(102, 0).addBox(2.0F, -8.0F, -5.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.4363F)
      );
      PartDefinition LeftBigEar = All.addOrReplaceChild(
         "LeftBigEar",
         CubeListBuilder.create().texOffs(85, 180).addBox(2.0F, -8.0F, -5.0F, 12.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.3491F)
      );
      PartDefinition RightSmallEar = All.addOrReplaceChild(
         "RightSmallEar",
         CubeListBuilder.create().texOffs(106, 15).addBox(-10.0F, -8.0F, -5.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, -0.4363F)
      );
      PartDefinition RightBigEar = All.addOrReplaceChild(
         "RightBigEar",
         CubeListBuilder.create().texOffs(85, 164).addBox(-14.0F, -8.0F, -5.0F, 12.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, -0.3491F)
      );
      PartDefinition Hump = All.addOrReplaceChild(
         "Hump",
         CubeListBuilder.create().texOffs(88, 30).addBox(-6.0F, -2.0F, -3.0F, 12.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -3.0F, 11.0F)
      );
      PartDefinition Body = All.addOrReplaceChild(
         "Body",
         CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, -10.0F, 16.0F, 20.0F, 28.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 8.0F, 13.5F)
      );
      PartDefinition Skirt = All.addOrReplaceChild(
         "Skirt",
         CubeListBuilder.create().texOffs(28, 94).addBox(-8.0F, -10.0F, -6.0F, 16.0F, 28.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 18.0F, 13.5F, 1.5708F, 0.0F, 0.0F)
      );
      PartDefinition RightTuskA = All.addOrReplaceChild(
         "RightTuskA",
         CubeListBuilder.create().texOffs(2, 60).addBox(-3.8F, -3.5F, -19.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.1745F)
      );
      PartDefinition RightTuskB = RightTuskA.addOrReplaceChild(
         "RightTuskB",
         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0168F, -1.0521F, -6.8731F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.7832F, -2.4479F, -18.6769F, -0.4363F, 0.0F, 0.0F)
      );
      PartDefinition RightTuskC = RightTuskB.addOrReplaceChild(
         "RightTuskC",
         CubeListBuilder.create().texOffs(0, 18).addBox(-0.9728F, -0.9351F, -5.1111F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.044F, 0.1451F, -6.1631F, -0.6109F, 0.0F, 0.0F)
      );
      PartDefinition RightTuskD = RightTuskC.addOrReplaceChild(
         "RightTuskD",
         CubeListBuilder.create().texOffs(14, 18).addBox(-0.9443F, -0.9926F, -5.0105F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-0.0285F, 0.1075F, -4.8256F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition TuskRW3 = RightTuskD.addOrReplaceChild(
         "TuskRW3",
         CubeListBuilder.create().texOffs(58, 149).addBox(1.3F, -4.025F, -35.175F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.7693F, 2.1952F, 29.6656F)
      );
      PartDefinition TuskRW5 = TuskRW3.addOrReplaceChild(
         "TuskRW5",
         CubeListBuilder.create().texOffs(52, 199).addBox(4.3F, -8.075F, -35.1F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.5F, 2.0F, -2.0F)
      );
      PartDefinition TuskRW2 = RightTuskC.addOrReplaceChild(
         "TuskRW2",
         CubeListBuilder.create().texOffs(60, 158).addBox(1.29F, -4.0F, -29.4F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.7728F, 2.3527F, 24.7401F)
      );
      PartDefinition TuskRW4 = TuskRW2.addOrReplaceChild(
         "TuskRW4",
         CubeListBuilder.create().texOffs(46, 157).addBox(4.29F, -8.0F, -29.4F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.5F, 2.0F, 0.0F)
      );
      PartDefinition TuskRW1 = RightTuskB.addOrReplaceChild(
         "TuskRW1",
         CubeListBuilder.create().texOffs(56, 166).addBox(-4.3F, 5.5F, -24.2F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.7832F, -7.0521F, 17.5269F)
      );
      PartDefinition LeftTuskA = All.addOrReplaceChild(
         "LeftTuskA",
         CubeListBuilder.create().texOffs(2, 48).addBox(1.8F, -3.5F, -19.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, -0.1745F)
      );
      PartDefinition LeftTuskB = LeftTuskA.addOrReplaceChild(
         "LeftTuskB",
         CubeListBuilder.create().texOffs(0, 9).addBox(-0.9832F, -0.8256F, -6.7674F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.7832F, -2.6744F, -18.6826F, -0.4363F, 0.0F, 0.0F)
      );
      PartDefinition LeftTuskC = LeftTuskB.addOrReplaceChild(
         "LeftTuskC",
         CubeListBuilder.create().texOffs(0, 18).addBox(-1.0272F, -0.9351F, -5.1111F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.044F, 0.3717F, -6.0325F, -0.6109F, 0.0F, 0.0F)
      );
      PartDefinition LeftTuskD = LeftTuskC.addOrReplaceChild(
         "LeftTuskD",
         CubeListBuilder.create().texOffs(14, 18).addBox(-1.0557F, -0.9926F, -5.0105F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0285F, 0.1075F, -4.8256F, -0.2618F, 0.0F, 0.0F)
      );
      PartDefinition TuskLW3 = LeftTuskD.addOrReplaceChild(
         "TuskLW3",
         CubeListBuilder.create().texOffs(58, 149).addBox(1.3F, 24.9F, -15.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.8557F, -26.7798F, 9.9406F)
      );
      PartDefinition TuskLW5 = TuskLW3.addOrReplaceChild(
         "TuskLW5",
         CubeListBuilder.create().texOffs(52, 192).addBox(2.7F, 22.9F, -17.5F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition TuskLW2 = LeftTuskC.addOrReplaceChild(
         "TuskLW2",
         CubeListBuilder.create().texOffs(60, 158).addBox(1.29F, 16.5F, -21.9F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.8272F, -18.1973F, 17.2151F)
      );
      PartDefinition TuskLW4 = TuskLW2.addOrReplaceChild(
         "TuskLW4",
         CubeListBuilder.create().texOffs(46, 164).addBox(2.7F, 14.5F, -21.9F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition TuskLW1 = LeftTuskB.addOrReplaceChild(
         "TuskLW1",
         CubeListBuilder.create().texOffs(56, 166).addBox(1.3F, 5.5F, -24.2F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-2.7832F, -6.8256F, 17.6826F)
      );
      PartDefinition TrunkA = All.addOrReplaceChild(
         "TrunkA",
         CubeListBuilder.create().texOffs(0, 76).addBox(-4.0F, -2.5F, -10.0F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 6.6F, -7.5417F, 1.5708F, 0.0F, 0.0F)
      );
      PartDefinition TrunkB = TrunkA.addOrReplaceChild(
         "TrunkB",
         CubeListBuilder.create().texOffs(0, 93).addBox(-3.0F, -2.5F, -7.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.05F, -9.6833F, 0.1309F, 0.0F, 0.0F)
      );
      PartDefinition TrunkC = TrunkB.addOrReplaceChild(
         "TrunkC", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.35F, -9.025F, -2.8798F, 0.0F, 0.0F)
      );
      PartDefinition TrunkC_r1 = TrunkC.addOrReplaceChild(
         "TrunkC_r1",
         CubeListBuilder.create().texOffs(0, 105).addBox(-2.5F, -13.0F, -26.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 13.0F, 22.0F, -0.0873F, 0.0F, 0.0F)
      );
      PartDefinition TrunkD = TrunkC.addOrReplaceChild(
         "TrunkD",
         CubeListBuilder.create().texOffs(0, 114).addBox(-2.0F, -1.5F, -5.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.25F, 1.5F, -3.0107F, 0.0F, 0.0F)
      );
      PartDefinition TrunkE = TrunkD.addOrReplaceChild(
         "TrunkE",
         CubeListBuilder.create().texOffs(0, 122).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 1.0F, -6.5F, 0.3491F, 0.0F, 0.0F)
      );
      PartDefinition FrontRightUpperLeg = All.addOrReplaceChild(
         "FrontRightUpperLeg",
         CubeListBuilder.create().texOffs(100, 109).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.6F, 14.0F, 6.9F)
      );
      PartDefinition FrontRightLowerLeg = FrontRightUpperLeg.addOrReplaceChild(
         "FrontRightLowerLeg",
         CubeListBuilder.create().texOffs(100, 73).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      PartDefinition FrontLeftUpperLeg = All.addOrReplaceChild(
         "FrontLeftUpperLeg",
         CubeListBuilder.create().texOffs(100, 90).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.6F, 14.0F, 6.9F)
      );
      PartDefinition FrontLeftLowerLeg = FrontLeftUpperLeg.addOrReplaceChild(
         "FrontLeftLowerLeg",
         CubeListBuilder.create().texOffs(72, 73).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      PartDefinition BackRightUpperLeg = All.addOrReplaceChild(
         "BackRightUpperLeg",
         CubeListBuilder.create().texOffs(72, 109).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-4.6F, 14.0F, 28.1F)
      );
      PartDefinition BackRightLowerLeg = BackRightUpperLeg.addOrReplaceChild(
         "BackRightLowerLeg",
         CubeListBuilder.create().texOffs(100, 56).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      PartDefinition BackLeftUpperLeg = All.addOrReplaceChild(
         "BackLeftUpperLeg",
         CubeListBuilder.create().texOffs(72, 90).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(4.6F, 14.0F, 28.1F)
      );
      PartDefinition BackLeftLowerLeg = BackLeftUpperLeg.addOrReplaceChild(
         "BackLeftLowerLeg",
         CubeListBuilder.create().texOffs(44, 77).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      PartDefinition TailRoot = All.addOrReplaceChild(
         "TailRoot",
         CubeListBuilder.create().texOffs(20, 105).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 2.0F, 31.5F, 0.3054F, 0.0F, 0.0F)
      );
      PartDefinition Tail = TailRoot.addOrReplaceChild(
         "Tail",
         CubeListBuilder.create().texOffs(20, 117).addBox(-1.0F, 9.7F, -0.2F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1876F, 0.0F, 0.0F)
      );
      PartDefinition TailPlush = Tail.addOrReplaceChild(
         "TailPlush",
         CubeListBuilder.create().texOffs(26, 76).addBox(-1.5F, 15.5F, -0.7F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition StorageRightBedroll = All.addOrReplaceChild(
         "StorageRightBedroll",
         CubeListBuilder.create().texOffs(90, 231).addBox(-2.5F, 8.0F, -8.0F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-9.0F, -0.2F, 17.5F, 0.0F, 0.0F, 0.48F)
      );
      PartDefinition StorageLeftBedroll = All.addOrReplaceChild(
         "StorageLeftBedroll",
         CubeListBuilder.create().texOffs(90, 231).addBox(-0.5F, 8.0F, -8.0F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(9.0F, -0.2F, 17.5F, 0.0F, 0.0F, -0.48F)
      );
      PartDefinition StorageFrontRightChest = All.addOrReplaceChild(
         "StorageFrontRightChest",
         CubeListBuilder.create().texOffs(76, 208).addBox(-3.5F, 0.0F, -5.0F, 5.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-11.0F, 8.8F, 12.0F, 0.0F, 0.0F, -0.2618F)
      );
      PartDefinition StorageBackRightChest = All.addOrReplaceChild(
         "StorageBackRightChest",
         CubeListBuilder.create().texOffs(76, 208).addBox(-3.5F, 0.0F, -5.0F, 5.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-11.0F, 8.8F, 23.0F, 0.0F, 0.0F, -0.2618F)
      );
      PartDefinition StorageFrontLeftChest = All.addOrReplaceChild(
         "StorageFrontLeftChest",
         CubeListBuilder.create().texOffs(76, 226).addBox(-1.5F, 0.0F, -5.0F, 5.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(11.0F, 8.8F, 12.0F, 0.0F, 0.0F, 0.2618F)
      );
      PartDefinition StorageBackLeftChest = All.addOrReplaceChild(
         "StorageBackLeftChest",
         CubeListBuilder.create().texOffs(76, 226).addBox(-1.5F, 0.0F, -5.0F, 5.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(11.0F, 8.8F, 23.0F, 0.0F, 0.0F, 0.2618F)
      );
      PartDefinition StorageRightBlankets = All.addOrReplaceChild(
         "StorageRightBlankets",
         CubeListBuilder.create().texOffs(0, 228).addBox(-4.5F, -1.0F, -7.0F, 5.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-9.0F, -0.2F, 17.5F)
      );
      PartDefinition StorageLeftBlankets = All.addOrReplaceChild(
         "StorageLeftBlankets",
         CubeListBuilder.create().texOffs(38, 228).addBox(-0.5F, -1.0F, -7.0F, 5.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offset(9.0F, -0.2F, 17.5F)
      );
      PartDefinition HarnessBlanket = All.addOrReplaceChild(
         "HarnessBlanket",
         CubeListBuilder.create().texOffs(0, 196).addBox(-8.5F, -2.0F, -3.0F, 17.0F, 14.0F, 18.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -3.2F, 13.0F)
      );
      PartDefinition HarnessUpperBelt = All.addOrReplaceChild(
         "HarnessUpperBelt",
         CubeListBuilder.create().texOffs(70, 196).addBox(-8.5F, 0.5F, -2.0F, 17.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 8.0F, 14.0F)
      );
      PartDefinition HarnessLowerBelt = All.addOrReplaceChild(
         "HarnessLowerBelt",
         CubeListBuilder.create().texOffs(70, 196).addBox(-8.5F, 0.5F, -2.5F, 17.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 8.0F, 23.5F)
      );
      PartDefinition CabinPillow = All.addOrReplaceChild(
         "CabinPillow",
         CubeListBuilder.create().texOffs(76, 146).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -6.0F, 18.5F)
      );
      PartDefinition CabinLeftRail = All.addOrReplaceChild(
         "CabinLeftRail",
         CubeListBuilder.create().texOffs(56, 147).addBox(-7.0F, 0.0F, 7.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -13.0F, 18.0F)
      );
      PartDefinition Cabin = All.addOrReplaceChild(
         "Cabin",
         CubeListBuilder.create().texOffs(0, 128).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 20.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -25.0F, 18.5F)
      );
      PartDefinition CabinRightRail = All.addOrReplaceChild(
         "CabinRightRail",
         CubeListBuilder.create().texOffs(56, 147).addBox(-7.0F, 0.0F, 7.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -13.0F, 18.0F)
      );
      PartDefinition CabinBackRail = All.addOrReplaceChild(
         "CabinBackRail",
         CubeListBuilder.create().texOffs(56, 147).addBox(-7.0F, 0.0F, 7.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -13.0F, 18.0F)
      );
      PartDefinition CabinRoof = All.addOrReplaceChild(
         "CabinRoof",
         CubeListBuilder.create().texOffs(56, 128).addBox(-7.5F, 0.0F, -7.5F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -24.0F, 18.5F)
      );
      PartDefinition FortNeckBeam = All.addOrReplaceChild(
         "FortNeckBeam",
         CubeListBuilder.create().texOffs(26, 180).addBox(-12.0F, 0.0F, -20.5F, 24.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -6.0F, 26.5F)
      );
      PartDefinition FortBackBeam = All.addOrReplaceChild(
         "FortBackBeam",
         CubeListBuilder.create().texOffs(26, 180).addBox(-12.0F, 0.0F, 0.0F, 24.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -6.0F, 26.5F)
      );
      PartDefinition FortFloor4 = All.addOrReplaceChild(
         "FortFloor4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 26.5F, 1.5708F, 0.0F, 1.5708F)
      );
      PartDefinition FortFloor1 = FortFloor4.addOrReplaceChild(
         "FortFloor1",
         CubeListBuilder.create().texOffs(0, 176).addBox(-0.5F, -20.0F, -6.0F, 1.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition FortFloor2 = FortFloor4.addOrReplaceChild(
         "FortFloor2",
         CubeListBuilder.create().texOffs(0, 176).addBox(-0.5F, -12.0F, -6.0F, 1.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition FortFloor3 = FortFloor4.addOrReplaceChild(
         "FortFloor3",
         CubeListBuilder.create().texOffs(0, 176).addBox(-0.5F, -4.0F, -6.0F, 1.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition FortBackWall = All.addOrReplaceChild(
         "FortBackWall",
         CubeListBuilder.create().texOffs(0, 176).addBox(-5.0F, -6.2F, -6.0F, 1.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -6.0F, 26.5F, 0.0F, 1.5708F, 0.0F)
      );
      PartDefinition FortBackLeftWall = All.addOrReplaceChild(
         "FortBackLeftWall",
         CubeListBuilder.create().texOffs(0, 176).addBox(6.0F, -6.0F, -7.0F, 1.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -6.0F, 26.5F)
      );
      PartDefinition FortBackRightWall = All.addOrReplaceChild(
         "FortBackRightWall",
         CubeListBuilder.create().texOffs(0, 176).addBox(-7.0F, -6.0F, -7.0F, 1.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -6.0F, 26.5F)
      );
      return LayerDefinition.create(meshdefinition, 128, 256);
   }

   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
      this.All.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
   }
}
