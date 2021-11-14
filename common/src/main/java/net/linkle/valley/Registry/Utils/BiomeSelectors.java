package net.linkle.valley.Registry.Utils;

import java.util.function.Predicate;

import dev.architectury.registry.level.biome.BiomeModifications.BiomeContext;
import net.minecraft.util.registry.RegistryKey;

public class BiomeSelectors {
    public static Predicate<BiomeContext> includeByKey(RegistryKey<?>... keys) {
        return context -> {
            for (var key : keys) {
                if (key.getValue().equals(context.getKey())) {
                    return true;
                }
            }
            return false;
        };
    }
}
