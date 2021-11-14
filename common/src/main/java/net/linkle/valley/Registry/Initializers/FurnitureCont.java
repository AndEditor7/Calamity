package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static net.linkle.valley.Registry.Initializers.ItemGroups.FURNITURE_GROUP;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

import dev.architectury.registry.registries.RegistrySupplier;

public class FurnitureCont {
    private static final Item.Settings furnGroup = new Item.Settings().group(FURNITURE_GROUP);
    private static final Item.Settings furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
    private static final Item.Settings furnGroupEpic = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.EPIC);
    
    public static final RegistrySupplier<Block> STUFFY_BROWN = registerWithItem("stuffy_brown", () -> new StuffyBlock(), furnGroup);
    public static final RegistrySupplier<Block> STUFFY_WHITE = registerWithItem("stuffy_white", () -> new StuffyBlock(), furnGroup);

    public static final RegistrySupplier<Block> GOLEM_R = registerWithItem("golem_rusty", () -> new GolemBlockWaxed(), furnGroupRare);
    public static final RegistrySupplier<Block> GOLEM_W = registerWithItem("golem_waxed", () -> new GolemBlockRusted(), furnGroupRare);
    public static final RegistrySupplier<Block> GOLEM_I = registerWithItem("golem_idling", () -> new GolemBlock(), furnGroupEpic);

    public static final RegistrySupplier<Block> CAMPFIRE_RING = registerWithItem("campfire_ring", () -> new CampfireRocksBlock(), furnGroup);
    public static final RegistrySupplier<Block> LOGPILE = registerWithItem("log_pile", () -> new LogPileBlock(), furnGroup);

    public static void initialize() {
        ValleyMain.LOGGER.info("FurnitureCont blocks has been initialized");
    }
}