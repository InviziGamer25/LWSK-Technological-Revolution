
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.igc.lwsktr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.igc.lwsktr.client.renderer.PistolRenderer;
import net.igc.lwsktr.client.renderer.HETGEntityRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LwskTrModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LwskTrModEntities.HETG_ITEM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(LwskTrModEntities.HETG_ENTITY.get(), HETGEntityRenderer::new);
		event.registerEntityRenderer(LwskTrModEntities.PISTOL.get(), PistolRenderer::new);
	}
}
