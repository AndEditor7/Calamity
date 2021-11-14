package net.linkle.valley.Registry.Blocks.Plants.Hanging;

import net.linkle.valley.Registry.Commons.BlockWithWater;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HangingCrystalBlock extends BlockWithWater {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(3, 4, 3, 13, 18, 13);

    public HangingCrystalBlock() {
        super(Settings.of(Material.GLASS)
                .sounds(BlockSoundGroup.GLASS)
                .strength(0.5f, 2.5f).luminance(s->13));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}