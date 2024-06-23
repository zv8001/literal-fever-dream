
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.literalfeverdream.item.Uranium235Item;
import net.mcreator.literalfeverdream.item.ThermonuclearmissileItem;
import net.mcreator.literalfeverdream.item.ThermonuclearbombItem;
import net.mcreator.literalfeverdream.item.RickrollingotItem;
import net.mcreator.literalfeverdream.item.RickrollItem;
import net.mcreator.literalfeverdream.item.RickrollArrmorItem;
import net.mcreator.literalfeverdream.item.RainbowcoreItem;
import net.mcreator.literalfeverdream.item.NiceDiensItem;
import net.mcreator.literalfeverdream.item.NexusshellholeItem;
import net.mcreator.literalfeverdream.item.NexusingotItem;
import net.mcreator.literalfeverdream.item.NexusSwordItem;
import net.mcreator.literalfeverdream.item.NexusPicItem;
import net.mcreator.literalfeverdream.item.NexusHoetoolItem;
import net.mcreator.literalfeverdream.item.NexusAxeItem;
import net.mcreator.literalfeverdream.item.KnifeItem;
import net.mcreator.literalfeverdream.item.IrradiatedpieceofshitItem;
import net.mcreator.literalfeverdream.item.HahaAsyncGoBRRRRRRRRRRRRRRRRRRRRRRRItem;
import net.mcreator.literalfeverdream.item.GraphiteBlockItem;
import net.mcreator.literalfeverdream.item.GoogleblockItem;
import net.mcreator.literalfeverdream.item.FusionDimensionItem;
import net.mcreator.literalfeverdream.item.FakeDiamondItem;
import net.mcreator.literalfeverdream.item.FakeDiamondArrmorItem;
import net.mcreator.literalfeverdream.item.EggItem;
import net.mcreator.literalfeverdream.item.CurseddiamondpickaxeItem;
import net.mcreator.literalfeverdream.item.CosmoItem;
import net.mcreator.literalfeverdream.item.CosmoArmmorItem;
import net.mcreator.literalfeverdream.item.ConeehashellplaceItem;
import net.mcreator.literalfeverdream.item.ConeehaArrmorItem;
import net.mcreator.literalfeverdream.item.ArromerNexusItem;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<Item> COSMO = REGISTRY.register("cosmo", () -> new CosmoItem());
	public static final RegistryObject<Item> TRAIN_BLOCK = block(LiteralFeverDreamModBlocks.TRAIN_BLOCK, LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM);
	public static final RegistryObject<Item> CONEEHA_1092 = block(LiteralFeverDreamModBlocks.CONEEHA_1092, LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM);
	public static final RegistryObject<Item> CONEEHASHELLPLACE = REGISTRY.register("coneehashellplace", () -> new ConeehashellplaceItem());
	public static final RegistryObject<Item> COSMO_ARMMOR_HELMET = REGISTRY.register("cosmo_armmor_helmet", () -> new CosmoArmmorItem.Helmet());
	public static final RegistryObject<Item> COSMO_ARMMOR_CHESTPLATE = REGISTRY.register("cosmo_armmor_chestplate", () -> new CosmoArmmorItem.Chestplate());
	public static final RegistryObject<Item> COSMO_ARMMOR_LEGGINGS = REGISTRY.register("cosmo_armmor_leggings", () -> new CosmoArmmorItem.Leggings());
	public static final RegistryObject<Item> COSMO_ARMMOR_BOOTS = REGISTRY.register("cosmo_armmor_boots", () -> new CosmoArmmorItem.Boots());
	public static final RegistryObject<Item> CONEEHA_ARRMOR_HELMET = REGISTRY.register("coneeha_arrmor_helmet", () -> new ConeehaArrmorItem.Helmet());
	public static final RegistryObject<Item> CONEEHA_ARRMOR_CHESTPLATE = REGISTRY.register("coneeha_arrmor_chestplate", () -> new ConeehaArrmorItem.Chestplate());
	public static final RegistryObject<Item> CONEEHA_ARRMOR_LEGGINGS = REGISTRY.register("coneeha_arrmor_leggings", () -> new ConeehaArrmorItem.Leggings());
	public static final RegistryObject<Item> CONEEHA_ARRMOR_BOOTS = REGISTRY.register("coneeha_arrmor_boots", () -> new ConeehaArrmorItem.Boots());
	public static final RegistryObject<Item> THERMONUCLEARBOMB = REGISTRY.register("thermonuclearbomb", () -> new ThermonuclearbombItem());
	public static final RegistryObject<Item> URANIUM_235 = REGISTRY.register("uranium_235", () -> new Uranium235Item());
	public static final RegistryObject<Item> IRRADIATEDPIECEOFSHIT = REGISTRY.register("irradiatedpieceofshit", () -> new IrradiatedpieceofshitItem());
	public static final RegistryObject<Item> CURSEDDIAMONDPICKAXE = REGISTRY.register("curseddiamondpickaxe", () -> new CurseddiamondpickaxeItem());
	public static final RegistryObject<Item> THERMONUCLEARMISSILE = REGISTRY.register("thermonuclearmissile", () -> new ThermonuclearmissileItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> NICE = block(LiteralFeverDreamModBlocks.NICE, LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM);
	public static final RegistryObject<Item> GOOGLEBLOCK = REGISTRY.register("googleblock", () -> new GoogleblockItem());
	public static final RegistryObject<Item> NICE_DIENS = REGISTRY.register("nice_diens", () -> new NiceDiensItem());
	public static final RegistryObject<Item> NEXUS_BLOCK = block(LiteralFeverDreamModBlocks.NEXUS_BLOCK, LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM);
	public static final RegistryObject<Item> NEXUSSHELLHOLE = REGISTRY.register("nexusshellhole", () -> new NexusshellholeItem());
	public static final RegistryObject<Item> ARROMER_NEXUS_HELMET = REGISTRY.register("arromer_nexus_helmet", () -> new ArromerNexusItem.Helmet());
	public static final RegistryObject<Item> ARROMER_NEXUS_CHESTPLATE = REGISTRY.register("arromer_nexus_chestplate", () -> new ArromerNexusItem.Chestplate());
	public static final RegistryObject<Item> ARROMER_NEXUS_LEGGINGS = REGISTRY.register("arromer_nexus_leggings", () -> new ArromerNexusItem.Leggings());
	public static final RegistryObject<Item> ARROMER_NEXUS_BOOTS = REGISTRY.register("arromer_nexus_boots", () -> new ArromerNexusItem.Boots());
	public static final RegistryObject<Item> NEXUSINGOT = REGISTRY.register("nexusingot", () -> new NexusingotItem());
	public static final RegistryObject<Item> NEXUS_SWORD = REGISTRY.register("nexus_sword", () -> new NexusSwordItem());
	public static final RegistryObject<Item> NEXUS_PIC = REGISTRY.register("nexus_pic", () -> new NexusPicItem());
	public static final RegistryObject<Item> NEXUS_AXE = REGISTRY.register("nexus_axe", () -> new NexusAxeItem());
	public static final RegistryObject<Item> NEXUS_HOETOOL = REGISTRY.register("nexus_hoetool", () -> new NexusHoetoolItem());
	public static final RegistryObject<Item> GRAPHITE_BLOCK = REGISTRY.register("graphite_block", () -> new GraphiteBlockItem());
	public static final RegistryObject<Item> URANIUM_BLOCK = block(LiteralFeverDreamModBlocks.URANIUM_BLOCK, LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM);
	public static final RegistryObject<Item> FURRYTRAIN = block(LiteralFeverDreamModBlocks.FURRYTRAIN, LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM);
	public static final RegistryObject<Item> RAINBOWCORE = REGISTRY.register("rainbowcore", () -> new RainbowcoreItem());
	public static final RegistryObject<Item> FAKE_DIAMOND = REGISTRY.register("fake_diamond", () -> new FakeDiamondItem());
	public static final RegistryObject<Item> FUSION_BLOCK = block(LiteralFeverDreamModBlocks.FUSION_BLOCK, LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM);
	public static final RegistryObject<Item> FAKE_DIAMOND_ARRMOR_HELMET = REGISTRY.register("fake_diamond_arrmor_helmet", () -> new FakeDiamondArrmorItem.Helmet());
	public static final RegistryObject<Item> FAKE_DIAMOND_ARRMOR_CHESTPLATE = REGISTRY.register("fake_diamond_arrmor_chestplate", () -> new FakeDiamondArrmorItem.Chestplate());
	public static final RegistryObject<Item> FAKE_DIAMOND_ARRMOR_LEGGINGS = REGISTRY.register("fake_diamond_arrmor_leggings", () -> new FakeDiamondArrmorItem.Leggings());
	public static final RegistryObject<Item> FAKE_DIAMOND_ARRMOR_BOOTS = REGISTRY.register("fake_diamond_arrmor_boots", () -> new FakeDiamondArrmorItem.Boots());
	public static final RegistryObject<Item> FUSION_DIMENSION = REGISTRY.register("fusion_dimension", () -> new FusionDimensionItem());
	public static final RegistryObject<Item> RICKROLL = REGISTRY.register("rickroll", () -> new RickrollItem());
	public static final RegistryObject<Item> RICKROLL_ORE = block(LiteralFeverDreamModBlocks.RICKROLL_ORE, LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM);
	public static final RegistryObject<Item> RICKROLL_ARRMOR_HELMET = REGISTRY.register("rickroll_arrmor_helmet", () -> new RickrollArrmorItem.Helmet());
	public static final RegistryObject<Item> RICKROLL_ARRMOR_CHESTPLATE = REGISTRY.register("rickroll_arrmor_chestplate", () -> new RickrollArrmorItem.Chestplate());
	public static final RegistryObject<Item> RICKROLL_ARRMOR_LEGGINGS = REGISTRY.register("rickroll_arrmor_leggings", () -> new RickrollArrmorItem.Leggings());
	public static final RegistryObject<Item> RICKROLL_ARRMOR_BOOTS = REGISTRY.register("rickroll_arrmor_boots", () -> new RickrollArrmorItem.Boots());
	public static final RegistryObject<Item> HAHA_ASYNC_GO_BRRRRRRRRRRRRRRRRRRRRRRR = REGISTRY.register("haha_async_go_brrrrrrrrrrrrrrrrrrrrrrr", () -> new HahaAsyncGoBRRRRRRRRRRRRRRRRRRRRRRRItem());
	public static final RegistryObject<Item> EGG = REGISTRY.register("egg", () -> new EggItem());
	public static final RegistryObject<Item> RICKROLLINGOT = REGISTRY.register("rickrollingot", () -> new RickrollingotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
