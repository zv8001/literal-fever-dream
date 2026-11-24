package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class KnifeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 4f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:knife_repair_items")));

	public KnifeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3f, -3f));
	}
}