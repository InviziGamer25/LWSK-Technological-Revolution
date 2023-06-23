
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.igc.lwsktr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.igc.lwsktr.client.model.ModelLWSK_Soldier;
import net.igc.lwsktr.client.model.ModelLWSK_Normal;
import net.igc.lwsktr.client.model.ModelLWSK_Fire_Eater;
import net.igc.lwsktr.client.model.ModelLWSK_Cadet;
import net.igc.lwsktr.client.model.ModelLWSK_Android;
import net.igc.lwsktr.client.model.ModelHE_Tech_Grenade_Entity_Converted;
import net.igc.lwsktr.client.model.ModelBullet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LwskTrModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBullet.LAYER_LOCATION, ModelBullet::createBodyLayer);
		event.registerLayerDefinition(ModelHE_Tech_Grenade_Entity_Converted.LAYER_LOCATION, ModelHE_Tech_Grenade_Entity_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelLWSK_Normal.LAYER_LOCATION, ModelLWSK_Normal::createBodyLayer);
		event.registerLayerDefinition(ModelLWSK_Fire_Eater.LAYER_LOCATION, ModelLWSK_Fire_Eater::createBodyLayer);
		event.registerLayerDefinition(ModelLWSK_Soldier.LAYER_LOCATION, ModelLWSK_Soldier::createBodyLayer);
		event.registerLayerDefinition(ModelLWSK_Android.LAYER_LOCATION, ModelLWSK_Android::createBodyLayer);
		event.registerLayerDefinition(ModelLWSK_Cadet.LAYER_LOCATION, ModelLWSK_Cadet::createBodyLayer);
	}
}
