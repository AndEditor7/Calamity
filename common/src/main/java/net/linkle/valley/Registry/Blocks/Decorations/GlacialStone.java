package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SoulSandBlock;
import net.minecraft.sound.BlockSoundGroup;

public class GlacialStone extends SoulSandBlock {
    public GlacialStone() {
        super(Block.Settings.of(Material.STONE)
                .ticksRandomly()
                .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                .strength(1f, 2.5f));
    }
}
