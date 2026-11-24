/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.literalfeverdream.fluid.WeirdRadioactiveLiquidFluid;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, LiteralFeverDreamMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> WEIRD_RADIOACTIVE_LIQUID = REGISTRY.register("weird_radioactive_liquid", WeirdRadioactiveLiquidFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_WEIRD_RADIOACTIVE_LIQUID = REGISTRY.register("flowing_weird_radioactive_liquid", WeirdRadioactiveLiquidFluid.Flowing::new);
}