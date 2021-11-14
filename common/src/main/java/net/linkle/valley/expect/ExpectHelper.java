package net.linkle.valley.expect;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.item.ItemConvertible;

/** Helper class. It using modding's API back-end implementation. */
public class ExpectHelper {
    @ExpectPlatform
    public static void registerCompostableItem(ItemConvertible item, float chance) {
        throw new AssertionError();
    }
}
