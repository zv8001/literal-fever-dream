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

public abstract class ArromerNexusItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(899, Map.of(ArmorType.BOOTS, 35, ArmorType.LEGGINGS, 35, ArmorType.CHESTPLATE, 35, ArmorType.HELMET, 35, ArmorType.BODY, 35), 100,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 10f, 2f, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:arromer_nexus_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("literal_fever_dream:arromer_nexus")));

	private ArromerNexusItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends ArromerNexusItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends ArromerNexusItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends ArromerNexusItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends ArromerNexusItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}