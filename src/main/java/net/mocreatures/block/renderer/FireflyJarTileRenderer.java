package net.mocreatures.block.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.block.entity.FireflyJarTileEntity;
import net.mocreatures.block.model.FireflyJarBlockModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class FireflyJarTileRenderer extends GeoBlockRenderer<FireflyJarTileEntity> {
   public FireflyJarTileRenderer() {
      super(new FireflyJarBlockModel());
   }

   public RenderType getRenderType(FireflyJarTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
      return RenderType.entityTranslucent(this.getTextureLocation(animatable));
   }
}
