
package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.literalfeverdream.procedures.UraniumOnAStickLivingEntityIsHitWithToolProcedure;
import net.mcreator.literalfeverdream.init.LiteralFeverDreamModItems;

public class UraniumOnAStickItem extends SwordItem {
	public UraniumOnAStickItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LiteralFeverDreamModItems.URANIUM_235.get()));
			}
		}, 3, -4f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		UraniumOnAStickLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
