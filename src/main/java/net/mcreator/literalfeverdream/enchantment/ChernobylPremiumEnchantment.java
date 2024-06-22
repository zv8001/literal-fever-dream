
package net.mcreator.literalfeverdream.enchantment;

public class ChernobylPremiumEnchantment extends Enchantment {

	public ChernobylPremiumEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return List.of(Enchantments.SHARPNESS).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(LiteralFeverDreamModItems.GRAPHITE_BLOCK.get()).contains(item);
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
