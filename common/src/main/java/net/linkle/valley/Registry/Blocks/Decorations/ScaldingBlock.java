package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.MagmaBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ScaldingBlock extends MagmaBlock {
    public ScaldingBlock() {
        super(Settings.of(Material.STONE)
                .luminance(s->3)
                .sounds(BlockSoundGroup.STONE)
                .strength(1f, 1.5f));
    }
}
