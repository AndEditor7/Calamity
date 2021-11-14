package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.sound.BlockSoundGroup;

public class FrozenFossilOreBlock extends OreBlock {

    public FrozenFossilOreBlock() {
        super(Block.Settings.of(Material.DENSE_ICE)
                .sounds(BlockSoundGroup.GLASS).nonOpaque()
                .strength(1, 1f));
    }
}
