package net.igc.lwsktr.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

import net.igc.lwsktr.init.LwskTrModGameRules;

public class HETGItemWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(LwskTrModGameRules.GRENADEACTIVATED) == true) {
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
					if (world instanceof Level _level)
						_level.getGameRules().getRule(LwskTrModGameRules.GRENADEACTIVATED).set((false), _level.getServer());
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 160);
		}
	}
}
