
package net.mcreator.rival.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BarindirmasinBlock extends Block {
	public BarindirmasinBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}