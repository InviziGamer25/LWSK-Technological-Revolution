
package net.igc.lwsktr.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.igc.lwsktr.procedures.AssaultRifleRangedItemUsedProcedure;
import net.igc.lwsktr.init.LwskTrModTabs;
import net.igc.lwsktr.entity.AssaultRifleEntity;

public class AssaultRifleItem extends Item {
	public AssaultRifleItem() {
		super(new Item.Properties().tab(LwskTrModTabs.TAB_LWSK_TECHNOLOGICAL_REVOLUTION_ITEMS).durability(41));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.CROSSBOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
		Level world = entityLiving.level;
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				AssaultRifleEntity entityarrow = AssaultRifleEntity.shoot(world, entity, world.getRandom(), 3f, 0.30000000000000004, 0);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;

				AssaultRifleRangedItemUsedProcedure.execute(entity, itemstack);
				entity.releaseUsingItem();
			}
		}
	}
}
