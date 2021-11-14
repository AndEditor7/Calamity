package net.linkle.valley.Registry.Blocks.Plants;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class MudBlock extends FallingBlock {
    public MudBlock() {
        super(Settings.of(Material.SOIL)
                .sounds(BlockSoundGroup.GRAVEL)
                .strength(0.6f, 1.5f));
    }
}