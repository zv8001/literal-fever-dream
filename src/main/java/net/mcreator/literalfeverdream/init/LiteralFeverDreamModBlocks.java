/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.literalfeverdream.block.*;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

import java.util.function.Function;

public class LiteralFeverDreamModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LiteralFeverDreamMod.MODID);
	public static final DeferredBlock<Block> TRAIN_BLOCK;
	public static final DeferredBlock<Block> COSMO_PORTAL;
	public static final DeferredBlock<Block> CONEEHA_1092;
	public static final DeferredBlock<Block> CONEEHASHELLPLACE_PORTAL;
	public static final DeferredBlock<Block> NICE;
	public static final DeferredBlock<Block> NICE_DIENS_PORTAL;
	public static final DeferredBlock<Block> NEXUS_BLOCK;
	public static final DeferredBlock<Block> NEXUSSHELLHOLE_PORTAL;
	public static final DeferredBlock<Block> URANIUM_BLOCK;
	public static final DeferredBlock<Block> FURRYTRAIN;
	public static final DeferredBlock<Block> FUSION_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> FUSION_BLOCK;
	public static final DeferredBlock<Block> RICKROLL_ORE;
	public static final DeferredBlock<Block> RADIATION_PLANT;
	public static final DeferredBlock<Block> FAKE_DIMOND_BLOCK;
	public static final DeferredBlock<Block> TEST_PORTAL;
	public static final DeferredBlock<Block> WEIRD_RADIOACTIVE_LIQUID;
	public static final DeferredBlock<Block> WEIRD_RUG;
	public static final DeferredBlock<Block> WALLS;
	static {
		TRAIN_BLOCK = register("train_block", TrainBlockBlock::new);
		COSMO_PORTAL = register("cosmo_portal", CosmoPortalBlock::new);
		CONEEHA_1092 = register("coneeha_1092", Coneeha1092Block::new);
		CONEEHASHELLPLACE_PORTAL = register("coneehashellplace_portal", ConeehashellplacePortalBlock::new);
		NICE = register("nice", NiceBlock::new);
		NICE_DIENS_PORTAL = register("nice_diens_portal", NiceDiensPortalBlock::new);
		NEXUS_BLOCK = register("nexus_block", NexusBlockBlock::new);
		NEXUSSHELLHOLE_PORTAL = register("nexusshellhole_portal", NexusshellholePortalBlock::new);
		URANIUM_BLOCK = register("uranium_block", UraniumBlockBlock::new);
		FURRYTRAIN = register("furrytrain", FurrytrainBlock::new);
		FUSION_DIMENSION_PORTAL = register("fusion_dimension_portal", FusionDimensionPortalBlock::new);
		FUSION_BLOCK = register("fusion_block", FusionBlockBlock::new);
		RICKROLL_ORE = register("rickroll_ore", RickrollOreBlock::new);
		RADIATION_PLANT = register("radiation_plant", RadiationPlantBlock::new);
		FAKE_DIMOND_BLOCK = register("fake_dimond_block", FakeDimondBlockBlock::new);
		TEST_PORTAL = register("test_portal", TestPortalBlock::new);
		WEIRD_RADIOACTIVE_LIQUID = register("weird_radioactive_liquid", WeirdRadioactiveLiquidBlock::new);
		WEIRD_RUG = register("weird_rug", WeirdRugBlock::new);
		WALLS = register("walls", WallsBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}