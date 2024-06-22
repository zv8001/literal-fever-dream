
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<SoundEvent> RICKROLL = REGISTRY.register("rickroll", () -> new SoundEvent(new ResourceLocation("literal_fever_dream", "rickroll")));
}
