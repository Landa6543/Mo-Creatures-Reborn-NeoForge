package net.mocreatures.block.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.block.entity.HangingFireflyJarTileEntity;
import net.mocreatures.block.model.HangingFireflyJarBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class HangingFireflyJarTileRenderer extends GeoBlockRenderer<HangingFireflyJarTileEntity> {
   public HangingFireflyJarTileRenderer() {
      super(new HangingFireflyJarBlockModel());
   }

   public RenderType getRenderType(HangingFireflyJarTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
      return RenderType.entityTranslucent(this.getTextureLocation(animatable));
   }
}
