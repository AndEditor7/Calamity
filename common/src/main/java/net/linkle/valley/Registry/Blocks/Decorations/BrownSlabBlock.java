package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class BrownSlabBlock extends SlabBlock {
    public BrownSlabBlock() {
        super(Block.Settings.of(Material.STONE)
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                .strength(1, 2));
    }
}
