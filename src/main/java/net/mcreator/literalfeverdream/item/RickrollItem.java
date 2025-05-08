
package net.mcreator.literalfeverdream.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class RickrollItem extends RecordItem {
	public RickrollItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("literal_fever_dream:rickroll")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
