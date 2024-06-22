
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;
import net.mcreator.literalfeverdream.init.LiteralFeverDreamModItems;

import java.util.List;

public class ModGraphiteBlockItem extends SwordItem {
	public ModGraphiteBlockItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 5998f;
			}

			public int getLevel() {
				return 50;
			}

			public int getEnchantmentValue() {
				return 500;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LiteralFeverDreamModItems.URANIUM_235.get()));
			}
		}, 3, -3.95f, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Moderator Only version of the Graphite Block"));
	}
}
