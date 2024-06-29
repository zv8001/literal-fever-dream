
package net.mcreator.literalfeverdream.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class WeirdRadioactiveLiquidBlock extends LiquidBlock {
	public WeirdRadioactiveLiquidBlock() {
		super(() -> LiteralFeverDreamModFluids.WEIRD_RADIOACTIVE_LIQUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		UraniumizedProcedure.execute(entity);
	}
}