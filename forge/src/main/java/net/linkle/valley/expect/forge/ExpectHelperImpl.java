package net.linkle.valley.expect.forge;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;

import static net.linkle.valley.forge.ValleyForge.RUNS;

public class ExpectHelperImpl {
    public static void registerCompostableItem(ItemConvertible item, float chance) {
        RUNS.add(() -> ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(item.asItem(), chance));
    }
}
