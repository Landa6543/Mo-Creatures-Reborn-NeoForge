package net.mocreatures.block.model;

import net.minecraft.resources.ResourceLocation;
import net.mocreatures.block.entity.FireflyJarTileEntity;
import software.bernie.geckolib.model.GeoModel;

public class FireflyJarBlockModel extends GeoModel<FireflyJarTileEntity> {
   public ResourceLocation getAnimationResource(FireflyJarTileEntity animatable) {
      return ResourceLocation.parse("mocreatures:animations/fireflyjar.animation.json");
   }

   public ResourceLocation getModelResource(FireflyJarTileEntity animatable) {
      return ResourceLocation.parse("mocreatures:geo/fireflyjar.geo.json");
   }

   public ResourceLocation getTextureResource(FireflyJarTileEntity animatable) {
      return ResourceLocation.parse("mocreatures:textures/block/fireflyjar.png");
   }
}
