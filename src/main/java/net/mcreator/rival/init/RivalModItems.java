
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.rival.item.HammerItem;
import net.mcreator.rival.RivalMod;

public class RivalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RivalMod.MODID);
	public static final RegistryObject<Item> SWORD_PILLAGER_SPAWN_EGG = REGISTRY.register("sword_pillager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.SWORD_PILLAGER, -11719630, -3355444, new Item.Properties()));
	public static final RegistryObject<Item> MAGE_PILLAGER_SPAWN_EGG = REGISTRY.register("mage_pillager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.MAGE_PILLAGER, -11719630, -10027162, new Item.Properties()));
	public static final RegistryObject<Item> SPEAR_PILLAGER_SPAWN_EGG = REGISTRY.register("spear_pillager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.SPEAR_PILLAGER, -11719630, -1, new Item.Properties()));
	public static final RegistryObject<Item> AXE_PILLAGER_SPAWN_EGG = REGISTRY.register("axe_pillager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.AXE_PILLAGER, -11719630, -1, new Item.Properties()));
	public static final RegistryObject<Item> MINER_PILLAGER_SPAWN_EGG = REGISTRY.register("miner_pillager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.MINER_PILLAGER, -11719630, -1, new Item.Properties()));
	public static final RegistryObject<Item> SUMMONER_PILLAGER_SPAWN_EGG = REGISTRY.register("summoner_pillager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.SUMMONER_PILLAGER, -11719630, -16776961, new Item.Properties()));
	public static final RegistryObject<Item> WITCH_SPAWN_EGG = REGISTRY.register("witch_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.WITCH, -11719630, -13434829, new Item.Properties()));
	public static final RegistryObject<Item> ROYAL_GUARDS_SPAWN_EGG = REGISTRY.register("royal_guards_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.ROYAL_GUARDS, -11719630, -16776961, new Item.Properties()));
	public static final RegistryObject<Item> BAD_VILLAGER_SPAWN_EGG = REGISTRY.register("bad_villager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.BAD_VILLAGER, -11719630, -16776961, new Item.Properties()));
	public static final RegistryObject<Item> HOG_RIDER_SPAWN_EGG = REGISTRY.register("hog_rider_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.HOG_RIDER, -11719630, -39322, new Item.Properties()));
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> SWORD_PILLAGER_DIAMOND_SWORD_SPAWN_EGG = REGISTRY.register("sword_pillager_diamond_sword_spawn_egg",
			() -> new ForgeSpawnEggItem(RivalModEntities.SWORD_PILLAGER_DIAMOND_SWORD, -11719630, -13408513, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
