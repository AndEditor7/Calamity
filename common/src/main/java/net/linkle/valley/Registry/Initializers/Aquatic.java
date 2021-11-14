package net.linkle.valley.Registry.Initializers;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FISHING_GROUP;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

import dev.architectury.registry.registries.RegistrySupplier;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Plants.AquaticPlants.ClamBlock;
import net.minecraft.block.Block;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Aquatic {

    public static final RegistrySupplier<Block> CLAM = registerWithItem("clam", () -> new ClamBlock(), new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build()));
    public static final RegistrySupplier<Block> STARFISH = registerWithItem("fossilized_starfish", () -> new ClamBlock(), new Item.Settings().group(FISHING_GROUP).rarity(Rarity.EPIC));
    public static final RegistrySupplier<Block> SAND_DOLLAR = registerWithItem("sand_dollar", () -> new ClamBlock(), new Item.Settings().group(FISHING_GROUP).rarity(Rarity.UNCOMMON));

    public static void initialize() {
        ValleyMain.LOGGER.info("Aquatic items has been initialized");
    }
}
