package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class FakeDiamondPicItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 30, 4f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:fake_diamond_pic_repair_items")));

	public FakeDiamondPicItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 3f, -3f));
	}
}