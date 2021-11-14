package net.linkle.valley.expect.fabric;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.ItemConvertible;

public class ExpectHelperImpl {
    public static void registerCompostableItem(ItemConvertible item, float chance) {
        CompostingChanceRegistry.INSTANCE.add(item, chance);
    }
}
