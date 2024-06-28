
package net.mcreator.literalfeverdream.item;

import net.minecraft.network.chat.Component;

public class WeirdRadioactiveLiquidItem extends BucketItem {

	public WeirdRadioactiveLiquidItem() {
		super(LiteralFeverDreamModFluids.WEIRD_RADIOACTIVE_LIQUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
	}

}
