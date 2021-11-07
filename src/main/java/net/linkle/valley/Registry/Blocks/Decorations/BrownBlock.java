package net.linkle.valley.Registry.Blocks.Decorations;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BrownBlock extends Block {
    public BrownBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 1)
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                .strength(1, 2));
    }
}
