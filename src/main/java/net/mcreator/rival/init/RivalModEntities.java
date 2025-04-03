
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
import net.mcreator.rival.entity.SwordPillagerDiamondSwordEntity;
import net.mcreator.rival.entity.SummonerPillagerEntity;
import net.mcreator.rival.entity.SpearPillagerEntity;
import net.mcreator.rival.entity.RoyalGuardsEntity;
import net.mcreator.rival.entity.MinerPillagerEntity;
import net.mcreator.rival.entity.MagePillagerEntityProjectile;
import net.mcreator.rival.entity.MagePillagerEntity;
import net.mcreator.rival.entity.HogRiderEntity;
import net.mcreator.rival.entity.DayiciBabaPhase4Entity;
import net.mcreator.rival.entity.DayiciBabaPhase3Entity;
import net.mcreator.rival.entity.DayiciBabaPhase2Entity;
import net.mcreator.rival.entity.DayiciBabaEntity;
import net.mcreator.rival.entity.BadVillagerEntity;
import net.mcreator.rival.RivalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RivalModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RivalMod.MODID);
	public static final RegistryObject<EntityType<SwordPillagerEntity>> SWORD_PILLAGER = register("sword_pillager",
			EntityType.Builder.<SwordPillagerEntity>of(SwordPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwordPillagerEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<SpearPillagerEntity>> SPEAR_PILLAGER = register("spear_pillager",
			EntityType.Builder.<SpearPillagerEntity>of(SpearPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpearPillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MinerPillagerEntity>> MINER_PILLAGER = register("miner_pillager",
			EntityType.Builder.<MinerPillagerEntity>of(MinerPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinerPillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SummonerPillagerEntity>> SUMMONER_PILLAGER = register("summoner_pillager",
			EntityType.Builder.<SummonerPillagerEntity>of(SummonerPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SummonerPillagerEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<WitchEntity>> WITCH = register("witch",
			EntityType.Builder.<WitchEntity>of(WitchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitchEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<RoyalGuardsEntity>> ROYAL_GUARDS = register("royal_guards",
			EntityType.Builder.<RoyalGuardsEntity>of(RoyalGuardsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoyalGuardsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BadVillagerEntity>> BAD_VILLAGER = register("bad_villager",
			EntityType.Builder.<BadVillagerEntity>of(BadVillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BadVillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HogRiderEntity>> HOG_RIDER = register("hog_rider",
			EntityType.Builder.<HogRiderEntity>of(HogRiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HogRiderEntity::new)

					.sized(1f, 2.5f));
	public static final RegistryObject<EntityType<SwordPillagerDiamondSwordEntity>> SWORD_PILLAGER_DIAMOND_SWORD = register("sword_pillager_diamond_sword",
			EntityType.Builder.<SwordPillagerDiamondSwordEntity>of(SwordPillagerDiamondSwordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SwordPillagerDiamondSwordEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<DayiciBabaEntity>> DAYICI_BABA = register("dayici_baba",
			EntityType.Builder.<DayiciBabaEntity>of(DayiciBabaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayiciBabaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayiciBabaPhase2Entity>> DAYICI_BABA_PHASE_2 = register("dayici_baba_phase_2",
			EntityType.Builder.<DayiciBabaPhase2Entity>of(DayiciBabaPhase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayiciBabaPhase2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayiciBabaPhase3Entity>> DAYICI_BABA_PHASE_3 = register("dayici_baba_phase_3",
			EntityType.Builder.<DayiciBabaPhase3Entity>of(DayiciBabaPhase3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayiciBabaPhase3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayiciBabaPhase4Entity>> DAYICI_BABA_PHASE_4 = register("dayici_baba_phase_4",
			EntityType.Builder.<DayiciBabaPhase4Entity>of(DayiciBabaPhase4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayiciBabaPhase4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagePillagerEntity>> MAGE_PILLAGER = register("mage_pillager",
			EntityType.Builder.<MagePillagerEntity>of(MagePillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagePillagerEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<MagePillagerEntityProjectile>> MAGE_PILLAGER_PROJECTILE = register("projectile_mage_pillager", EntityType.Builder.<MagePillagerEntityProjectile>of(MagePillagerEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(MagePillagerEntityProjectile::new).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SwordPillagerEntity.init();
			SpearPillagerEntity.init();
			MinerPillagerEntity.init();
			SummonerPillagerEntity.init();
			WitchEntity.init();
			RoyalGuardsEntity.init();
			BadVillagerEntity.init();
			HogRiderEntity.init();
			SwordPillagerDiamondSwordEntity.init();
			DayiciBabaEntity.init();
			DayiciBabaPhase2Entity.init();
			DayiciBabaPhase3Entity.init();
			DayiciBabaPhase4Entity.init();
			MagePillagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SWORD_PILLAGER.get(), SwordPillagerEntity.createAttributes().build());
		event.put(SPEAR_PILLAGER.get(), SpearPillagerEntity.createAttributes().build());
		event.put(MINER_PILLAGER.get(), MinerPillagerEntity.createAttributes().build());
		event.put(SUMMONER_PILLAGER.get(), SummonerPillagerEntity.createAttributes().build());
		event.put(WITCH.get(), WitchEntity.createAttributes().build());
		event.put(ROYAL_GUARDS.get(), RoyalGuardsEntity.createAttributes().build());
		event.put(BAD_VILLAGER.get(), BadVillagerEntity.createAttributes().build());
		event.put(HOG_RIDER.get(), HogRiderEntity.createAttributes().build());
		event.put(SWORD_PILLAGER_DIAMOND_SWORD.get(), SwordPillagerDiamondSwordEntity.createAttributes().build());
		event.put(DAYICI_BABA.get(), DayiciBabaEntity.createAttributes().build());
		event.put(DAYICI_BABA_PHASE_2.get(), DayiciBabaPhase2Entity.createAttributes().build());
		event.put(DAYICI_BABA_PHASE_3.get(), DayiciBabaPhase3Entity.createAttributes().build());
		event.put(DAYICI_BABA_PHASE_4.get(), DayiciBabaPhase4Entity.createAttributes().build());
		event.put(MAGE_PILLAGER.get(), MagePillagerEntity.createAttributes().build());
	}
}
