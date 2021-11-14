package net.linkle.valley.Registry.Blocks.Plants.Hanging;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class PlanterBlock extends Block {
    public PlanterBlock() {
        super(Settings.of(Material.WOOD)
                .sounds(BlockSoundGroup.WOOD).nonOpaque()
                .strength(2, 2));
    }
}
