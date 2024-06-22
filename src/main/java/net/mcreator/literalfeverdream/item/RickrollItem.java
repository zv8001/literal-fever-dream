
package net.mcreator.literalfeverdream.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;

public class RickrollItem extends RecordItem {
	public RickrollItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("literal_fever_dream:rickroll")), new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
