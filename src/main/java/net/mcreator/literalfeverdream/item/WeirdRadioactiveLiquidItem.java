package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModFluids;

public class WeirdRadioactiveLiquidItem extends BucketItem {
	public WeirdRadioactiveLiquidItem(Item.Properties properties) {
		super(LiteralFeverDreamModFluids.WEIRD_RADIOACTIVE_LIQUID.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}