package net.linkle.valley;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.architectury.registry.fuel.FuelRegistry;
import net.linkle.valley.Registry.Registies;
import net.linkle.valley.Registry.Blocks.Decorations.Furnaces.Furnaces;
import net.linkle.valley.Registry.Initializers.Aquatic;
import net.linkle.valley.Registry.Initializers.Armors;
import net.linkle.valley.Registry.Initializers.Compostables;
import net.linkle.valley.Registry.Initializers.Crops;
import net.linkle.valley.Registry.Initializers.Fishing;
import net.linkle.valley.Registry.Initializers.FoodAndCooking;
import net.linkle.valley.Registry.Initializers.Furniture;
import net.linkle.valley.Registry.Initializers.FurnitureCont;
import net.linkle.valley.Registry.Initializers.ItemGroups;
import net.linkle.valley.Registry.Initializers.MiscItems;
import net.linkle.valley.Registry.Initializers.Plants;
import net.linkle.valley.Registry.Initializers.PotBlock;
import net.linkle.valley.Registry.Initializers.Sounds;
import net.linkle.valley.Registry.Initializers.StoneBlocks;
import net.linkle.valley.Registry.Initializers.WeaponsAndTools;

public class ValleyMain {
    public static final String MOD_ID = "valley";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    // We can use this if we don't want to use DeferredRegister
    //public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    
    public static void init() {
        Registies.start();
		
		//Item Initializers
        ItemGroups.initialize();
        FoodAndCooking.initialize();
        Fishing.initialize();
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
        PotBlock.initialize();
        
        // Misc Initializers (Recommended put it after the blocks and items initializers)
        Sounds.initialize();
        //Entities.initialize();

        //Configured Feature Initializers
        //OreConfiguredFeatures.initialize();
        //OverworldPlantConfiguredFeatures.initialize();
        //CaveFeatures.initialize();
        //OceanFeatures.initialize();
        //Trees.ints();

        Registies.end();
        //Compostables.initialize();
        //FuelRegistry.register(16000, Furniture.CHARCOAL_BLOCK.get());
    }
}
