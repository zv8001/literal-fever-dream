package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.literalfeverdream.procedures.UraniumOnAStickLivingEntityIsHitWithToolProcedure;

public class UraniumOnAStickItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 4f, 0, 20, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:uranium_on_a_stick_repair_items")));

	public UraniumOnAStickItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3f, -4f).fireResistant());
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		UraniumOnAStickLivingEntityIsHitWithToolProcedure.execute(entity);
	}
}