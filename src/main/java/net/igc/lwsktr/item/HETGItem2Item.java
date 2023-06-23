
package net.igc.lwsktr.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.igc.lwsktr.procedures.HETGItem2RightclickedProcedure;
import net.igc.lwsktr.init.LwskTrModTabs;

import java.util.List;

public class HETGItem2Item extends Item {
	public HETGItem2Item() {
		super(new Item.Properties().tab(LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_ITEMS).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Hight Explosive Technological Grenade"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HETGItem2RightclickedProcedure.execute(world, entity);
		return ar;
	}
}
