
package net.mcreator.literalfeverdream.item;

import net.minecraft.network.chat.Component;

public class RickrollItem extends RecordItem {

	public RickrollItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("literal_fever_dream:rickroll")), new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).stacksTo(1).rarity(Rarity.RARE), 100);
	}

}
