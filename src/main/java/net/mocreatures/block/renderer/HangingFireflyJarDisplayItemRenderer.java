package net.mocreatures.block.renderer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.mocreatures.block.display.HangingFireflyJarDisplayItem;
import net.mocreatures.block.model.HangingFireflyJarDisplayModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class HangingFireflyJarDisplayItemRenderer extends GeoItemRenderer<HangingFireflyJarDisplayItem> {
   public HangingFireflyJarDisplayItemRenderer() {
      super(new HangingFireflyJarDisplayModel());
   }

   public RenderType getRenderType(HangingFireflyJarDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
      return RenderType.entityTranslucent(this.getTextureLocation(animatable));
   }
}
