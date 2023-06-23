package net.igc.lwsktr.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.igc.lwsktr.init.LwskTrModItems;
import net.igc.lwsktr.init.LwskTrModGameRules;

public class HETGItem2RightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(LwskTrModGameRules.GRENADEACTIVATED) == false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LwskTrModItems.HETG_ITEM_2.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(LwskTrModItems.HETG_ITEM.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level)
					_level.getGameRules().getRule(LwskTrModGameRules.GRENADEACTIVATED).set((true), _level.getServer());
			}
		}
	}
}
