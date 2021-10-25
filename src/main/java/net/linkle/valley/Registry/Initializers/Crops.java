package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.CrystalCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.GreenBeanCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.MandrakeCropBlock;
import net.linkle.valley.Registry.Blocks.Plants.CropsSeeds.PuffCropBlock;
import net.linkle.valley.Registry.Cooking.FoodTypeBases.FoodItemBase;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.linkle.valley.Registry.Initializers.ItemGroups.COOKING_GROUP;
import static net.linkle.valley.Registry.Initializers.ItemGroups.NATURE_GROUP;
import static net.linkle.valley.ValleyMain.MOD_ID;

public class Crops {
    //Puff Ball
    public static final CropBlock PUFF_CROP_BLOCK = new PuffCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item PUFF_SEEDS = new AliasedBlockItem(PUFF_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    //Green Bean
    public static final CropBlock GB_CROP_BLOCK = new GreenBeanCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item GB_SEEDS = new AliasedBlockItem(GB_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item GREEN_BEAN = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Mandrake
    public static final CropBlock MANDRAKE_CROP_BLOCK = new MandrakeCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item MANDRAKE_SEEDS = new AliasedBlockItem(MANDRAKE_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item MANDRAKE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Crystal Fruit
    public static final CropBlock CRYSTAL_CROP_BLOCK = new CrystalCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Item CRYSTAL_SEEDS = new AliasedBlockItem(CRYSTAL_CROP_BLOCK, new Item.Settings().group(NATURE_GROUP));
    public static final Item CRYSTAL_FRUIT = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    //Foods
    public static final Item COOKED_MANDRAKE = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build()).maxCount(64));
    public static final Item SNOW_YAM_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item WINTER_ROOT_ITEM = new FoodItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));

    public static void initialize() {
        //Puff Ball
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"puff_crop_block"), PUFF_CROP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"puff_seeds"), PUFF_SEEDS);
        //Green Bean
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"green_bean_crop_block"), GB_CROP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"green_bean_seeds"), GB_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_bean"), GREEN_BEAN);
        //Mandrake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"mandrake_crop_block"), MANDRAKE_CROP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"mandrake_seeds"), MANDRAKE_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mandrake"), MANDRAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_mandrake"), COOKED_MANDRAKE);
        //Crystal Fruit
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"crystal_crop_block"), CRYSTAL_CROP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"crystal_seeds"), CRYSTAL_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crystal_fruit"), CRYSTAL_FRUIT);
        //Foraged Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "snow_yam_item"), SNOW_YAM_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "winter_root_item"), WINTER_ROOT_ITEM);
    }
}
