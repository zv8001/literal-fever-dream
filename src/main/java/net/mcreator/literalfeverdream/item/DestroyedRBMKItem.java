package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.literalfeverdream.procedures.RbmkProcedureProcedure;
import net.mcreator.literalfeverdream.procedures.BrokenRBMKProdecureProcedure;

import javax.annotation.Nullable;

import java.util.function.Consumer;

public class DestroyedRBMKItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 31000, 4f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("literal_fever_dream:destroyed_rbmk_repair_items")));

	public DestroyedRBMKItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 14999f, -3.64f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.literal_fever_dream.destroyed_rbmk.description_0"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		if (equipmentSlot == EquipmentSlot.MAINHAND)
			BrokenRBMKProdecureProcedure.execute(world, entity);
		RbmkProcedureProcedure.execute(entity);
	}
}