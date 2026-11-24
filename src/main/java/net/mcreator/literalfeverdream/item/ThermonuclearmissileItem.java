package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import java.util.function.Consumer;

public class ThermonuclearmissileItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 20f, 0, 22, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:thermonuclearmissile_repair_items")));

	public ThermonuclearmissileItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 89f, 96f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.literal_fever_dream.thermonuclearmissile.description_0"));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}