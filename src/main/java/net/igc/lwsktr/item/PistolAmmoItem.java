
package net.igc.lwsktr.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.igc.lwsktr.init.LwskTrModTabs;

import java.util.List;

public class PistolAmmoItem extends Item {
	public PistolAmmoItem() {
		super(new Item.Properties().tab(LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_ITEMS).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("<10mm>"));
	}
}
