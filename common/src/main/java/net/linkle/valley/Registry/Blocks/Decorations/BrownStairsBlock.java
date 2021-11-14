package net.linkle.valley.Registry.Blocks.Decorations;

import net.linkle.valley.Registry.Initializers.Furniture;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class BrownStairsBlock extends StairsBlock {
    public BrownStairsBlock() {
        super(Furniture.B_BRICKS.get().getDefaultState(), 
                Block.Settings.of(Material.STONE)
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                .strength(1, 2));
    }
}