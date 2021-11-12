package net.linkle.valley;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.linkle.valley.Registry.Blocks.Decorations.Furnaces.Furnaces;
import net.linkle.valley.Registry.Initializers.Aquatic;
import net.linkle.valley.Registry.Initializers.Armors;
import net.linkle.valley.Registry.Initializers.Compostables;
import net.linkle.valley.Registry.Initializers.Crops;
import net.linkle.valley.Registry.Initializers.Entities;
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
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.CaveFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.OceanFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.OreConfiguredFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.OverworldPlantConfiguredFeatures;
import net.linkle.valley.Registry.Initializers.ConfiguredFeatures.Trees;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ValleyMain {
    public static final String MOD_ID = "valley";
    // We can use this if we don't want to use DeferredRegister
    //public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    
    // Registering a new creative tab
    public static final ItemGroup EXAMPLE_TAB = CreativeTabRegistry.create(new Identifier(MOD_ID, "example_tab"), () ->
            new ItemStack(ValleyMain.EXAMPLE_ITEM.get()));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Settings().group(ValleyMain.EXAMPLE_TAB)));
    
    public static void init() {
        ITEMS.register();
		
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
