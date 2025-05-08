
package net.mcreator.literalfeverdream.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class HahaAsyncGoBRRRRRRRRRRRRRRRRRRRRRRRItem extends RecordItem {
	public HahaAsyncGoBRRRRRRRRRRRRRRRRRRRRRRRItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("literal_fever_dream:async-third_test")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
