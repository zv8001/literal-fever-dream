package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class NexusSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 5f, 0, 100, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:nexus_sword_repair_items")));

	public NexusSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 9f, -3f));
	}
}