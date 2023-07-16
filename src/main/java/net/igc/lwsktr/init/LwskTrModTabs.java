
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.igc.lwsktr.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LwskTrModTabs {
	public static CreativeModeTab TAB_LWSK_TECHNOLOGICAL_REVOLUTION_ITEMS;
	public static CreativeModeTab TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS;

	public static void load() {
		TAB_LWSK_TECHNOLOGICAL_REVOLUTION_ITEMS = new CreativeModeTab("tablwsk_technological_revolution_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LwskTrModItems.PISTOL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_LWSK_TECHNOLOGICAL_REVOLUTION_BLOCKS = new CreativeModeTab("tablwsk_technological_revolution_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LwskTrModBlocks.HETG.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
