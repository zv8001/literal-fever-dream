package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.literalfeverdream.procedures.FIREEEEProcedure;

import java.util.function.Consumer;

public class RainbowcoreItem extends Item {
	public RainbowcoreItem(Item.Properties properties) {
		super(properties.fireResistant().food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0f).build(), Consumables.defaultFood().consumeSeconds(3.2F).build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.literal_fever_dream.rainbowcore.description_0"));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		FIREEEEProcedure.execute(entity.level(), entity);
	}
}