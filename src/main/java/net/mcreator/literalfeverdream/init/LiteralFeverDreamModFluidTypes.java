/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.literalfeverdream.fluid.types.WeirdRadioactiveLiquidFluidType;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, LiteralFeverDreamMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> WEIRD_RADIOACTIVE_LIQUID_TYPE = REGISTRY.register("weird_radioactive_liquid", WeirdRadioactiveLiquidFluidType::new);
}