package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.CrystalCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.GreenBeanCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.MandrakeCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.PuffCropBlock;
import net.linkle.valley.Registry.Cooking.FoodTypeBases.FoodItemBase;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

import static net.linkle.valley.Registry.Initializers.ItemGroups.COOKING_GROUP;
import static net.linkle.valley.Registry.Initializers.ItemGroups.NATURE_GROUP;
import static net.linkle.valley.Registry.Utils.Util.registerBlock;
import static net.linkle.valley.Registry.Utils.Util.registerItem;

import dev.architectury.registry.registries.RegistrySupplier;

public class Crops {
    //Puff Ball
    public static final RegistrySupplier<Block> PUFF_CROP_BLOCK = registerBlock("puff_crop_block", () -> new PuffCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
    public static final RegistrySupplier<Item> PUFF_SEEDS = registerItem("puff_seeds", () -> new AliasedBlockItem(PUFF_CROP_BLOCK.get(), new Item.Settings().group(NATURE_GROUP)));
    //Green Bean
    public static final RegistrySupplier<Block> GB_CROP_BLOCK = registerBlock("green_bean_crop_block", () -> new GreenBeanCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
    public static final RegistrySupplier<Item> GB_SEEDS = registerItem("green_bean_seeds", () -> new AliasedBlockItem(GB_CROP_BLOCK.get(), new Item.Settings().group(NATURE_GROUP)));
    public static final RegistrySupplier<Item> GREEN_BEAN = registerItem("green_bean", () -> new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));
    //Mandrake
    public static final RegistrySupplier<Block> MANDRAKE_CROP_BLOCK = registerBlock("mandrake_crop_block", () -> new MandrakeCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
    public static final RegistrySupplier<Item> MANDRAKE_SEEDS = registerItem("mandrake_seeds", () -> new AliasedBlockItem(MANDRAKE_CROP_BLOCK.get(), new Item.Settings().group(NATURE_GROUP)));
    public static final RegistrySupplier<Item> MANDRAKE = registerItem("mandrake", () -> new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));
    //Crystal Fruit
    public static final RegistrySupplier<Block> CRYSTAL_CROP_BLOCK = registerBlock("crystal_crop_block", () -> new CrystalCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
    public static final RegistrySupplier<Item> CRYSTAL_SEEDS = registerItem("crystal_seeds", () -> new AliasedBlockItem(CRYSTAL_CROP_BLOCK.get(), new Item.Settings().group(NATURE_GROUP)));
    public static final RegistrySupplier<Item> CRYSTAL_FRUIT = registerItem("crystal_fruit", () -> new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));
    //Foods
    public static final RegistrySupplier<Item> COOKED_MANDRAKE = registerItem("cooked_mandrake", () -> new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build()).maxCount(64)));
    public static final RegistrySupplier<Item> SNOW_YAM_ITEM = registerItem("snow_yam_item", () -> new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));
    public static final RegistrySupplier<Item> WINTER_ROOT_ITEM = registerItem("winter_root_item", () -> new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));
    
    public static void initialize() {
        ValleyMain.LOGGER.info("Crop items has been initialized");
    }
}
