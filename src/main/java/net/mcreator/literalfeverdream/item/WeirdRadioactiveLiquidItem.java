
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;
import net.mcreator.literalfeverdream.init.LiteralFeverDreamModFluids;

public class WeirdRadioactiveLiquidItem extends BucketItem {
	public WeirdRadioactiveLiquidItem() {
		super(LiteralFeverDreamModFluids.WEIRD_RADIOACTIVE_LIQUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
	}
}
