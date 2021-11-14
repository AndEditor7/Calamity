package net.linkle.valley.Registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BookshelfBlock extends Block {

    public BookshelfBlock() {
        super(Block.Settings.of(Material.WOOD)
                .sounds(BlockSoundGroup.WOOD)
                .strength(1, 2f));
    }
}
