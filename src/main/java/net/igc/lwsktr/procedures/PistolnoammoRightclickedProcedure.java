package net.igc.lwsktr.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.igc.lwsktr.init.LwskTrModItems;
import net.igc.lwsktr.init.LwskTrModGameRules;

public class PistolnoammoRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getLevelData().getGameRules().getInt(LwskTrModGameRules.AMMORELOAD)) == 1) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(LwskTrModItems.PISTOL_AMMO.get())) : false) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LwskTrModItems.PISTOLNOAMMO.get()) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 45, 5));
					if (world instanceof Level _level)
						_level.getGameRules().getRule(LwskTrModGameRules.AMMORELOAD).set(2, _level.getServer());
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lwsk_tr:ammoremove")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lwsk_tr:ammoremove")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(LwskTrModItems.PISTOL_AMMO.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LwskTrModItems.PISTOLNOAMMO.get()) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lwsk_tr:ammoreload")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lwsk_tr:ammoreload")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack = new ItemStack(LwskTrModItems.PISTOL.get());
									_setstack.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								if (world instanceof Level _level)
									_level.getGameRules().getRule(LwskTrModGameRules.AMMORELOAD).set(1, _level.getServer());
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 40);
				}
			}
			if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(LwskTrModItems.PISTOL_AMMO.get())) : false)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
		}
	}
}
