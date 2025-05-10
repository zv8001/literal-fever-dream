
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<PaintingVariant> WEIRDGUYANDSKELETON = REGISTRY.register("weirdguyandskeleton", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> TRAINANDAYDEN = REGISTRY.register("trainandayden", () -> new PaintingVariant(32, 32));
}
