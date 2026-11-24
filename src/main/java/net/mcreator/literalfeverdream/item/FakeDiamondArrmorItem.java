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

public abstract class FakeDiamondArrmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(25, Map.of(ArmorType.BOOTS, 1, ArmorType.LEGGINGS, 2, ArmorType.CHESTPLATE, 4, ArmorType.HELMET, 1, ArmorType.BODY, 4), 9,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 0.2f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:fake_diamond_arrmor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("literal_fever_dream:fake_diamond_arrmor")));

	private FakeDiamondArrmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends FakeDiamondArrmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends FakeDiamondArrmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends FakeDiamondArrmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends FakeDiamondArrmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}