package net.linkle.valley.Registry.Initializers;

import static net.linkle.valley.Registry.Utils.Util.registerItem;

import dev.architectury.registry.registries.RegistrySupplier;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Armors.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Armors {
    public static final RegistrySupplier<Item> TRADER_HELMET = registerItem("trader_helmet", () -> new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
    public static final RegistrySupplier<Item> TRADER_CHESTPLATE = registerItem("trader_chestplate", () -> new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
    //public static final Item TRADER_LEGGINGS = new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final RegistrySupplier<Item> TRADER_BOOTS = registerItem("trader_boots", () -> new ArmorItem(TraderArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
    
    public static final RegistrySupplier<Item> TURTLE_CHESTPLATE = registerItem("turtle_chestplate", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
    public static final RegistrySupplier<Item> TURTLE_LEGGINGS = registerItem("turtle_leggings", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
    public static final RegistrySupplier<Item> TURTLE_BOOTS = registerItem("turtle_boots", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
    
    public static final RegistrySupplier<Item> STRAY_HELMET = registerItem("stray_helmet", () -> new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
    public static final RegistrySupplier<Item> STRAY_CHESTPLATE = registerItem("stray_chestplate", () -> new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
    public static final RegistrySupplier<Item> STRAY_LEGGINGS = registerItem("stray_leggings", () -> new ArmorItem(StrayArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
    
    public static final RegistrySupplier<Item> FUR_CHESTPLATE = registerItem("fur_chestplate", () -> new ArmorItem(FurArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));

    //register("trader_leggings", TRADER_LEGGINGS);
    
    public static void initialize() {
        ValleyMain.LOGGER.info("Armor items has been initialized");
    }
}
