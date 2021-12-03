package net.linkle.valley;

import net.fabricmc.api.ModInitializer;
import net.linkle.valley.Registry.Blocks.Decorations.Furnaces.Furnaces;
import net.linkle.valley.Registry.Initializers.*;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.CaveFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.OceanFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.OreConfiguredFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.OverworldPlantConfiguredFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Trees;

public class ValleyMain implements ModInitializer {

    public static final String MOD_ID = "valley";

    @Override
    public void onInitialize() {
        // This should stay first before items and blocks.
        Tags.initialize();

        //Item Initializers
        FoodAndCooking.initialize();
        Fishing.initialize();
        ItemGroups.initialize();
        WeaponsAndTools.initialize();
        MiscItems.initialize();
        Armors.initialize();

        //Block Initializers
        Furniture.initialize();
        FurnitureCont.initialize();
        Plants.initialize();
        Aquatic.initialize();
        Crops.initialize();
        StoneBlocks.initialize();
        Furnaces.ints();
        PotBlock.initialize();
        
        // Misc Initializers (Recommended put it after the blocks and items initializers)
        VCLootTables.initialize();
        Sounds.initialize();
        Compostables.initialize();
        Entities.initialize();

        //Configured Feature Initializers
        OreConfiguredFeatures.initialize();
        OverworldPlantConfiguredFeatures.initialize();
        CaveFeatures.initialize();
        OceanFeatures.initialize();
        Trees.ints();

        //Future Updates ;)
        //NetherPlantConfiguredFeatures.initialize();
        //CavePlantConfiguredFeatures.initialize();
        //WaterPlantConfiguredFeatures.initialize();

        //Tells you if this shit actually worked
        System.out.println("The main mod initialization sections loaded fine somehow.");
    }
}