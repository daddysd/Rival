
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.rival.RivalMod;

public class RivalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RivalMod.MODID);
	public static final RegistryObject<Item> CROSSBOW_PILLAGER_SPAWN_EGG = REGISTRY.register("crossbow_pillager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.CROSSBOW_PILLAGER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SWORD_PILLAGER_SPAWN_EGG = REGISTRY.register("sword_pillager_spawn_egg", () -> new ForgeSpawnEggItem(RivalModEntities.SWORD_PILLAGER, -1, -1, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
