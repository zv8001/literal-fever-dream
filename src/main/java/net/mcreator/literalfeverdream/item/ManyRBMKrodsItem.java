
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.literalfeverdream.procedures.PureSlownessProcedure;
import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;

import java.util.List;

public class ManyRBMKrodsItem extends Item {
	public ManyRBMKrodsItem() {
		super(new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("thats a lot"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			PureSlownessProcedure.execute(entity);
	}
}
