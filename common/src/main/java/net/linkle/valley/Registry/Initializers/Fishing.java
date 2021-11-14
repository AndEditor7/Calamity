package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Cooking.FoodTypeBases.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.Registry.Utils.Util.registerItem;

import dev.architectury.registry.registries.RegistrySupplier;

public class Fishing {
    public static final RegistrySupplier<Item> FIRE_EEL = registerItem("fire_eel", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64)));
    public static final RegistrySupplier<Item> OCTO = registerItem("octopus", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build()).rarity(Rarity.RARE).maxCount(64)));
    public static final RegistrySupplier<Item> GHOST_FISH = registerItem("ghost_fish", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).rarity(Rarity.EPIC).maxCount(64)));
    public static final RegistrySupplier<Item> PERCH = registerItem("perch", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64)));
    public static final RegistrySupplier<Item> CRAB = registerItem("crab_red", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.8f).build()).maxCount(64)));
    public static final RegistrySupplier<Item> MUSSEL = registerItem("mussel", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.3f).build()).maxCount(64)));
    public static final RegistrySupplier<Item> BROWN_MUSSEL = registerItem("brown_mussel", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900),0.3f).build()).maxCount(64)));
    public static final RegistrySupplier<Item> CERITH_SNAIL = registerItem("cerith_snail", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> LIONFISH = registerItem("lionfish", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64)));
    public static final RegistrySupplier<Item> SARDINE = registerItem("sardine", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64)));
    public static final RegistrySupplier<Item> SLIMEFISH = registerItem("slime_fish", () -> new FoodItemBase(new Item.Settings().group(FISHING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build()).rarity(Rarity.COMMON).maxCount(64)));

    public static void initialize() {
        ValleyMain.LOGGER.info("Fishing items has been initialized");
    }
}