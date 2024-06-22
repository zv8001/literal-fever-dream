
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.literalfeverdream.procedures.Uranium235ItemInHandTickProcedure;
import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;

public class Uranium235Item extends Item {
	public Uranium235Item() {
		super(new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			Uranium235ItemInHandTickProcedure.execute(entity);
	}
}
