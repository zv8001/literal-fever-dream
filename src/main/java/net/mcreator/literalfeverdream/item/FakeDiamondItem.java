package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class FakeDiamondItem extends Item {
	public FakeDiamondItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build(), Consumables.defaultFood().consumeSeconds(0F).build()));
	}
}