package net.linkle.valley.Registry.Initializers;

import net.minecraft.item.Items;

import static net.linkle.valley.expect.ExpectHelper.registerCompostableItem;

/** Registering items for composer block */
public class Compostables {
    public static void initialize() {
        float levelLow = 0.3f; // leaves, seeds, saplings, grass.
        float levelMed = 0.5f; // double plant, vines.
        float levelHigh = 0.65f; // foods, flowers.
        float levelVery = 0.85f; // blocks.
        float levelUltra = 1.0f; // specialties.

        registerCompostableItem(Plants.RICE_SEEDLINGS.get(), levelLow);
        registerCompostableItem(Plants.TOMATO_BUSH.get(), levelLow);
        registerCompostableItem(Plants.SPICY_BERRY_BUSH.get(), levelLow);
        registerCompostableItem(Plants.BITTER_BERRY_BUSH.get(), levelLow);
        registerCompostableItem(Plants.HOLLY_BUSH.get(), levelLow);
        registerCompostableItem(Plants.APPLE_SAPLING.get(), levelLow);
        registerCompostableItem(Plants.APPLE_LEAVES.get(), levelLow);
        registerCompostableItem(Plants.APPLE_LEAVES_EMPTY.get(), levelLow);
        registerCompostableItem(Plants.SMALL_CACTUS.get(), levelLow);
        registerCompostableItem(Crops.PUFF_SEEDS.get(), levelLow);
        registerCompostableItem(Crops.MANDRAKE_SEEDS.get(), levelLow);
        registerCompostableItem(Crops.GREEN_BEAN.get(), levelLow);
        registerCompostableItem(Crops.GB_SEEDS.get(), levelLow);
        registerCompostableItem(MiscItems.FIBER.get(), levelLow);
        registerCompostableItem(MiscItems.MOSS_BALL.get(), levelLow);
        registerCompostableItem(MiscItems.TURF_ITEM.get(), levelLow);
        registerCompostableItem(Items.STICK, levelLow);

        registerCompostableItem(Plants.MOREL.get(), levelMed);
        registerCompostableItem(Plants.BUSH.get(), levelMed);
        registerCompostableItem(Crops.SNOW_YAM_ITEM.get(), levelMed);
        registerCompostableItem(Crops.WINTER_ROOT_ITEM.get(), levelMed);
        registerCompostableItem(Plants.SNOW_BUSH.get(), levelMed);
        registerCompostableItem(Plants.BUSH_ALIVE.get(), levelMed);
        registerCompostableItem(Plants.FERNBUSH.get(), levelMed);
        registerCompostableItem(Plants.JUNGLE_CAP.get(), levelMed);
        registerCompostableItem(Plants.ORANGE_FERN.get(), levelMed);
        registerCompostableItem(Plants.SPROUT.get(), levelMed);
        registerCompostableItem(Plants.MAIZE_CROP.get(), levelMed);
        registerCompostableItem(Plants.REED_BLOCK.get(), levelMed);
        registerCompostableItem(Plants.MINER_BUSH.get(), levelMed);
        registerCompostableItem(Plants.ONION.get(), levelMed);
        registerCompostableItem(Plants.MOSSY_VINE.get(), levelMed);
        registerCompostableItem(Plants.SWAMP_BUSH.get(), levelMed);
        registerCompostableItem(Plants.HEDGE.get(), levelMed);
        registerCompostableItem(Crops.MANDRAKE.get(), levelMed);
        registerCompostableItem(Plants.TUMBLE_WEED.get(), levelMed);
        registerCompostableItem(Plants.APPLE_LEAVES_EMPTY.get(), levelMed);
        registerCompostableItem(FoodAndCooking.WORM.get(), levelMed);

        registerCompostableItem(MiscItems.MULCH.get(), levelHigh);
        registerCompostableItem(Plants.ROSEBUSH.get(), levelHigh);
        registerCompostableItem(Plants.LILACBUSH.get(), levelHigh);
        registerCompostableItem(Plants.PEONYBUSH.get(), levelHigh);
        registerCompostableItem(Plants.FERNBUSH.get(), levelHigh);
        registerCompostableItem(Plants.WEAPING_SWAMP_WILLOW.get(), levelHigh);
        registerCompostableItem(Plants.REDWOOD_SORREL.get(), levelHigh);
        registerCompostableItem(Plants.CROCUS.get(), levelHigh);
        registerCompostableItem(Plants.DANDELION_PUFF.get(), levelHigh);
        registerCompostableItem(Plants.LAVENDER.get(), levelHigh);
        registerCompostableItem(Plants.LAVENDER_SPRIG.get(), levelHigh);
        registerCompostableItem(Plants.SWAMP_RIBBON.get(), levelHigh);
        registerCompostableItem(Plants.ROSE_SPRIG.get(), levelHigh);
        registerCompostableItem(Plants.BLACK_DAHLIA.get(), levelHigh);
        registerCompostableItem(Plants.ICE_ROSE.get(), levelHigh);
        registerCompostableItem(Plants.WILD_CARROT.get(), levelHigh);
        registerCompostableItem(Plants.WILD_POTATO.get(), levelHigh);
        registerCompostableItem(Plants.WILD_BEET.get(), levelHigh);
        registerCompostableItem(Plants.WILD_WHEAT.get(), levelHigh);
        registerCompostableItem(Plants.ORANGE_BEAUTY.get(), levelHigh);
        registerCompostableItem(Plants.JUNGLE_BUSH.get(), levelHigh);
        registerCompostableItem(Plants.JUNGLE_BUSH.get(), levelHigh);
        registerCompostableItem(Crops.COOKED_MANDRAKE.get(), levelHigh);
        registerCompostableItem(Items.EGG, levelHigh);
        registerCompostableItem(MiscItems.DUCK_EGG.get(), levelHigh);
        registerCompostableItem(Items.COD, levelHigh);
        registerCompostableItem(Items.SALMON, levelHigh);
        registerCompostableItem(Items.TROPICAL_FISH, levelHigh);
        registerCompostableItem(Furniture.FIBER_BALE.get(), levelHigh);
    }
}