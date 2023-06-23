
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.igc.lwsktr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.igc.lwsktr.item.PistolnoammoItem;
import net.igc.lwsktr.item.PistolItem;
import net.igc.lwsktr.item.PistolAmmoItem;
import net.igc.lwsktr.item.HETGItemItem;
import net.igc.lwsktr.item.HETGItem2Item;
import net.igc.lwsktr.item.BulletItem;
import net.igc.lwsktr.LwskTrMod;

public class LwskTrModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LwskTrMod.MODID);
	public static final RegistryObject<Item> HETG_ITEM = REGISTRY.register("hetg_item", () -> new HETGItemItem());
	public static final RegistryObject<Item> HETG = block(LwskTrModBlocks.HETG, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> HETG_ITEM_2 = REGISTRY.register("hetg_item_2", () -> new HETGItem2Item());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> PISTOLNOAMMO = REGISTRY.register("pistolnoammo", () -> new PistolnoammoItem());
	public static final RegistryObject<Item> PISTOL_BLOCK = block(LwskTrModBlocks.PISTOL_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> PISTOL_AMMO_BLOCK = block(LwskTrModBlocks.PISTOL_AMMO_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> PISTOL_AMMO = REGISTRY.register("pistol_ammo", () -> new PistolAmmoItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
