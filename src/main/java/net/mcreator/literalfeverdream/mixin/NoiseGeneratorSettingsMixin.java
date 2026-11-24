package net.mcreator.literalfeverdream.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements LiteralFeverDreamModBiomes.LiteralFeverDreamModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> literal_fever_dream_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.literal_fever_dream_dimensionTypeReference != null) {
			retval = LiteralFeverDreamModBiomes.adaptSurfaceRule(retval, this.literal_fever_dream_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setliteral_fever_dreamDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.literal_fever_dream_dimensionTypeReference = dimensionType;
	}
}