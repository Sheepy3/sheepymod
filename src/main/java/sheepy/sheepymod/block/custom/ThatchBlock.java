package sheepy.sheepymod.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class ThatchBlock extends PillarBlock {
    public static final IntProperty AGE = Properties.AGE_7;
    public ThatchBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AGE, 0));
    }
    //public static final MapCodec<ThatchBlock> CODEC = ThatchBlock.createCodec(ThatchBlock::new);

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE); // Add AGE property to the block's state
        super.appendProperties(builder);
        }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

        int j = state.get(AGE);
        if (j != 7) {
            //world.setBlockState(pos, this.getDefaultState());
            //world.setBlockState(pos, (BlockState)state.with(AGE, 0));

            world.setBlockState(pos, (BlockState)state.with(AGE, j + 1));
        }
    }

}

