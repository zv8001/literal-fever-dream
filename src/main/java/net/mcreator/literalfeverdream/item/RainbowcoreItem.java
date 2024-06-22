
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.literalfeverdream.procedures.FIREEEEProcedure;
import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;

import java.util.List;

public class RainbowcoreItem extends Item {
	public RainbowcoreItem() {
		super(new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).stacksTo(64).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(255f)

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 64;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("dont eat this. (takes a long time to eat)"));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		FIREEEEProcedure.execute(entity);
		return retval;
	}
}
