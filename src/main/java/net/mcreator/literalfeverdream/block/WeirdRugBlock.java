package net.mcreator.literalfeverdream.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WeirdRugBlock extends Block {
	public WeirdRugBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WET_GRASS).strength(1f, 40f).instrument(NoteBlockInstrument.BASEDRUM));
	}
}