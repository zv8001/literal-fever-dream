package net.mcreator.literalfeverdream.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RickrollOreBlock extends Block {
	public RickrollOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BONE_BLOCK).strength(1f, 10f).instrument(NoteBlockInstrument.BASEDRUM));
	}
}