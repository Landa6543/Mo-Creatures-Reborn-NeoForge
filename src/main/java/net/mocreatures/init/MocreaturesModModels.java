package net.mocreatures.init;

import net.mocreatures.client.model.ModelBigCat;
import net.mocreatures.client.model.ModelBlockProjectile;
import net.mocreatures.client.model.ModelElephant;
import net.mocreatures.client.model.ModelManticore;
import net.mocreatures.client.model.ModelMocHorse;
import net.mocreatures.client.model.ModelRay;
import net.mocreatures.client.model.ModelWyvern;
import net.mocreatures.client.model.Modeldeer;
import net.mocreatures.client.model.Modelostrich2;
import net.mocreatures.client.model.Modelporcupineturret;
import net.mocreatures.client.model.Modelquillprojectile;
import net.mocreatures.client.model.Modelstingray;
import net.mocreatures.client.model.Modelturtle;
import net.mocreatures.client.model.Modelwraith;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;

@EventBusSubscriber(bus = Bus.MOD, value = Dist.CLIENT)
public class MocreaturesModModels {
   @SubscribeEvent
   public static void registerLayerDefinitions(RegisterLayerDefinitions event) {
      event.registerLayerDefinition(Modelostrich2.LAYER_LOCATION, Modelostrich2::createBodyLayer);
      event.registerLayerDefinition(ModelWyvern.LAYER_LOCATION, ModelWyvern::createBodyLayer);
      event.registerLayerDefinition(Modelturtle.LAYER_LOCATION, Modelturtle::createBodyLayer);
      event.registerLayerDefinition(ModelMocHorse.LAYER_LOCATION, ModelMocHorse::createBodyLayer);
      event.registerLayerDefinition(Modelstingray.LAYER_LOCATION, Modelstingray::createBodyLayer);
      event.registerLayerDefinition(ModelBigCat.LAYER_LOCATION, ModelBigCat::createBodyLayer);
      event.registerLayerDefinition(Modeldeer.LAYER_LOCATION, Modeldeer::createBodyLayer);
      event.registerLayerDefinition(ModelRay.LAYER_LOCATION, ModelRay::createBodyLayer);
      event.registerLayerDefinition(ModelBlockProjectile.LAYER_LOCATION, ModelBlockProjectile::createBodyLayer);
      event.registerLayerDefinition(ModelElephant.LAYER_LOCATION, ModelElephant::createBodyLayer);
      event.registerLayerDefinition(Modelwraith.LAYER_LOCATION, Modelwraith::createBodyLayer);
      event.registerLayerDefinition(ModelManticore.LAYER_LOCATION, ModelManticore::createBodyLayer);
      event.registerLayerDefinition(Modelporcupineturret.LAYER_LOCATION, Modelporcupineturret::createBodyLayer);
      event.registerLayerDefinition(Modelquillprojectile.LAYER_LOCATION, Modelquillprojectile::createBodyLayer);
   }
}
