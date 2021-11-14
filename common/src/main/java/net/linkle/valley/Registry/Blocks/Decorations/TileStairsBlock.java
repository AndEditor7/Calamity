package net.linkle.valley.Registry.Blocks.Decorations;

import net.linkle.valley.Registry.Initializers.Furniture;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class TileStairsBlock extends StairsBlock {
    public TileStairsBlock() {
        super(Furniture.SMOOTH_STONE_TILE.get().getDefaultState(), 
                Settings.of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .strength(1, 2));
    }
}