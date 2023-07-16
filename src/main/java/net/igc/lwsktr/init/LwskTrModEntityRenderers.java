
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
import net.igc.lwsktr.client.renderer.ExplosiveAssaultRifleRenderer;
import net.igc.lwsktr.client.renderer.AssaultRifleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LwskTrModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LwskTrModEntities.HETG_ENTITY.get(), HETGEntityRenderer::new);
		event.registerEntityRenderer(LwskTrModEntities.PISTOL.get(), PistolRenderer::new);
		event.registerEntityRenderer(LwskTrModEntities.ASSAULT_RIFLE.get(), AssaultRifleRenderer::new);
		event.registerEntityRenderer(LwskTrModEntities.EXPLOSIVE_ASSAULT_RIFLE.get(), ExplosiveAssaultRifleRenderer::new);
		event.registerEntityRenderer(LwskTrModEntities.HETG_ITEM.get(), ThrownItemRenderer::new);
	}
}
