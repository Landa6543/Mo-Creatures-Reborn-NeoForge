package net.mocreatures.block.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.block.entity.HangingFireflyJarTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class HangingFireflyJarBlockModel extends GeoModel<HangingFireflyJarTileEntity> {
   public ResourceLocation getAnimationResource(HangingFireflyJarTileEntity animatable) {
      return ResourceLocation.parse("mocreatures:animations/fireflyjarhanging.animation.json");
   }

   public ResourceLocation getModelResource(HangingFireflyJarTileEntity animatable) {
      return ResourceLocation.parse("mocreatures:geo/fireflyjarhanging.geo.json");
   }

   public ResourceLocation getTextureResource(HangingFireflyJarTileEntity animatable) {
      return ResourceLocation.parse("mocreatures:textures/block/fireflyjar.png");
   }
}
