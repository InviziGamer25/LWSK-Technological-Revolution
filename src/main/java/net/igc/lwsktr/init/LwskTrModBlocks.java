
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.igc.lwsktr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.igc.lwsktr.block.PistolBlockBlock;
import net.igc.lwsktr.block.PistolAmmoBlockBlock;
import net.igc.lwsktr.block.HETGBlock;
import net.igc.lwsktr.LwskTrMod;

public class LwskTrModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LwskTrMod.MODID);
	public static final RegistryObject<Block> HETG = REGISTRY.register("hetg", () -> new HETGBlock());
	public static final RegistryObject<Block> PISTOL_BLOCK = REGISTRY.register("pistol_block", () -> new PistolBlockBlock());
	public static final RegistryObject<Block> PISTOL_AMMO_BLOCK = REGISTRY.register("pistol_ammo_block", () -> new PistolAmmoBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			HETGBlock.registerRenderLayer();
			PistolBlockBlock.registerRenderLayer();
			PistolAmmoBlockBlock.registerRenderLayer();
		}
	}
}
