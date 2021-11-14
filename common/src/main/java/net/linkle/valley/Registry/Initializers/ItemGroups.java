package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Misc.MiscItemBase;
import net.linkle.valley.Registry.Utils.Util;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static net.linkle.valley.ValleyMain.MOD_ID;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.RegistrySupplier;

public class ItemGroups {
    
    //icons for item groups
    private static final RegistrySupplier<Item> EXPLORATION_ICON = Util.registerItem("exploration", () -> new MiscItemBase(new Item.Settings()));
    private static final RegistrySupplier<Item> COOKING_ICON = Util.registerItem("cooking", () -> new MiscItemBase(new Item.Settings()));
    private static final RegistrySupplier<Item> FURNITURE_ICON = Util.registerItem("furniture", () -> new MiscItemBase(new Item.Settings()));
    private static final RegistrySupplier<Item> MISC_ICON = Util.registerItem("misc", () -> new MiscItemBase(new Item.Settings()));
    private static final RegistrySupplier<Item> NATURE_ICON = Util.registerItem("nature", () -> new MiscItemBase(new Item.Settings()));
    private static final RegistrySupplier<Item> FISHING_ICON = Util.registerItem("fishing", () -> new MiscItemBase(new Item.Settings()));
    
    //item groups & some items
    //i hate order of operations in programming
    public static final ItemGroup NATURE_GROUP = CreativeTabRegistry.create(
            new Identifier(MOD_ID, "nature"), () -> new ItemStack(NATURE_ICON.get()));

    public static final ItemGroup COOKING_GROUP = CreativeTabRegistry.create(
            new Identifier(MOD_ID, "cooking"), () -> new ItemStack(COOKING_ICON.get()));

    public static final ItemGroup EXPLORATION_GROUP = CreativeTabRegistry.create(
            new Identifier(MOD_ID, "exploration"), () -> new ItemStack(EXPLORATION_ICON.get()));

    public static final ItemGroup FURNITURE_GROUP = CreativeTabRegistry.create(
            new Identifier(MOD_ID, "furniture"), () -> new ItemStack(FURNITURE_ICON.get()));

    public static final ItemGroup MISC_GROUP = CreativeTabRegistry.create(
            new Identifier(MOD_ID, "misc"), () -> new ItemStack(MISC_ICON.get()));

    public static final ItemGroup FISHING_GROUP = CreativeTabRegistry.create(
            new Identifier(MOD_ID, "fishing"), () -> new ItemStack(FISHING_ICON.get()));

    public static void initialize() {
        ValleyMain.LOGGER.info("ItemGroups has been initialized");
    }
}
