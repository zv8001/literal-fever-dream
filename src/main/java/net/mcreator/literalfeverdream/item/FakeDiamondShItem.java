
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class FakeDiamondShItem extends PickaxeItem {
	public FakeDiamondShItem() {
		super(new Tier() {
			public int getUses() {
				return 30;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 1, -3f, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
	}
}
