
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

import net.mcreator.rival.entity.SwordPillagerEntity;
import net.mcreator.rival.entity.CrossbowPillagerEntity;
import net.mcreator.rival.RivalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RivalModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RivalMod.MODID);
	public static final RegistryObject<EntityType<CrossbowPillagerEntity>> CROSSBOW_PILLAGER = register("crossbow_pillager",
			EntityType.Builder.<CrossbowPillagerEntity>of(CrossbowPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrossbowPillagerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SwordPillagerEntity>> SWORD_PILLAGER = register("sword_pillager",
			EntityType.Builder.<SwordPillagerEntity>of(SwordPillagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwordPillagerEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CrossbowPillagerEntity.init();
			SwordPillagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CROSSBOW_PILLAGER.get(), CrossbowPillagerEntity.createAttributes().build());
		event.put(SWORD_PILLAGER.get(), SwordPillagerEntity.createAttributes().build());
	}
}
