
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class LiteralFeverDreamModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LiteralFeverDreamMod.MODID);
	public static final RegistryObject<CreativeModeTab> LITERALFEVERDREAM = REGISTRY.register("literalfeverdream",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.literal_fever_dream.literalfeverdream")).icon(() -> new ItemStack(Blocks.TNT)).displayItems((parameters, tabData) -> {
				tabData.accept(LiteralFeverDreamModBlocks.TRAIN_BLOCK.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.COSMO.get());
				tabData.accept(LiteralFeverDreamModBlocks.CONEEHA_1092.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.CONEEHASHELLPLACE.get());
				tabData.accept(LiteralFeverDreamModItems.COSMO_ARMMOR_HELMET.get());
				tabData.accept(LiteralFeverDreamModItems.COSMO_ARMMOR_CHESTPLATE.get());
				tabData.accept(LiteralFeverDreamModItems.COSMO_ARMMOR_LEGGINGS.get());
				tabData.accept(LiteralFeverDreamModItems.COSMO_ARMMOR_BOOTS.get());
				tabData.accept(LiteralFeverDreamModItems.CONEEHA_ARRMOR_HELMET.get());
				tabData.accept(LiteralFeverDreamModItems.CONEEHA_ARRMOR_CHESTPLATE.get());
				tabData.accept(LiteralFeverDreamModItems.CONEEHA_ARRMOR_LEGGINGS.get());
				tabData.accept(LiteralFeverDreamModItems.CONEEHA_ARRMOR_BOOTS.get());
				tabData.accept(LiteralFeverDreamModItems.THERMONUCLEARBOMB.get());
				tabData.accept(LiteralFeverDreamModItems.URANIUM_235.get());
				tabData.accept(LiteralFeverDreamModItems.IRRADIATEDPIECEOFSHIT.get());
				tabData.accept(LiteralFeverDreamModItems.CURSEDDIAMONDPICKAXE.get());
				tabData.accept(LiteralFeverDreamModItems.THERMONUCLEARMISSILE.get());
				tabData.accept(LiteralFeverDreamModItems.KNIFE.get());
				tabData.accept(LiteralFeverDreamModBlocks.NICE.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.GOOGLEBLOCK.get());
				tabData.accept(LiteralFeverDreamModItems.NICE_DIENS.get());
				tabData.accept(LiteralFeverDreamModBlocks.NEXUS_BLOCK.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.NEXUSSHELLHOLE.get());
				tabData.accept(LiteralFeverDreamModItems.ARROMER_NEXUS_HELMET.get());
				tabData.accept(LiteralFeverDreamModItems.ARROMER_NEXUS_CHESTPLATE.get());
				tabData.accept(LiteralFeverDreamModItems.ARROMER_NEXUS_LEGGINGS.get());
				tabData.accept(LiteralFeverDreamModItems.ARROMER_NEXUS_BOOTS.get());
				tabData.accept(LiteralFeverDreamModItems.NEXUSINGOT.get());
				tabData.accept(LiteralFeverDreamModItems.NEXUS_SWORD.get());
				tabData.accept(LiteralFeverDreamModItems.NEXUS_PIC.get());
				tabData.accept(LiteralFeverDreamModItems.NEXUS_AXE.get());
				tabData.accept(LiteralFeverDreamModItems.NEXUS_HOETOOL.get());
				tabData.accept(LiteralFeverDreamModItems.GRAPHITE_BLOCK.get());
				tabData.accept(LiteralFeverDreamModBlocks.URANIUM_BLOCK.get().asItem());
				tabData.accept(LiteralFeverDreamModBlocks.FURRYTRAIN.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.RAINBOWCORE.get());
				tabData.accept(LiteralFeverDreamModItems.FUSION_DIMENSION.get());
				tabData.accept(LiteralFeverDreamModBlocks.FUSION_BLOCK.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND.get());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND_ARRMOR_HELMET.get());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND_ARRMOR_CHESTPLATE.get());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND_ARRMOR_LEGGINGS.get());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND_ARRMOR_BOOTS.get());
				tabData.accept(LiteralFeverDreamModItems.RICKROLLINGOT.get());
				tabData.accept(LiteralFeverDreamModItems.RICKROLL_ARRMOR_HELMET.get());
				tabData.accept(LiteralFeverDreamModItems.RICKROLL_ARRMOR_CHESTPLATE.get());
				tabData.accept(LiteralFeverDreamModItems.RICKROLL_ARRMOR_LEGGINGS.get());
				tabData.accept(LiteralFeverDreamModItems.RICKROLL_ARRMOR_BOOTS.get());
				tabData.accept(LiteralFeverDreamModBlocks.RICKROLL_ORE.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.EGG.get());
				tabData.accept(LiteralFeverDreamModBlocks.RADIATION_PLANT.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.CONTROL_ROD.get());
				tabData.accept(LiteralFeverDreamModItems.MANY_RBM_KRODS.get());
				tabData.accept(LiteralFeverDreamModItems.RBMK.get());
				tabData.accept(LiteralFeverDreamModItems.PI.get());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND_PIC.get());
				tabData.accept(LiteralFeverDreamModBlocks.FAKE_DIMOND_BLOCK.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND_AXE.get());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND_HOE.get());
				tabData.accept(LiteralFeverDreamModItems.FAKE_DIAMOND_SH.get());
				tabData.accept(LiteralFeverDreamModItems.DESTROYED_RBMK.get());
				tabData.accept(LiteralFeverDreamModItems.URANIUM_ON_A_STICK.get());
				tabData.accept(LiteralFeverDreamModItems.TEST.get());
				tabData.accept(LiteralFeverDreamModItems.WEIRD_RADIOACTIVE_LIQUID_BUCKET.get());
				tabData.accept(LiteralFeverDreamModBlocks.WEIRD_RUG.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.AIR_REMOVER.get());
				tabData.accept(LiteralFeverDreamModBlocks.WALLS.get().asItem());
				tabData.accept(LiteralFeverDreamModItems.RICKROLL.get());
				tabData.accept(LiteralFeverDreamModItems.HAHA_ASYNC_GO_BRRRRRRRRRRRRRRRRRRRRRRR.get());
			}).build());
}
