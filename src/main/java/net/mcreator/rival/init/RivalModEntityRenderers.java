
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.rival.client.renderer.SwordPillagerRenderer;
import net.mcreator.rival.client.renderer.SpearPillagerRenderer;
import net.mcreator.rival.client.renderer.MinerPillagerRenderer;
import net.mcreator.rival.client.renderer.AxePillagerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RivalModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RivalModEntities.SWORD_PILLAGER.get(), SwordPillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.AXE_PILLAGER.get(), AxePillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.SPEAR_PILLAGER.get(), SpearPillagerRenderer::new);
		event.registerEntityRenderer(RivalModEntities.MINER_PILLAGER.get(), MinerPillagerRenderer::new);
	}
}
