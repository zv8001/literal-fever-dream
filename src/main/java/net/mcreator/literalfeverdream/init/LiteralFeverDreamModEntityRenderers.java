/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.literalfeverdream.client.renderer.BacteriaRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class LiteralFeverDreamModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LiteralFeverDreamModEntities.BACTERIA.get(), BacteriaRenderer::new);
	}
}