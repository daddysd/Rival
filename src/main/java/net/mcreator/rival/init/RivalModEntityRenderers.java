
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rival.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.rival.client.renderer.CrossbowPillagerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RivalModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RivalModEntities.CROSSBOW_PILLAGER.get(), CrossbowPillagerRenderer::new);
	}
}
