
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;

public class TemuDiamondShItem extends ShovelItem {
	public TemuDiamondShItem() {
		super(new Tier() {
			public int getUses() {
				return 30;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
	}
}
