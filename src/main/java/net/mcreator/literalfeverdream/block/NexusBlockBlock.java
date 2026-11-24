package net.mcreator.literalfeverdream.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class NexusBlockBlock extends Block {
	public NexusBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE_BRICKS).strength(1f, 10f).instrument(NoteBlockInstrument.BASEDRUM));
	}
}