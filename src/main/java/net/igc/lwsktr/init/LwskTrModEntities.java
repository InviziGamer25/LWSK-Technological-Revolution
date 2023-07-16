
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.igc.lwsktr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.igc.lwsktr.entity.PistolEntity;
import net.igc.lwsktr.entity.HETGItemEntity;
import net.igc.lwsktr.entity.HETGEntityEntity;
import net.igc.lwsktr.entity.ExplosiveAssaultRifleEntity;
import net.igc.lwsktr.entity.AssaultRifleEntity;
import net.igc.lwsktr.LwskTrMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LwskTrModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, LwskTrMod.MODID);
	public static final RegistryObject<EntityType<HETGEntityEntity>> HETG_ENTITY = register("hetg_entity", EntityType.Builder.<HETGEntityEntity>of(HETGEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(HETGEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PistolEntity>> PISTOL = register("projectile_pistol",
			EntityType.Builder.<PistolEntity>of(PistolEntity::new, MobCategory.MISC).setCustomClientFactory(PistolEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AssaultRifleEntity>> ASSAULT_RIFLE = register("projectile_assault_rifle",
			EntityType.Builder.<AssaultRifleEntity>of(AssaultRifleEntity::new, MobCategory.MISC).setCustomClientFactory(AssaultRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExplosiveAssaultRifleEntity>> EXPLOSIVE_ASSAULT_RIFLE = register("projectile_explosive_assault_rifle",
			EntityType.Builder.<ExplosiveAssaultRifleEntity>of(ExplosiveAssaultRifleEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosiveAssaultRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HETGItemEntity>> HETG_ITEM = register("projectile_hetg_item",
			EntityType.Builder.<HETGItemEntity>of(HETGItemEntity::new, MobCategory.MISC).setCustomClientFactory(HETGItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HETGEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HETG_ENTITY.get(), HETGEntityEntity.createAttributes().build());
	}
}
