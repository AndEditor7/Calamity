package net.linkle.valley.Registry.Blocks.Plants.Stumps;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static net.minecraft.block.Blocks.BROWN_MUSHROOM;

public class BrownStumpBlock extends Block {

    public BrownStumpBlock() {
        super(Settings.of(Material.WOOD)
                .ticksRandomly().nonOpaque()
                .sounds(BlockSoundGroup.WOOD)
                .strength(1, 1f));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockPosTop = pos.up();
        if (world.isAir(blockPosTop)) {
            world.setBlockState(blockPosTop, BROWN_MUSHROOM.getDefaultState());
        }
    }
}
