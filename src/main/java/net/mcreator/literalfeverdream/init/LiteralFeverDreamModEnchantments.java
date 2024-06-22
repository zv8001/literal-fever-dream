
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.literalfeverdream.enchantment.ChernobylPremiumEnchantment;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<Enchantment> CHERNOBYL_PREMIUM = REGISTRY.register("chernobyl_premium", () -> new ChernobylPremiumEnchantment());
}
