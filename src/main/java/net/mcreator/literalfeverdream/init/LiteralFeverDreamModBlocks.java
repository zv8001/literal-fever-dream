
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.literalfeverdream.block.UraniumBlockBlock;
import net.mcreator.literalfeverdream.block.TrainBlockBlock;
import net.mcreator.literalfeverdream.block.NiceDiensPortalBlock;
import net.mcreator.literalfeverdream.block.NiceBlock;
import net.mcreator.literalfeverdream.block.NexusshellholePortalBlock;
import net.mcreator.literalfeverdream.block.NexusBlockBlock;
import net.mcreator.literalfeverdream.block.FusionDimensionPortalBlock;
import net.mcreator.literalfeverdream.block.FusionBlockBlock;
import net.mcreator.literalfeverdream.block.FurrytrainBlock;
import net.mcreator.literalfeverdream.block.CosmoPortalBlock;
import net.mcreator.literalfeverdream.block.ConeehashellplacePortalBlock;
import net.mcreator.literalfeverdream.block.Coneeha1092Block;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<Block> COSMO_PORTAL = REGISTRY.register("cosmo_portal", () -> new CosmoPortalBlock());
	public static final RegistryObject<Block> TRAIN_BLOCK = REGISTRY.register("train_block", () -> new TrainBlockBlock());
	public static final RegistryObject<Block> CONEEHA_1092 = REGISTRY.register("coneeha_1092", () -> new Coneeha1092Block());
	public static final RegistryObject<Block> CONEEHASHELLPLACE_PORTAL = REGISTRY.register("coneehashellplace_portal", () -> new ConeehashellplacePortalBlock());
	public static final RegistryObject<Block> NICE = REGISTRY.register("nice", () -> new NiceBlock());
	public static final RegistryObject<Block> NICE_DIENS_PORTAL = REGISTRY.register("nice_diens_portal", () -> new NiceDiensPortalBlock());
	public static final RegistryObject<Block> NEXUS_BLOCK = REGISTRY.register("nexus_block", () -> new NexusBlockBlock());
	public static final RegistryObject<Block> NEXUSSHELLHOLE_PORTAL = REGISTRY.register("nexusshellhole_portal", () -> new NexusshellholePortalBlock());
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
	public static final RegistryObject<Block> FURRYTRAIN = REGISTRY.register("furrytrain", () -> new FurrytrainBlock());
	public static final RegistryObject<Block> FUSION_BLOCK = REGISTRY.register("fusion_block", () -> new FusionBlockBlock());
	public static final RegistryObject<Block> FUSION_DIMENSION_PORTAL = REGISTRY.register("fusion_dimension_portal", () -> new FusionDimensionPortalBlock());
}
