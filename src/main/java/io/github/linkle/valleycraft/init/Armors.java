package io.github.linkle.valleycraft.init;

import io.github.linkle.valleycraft.utils.Util;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Armors {
    private static final Item.Settings settings = new Item.Settings().group(ItemGroup.COMBAT);

    public static final Item RG_HELMET = new ArmorItem(VArmorMaterials.ROSE_GOLD, EquipmentSlot.HEAD, settings);
    public static final Item RG_CHESTPLATE = new ArmorItem(VArmorMaterials.ROSE_GOLD, EquipmentSlot.CHEST, settings);
    public static final Item RG_LEGGINGS = new ArmorItem(VArmorMaterials.ROSE_GOLD, EquipmentSlot.LEGS, settings);
    public static final Item RG_BOOTS = new ArmorItem(VArmorMaterials.ROSE_GOLD, EquipmentSlot.FEET, settings);
    
    public static final Item TURTLE_CHESTPLATE = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, settings);
    public static final Item TURTLE_LEGGINGS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, settings);
    public static final Item TURTLE_BOOTS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, settings);

    public static final Item FUR_CHESTPLATE = new ArmorItem(VArmorMaterials.FUR, EquipmentSlot.CHEST, settings);

    public static void initialize() {
        Util.register("rg_helmet", RG_HELMET);
        Util.register("rg_chestplate", RG_CHESTPLATE);
        Util.register("rg_leggings", RG_LEGGINGS);
        Util.register("rg_boots", RG_BOOTS);
        
        Util.register("turtle_chestplate", TURTLE_CHESTPLATE);
        Util.register("turtle_leggings", TURTLE_LEGGINGS);
        Util.register("turtle_boots", TURTLE_BOOTS);

        Util.register("fur_chestplate", FUR_CHESTPLATE);
    }
}
