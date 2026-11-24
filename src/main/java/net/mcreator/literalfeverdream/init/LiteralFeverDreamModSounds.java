/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, LiteralFeverDreamMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> RICKROLL = REGISTRY.register("rickroll", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("literal_fever_dream", "rickroll")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ASYNC_THIRD_TEST = REGISTRY.register("async-third_test", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("literal_fever_dream", "async-third_test")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FOOTSTEPSDGES = REGISTRY.register("footstepsdges", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("literal_fever_dream", "footstepsdges")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BACKROOMS = REGISTRY.register("backrooms", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("literal_fever_dream", "backrooms")));
}