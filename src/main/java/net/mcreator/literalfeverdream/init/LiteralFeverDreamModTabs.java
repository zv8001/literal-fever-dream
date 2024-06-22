
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.literalfeverdream.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LiteralFeverDreamModTabs {
	public static CreativeModeTab TAB_LITERALFEVERDREAM;

	public static void load() {
		TAB_LITERALFEVERDREAM = new CreativeModeTab("tabliteralfeverdream") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.TNT);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
