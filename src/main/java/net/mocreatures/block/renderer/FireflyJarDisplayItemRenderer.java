package net.mocreatures.block.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.block.display.FireflyJarDisplayItem;
import net.mocreatures.block.model.FireflyJarDisplayModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FireflyJarDisplayItemRenderer extends GeoItemRenderer<FireflyJarDisplayItem> {
   public FireflyJarDisplayItemRenderer() {
      super(new FireflyJarDisplayModel());
   }

   public RenderType getRenderType(FireflyJarDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
      return RenderType.entityTranslucent(this.getTextureLocation(animatable));
   }
}
