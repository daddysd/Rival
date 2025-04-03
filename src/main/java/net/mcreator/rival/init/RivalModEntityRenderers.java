
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.rival.client.renderer.WitchRenderer;
import net.mcreator.rival.client.renderer.SwordPillagerRenderer;
import net.mcreator.rival.client.renderer.SwordPillagerDiamondSwordRenderer;
import net.mcreator.rival.client.renderer.SummonerPillagerRenderer;
import net.mcreator.rival.client.renderer.SpearPillagerRenderer;
import net.mcreator.rival.client.renderer.RoyalGuardsRenderer;
import net.mcreator.rival.client.renderer.MinerPillagerRenderer;
import net.mcreator.rival.client.renderer.MagePillagerRenderer;
import net.mcreator.rival.client.renderer.HogRiderRenderer;
import net.mcreator.rival.client.renderer.DayiciBabaRenderer;
import net.mcreator.rival.client.renderer.DayiciBabaPhase4Renderer;
import net.mcreator.rival.client.renderer.DayiciBabaPhase3Renderer;
import net.mcreator.rival.client.renderer.DayiciBabaPhase2Renderer;
import net.mcreator.rival.client.renderer.BadVillagerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RivalModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RivalModEntities.SWORD_PILLAGER.get(), SwordPillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.SPEAR_PILLAGER.get(), SpearPillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.MINER_PILLAGER.get(), MinerPillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.SUMMONER_PILLAGER.get(), SummonerPillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.WITCH.get(), WitchRenderer::new);
		event.registerEntityRenderer(RivalModEntities.ROYAL_GUARDS.get(), RoyalGuardsRenderer::new);
		event.registerEntityRenderer(RivalModEntities.BAD_VILLAGER.get(), BadVillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.HOG_RIDER.get(), HogRiderRenderer::new);
		event.registerEntityRenderer(RivalModEntities.SWORD_PILLAGER_DIAMOND_SWORD.get(), SwordPillagerDiamondSwordRenderer::new);
		event.registerEntityRenderer(RivalModEntities.DAYICI_BABA.get(), DayiciBabaRenderer::new);
		event.registerEntityRenderer(RivalModEntities.DAYICI_BABA_PHASE_2.get(), DayiciBabaPhase2Renderer::new);
		event.registerEntityRenderer(RivalModEntities.DAYICI_BABA_PHASE_3.get(), DayiciBabaPhase3Renderer::new);
		event.registerEntityRenderer(RivalModEntities.DAYICI_BABA_PHASE_4.get(), DayiciBabaPhase4Renderer::new);
		event.registerEntityRenderer(RivalModEntities.MAGE_PILLAGER.get(), MagePillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.MAGE_PILLAGER_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
