package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class NexusAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 50, 7f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:nexus_axe_repair_items")));

	public NexusAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, 1f, properties);
	}
}