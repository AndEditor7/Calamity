package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Misc.*;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.GrowthTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.RainTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.StormTotemBase;
import net.linkle.valley.Registry.WeaponsAndTools.Totems.SunshineTotemBase;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.Registry.Utils.Util.registerItem;

import dev.architectury.registry.registries.RegistrySupplier;

public class MiscItems {
    public static final RegistrySupplier<Item> BOMB_BAG = registerItem("bomb_bag", () -> new BombBundleBase(new Item.Settings().group(MISC_GROUP).rarity(Rarity.UNCOMMON).maxCount(16)));
    public static final RegistrySupplier<Item> ARROW_BUNDLE = registerItem("arrow_bundle", () -> new ArrowBundleBase(new Item.Settings().group(EXPLORATION_GROUP).rarity(Rarity.UNCOMMON).maxCount(16)));
    public static final RegistrySupplier<Item> STIRRUP = registerItem("stirrup", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP)));
    public static final RegistrySupplier<Item> TURF_ITEM = registerItem("turf", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP)));
    public static final RegistrySupplier<Item> MUD = registerItem("mud", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> MUD_BRICK = registerItem("mud_brick", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> FLOUR_BAG = registerItem("flour_bag", () -> new MiscItemBase(new Item.Settings().group(COOKING_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> COPPER_NUGGET = registerItem("copper_nugget", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> NETHER_NUGGET = registerItem("netherite_nugget", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> SALTPETER = registerItem("saltpeter", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> SQUID_SUCKER = registerItem("squid_sucker", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> FIBER = registerItem("fiber", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> MOSS_BALL = registerItem("moss_ball", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> PUFF_BALL = registerItem("puff_ball", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> E_TOTEM = registerItem("null_totem", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(1)));
    public static final RegistrySupplier<Item> S_TOTEM = registerItem("sunshine_totem", () -> new SunshineTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1)));
    public static final RegistrySupplier<Item> ST_TOTEM = registerItem("storm_totem", () -> new StormTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1)));
    public static final RegistrySupplier<Item> R_TOTEM = registerItem("rain_totem", () -> new RainTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1)));
    public static final RegistrySupplier<Item> G_TOTEM = registerItem("growth_totem", () -> new GrowthTotemBase(new Item.Settings().group(MISC_GROUP).maxCount(1)));
    public static final RegistrySupplier<Item> MULCH = registerItem("mulch", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> FUR_CLUMP = registerItem("fur_clump", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> RAWHIDE = registerItem("rawhide_lashing", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    //public static final RegistrySupplier<Item> BEAR_SPAWN_EGG = registerItem("bear_spawn_egg", () -> new SpawnEggItem(Entities.BEAR, 0x56290D, 0x120802, new Item.Settings().group(MISC_GROUP)));
    //public static final RegistrySupplier<Item> DUCK_SPAWN_EGG = registerItem("duck_spawn_egg", () -> new SpawnEggItem(Entities.DUCK, 0x5B3200, 0x445B22, new Item.Settings().group(MISC_GROUP)));
    public static final RegistrySupplier<Item> DUCK_EGG = registerItem("duck_egg", () -> new MiscItemBase((new Item.Settings()).maxCount(16).group(MISC_GROUP)));
    public static final RegistrySupplier<Item> COPPER_BILLET = registerItem("copper_billet", () -> new BilletItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64).recipeRemainder(COPPER_NUGGET.get())));
    public static final RegistrySupplier<Item> ARROWHEAD = registerItem("knapped_flint_arrowhead", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> DRIP_ARROWHEAD = registerItem("knapped_dripstone_arrowhead", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> DRIFT = registerItem("driftwood", () -> new MiscItemBase(new Item.Settings().group(FISHING_GROUP).maxCount(64)));
    public static final RegistrySupplier<Item> SPRUCE_STICK = registerItem("spruce_bark_hilt", () -> new MiscItemBase(new Item.Settings().group(MISC_GROUP).maxCount(64)));
    //public static final RegistrySupplier<Item> REDSTONE_WAND = registerItem("redstone_wand", () -> new RedstoneWandBase(new Item.Settings().group(MISC_GROUP).rarity(Rarity.UNCOMMON)));

    public static void initialize() {
        ValleyMain.LOGGER.info("MiscItems items has been initialized");
    }
}
