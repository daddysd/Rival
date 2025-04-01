
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.rival.RivalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RivalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RivalMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RivalModItems.SWORD_PILLAGER_SPAWN_EGG.get());
			tabData.accept(RivalModItems.MAGE_PILLAGER_SPAWN_EGG.get());
			tabData.accept(RivalModItems.SPEAR_PILLAGER_SPAWN_EGG.get());
			tabData.accept(RivalModItems.AXE_PILLAGER_SPAWN_EGG.get());
			tabData.accept(RivalModItems.MINER_PILLAGER_SPAWN_EGG.get());
			tabData.accept(RivalModItems.SUMMONER_PILLAGER_SPAWN_EGG.get());
			tabData.accept(RivalModItems.WITCH_SPAWN_EGG.get());
			tabData.accept(RivalModItems.ROYAL_GUARDS_SPAWN_EGG.get());
			tabData.accept(RivalModItems.BAD_VILLAGER_SPAWN_EGG.get());
			tabData.accept(RivalModItems.HOG_RIDER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RivalModItems.HAMMER.get());
		}
	}
}
