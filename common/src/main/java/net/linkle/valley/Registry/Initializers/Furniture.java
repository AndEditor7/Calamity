package net.linkle.valley.Registry.Initializers;

import dev.architectury.registry.registries.RegistrySupplier;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Blocks.Decorations.*;
import net.linkle.valley.Registry.Blocks.Plants.Hanging.*;
import net.linkle.valley.Registry.Blocks.Plants.Stumps.*;
import net.linkle.valley.Registry.Utils.Util;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;

import static net.linkle.valley.Registry.Initializers.ItemGroups.*;
import static net.linkle.valley.Registry.Utils.Util.registerWithItem;

public class Furniture {
    private static final Item.Settings furnGroup = new Item.Settings().group(FURNITURE_GROUP);
    private static final Item.Settings explGroup = new Item.Settings().group(EXPLORATION_GROUP);
    private static final Item.Settings cookGroup = new Item.Settings().group(COOKING_GROUP);
    private static final Item.Settings furnGroupRare = new Item.Settings().group(FURNITURE_GROUP).rarity(Rarity.RARE);
    
    public static final RegistrySupplier<Block> TABLE_OAK = registerWithItem("table_oak", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_DARK = registerWithItem("table_dark_oak", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_SPRUCE = registerWithItem("table_spruce", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_JUNGLE = registerWithItem("table_jungle", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_ACACIA = registerWithItem("table_acacia", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_BIRCH = registerWithItem("table_birch", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_WARPED = registerWithItem("table_warped", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_CRIMSON = registerWithItem("table_crimson", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_STONE = registerWithItem("table_stone", () -> new TableBlock(), furnGroup);
    public static final RegistrySupplier<Block> TABLE_PLAID = registerWithItem("table_plaid", () -> new TableBlock(), furnGroup);

    public static final RegistrySupplier<Block> STOOL_OAK = registerWithItem("stool_oak", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_DARK = registerWithItem("stool_dark_oak", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_SPRUCE = registerWithItem("stool_spruce", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_JUNGLE = registerWithItem("stool_jungle", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_ACACIA = registerWithItem("stool_acacia", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_BIRCH = registerWithItem("stool_birch", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_WARPED = registerWithItem("stool_warped", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_CRIMSON = registerWithItem("stool_crimson", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_STONE = registerWithItem("stool_stone", () -> new StoolBlock(), furnGroup);
    public static final RegistrySupplier<Block> STOOL_PLAID = registerWithItem("stool_plaid", () -> new StoolBlock(), furnGroup);

    public static final RegistrySupplier<Block> IRON_LADDER = registerWithItem("iron_ladder", () -> new LadderBlock(Block.Settings.of(Material.METAL).sounds(BlockSoundGroup.METAL).strength(1f,5f)), furnGroup);
    public static final RegistrySupplier<Block> BAMBOO_LADDER = registerWithItem("bamboo_ladder", () -> new LadderBlock(), furnGroup);
    public static final RegistrySupplier<Block> OAK_LADDER = registerWithItem("ladder_oak", () -> new LadderBlock(), furnGroup);
    public static final RegistrySupplier<Block> BIRCH_LADDER = registerWithItem("ladder_birch", () -> new LadderBlock(), furnGroup);
    public static final RegistrySupplier<Block> ACACIA_LADDER = registerWithItem("ladder_acacia", () -> new LadderBlock(), furnGroup);
    public static final RegistrySupplier<Block> SPRUCE_LADDER = registerWithItem("ladder_spruce", () -> new LadderBlock(), furnGroup);
    public static final RegistrySupplier<Block> DARK_LADDER = registerWithItem("ladder_dark", () -> new LadderBlock(), furnGroup);
    public static final RegistrySupplier<Block> JUNGLE_LADDER = registerWithItem("ladder_jungle", () -> new LadderBlock(), furnGroup);
    public static final RegistrySupplier<Block> CRIMSON_LADDER = registerWithItem("ladder_crimson", () -> new LadderBlock(), furnGroup);
    public static final RegistrySupplier<Block> WARPED_LADDER = registerWithItem("ladder_warped", () -> new LadderBlock(), furnGroup);

    public static final RegistrySupplier<Block> SCARE = registerWithItem("scarecrow", () -> new StatueBlock(false), furnGroup);
    public static final RegistrySupplier<Block> SCARE_HAT = registerWithItem("scarecrow_hat", () -> new StatueBlock(false), furnGroup);

    public static final RegistrySupplier<Block> SCARE_GLOW = registerWithItem("scarecrow_glow", () -> new StatueBlock(true), furnGroup);
    public static final RegistrySupplier<Block> SCARE_HAT_GLOW = registerWithItem("scarecrow_hat_glow", () -> new StatueBlock(true), furnGroup);

    public static final RegistrySupplier<Block> SCARE_SOUL = registerWithItem("scarecrow_soul", () -> new StatueBlock(true), furnGroup);
    public static final RegistrySupplier<Block> SCARE_HAT_SOUL = registerWithItem("scarecrow_hat_soul", () -> new StatueBlock(true), furnGroup);

    public static final RegistrySupplier<Block> SCARE_TARGET = registerWithItem("scarecrow_target", () -> new StatueBlock(false), furnGroup);
    public static final RegistrySupplier<Block> RARE_MELON = registerWithItem("rarecrow_melon", () -> new StatueBlock(false), furnGroup);
    public static final RegistrySupplier<Block> RARE_ZOMBIE = registerWithItem("rarecrow_zombie", () -> new StatueBlock(false), furnGroup);
    public static final RegistrySupplier<Block> RARE_SKELETON = registerWithItem("rarecrow_skeleton", () -> new StatueBlock(false), furnGroup);

    public static final RegistrySupplier<Block> SCARE_COPPER = registerWithItem("scarecrow_copper", () -> new StatueBlock(true), furnGroup);
    public static final RegistrySupplier<Block> SCARE_HAT_COPPER = registerWithItem("scarecrow_hat_copper", () -> new StatueBlock(true), furnGroup);

    public static final RegistrySupplier<Block> SNOW = registerWithItem("snow", () -> new SnowmanBlock(), furnGroup);

    public static final RegistrySupplier<Block> ROPE_BRIDGE = registerWithItem("rope_bridge", () -> new RopeBridgeBlock(Block.Settings.of(Material.WOOD).nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f)), explGroup);

    public static final RegistrySupplier<Block> ROPE_BRIDGE_ANCHOR = registerWithItem("rope_bridge_anchor", () -> new RopeBridgeBlock(Block.Settings.of(Material.WOOD).nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f,1f).noCollision()), explGroup);

    public static final RegistrySupplier<Block> SMOOTH_STONE_BRICK = registerWithItem("smooth_stone", () -> new PolishedStoneBlock(), furnGroup);
    public static final RegistrySupplier<Block> SMOOTH_STONE_TILE = registerWithItem("stone_tiles", () -> new PolishedStoneBlock(), furnGroup);
    public static final RegistrySupplier<Block> SMOOTH_STONE_TILE_SLAB = registerWithItem("stone_tile_slab", () -> new TileSlabBlock(), furnGroup);
    public static final RegistrySupplier<Block> SMOOTH_STONE_TILE_STAIRS = registerWithItem("stone_tile_stairs", () -> new TileStairsBlock(), furnGroup);

    public static final RegistrySupplier<Block> COBBLE_BRICK = registerWithItem("cobblestone_brick", () -> new PolishedStoneBlock(), furnGroup);
    public static final RegistrySupplier<Block> COBBLE_MOSSY = registerWithItem("cobblestone_mossy_brick", () -> new PolishedStoneBlock(), furnGroup);
    public static final RegistrySupplier<Block> COBBLE_SLAB = registerWithItem("cobblestone_brick_slab", () -> new TileSlabBlock(), furnGroup);
    public static final RegistrySupplier<Block> COBBLE_STAIRS = registerWithItem("cobblestone_brick_stairs", () -> new TileStairsBlock(), furnGroup);

    public static final RegistrySupplier<Block> NET = registerWithItem("net_block", () -> new NetBlock(), explGroup);
    public static final RegistrySupplier<Block> B_BRICKS = registerWithItem("brown_bricks", () -> new BrownBlock(), furnGroup);
    public static final RegistrySupplier<Block> B_CRACKED = registerWithItem("brown_cracked_bricks", () -> new BrownBlock(), furnGroup);
    public static final RegistrySupplier<Block> B_MOSSY = registerWithItem("brown_mossy_bricks", () -> new BrownBlock(), furnGroup);
    public static final RegistrySupplier<Block> B_STAIRS = registerWithItem("brown_brick_stairs", () -> new BrownStairsBlock(), furnGroup);
    public static final RegistrySupplier<Block> B_SLAB = registerWithItem("brown_brick_slab", () -> new BrownSlabBlock(), furnGroup);
    public static final RegistrySupplier<Block> SCREEN = registerWithItem("screen", () -> new ScreenBlock(), furnGroup);
    public static final RegistrySupplier<Block> BRAZIER = registerWithItem("brazier", () -> new BrazierBlock(15), furnGroup);
    public static final RegistrySupplier<Block> SOUL_BRAZIER = registerWithItem("brazier_soul", () -> new BrazierBlock(10), furnGroup);
    public static final RegistrySupplier<Block> COPPER_BRAZIER = registerWithItem("brazier_copper", () -> new BrazierBlock(13), furnGroup);

    public static final RegistrySupplier<Block> C_BRICKS = registerWithItem("carmine_bricks", () -> new BrownBlock(), furnGroup);
    public static final RegistrySupplier<Block> C_CHISELED = registerWithItem("chiseled_carmine", () -> new BrownBlock(), furnGroup);
    public static final RegistrySupplier<Block> C_STAIRS = registerWithItem("carmine_stairs", () -> new BrownStairsBlock(), furnGroup);
    public static final RegistrySupplier<Block> C_SLAB = registerWithItem("carmine_slab", () -> new BrownSlabBlock(), furnGroup);
    public static final RegistrySupplier<Block> C_MOSSY = registerWithItem("carmine_mossy", () -> new BrownBlock(), furnGroup);
    public static final RegistrySupplier<Block> C_CRACK = registerWithItem("carmine_cracked", () -> new BrownBlock(), furnGroup);
    public static final RegistrySupplier<Block> C_SMOOTH = registerWithItem("carmine_smooth", () -> new BrownBlock(), furnGroup);

    public static final RegistrySupplier<Block> ANCHOR = registerWithItem("anchor", () -> new AnchorBlock(), furnGroupRare);

    public static final RegistrySupplier<Block> CHARCOAL_BLOCK = registerWithItem("charcoal_block", () -> new CharcoalBlock(Block.Settings.of(Material.STONE)
            .sounds(BlockSoundGroup.STONE)
            .strength(1, 2.0f)), furnGroup);

    public static final RegistrySupplier<Block> FIBER_BALE = registerWithItem("fiber_block", () -> new BaleBlock(Block.Settings.of(Material.STONE)
            .sounds(BlockSoundGroup.GRASS)
            .strength(1, 1.0f)), furnGroup);

    public static final RegistrySupplier<Block> SEAWEED_BALE = registerWithItem("seaweed_block", () -> new BaleBlock(Block.Settings.of(Material.STONE)
            .sounds(BlockSoundGroup.GRASS)
            .strength(1, 1.0f)), furnGroup);

    //rope
    public static final RegistrySupplier<Block> CLIMBABLE_ROPE = registerWithItem("climbable_rope", () -> new ClimbableRopeBlock(Block.Settings.of(Material.NETHER_WOOD).nonOpaque()
            .sounds(BlockSoundGroup.NETHER_STEM)
            .strength(0,0.1f)), explGroup);

    //chain
    public static final RegistrySupplier<Block> CHAIN_C = registerWithItem("copper_chain", () -> new ClimbableChainBlock(Block.Settings.of(Material.NETHER_WOOD).nonOpaque()
            .sounds(BlockSoundGroup.CHAIN)
            .strength(1,1.1f)), explGroup);
    public static final RegistrySupplier<Block> CHAIN_G = registerWithItem("golden_chain", () -> new ClimbableChainBlock(Block.Settings.of(Material.NETHER_WOOD).nonOpaque()
            .sounds(BlockSoundGroup.CHAIN)
            .strength(1,1.1f)), explGroup);
    public static final RegistrySupplier<Block> CHAIN_N = registerWithItem("netherite_chain", () -> new ClimbableChainBlock(Block.Settings.of(Material.NETHER_WOOD).nonOpaque()
            .sounds(BlockSoundGroup.CHAIN)
            .strength(1,1.1f)), explGroup);

    //lantern

    public static final RegistrySupplier<Block> REDSTONE_LANTERN = registerWithItem("redstone_lantern", () -> new RedLanternBlock(
            Block.Settings.of(Material.METAL).nonOpaque()
            .sounds(BlockSoundGroup.CHAIN).luminance(Util.toInt(2))
            .strength(1.0f,0.8f)), furnGroup);

    public static final RegistrySupplier<Block> BEVELED_PANE = registerWithItem("beveled_glass", () -> new BeveledGlassBlock(), furnGroup);
    public static final RegistrySupplier<Block> BEVELED_PANE_COPPER = registerWithItem("beveled_glass_copper", () -> new BeveledGlassBlock(), furnGroup);
    public static final RegistrySupplier<Block> BEVELED_PANE_GOLD = registerWithItem("beveled_glass_gold", () -> new BeveledGlassBlock(), furnGroup);
    public static final RegistrySupplier<Block> BEVELED_PANE_NETHERITE = registerWithItem("beveled_glass_netherite", () -> new BeveledGlassBlock(), furnGroup);

    public static final RegistrySupplier<Block> BEVELED_PANE_A = registerWithItem("beveled_glass_amethyst", () -> new BeveledGlassBlock(), furnGroup);
    public static final RegistrySupplier<Block> BEVELED_PANE_A_C = registerWithItem("beveled_glass_amethyst_copper", () -> new BeveledGlassBlock(), furnGroup);
    public static final RegistrySupplier<Block> BEVELED_PANE_A_G = registerWithItem("beveled_glass_amethyst_gold", () -> new BeveledGlassBlock(), furnGroup);
    public static final RegistrySupplier<Block> BEVELED_PANE_A_N = registerWithItem("beveled_glass_amethyst_netherite", () -> new BeveledGlassBlock(), furnGroup);

    public static final RegistrySupplier<Block> MUG_BLOCK = registerWithItem("mug_block", () -> new DishBlock(), cookGroup);
    public static final RegistrySupplier<Block> BENTO_BLOCK = registerWithItem("bento_block", () -> new BentoBlock(), cookGroup);
    public static final RegistrySupplier<Block> BOWL_BLOCK = registerWithItem("bowl_block", () -> new BowlBlock(), cookGroup);
    public static final RegistrySupplier<Block> STEW_POT = registerWithItem("stew_pot", () -> new StewPotBlock(), furnGroup);
    public static final RegistrySupplier<Block> STEW_POT_CAMPFIRE = registerWithItem("stew_campfire_pot", () -> new StewPotCampfireBlock(), furnGroup);
    public static final RegistrySupplier<Block> SMALL_MUG_BLOCK = registerWithItem("small_mug_block", () -> new DishBlock(), cookGroup);
    public static final RegistrySupplier<Block> GOBLET_BLOCK = registerWithItem("goblet", () -> new DishBlock(), cookGroup);

    public static final RegistrySupplier<Block> SPIKE_WALL_BLOCK = registerWithItem("spike_wall_block", 
            () -> new SpikeTrapBlock(Block.Settings.of(Material.WOOD)
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.5f, 1.5f)), furnGroup);

    public static final RegistrySupplier<Block> ROUNDED_BARREL = registerWithItem("rounded_barrel", () -> new RoundedBarrelBlock(), furnGroup);
    public static final RegistrySupplier<Block> SOUL_JACK = registerWithItem("soul_jack_o_lantern", () -> new JackBlock(), furnGroup);
    public static final RegistrySupplier<Block> COPPER_JACK = registerWithItem("copper_jack_o_lantern", () -> new JackBlock(), furnGroup);
    public static final RegistrySupplier<Block> VOLCANIC_STONE_SMOOTH = registerWithItem("volc_stone_smooth", () -> new StoneOreBlock(), furnGroup);

    public static final RegistrySupplier<Block> LANTERN_HANGING = registerWithItem("lantern_hanging", () -> new LanternBlock(15, false), furnGroup);
    public static final RegistrySupplier<Block> SOUL_HANGING = registerWithItem("soul_hanging", () -> new LanternBlock(10, false), furnGroup);
    public static final RegistrySupplier<Block> RED_HANGING = registerWithItem("redstone_hanging", () -> new LanternBlock(7, true), furnGroup);

    public static final RegistrySupplier<Block> CHIMNEY_COBBLE = registerWithItem("chimney_cobble", 
            () -> new ChimneyBlock(Block.Settings.of(Material.STONE)
            .sounds(BlockSoundGroup.STONE)
            .strength(1, 2.0f)), furnGroup);

    public static final RegistrySupplier<Block> HANGING = registerWithItem("hanging_pot", () -> new HangingBlock(), furnGroup);
    public static final RegistrySupplier<Block> CRYSTAL = registerWithItem("crystal_ball", () -> new CrystalBlock(), furnGroup);

    public static final RegistrySupplier<Block> BOOK_COBWEB = registerWithItem("bookshelf_cobweb", () -> new BookshelfBlock(), furnGroup);
    public static final RegistrySupplier<Block> EMPTY_SHELF = registerWithItem("bookshelf_empty", () -> new BookshelfBlock(), furnGroup);
    public static final RegistrySupplier<Block> EMPTY_COBWEB = registerWithItem("bookshelf_empty_cobweb", () -> new BookshelfBlock(), furnGroup);
    public static final RegistrySupplier<Block> LANTERN_SHELF = registerWithItem("bookshelf_lantern", () -> new BookshelfBlockGlow(), furnGroup);
    public static final RegistrySupplier<Block> LANTERN_COBWEB = registerWithItem("bookshelf_lantern_cobweb", () -> new BookshelfBlockGlow(), furnGroup);
    public static final RegistrySupplier<Block> DISH_SHELF = registerWithItem("bookshelf_dishes", () -> new BookshelfBlock(), furnGroup);
    public static final RegistrySupplier<Block> DISH_COBWEB = registerWithItem("bookshelf_dishes_cobweb", () -> new BookshelfBlock(), furnGroup);
    public static final RegistrySupplier<Block> POTION_SHELF = registerWithItem("bookshelf_potions", () -> new BookshelfBlock(), furnGroup);
    public static final RegistrySupplier<Block> POTION_COBWEB = registerWithItem("bookshelf_potions_cobweb", () -> new BookshelfBlock(), furnGroup);
    public static final RegistrySupplier<Block> ANTHRO_SHELF = registerWithItem("bookshelf_anthropology", () -> new BookshelfBlock(), furnGroup);
    public static final RegistrySupplier<Block> ANTHRO_COBWEB  = registerWithItem("bookshelf_anthropology_cobweb", () -> new BookshelfBlock(), furnGroup);

    public static final RegistrySupplier<Block> STUMP_MOREL  = registerWithItem("stump_morel", () -> new MorelStumpBlock(), furnGroup);
    public static final RegistrySupplier<Block> STUMP_RED  = registerWithItem("stump_red", () -> new RedStumpBlock(), furnGroup);
    public static final RegistrySupplier<Block> STUMP_BROWN  = registerWithItem("stump_brown", () -> new BrownStumpBlock(), furnGroup);

    public static final RegistrySupplier<Block> HANGING_D = registerWithItem("hanging_diamond", () -> new HangingCrystalAltBlock(), furnGroup);
    public static final RegistrySupplier<Block> HANGING_E = registerWithItem("hanging_emerald", () -> new HangingCrystalAltBlock(), furnGroup);
    public static final RegistrySupplier<Block> HANGING_A = registerWithItem("hanging_amethyst", () -> new HangingCrystalAltBlock(), furnGroup);
    public static final RegistrySupplier<Block> HANGING_G = registerWithItem("hanging_glowstone", () -> new HangingCrystalBlock(), furnGroup);

    public static final RegistrySupplier<Block> KEG = registerWithItem("keg", () -> new KegBlock(), furnGroup);

    public static final RegistrySupplier<Block> PET_BED = registerWithItem("pet_bed", () -> new PetBedBlock(), furnGroup);
    public static final RegistrySupplier<Block> WREATH = registerWithItem("wreath", () -> new WreathBlock(), furnGroup);
    public static final RegistrySupplier<Block> CREST = registerWithItem("miners_crest", () -> new CrestBlock(), furnGroup);
    public static final RegistrySupplier<Block> GEAR = registerWithItem("gear", () -> new GearBlock(), furnGroupRare);

    public static void initialize() {
        ValleyMain.LOGGER.info("Furniture blocks has been initialized");
    }
}
