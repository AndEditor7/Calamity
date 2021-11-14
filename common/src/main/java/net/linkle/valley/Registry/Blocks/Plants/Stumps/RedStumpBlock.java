package net.linkle.valley.Registry.Blocks.Plants.Stumps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static net.minecraft.block.Blocks.RED_MUSHROOM;

public class RedStumpBlock extends Block {

    public RedStumpBlock() {
        super(Settings.of(Material.WOOD)
                .nonOpaque()
                .ticksRandomly()
                .sounds(BlockSoundGroup.WOOD)
                .strength(1, 1f));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockPosTop = pos.up();
        if (world.isAir(blockPosTop)) {
            world.setBlockState(blockPosTop, RED_MUSHROOM.getDefaultState());
        }
    }
}
