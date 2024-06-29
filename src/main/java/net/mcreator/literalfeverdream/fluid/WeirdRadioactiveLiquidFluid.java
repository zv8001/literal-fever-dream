
package net.mcreator.literalfeverdream.fluid;

public abstract class WeirdRadioactiveLiquidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> LiteralFeverDreamModFluidTypes.WEIRD_RADIOACTIVE_LIQUID_TYPE.get(), () -> LiteralFeverDreamModFluids.WEIRD_RADIOACTIVE_LIQUID.get(),
			() -> LiteralFeverDreamModFluids.FLOWING_WEIRD_RADIOACTIVE_LIQUID.get()).explosionResistance(100f).bucket(() -> LiteralFeverDreamModItems.WEIRD_RADIOACTIVE_LIQUID_BUCKET.get())
			.block(() -> (LiquidBlock) LiteralFeverDreamModBlocks.WEIRD_RADIOACTIVE_LIQUID.get());

	private WeirdRadioactiveLiquidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WeirdRadioactiveLiquidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WeirdRadioactiveLiquidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
