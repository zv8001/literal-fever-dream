package net.mcreator.literalfeverdream.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.literalfeverdream.LiteralFeverDreamMod;

public class HahaAsyncGoBRRRRRRRRRRRRRRRRRRRRRRRItem extends Item {
	public HahaAsyncGoBRRRRRRRRRRRRRRRRRRRRRRRItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(LiteralFeverDreamMod.MODID, "haha_async_go_brrrrrrrrrrrrrrrrrrrrrrr"))));
	}
}