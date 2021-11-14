package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.linkle.valley.Registry.Blocks.Plants.*;
import net.linkle.valley.Registry.Blocks.Plants.Decorative.SporeBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import static net.linkle.valley.Registry.Initializers.ItemGroups.NATURE_GROUP;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

import dev.architectury.registry.registries.RegistrySupplier;

public class StoneBlocks {
 // RegistrySupplier<Block> registerWithItem("REDACTIVE", () -> 
    private static final Item.Settings natureGroup = new Item.Settings().group(NATURE_GROUP);
    public static final RegistrySupplier<Block> VOLCANIC_ASH = registerWithItem("volc_ash", () -> new VolcanicAshBlock(), natureGroup);
    public static final RegistrySupplier<Block> VOLCANIC_STONE = registerWithItem("volc_stone", () -> new StoneOreBlock(), natureGroup);

    public static final RegistrySupplier<Block> MIXED_ORE = registerWithItem("mixed_ore", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> SALTPETER_ORE = registerWithItem("saltpeter_ore", () -> new StoneOreBlock(), natureGroup);

    public static final RegistrySupplier<Block> SCALDING_STONE = registerWithItem("scalding_stone", () -> new ScaldingBlock(), natureGroup);
    public static final RegistrySupplier<Block> SCALDING_SANDSTONE = registerWithItem("scalding_sandstone", () -> new ScaldingBlock(), natureGroup);
    public static final RegistrySupplier<Block> DESERT_GRAVEL = registerWithItem("desert_gravel", () -> new VolcanicAshBlock(), natureGroup);
    public static final RegistrySupplier<Block> BLEACHED_GRAVEL = registerWithItem("bleached_gravel", () -> new VolcanicAshBlock(), natureGroup);
    public static final RegistrySupplier<Block> SCALDING_VOLC = registerWithItem("scalding_volc_stone", () -> new ScaldingBlock(), natureGroup);
    public static final RegistrySupplier<Block> GLACIAL_STONE = registerWithItem("glacial_stone", () -> new GlacialStone(), natureGroup);

    public static final RegistrySupplier<Block> SALT_ORE = registerWithItem("salt_ore", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> SALT_BLOCK = registerWithItem("salt_block", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> NETHER_SALT = registerWithItem("nether_salt", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> NETHER_COAL_ORE = registerWithItem("nether_coal_ore", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> B_CLAY = registerWithItem("brown_clay", () -> new MudBlock(), natureGroup);

    public static final RegistrySupplier<Block> JUNGLE = registerWithItem("jungle_stone", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> JUNGLE_MOSSY = registerWithItem("jungle_mossy", () -> new MossyBlock(), natureGroup);
    public static final RegistrySupplier<Block> JUNGLE_SPOREY = registerWithItem("jungle_sporey", () -> new SporeBlock(), natureGroup);
    public static final RegistrySupplier<Block> JUNGLE_COBBLE = registerWithItem("jungle_cobble", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> STONE_MOSSY = registerWithItem("stone_mossy", () -> new MossyBlock(), natureGroup);

    public static final RegistrySupplier<Block> OCEAN_STONE = registerWithItem("oceanstone", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> SWAMP_STONE = registerWithItem("swampstone", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> DARK_STONE = registerWithItem("darkstone", () -> new StoneOreBlock(), natureGroup);
    public static final RegistrySupplier<Block> TAIGA_STONE = registerWithItem("taigastone", () -> new StoneOreBlock(), natureGroup);

    public static void initialize() {
        ValleyMain.LOGGER.info("Stone blocks has been initialized");
    }
}