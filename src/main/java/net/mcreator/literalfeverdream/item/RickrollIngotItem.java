
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;

public class RickrollIngotItem extends Item {
	public RickrollIngotItem() {
		super(new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
