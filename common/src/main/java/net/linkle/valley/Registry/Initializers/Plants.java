package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Plants.*;
import net.linkle.valley.Registry.Blocks.Plants.Bushes.*;
import net.linkle.valley.Registry.Blocks.Plants.Cave.*;
import net.linkle.valley.Registry.Blocks.Plants.CactusBlock;
import net.linkle.valley.Registry.Blocks.Plants.Crops.MaizeCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.Crops.RiceCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.Decorative.*;
import net.linkle.valley.Registry.Utils.Util;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.Registry.Utils.Util.registerBlock;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

import dev.architectury.registry.registries.RegistrySupplier;

public class Plants {
    private static final Item.Settings natureGroup = new Item.Settings().group(NATURE_GROUP);
    //bushes
    public static final RegistrySupplier<Block> BITTER_BERRY_BUSH = registerWithItem("bitter_berries", () -> new BitterBerryBushBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,200), 1.0f).build()).maxCount(64));

    public static final RegistrySupplier<Block> SPICY_BERRY_BUSH = registerWithItem("spicy_berries", () -> new SpicyBerryBushBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque().luminance(Util.toInt(5))
            .sounds(BlockSoundGroup.NETHER_WART)
            .strength(0,0.1f)), new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), 1.0f).build()).maxCount(64));

    public static final RegistrySupplier<Block> TOMATO_BUSH = registerWithItem("tomato_bush", () -> new TomatoBushBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));

    public static final RegistrySupplier<Block> HOLLY_BUSH = registerWithItem("holly", () -> new HollyBushBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,400), 1.0f).build()).maxCount(64));

    public static final RegistrySupplier<Block> TUMBLE_WEED = registerWithItem("tumbleweed", () -> new TumbleWeedBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.4f,0.1f)), natureGroup);
    //crops

    public static final RegistrySupplier<Block> RICE_SEEDLINGS = registerWithItem("rice_crop", () -> new RiceCropBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), natureGroup);

    public static final RegistrySupplier<Block> MAIZE_CROP = registerWithItem("maize_crop", () -> new MaizeCropBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));

    public static final RegistrySupplier<Block> ROSEBUSH = registerWithItem("rose_bush", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> LILACBUSH = registerWithItem("lilac_bush", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> PEONYBUSH = registerWithItem("peony_bush", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> FERNBUSH = registerWithItem("fern_bush", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> BUSH = registerWithItem("bush", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> MOREL = registerWithItem("morel", () -> new MorelBlock(), natureGroup);
    public static final RegistrySupplier<Block> HERBS = registerWithItem("herbs", () -> new RoseBush(), new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64));

    public static final RegistrySupplier<Block> HEDGE = registerWithItem("hedge", () -> new HedgeBushBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), natureGroup);

    public static final RegistrySupplier<Block> SMALL_CACTUS = registerWithItem("small_cactus", () -> new CactusBlock(), natureGroup);

    public static final RegistrySupplier<Block> REED_BLOCK = registerWithItem("reeds", () -> new ReedBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), natureGroup);

    public static final RegistrySupplier<Block> WILD_CARROT = registerWithItem("wild_carrot", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> WILD_POTATO = registerWithItem("wild_potato", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> WILD_BEET = registerWithItem("wild_beet", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> WILD_WHEAT = registerWithItem("wild_wheat", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> DANDELION_PUFF = registerWithItem("dandelion_puffs", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> REDWOOD_SORREL = registerWithItem("redwood_sorrel", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> WEAPING_SWAMP_WILLOW = registerWithItem("weaping_willow", () -> new RoseBushGlow(), natureGroup);
    public static final RegistrySupplier<Block> CROCUS = registerWithItem("crocus", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> TAPROOTS = registerWithItem("taproots", () -> new RoseBush(), new Item.Settings().group(NATURE_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build()).maxCount(64));

    public static final RegistrySupplier<Block> BUSH_ALIVE = registerWithItem("alive_bush", () -> new RoseBushTall(), natureGroup);
    public static final RegistrySupplier<Block> SNOW_BUSH = registerWithItem("snow_bush", () -> new SnowBush(), natureGroup);

    public static final RegistrySupplier<Block> MINER_BUSH = registerWithItem("miners_lettuce", () -> new MinerBushBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));

    public static final RegistrySupplier<Block> ROCK_PILE = registerWithItem("rocks", () -> new RockBlock(), natureGroup);
    public static final RegistrySupplier<Block> RED_PILE = registerWithItem("redstone_crystal", () -> new RedCrystalBlock(Block.Settings.of(Material.STONE)
            .nonOpaque()
            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
            .strength(1.0f,2.0f).luminance(Util.toInt(7))), natureGroup);

    public static final RegistrySupplier<Block> SNOW_ROCK_PILE = registerWithItem("snow_rocks", () -> new RockBlock(), natureGroup);

    public static final RegistrySupplier<Block> ONION = registerWithItem("onion", () -> new OnionBushBlock(Block.Settings.of(Material.LEAVES).nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));

    public static final RegistrySupplier<Block> MOSSY_VINE = registerWithItem("mossy_vines", () -> new MossVinesBlock(Block.Settings.of(Material.PLANT, MapColor.GREEN).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)), natureGroup);
    public static final RegistrySupplier<Block> MOSSY_VINE_PLANT = registerBlock("mossy_vines_plant", () -> new MossVinesPlantBlock(Block.Settings.of(Material.PLANT, MapColor.GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES)));
    public static final RegistrySupplier<Block> JUNGLE_BUSH = registerWithItem("jungle_bush", () -> new JungleBushBlock(Block.Settings.of(Material.LEAVES).nonOpaque()
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f)), natureGroup);

    public static final RegistrySupplier<Block> SWAMP_BUSH = registerWithItem("swamp_bush", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> JUNGLE_CAP = registerWithItem("jungle_cap", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> SPROUT = registerWithItem("sprout", () -> new RoseBush(), natureGroup);

    public static final RegistrySupplier<Block> SWAMP_RIBBON = registerWithItem("pond_ribbons", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> BLACK_DAHLIA = registerWithItem("black_dahlia", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> LAVENDER = registerWithItem("lavender", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> LAVENDER_SPRIG = registerWithItem("lavender_sprig", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> ROSE_SPRIG = registerWithItem("single_rose", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> ICE_ROSE = registerWithItem("ice_rose", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> ORANGE_FERN = registerWithItem("orange_fern", () -> new RoseBush(), natureGroup);
    public static final RegistrySupplier<Block> ORANGE_BEAUTY = registerWithItem("orange_beauty", () -> new RoseBush(), natureGroup);

    public static final RegistrySupplier<Block> APPLE_SAPLING = registerWithItem("apple_sapling", () -> new SaplingBlock(new AppleSaplingGen()), natureGroup);
    public static final RegistrySupplier<Block> APPLE_LEAVES = registerWithItem("apple_leaves", () -> new AppleLeavesBlock(), natureGroup);
    public static final RegistrySupplier<Block> APPLE_LEAVES_EMPTY = registerWithItem("apple_leaves_empty", () -> new AppleLeavesBlock(), natureGroup);

    public static final RegistrySupplier<Block> SPIDER_EGG_BLOCK = registerWithItem("spider_egg", () -> new SpiderEggBlock(Block.Settings.of(Material.LEAVES)
            .nonOpaque().luminance(Util.toInt(3))
            .sounds(BlockSoundGroup.WOOL).breakInstantly()
            .strength(0.0f,0.1f)), natureGroup);

    public static void initialize() {
        ValleyMain.LOGGER.info("Plant blocks has been initialized");
    }
}
