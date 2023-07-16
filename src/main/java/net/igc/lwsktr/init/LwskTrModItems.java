
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
import net.igc.lwsktr.item.ExplosiveAssaultRifleItem;
import net.igc.lwsktr.item.ExplosiveAssaultRifleAmmoItem;
import net.igc.lwsktr.item.BulletItem;
import net.igc.lwsktr.item.AssaultRiflenoammoItem;
import net.igc.lwsktr.item.AssaultRifleItem;
import net.igc.lwsktr.item.AssaultRifleAmmoItem;
import net.igc.lwsktr.LwskTrMod;

public class LwskTrModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LwskTrMod.MODID);
	public static final RegistryObject<Item> HETG = block(LwskTrModBlocks.HETG, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> PISTOL_AMMO_BLOCK = block(LwskTrModBlocks.PISTOL_AMMO_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> ASSAULT_RIFLE_AMMO_BLOCK = block(LwskTrModBlocks.ASSAULT_RIFLE_AMMO_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> EXPLOSIVE_ASSAULT_RIFLE_AMMO_BLOCK = block(LwskTrModBlocks.EXPLOSIVE_ASSAULT_RIFLE_AMMO_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> PISTOL_BLOCK = block(LwskTrModBlocks.PISTOL_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> ASSAULT_RIFLE_BLOCK = block(LwskTrModBlocks.ASSAULT_RIFLE_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> EXPLOSIVE_ASSAULT_RIFLE_BLOCK = block(LwskTrModBlocks.EXPLOSIVE_ASSAULT_RIFLE_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_A = block(LwskTrModBlocks.FLOOR_A, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_A_CORNER = block(LwskTrModBlocks.FLOOR_A_CORNER, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_A_BOTTOM = block(LwskTrModBlocks.FLOOR_A_BOTTOM, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_A_SMALL = block(LwskTrModBlocks.FLOOR_A_SMALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_A_STAIRS = block(LwskTrModBlocks.FLOOR_A_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_A_SLAB = block(LwskTrModBlocks.FLOOR_A_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_B = block(LwskTrModBlocks.FLOOR_B, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_B_CORNER = block(LwskTrModBlocks.FLOOR_B_CORNER, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_B_BOTTOM = block(LwskTrModBlocks.FLOOR_B_BOTTOM, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_B_SMALL = block(LwskTrModBlocks.FLOOR_B_SMALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_C_CORNER = block(LwskTrModBlocks.FLOOR_C_CORNER, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_C_BOTTOM = block(LwskTrModBlocks.FLOOR_C_BOTTOM, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_C_SMALL = block(LwskTrModBlocks.FLOOR_C_SMALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_D = block(LwskTrModBlocks.FLOOR_D, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_D_STAIRS = block(LwskTrModBlocks.FLOOR_D_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> FLOOR_D_SLAB = block(LwskTrModBlocks.FLOOR_D_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> COPPER_TUBE = block(LwskTrModBlocks.COPPER_TUBE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> COPPER_TUBE_TOP = block(LwskTrModBlocks.COPPER_TUBE_TOP, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> IRON_TUBE = block(LwskTrModBlocks.IRON_TUBE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> IRON_TUBE_TOP = block(LwskTrModBlocks.IRON_TUBE_TOP, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> VENT = block(LwskTrModBlocks.VENT, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> VENT_TUBE = block(LwskTrModBlocks.VENT_TUBE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> RUSTY_VENT = block(LwskTrModBlocks.RUSTY_VENT, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> RUSTY_VENT_TUBE = block(LwskTrModBlocks.RUSTY_VENT_TUBE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> GRAY_METAL = block(LwskTrModBlocks.GRAY_METAL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> GRAY_METAL_STAIRS = block(LwskTrModBlocks.GRAY_METAL_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> GRAY_METAL_SLAB = block(LwskTrModBlocks.GRAY_METAL_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> GRAY_METAL_WALL = block(LwskTrModBlocks.GRAY_METAL_WALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BLACK_METAL = block(LwskTrModBlocks.BLACK_METAL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BLACK_METAL_STAIRS = block(LwskTrModBlocks.BLACK_METAL_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BLACK_METAL_SLAB = block(LwskTrModBlocks.BLACK_METAL_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BLACK_METAL_WALL = block(LwskTrModBlocks.BLACK_METAL_WALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> GREEN_METAL = block(LwskTrModBlocks.GREEN_METAL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> GREEN_METAL_STAIRS = block(LwskTrModBlocks.GREEN_METAL_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> GREEN_METAL_SLAB = block(LwskTrModBlocks.GREEN_METAL_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> GREEN_METAL_WALL = block(LwskTrModBlocks.GREEN_METAL_WALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BLUE_METAL = block(LwskTrModBlocks.BLUE_METAL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BLUE_METAL_STAIRS = block(LwskTrModBlocks.BLUE_METAL_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BLUE_METAL_SLAB = block(LwskTrModBlocks.BLUE_METAL_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BLUE_METAL_WALL = block(LwskTrModBlocks.BLUE_METAL_WALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> RED_METAL = block(LwskTrModBlocks.RED_METAL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> RED_METAL_STAIRS = block(LwskTrModBlocks.RED_METAL_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> RED_METAL_SLAB = block(LwskTrModBlocks.RED_METAL_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> RED_METAL_WALL = block(LwskTrModBlocks.RED_METAL_WALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> YELLOW_METAL = block(LwskTrModBlocks.YELLOW_METAL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> YELLOW_METAL_STAIRS = block(LwskTrModBlocks.YELLOW_METAL_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> YELLOW_METAL_SLAB = block(LwskTrModBlocks.YELLOW_METAL_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> YELLOW_METAL_WALL = block(LwskTrModBlocks.YELLOW_METAL_WALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_STRUCTURE = block(LwskTrModBlocks.REINFORCED_STRUCTURE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_STRUCTURE_LIGHT = block(LwskTrModBlocks.REINFORCED_STRUCTURE_LIGHT, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GATE = block(LwskTrModBlocks.REINFORCED_GATE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GATE_BLOCK = block(LwskTrModBlocks.REINFORCED_GATE_BLOCK, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> SMALL_REINFORCED_GLASS = block(LwskTrModBlocks.SMALL_REINFORCED_GLASS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GLASS_CORNER_TOP = block(LwskTrModBlocks.REINFORCED_GLASS_CORNER_TOP, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GLASS_CORNER_DOWN = block(LwskTrModBlocks.REINFORCED_GLASS_CORNER_DOWN, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GLASS_CORNER_MIDDLE = block(LwskTrModBlocks.REINFORCED_GLASS_CORNER_MIDDLE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GLASS_MIDDLE = block(LwskTrModBlocks.REINFORCED_GLASS_MIDDLE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GLASS_MIDDLE_UP = block(LwskTrModBlocks.REINFORCED_GLASS_MIDDLE_UP, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GLASS_MIDDLE_DOWN = block(LwskTrModBlocks.REINFORCED_GLASS_MIDDLE_DOWN, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GLASS_MIDDLE_UP_FAKE = block(LwskTrModBlocks.REINFORCED_GLASS_MIDDLE_UP_FAKE, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> REINFORCED_GLASS_BIG = block(LwskTrModBlocks.REINFORCED_GLASS_BIG, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> IRON_CHAIN = block(LwskTrModBlocks.IRON_CHAIN, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> CEILING_LIGHT = block(LwskTrModBlocks.CEILING_LIGHT, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> OPERATIONAL_COMPUTER_OFF = block(LwskTrModBlocks.OPERATIONAL_COMPUTER_OFF, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> OPERATIONAL_COMPUTER_ON = block(LwskTrModBlocks.OPERATIONAL_COMPUTER_ON, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> HETG_ITEM_2 = REGISTRY.register("hetg_item_2", () -> new HETGItem2Item());
	public static final RegistryObject<Item> PISTOL_AMMO = REGISTRY.register("pistol_ammo", () -> new PistolAmmoItem());
	public static final RegistryObject<Item> ASSAULT_RIFLE_AMMO = REGISTRY.register("assault_rifle_ammo", () -> new AssaultRifleAmmoItem());
	public static final RegistryObject<Item> EXPLOSIVE_ASSAULT_RIFLE_AMMO = REGISTRY.register("explosive_assault_rifle_ammo", () -> new ExplosiveAssaultRifleAmmoItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> ASSAULT_RIFLE = REGISTRY.register("assault_rifle", () -> new AssaultRifleItem());
	public static final RegistryObject<Item> EXPLOSIVE_ASSAULT_RIFLE = REGISTRY.register("explosive_assault_rifle", () -> new ExplosiveAssaultRifleItem());
	public static final RegistryObject<Item> HETG_ITEM = REGISTRY.register("hetg_item", () -> new HETGItemItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> PISTOLNOAMMO = REGISTRY.register("pistolnoammo", () -> new PistolnoammoItem());
	public static final RegistryObject<Item> ASSAULT_RIFLENOAMMO = REGISTRY.register("assault_riflenoammo", () -> new AssaultRiflenoammoItem());
	public static final RegistryObject<Item> BIG_BUTTON = block(LwskTrModBlocks.BIG_BUTTON, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> BIG_BUTTON_POWER = block(LwskTrModBlocks.BIG_BUTTON_POWER, null);
	public static final RegistryObject<Item> WHITE_METAL = block(LwskTrModBlocks.WHITE_METAL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> WHITE_METAL_STAIRS = block(LwskTrModBlocks.WHITE_METAL_STAIRS, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> WHITE_METAL_SLAB = block(LwskTrModBlocks.WHITE_METAL_SLAB, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);
	public static final RegistryObject<Item> WHITE_METAL_WALL = block(LwskTrModBlocks.WHITE_METAL_WALL, LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
