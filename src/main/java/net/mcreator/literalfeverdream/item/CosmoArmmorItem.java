
package net.mcreator.literalfeverdream.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.literalfeverdream.init.LiteralFeverDreamModTabs;

public abstract class CosmoArmmorItem extends ArmorItem {
	public CosmoArmmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 70;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
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
				return "cosmo_armmor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CosmoArmmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "literal_fever_dream:textures/models/armor/cosmo_layer_1.png";
		}
	}

	public static class Chestplate extends CosmoArmmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "literal_fever_dream:textures/models/armor/cosmo_layer_1.png";
		}
	}

	public static class Leggings extends CosmoArmmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "literal_fever_dream:textures/models/armor/cosmo_layer_2.png";
		}
	}

	public static class Boots extends CosmoArmmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(LiteralFeverDreamModTabs.TAB_LITERALFEVERDREAM));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "literal_fever_dream:textures/models/armor/cosmo_layer_1.png";
		}
	}
}
