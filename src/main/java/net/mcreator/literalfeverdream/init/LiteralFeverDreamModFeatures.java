
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.literalfeverdream.world.features.plants.RadiationPlantFeature;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

@Mod.EventBusSubscriber
public class LiteralFeverDreamModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<Feature<?>> RADIATION_PLANT = REGISTRY.register("radiation_plant", RadiationPlantFeature::feature);
}
