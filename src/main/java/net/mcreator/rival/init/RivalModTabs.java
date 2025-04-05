
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.rival.RivalMod;

public class RivalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RivalMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOBS = REGISTRY.register("mobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rival.mobs")).icon(() -> new ItemStack(RivalModItems.HAMMER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RivalModItems.SWORD_PILLAGER_SPAWN_EGG.get());
				tabData.accept(RivalModItems.SPEAR_PILLAGER_SPAWN_EGG.get());
				tabData.accept(RivalModItems.MINER_PILLAGER_SPAWN_EGG.get());
				tabData.accept(RivalModItems.SUMMONER_PILLAGER_SPAWN_EGG.get());
				tabData.accept(RivalModItems.WITCH_SPAWN_EGG.get());
				tabData.accept(RivalModItems.ROYAL_GUARDS_SPAWN_EGG.get());
				tabData.accept(RivalModItems.BAD_VILLAGER_SPAWN_EGG.get());
				tabData.accept(RivalModItems.HOG_RIDER_SPAWN_EGG.get());
				tabData.accept(RivalModItems.SWORD_PILLAGER_DIAMOND_SWORD_SPAWN_EGG.get());
				tabData.accept(RivalModItems.MAGE_PILLAGER_SPAWN_EGG.get());
				tabData.accept(RivalModItems.DAYICI_USTA_SPAWN_EGG.get());
				tabData.accept(RivalModItems.DAYICI_USTA_PHASE_2_SPAWN_EGG.get());
			}).build());
	public static final RegistryObject<CreativeModeTab> TOOLS = REGISTRY.register("tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rival.tools")).icon(() -> new ItemStack(RivalModItems.HAMMER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RivalModItems.HAMMER.get());
				tabData.accept(RivalModItems.ZULFI.get());
			}).withTabsBefore(MOBS.getId()).build());
}
