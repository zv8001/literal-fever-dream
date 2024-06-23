
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PiItem extends SwordItem {
	public PiItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 29.419f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.PUMPKIN_PIE));
			}
		}, 3, -0.86f, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("pi"));
	}
}
