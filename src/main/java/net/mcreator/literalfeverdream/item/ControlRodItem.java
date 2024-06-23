
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ControlRodItem extends Item {

	public ControlRodItem() {
		super(new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("why again?"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			TooHeavyProcedure.execute(entity);
	}

}
