
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.literalfeverdream.fluid.types.WeirdRadioactiveLiquidFluidType;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<FluidType> WEIRD_RADIOACTIVE_LIQUID_TYPE = REGISTRY.register("weird_radioactive_liquid", () -> new WeirdRadioactiveLiquidFluidType());
}
