package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.sound.BlockSoundGroup;

public class StoneOreBlock extends OreBlock {

    public StoneOreBlock() {
        super(Settings.of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .strength(1, 3f));
    }
}
