package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class JackBlock extends CarvedPumpkinBlock {
    public JackBlock() {
        super(Block.Settings.of(Material.GOURD)
                .sounds(BlockSoundGroup.WOOD)
                .strength(1f, 1.0f).luminance(s->15));
    }
}
