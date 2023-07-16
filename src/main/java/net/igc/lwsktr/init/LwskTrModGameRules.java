
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.igc.lwsktr.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LwskTrModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> GRENADEACTIVATED = GameRules.register("grenadeActivated", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.IntegerValue> AMMORELOAD = GameRules.register("ammoReload", GameRules.Category.PLAYER, GameRules.IntegerValue.create(1));
}
