
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.literalfeverdream.fluid.WeirdRadioactiveLiquidFluid;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<FlowingFluid> WEIRD_RADIOACTIVE_LIQUID = REGISTRY.register("weird_radioactive_liquid", () -> new WeirdRadioactiveLiquidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_WEIRD_RADIOACTIVE_LIQUID = REGISTRY.register("flowing_weird_radioactive_liquid", () -> new WeirdRadioactiveLiquidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(WEIRD_RADIOACTIVE_LIQUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WEIRD_RADIOACTIVE_LIQUID.get(), RenderType.translucent());
		}
	}
}
