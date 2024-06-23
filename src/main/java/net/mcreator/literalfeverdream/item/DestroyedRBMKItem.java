
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.literalfeverdream.procedures.RbmkProcedureProcedure;
import net.mcreator.literalfeverdream.procedures.BrokenRBMKProdecureProcedure;
import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;

import java.util.List;

public class DestroyedRBMKItem extends SwordItem {
	public DestroyedRBMKItem() {
		super(new Tier() {
			public int getUses() {
				return 31000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 14998f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3.64f, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("why is it frozen"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			BrokenRBMKProdecureProcedure.execute(entity);
		RbmkProcedureProcedure.execute(entity);
	}
}
