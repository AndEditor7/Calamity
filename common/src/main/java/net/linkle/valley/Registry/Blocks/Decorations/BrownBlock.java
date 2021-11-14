package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BrownBlock extends Block {
    public BrownBlock() {
        super(Block.Settings.of(Material.STONE)
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                .strength(1, 2));
    }
}
