package net.linkle.valley.Registry.Blocks.Plants.Hanging;

import net.linkle.valley.Registry.Commons.BlockWithWater;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class PlanterBlockWater extends BlockWithWater {
    
    public PlanterBlockWater() {
        super(Settings.of(Material.WOOD)
                .sounds(BlockSoundGroup.WOOD).nonOpaque()
                .strength(2, 2));
        setDefaultState(stateManager.getDefaultState().with(WATERLOGGED, false));
    }
}
