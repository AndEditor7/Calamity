package net.linkle.valley.Registry.Utils;

import java.util.function.Predicate;

import dev.architectury.registry.level.biome.BiomeModifications;
import dev.architectury.registry.level.biome.BiomeModifications.BiomeContext;
import net.minecraft.world.gen.GenerationStep.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class BiomeMods {

    public static void addFeature(Predicate<BiomeContext> predicate, 
            Feature genStep, ConfiguredFeature<?, ?> feature) {
        BiomeModifications.addProperties(predicate, (context, props) -> {
            props.getGenerationProperties().addFeature(genStep, feature);
        });
    }

}
