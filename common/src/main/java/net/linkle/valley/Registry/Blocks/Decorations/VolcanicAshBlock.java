package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.GravelBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class VolcanicAshBlock extends GravelBlock {
    public VolcanicAshBlock() {
        super(Settings.of(Material.SOIL)
                .sounds(BlockSoundGroup.GRAVEL)
                .strength(0.5f, 1.5f));
    }
}
