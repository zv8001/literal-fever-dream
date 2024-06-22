
package net.mcreator.literalfeverdream.item;

import net.minecraft.sounds.SoundEvent;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class RickrollArrmorItem extends ArmorItem {

	public RickrollArrmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 6, 6, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "rickroll_arrmor";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RickrollArrmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "literal_fever_dream:textures/models/armor/rickrollarmor_layer_1.png";
		}

	}

	public static class Chestplate extends RickrollArrmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "literal_fever_dream:textures/models/armor/rickrollarmor_layer_1.png";
		}

	}

	public static class Leggings extends RickrollArrmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "literal_fever_dream:textures/models/armor/rickrollarmor_layer_2.png";
		}

	}

	public static class Boots extends RickrollArrmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "literal_fever_dream:textures/models/armor/rickrollarmor_layer_1.png";
		}

	}

}
