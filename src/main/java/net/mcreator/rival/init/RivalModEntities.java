
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

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

import net.mcreator.rival.entity.WitchEntity;
import net.mcreator.rival.entity.SwordPillagerEntity;
import net.mcreator.rival.entity.SummonerPillagerEntity;
import net.mcreator.rival.entity.SpearPillagerEntity;
import net.mcreator.rival.entity.RoyalGuardsEntity;
import net.mcreator.rival.entity.MinerPillagerEntity;
import net.mcreator.rival.entity.MagePillagerEntity;
import net.mcreator.rival.entity.HogRiderEntity;
import net.mcreator.rival.entity.BadVillagerEntity;
import net.mcreator.rival.entity.AxePillagerEntity;
import net.mcreator.rival.RivalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RivalModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RivalMod.MODID);
	public static final RegistryObject<EntityType<SwordPillagerEntity>> SWORD_PILLAGER = register("sword_pillager",
			EntityType.Builder.<SwordPillagerEntity>of(SwordPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwordPillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagePillagerEntity>> MAGE_PILLAGER = register("mage_pillager",
			EntityType.Builder.<MagePillagerEntity>of(MagePillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagePillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpearPillagerEntity>> SPEAR_PILLAGER = register("spear_pillager",
			EntityType.Builder.<SpearPillagerEntity>of(SpearPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpearPillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AxePillagerEntity>> AXE_PILLAGER = register("axe_pillager",
			EntityType.Builder.<AxePillagerEntity>of(AxePillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AxePillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MinerPillagerEntity>> MINER_PILLAGER = register("miner_pillager",
			EntityType.Builder.<MinerPillagerEntity>of(MinerPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinerPillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SummonerPillagerEntity>> SUMMONER_PILLAGER = register("summoner_pillager",
			EntityType.Builder.<SummonerPillagerEntity>of(SummonerPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SummonerPillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitchEntity>> WITCH = register("witch",
			EntityType.Builder.<WitchEntity>of(WitchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitchEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoyalGuardsEntity>> ROYAL_GUARDS = register("royal_guards",
			EntityType.Builder.<RoyalGuardsEntity>of(RoyalGuardsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoyalGuardsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BadVillagerEntity>> BAD_VILLAGER = register("bad_villager",
			EntityType.Builder.<BadVillagerEntity>of(BadVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BadVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HogRiderEntity>> HOG_RIDER = register("hog_rider",
			EntityType.Builder.<HogRiderEntity>of(HogRiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HogRiderEntity::new)

					.sized(1f, 2.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SwordPillagerEntity.init();
			MagePillagerEntity.init();
			SpearPillagerEntity.init();
			AxePillagerEntity.init();
			MinerPillagerEntity.init();
			SummonerPillagerEntity.init();
			WitchEntity.init();
			RoyalGuardsEntity.init();
			BadVillagerEntity.init();
			HogRiderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SWORD_PILLAGER.get(), SwordPillagerEntity.createAttributes().build());
		event.put(MAGE_PILLAGER.get(), MagePillagerEntity.createAttributes().build());
		event.put(SPEAR_PILLAGER.get(), SpearPillagerEntity.createAttributes().build());
		event.put(AXE_PILLAGER.get(), AxePillagerEntity.createAttributes().build());
		event.put(MINER_PILLAGER.get(), MinerPillagerEntity.createAttributes().build());
		event.put(SUMMONER_PILLAGER.get(), SummonerPillagerEntity.createAttributes().build());
		event.put(WITCH.get(), WitchEntity.createAttributes().build());
		event.put(ROYAL_GUARDS.get(), RoyalGuardsEntity.createAttributes().build());
		event.put(BAD_VILLAGER.get(), BadVillagerEntity.createAttributes().build());
		event.put(HOG_RIDER.get(), HogRiderEntity.createAttributes().build());
	}
}
