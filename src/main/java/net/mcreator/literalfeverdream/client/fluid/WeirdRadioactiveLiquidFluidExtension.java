package net.mcreator.literalfeverdream.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.renderer.block.FluidModel;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModFluids;
import net.mcreator.literalfeverdream.init.LiteralFeverDreamModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class WeirdRadioactiveLiquidFluidExtension {
	@SubscribeEvent
	public static void registerRegisterFluidModels(RegisterFluidModelsEvent event) {
		event.register(new FluidModel.Unbaked(new Material(Identifier.parse("literal_fever_dream:block/stillwater")), new Material(Identifier.parse("literal_fever_dream:block/stillwater")), null, null),
				LiteralFeverDreamModFluids.WEIRD_RADIOACTIVE_LIQUID, LiteralFeverDreamModFluids.FLOWING_WEIRD_RADIOACTIVE_LIQUID);
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
		}, LiteralFeverDreamModFluidTypes.WEIRD_RADIOACTIVE_LIQUID_TYPE);
	}
}