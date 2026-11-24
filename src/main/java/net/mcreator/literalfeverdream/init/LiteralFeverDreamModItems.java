/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.neoforged.neoforge.transfer.fluid.BucketResourceHandler;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.literalfeverdream.item.*;
import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

import java.util.function.Function;

@EventBusSubscriber
public class LiteralFeverDreamModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LiteralFeverDreamMod.MODID);
	public static final DeferredItem<Item> TRAIN_BLOCK;
	public static final DeferredItem<Item> COSMO;
	public static final DeferredItem<Item> CONEEHA_1092;
	public static final DeferredItem<Item> CONEEHASHELLPLACE;
	public static final DeferredItem<Item> COSMO_ARMMOR_HELMET;
	public static final DeferredItem<Item> COSMO_ARMMOR_CHESTPLATE;
	public static final DeferredItem<Item> COSMO_ARMMOR_LEGGINGS;
	public static final DeferredItem<Item> COSMO_ARMMOR_BOOTS;
	public static final DeferredItem<Item> CONEEHA_ARRMOR_HELMET;
	public static final DeferredItem<Item> CONEEHA_ARRMOR_CHESTPLATE;
	public static final DeferredItem<Item> CONEEHA_ARRMOR_LEGGINGS;
	public static final DeferredItem<Item> CONEEHA_ARRMOR_BOOTS;
	public static final DeferredItem<Item> THERMONUCLEARBOMB;
	public static final DeferredItem<Item> URANIUM_235;
	public static final DeferredItem<Item> IRRADIATEDPIECEOFSHIT;
	public static final DeferredItem<Item> CURSEDDIAMONDPICKAXE;
	public static final DeferredItem<Item> THERMONUCLEARMISSILE;
	public static final DeferredItem<Item> KNIFE;
	public static final DeferredItem<Item> NICE;
	public static final DeferredItem<Item> GOOGLEBLOCK;
	public static final DeferredItem<Item> NICE_DIENS;
	public static final DeferredItem<Item> NEXUS_BLOCK;
	public static final DeferredItem<Item> NEXUSSHELLHOLE;
	public static final DeferredItem<Item> ARROMER_NEXUS_HELMET;
	public static final DeferredItem<Item> ARROMER_NEXUS_CHESTPLATE;
	public static final DeferredItem<Item> ARROMER_NEXUS_LEGGINGS;
	public static final DeferredItem<Item> ARROMER_NEXUS_BOOTS;
	public static final DeferredItem<Item> NEXUSINGOT;
	public static final DeferredItem<Item> NEXUS_SWORD;
	public static final DeferredItem<Item> NEXUS_PIC;
	public static final DeferredItem<Item> NEXUS_AXE;
	public static final DeferredItem<Item> NEXUS_HOETOOL;
	public static final DeferredItem<Item> GRAPHITE_BLOCK;
	public static final DeferredItem<Item> URANIUM_BLOCK;
	public static final DeferredItem<Item> FURRYTRAIN;
	public static final DeferredItem<Item> RAINBOWCORE;
	public static final DeferredItem<Item> FUSION_DIMENSION;
	public static final DeferredItem<Item> FUSION_BLOCK;
	public static final DeferredItem<Item> FAKE_DIAMOND;
	public static final DeferredItem<Item> FAKE_DIAMOND_ARRMOR_HELMET;
	public static final DeferredItem<Item> FAKE_DIAMOND_ARRMOR_CHESTPLATE;
	public static final DeferredItem<Item> FAKE_DIAMOND_ARRMOR_LEGGINGS;
	public static final DeferredItem<Item> FAKE_DIAMOND_ARRMOR_BOOTS;
	public static final DeferredItem<Item> RICKROLLINGOT;
	public static final DeferredItem<Item> RICKROLL_ARRMOR_HELMET;
	public static final DeferredItem<Item> RICKROLL_ARRMOR_CHESTPLATE;
	public static final DeferredItem<Item> RICKROLL_ARRMOR_LEGGINGS;
	public static final DeferredItem<Item> RICKROLL_ARRMOR_BOOTS;
	public static final DeferredItem<Item> RICKROLL_ORE;
	public static final DeferredItem<Item> EGG;
	public static final DeferredItem<Item> RADIATION_PLANT;
	public static final DeferredItem<Item> CONTROL_ROD;
	public static final DeferredItem<Item> MANY_RBM_KRODS;
	public static final DeferredItem<Item> RBMK;
	public static final DeferredItem<Item> PI;
	public static final DeferredItem<Item> FAKE_DIAMOND_PIC;
	public static final DeferredItem<Item> FAKE_DIMOND_BLOCK;
	public static final DeferredItem<Item> FAKE_DIAMOND_AXE;
	public static final DeferredItem<Item> FAKE_DIAMOND_HOE;
	public static final DeferredItem<Item> FAKE_DIAMOND_SH;
	public static final DeferredItem<Item> DESTROYED_RBMK;
	public static final DeferredItem<Item> URANIUM_ON_A_STICK;
	public static final DeferredItem<Item> TEST;
	public static final DeferredItem<Item> WEIRD_RADIOACTIVE_LIQUID_BUCKET;
	public static final DeferredItem<Item> WEIRD_RUG;
	public static final DeferredItem<Item> AIR_REMOVER;
	public static final DeferredItem<Item> WALLS;
	public static final DeferredItem<Item> RICKROLL;
	public static final DeferredItem<Item> HAHA_ASYNC_GO_BRRRRRRRRRRRRRRRRRRRRRRR;
	static {
		TRAIN_BLOCK = block(LiteralFeverDreamModBlocks.TRAIN_BLOCK);
		COSMO = register("cosmo", CosmoItem::new);
		CONEEHA_1092 = block(LiteralFeverDreamModBlocks.CONEEHA_1092);
		CONEEHASHELLPLACE = register("coneehashellplace", ConeehashellplaceItem::new);
		COSMO_ARMMOR_HELMET = register("cosmo_armmor_helmet", CosmoArmmorItem.Helmet::new);
		COSMO_ARMMOR_CHESTPLATE = register("cosmo_armmor_chestplate", CosmoArmmorItem.Chestplate::new);
		COSMO_ARMMOR_LEGGINGS = register("cosmo_armmor_leggings", CosmoArmmorItem.Leggings::new);
		COSMO_ARMMOR_BOOTS = register("cosmo_armmor_boots", CosmoArmmorItem.Boots::new);
		CONEEHA_ARRMOR_HELMET = register("coneeha_arrmor_helmet", ConeehaArrmorItem.Helmet::new);
		CONEEHA_ARRMOR_CHESTPLATE = register("coneeha_arrmor_chestplate", ConeehaArrmorItem.Chestplate::new);
		CONEEHA_ARRMOR_LEGGINGS = register("coneeha_arrmor_leggings", ConeehaArrmorItem.Leggings::new);
		CONEEHA_ARRMOR_BOOTS = register("coneeha_arrmor_boots", ConeehaArrmorItem.Boots::new);
		THERMONUCLEARBOMB = register("thermonuclearbomb", ThermonuclearbombItem::new);
		URANIUM_235 = register("uranium_235", Uranium235Item::new);
		IRRADIATEDPIECEOFSHIT = register("irradiatedpieceofshit", IrradiatedpieceofshitItem::new);
		CURSEDDIAMONDPICKAXE = register("curseddiamondpickaxe", CurseddiamondpickaxeItem::new);
		THERMONUCLEARMISSILE = register("thermonuclearmissile", ThermonuclearmissileItem::new);
		KNIFE = register("knife", KnifeItem::new);
		NICE = block(LiteralFeverDreamModBlocks.NICE);
		GOOGLEBLOCK = register("googleblock", GoogleblockItem::new);
		NICE_DIENS = register("nice_diens", NiceDiensItem::new);
		NEXUS_BLOCK = block(LiteralFeverDreamModBlocks.NEXUS_BLOCK);
		NEXUSSHELLHOLE = register("nexusshellhole", NexusshellholeItem::new);
		ARROMER_NEXUS_HELMET = register("arromer_nexus_helmet", ArromerNexusItem.Helmet::new);
		ARROMER_NEXUS_CHESTPLATE = register("arromer_nexus_chestplate", ArromerNexusItem.Chestplate::new);
		ARROMER_NEXUS_LEGGINGS = register("arromer_nexus_leggings", ArromerNexusItem.Leggings::new);
		ARROMER_NEXUS_BOOTS = register("arromer_nexus_boots", ArromerNexusItem.Boots::new);
		NEXUSINGOT = register("nexusingot", NexusingotItem::new);
		NEXUS_SWORD = register("nexus_sword", NexusSwordItem::new);
		NEXUS_PIC = register("nexus_pic", NexusPicItem::new);
		NEXUS_AXE = register("nexus_axe", NexusAxeItem::new);
		NEXUS_HOETOOL = register("nexus_hoetool", NexusHoetoolItem::new);
		GRAPHITE_BLOCK = register("graphite_block", GraphiteBlockItem::new);
		URANIUM_BLOCK = block(LiteralFeverDreamModBlocks.URANIUM_BLOCK);
		FURRYTRAIN = block(LiteralFeverDreamModBlocks.FURRYTRAIN);
		RAINBOWCORE = register("rainbowcore", RainbowcoreItem::new);
		FUSION_DIMENSION = register("fusion_dimension", FusionDimensionItem::new);
		FUSION_BLOCK = block(LiteralFeverDreamModBlocks.FUSION_BLOCK);
		FAKE_DIAMOND = register("fake_diamond", FakeDiamondItem::new);
		FAKE_DIAMOND_ARRMOR_HELMET = register("fake_diamond_arrmor_helmet", FakeDiamondArrmorItem.Helmet::new);
		FAKE_DIAMOND_ARRMOR_CHESTPLATE = register("fake_diamond_arrmor_chestplate", FakeDiamondArrmorItem.Chestplate::new);
		FAKE_DIAMOND_ARRMOR_LEGGINGS = register("fake_diamond_arrmor_leggings", FakeDiamondArrmorItem.Leggings::new);
		FAKE_DIAMOND_ARRMOR_BOOTS = register("fake_diamond_arrmor_boots", FakeDiamondArrmorItem.Boots::new);
		RICKROLLINGOT = register("rickrollingot", RickrollingotItem::new);
		RICKROLL_ARRMOR_HELMET = register("rickroll_arrmor_helmet", RickrollArrmorItem.Helmet::new);
		RICKROLL_ARRMOR_CHESTPLATE = register("rickroll_arrmor_chestplate", RickrollArrmorItem.Chestplate::new);
		RICKROLL_ARRMOR_LEGGINGS = register("rickroll_arrmor_leggings", RickrollArrmorItem.Leggings::new);
		RICKROLL_ARRMOR_BOOTS = register("rickroll_arrmor_boots", RickrollArrmorItem.Boots::new);
		RICKROLL_ORE = block(LiteralFeverDreamModBlocks.RICKROLL_ORE);
		EGG = register("egg", EggItem::new);
		RADIATION_PLANT = block(LiteralFeverDreamModBlocks.RADIATION_PLANT);
		CONTROL_ROD = register("control_rod", ControlRodItem::new);
		MANY_RBM_KRODS = register("many_rbm_krods", ManyRBMKrodsItem::new);
		RBMK = register("rbmk", RBMKItem::new);
		PI = register("pi", PiItem::new);
		FAKE_DIAMOND_PIC = register("fake_diamond_pic", FakeDiamondPicItem::new);
		FAKE_DIMOND_BLOCK = block(LiteralFeverDreamModBlocks.FAKE_DIMOND_BLOCK);
		FAKE_DIAMOND_AXE = register("fake_diamond_axe", FakeDiamondAxeItem::new);
		FAKE_DIAMOND_HOE = register("fake_diamond_hoe", FakeDiamondHoeItem::new);
		FAKE_DIAMOND_SH = register("fake_diamond_sh", FakeDiamondShItem::new);
		DESTROYED_RBMK = register("destroyed_rbmk", DestroyedRBMKItem::new);
		URANIUM_ON_A_STICK = register("uranium_on_a_stick", UraniumOnAStickItem::new);
		TEST = register("test", TestItem::new);
		WEIRD_RADIOACTIVE_LIQUID_BUCKET = register("weird_radioactive_liquid_bucket", WeirdRadioactiveLiquidItem::new);
		WEIRD_RUG = block(LiteralFeverDreamModBlocks.WEIRD_RUG);
		AIR_REMOVER = register("air_remover", AirRemoverItem::new);
		WALLS = block(LiteralFeverDreamModBlocks.WALLS);
		RICKROLL = register("rickroll", RickrollItem::new);
		HAHA_ASYNC_GO_BRRRRRRRRRRRRRRRRRRRRRRR = register("haha_async_go_brrrrrrrrrrrrrrrrrrrrrrr", HahaAsyncGoBRRRRRRRRRRRRRRRRRRRRRRRItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.Fluid.ITEM, (stack, access) -> new BucketResourceHandler(access), WEIRD_RADIOACTIVE_LIQUID_BUCKET.get());
	}
}