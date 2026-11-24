package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;

public abstract class RickrollArrmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(25, Map.of(ArmorType.BOOTS, 6, ArmorType.LEGGINGS, 6, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 6, ArmorType.BODY, 6), 20,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 2f, 0.1f, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:rickroll_arrmor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("literal_fever_dream:rickroll_arrmor")));

	private RickrollArrmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends RickrollArrmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends RickrollArrmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends RickrollArrmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends RickrollArrmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}