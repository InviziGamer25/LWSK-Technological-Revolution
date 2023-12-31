
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.igc.lwsktr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LwskTrModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("lwsk_tr", "singlepistol"), new SoundEvent(new ResourceLocation("lwsk_tr", "singlepistol")));
		REGISTRY.put(new ResourceLocation("lwsk_tr", "ammoremove"), new SoundEvent(new ResourceLocation("lwsk_tr", "ammoremove")));
		REGISTRY.put(new ResourceLocation("lwsk_tr", "ammoreload"), new SoundEvent(new ResourceLocation("lwsk_tr", "ammoreload")));
		REGISTRY.put(new ResourceLocation("lwsk_tr", "shootsgun9mm"), new SoundEvent(new ResourceLocation("lwsk_tr", "shootsgun9mm")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
