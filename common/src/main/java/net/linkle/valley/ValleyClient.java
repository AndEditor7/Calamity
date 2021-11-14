package net.linkle.valley;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.valley.Registry.Utils.RawArray;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

import static net.linkle.valley.Registry.Initializers.Plants.*;
import static net.linkle.valley.Registry.Initializers.Crops.*;
import static net.linkle.valley.Registry.Initializers.Furniture.*;
import static net.linkle.valley.Registry.Initializers.FurnitureCont.*;
import static net.linkle.valley.Registry.Initializers.PotBlock.POTTED_ROSE_SPRIG;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;

@Environment(EnvType.CLIENT)
public class ValleyClient {
    
    public static void init() {
        //Entities.initializeClient();
        renderLayer();

        ColorHandlerRegistry.registerBlockColors((state, view, pos, tintIndex) -> {
            return tintIndex == 1 ? BiomeColors.getFoliageColor(view, pos) : -1;
        }, APPLE_LEAVES);

        ColorHandlerRegistry.registerItemColors((stack, tintIndex) -> {
            return tintIndex == 1 ? 4764952 : -1;
        }, APPLE_LEAVES);

        ColorHandlerRegistry.registerBlockColors((state, view, pos, tintIndex) -> {
            return tintIndex == 1 ? BiomeColors.getFoliageColor(view, pos) : -1;
        }, APPLE_LEAVES_EMPTY);

        ColorHandlerRegistry.registerItemColors((stack, tintIndex) -> {
            return tintIndex == 1 ? 4764952 : -1;
        }, APPLE_LEAVES_EMPTY);
    }
    
    private static void renderLayer() {
        var cullouts = new RawArray<Block>(Block.class, 300);
        var translucents = new RawArray<Block>(Block.class, 100);
        
        //bush texture fix
        cullouts.add(BITTER_BERRY_BUSH.get());
        cullouts.add(SPICY_BERRY_BUSH.get());
        cullouts.add(TOMATO_BUSH.get());
        cullouts.add(HOLLY_BUSH.get());

        cullouts.add(RICE_SEEDLINGS.get());
        cullouts.add(MAIZE_CROP.get());

        cullouts.add(REDSTONE_LANTERN.get());
        cullouts.add(WREATH.get());
        
        cullouts.add(PET_BED.get());

        cullouts.add(SOUL_HANGING.get());
        cullouts.add(LANTERN_HANGING.get());
        cullouts.add(RED_HANGING.get());

        cullouts.add(ROUNDED_BARREL.get());
        
        //spike trap fix
        cullouts.add(SPIKE_WALL_BLOCK.get());

        //nether plants
        //cullouts.add(BLAZE_NETTLE);
        //cullouts.add(WEAPING_BRIAR);
        //cullouts.add(CORRUPT_WART);
        //cullouts.add(TAINTED_BUSH);
        //cullouts.add(WATCHERS_GAZE);

        //bushes
        cullouts.add(TUMBLE_WEED.get());

        cullouts.add(BOWL_BLOCK.get());
        cullouts.add(MUG_BLOCK.get());
        cullouts.add(BENTO_BLOCK.get());
        cullouts.add(STEW_POT.get());
        cullouts.add(TABLE_OAK.get());
        cullouts.add(TABLE_SPRUCE.get());
        cullouts.add(TABLE_BIRCH.get());
        cullouts.add(TABLE_ACACIA.get());
        cullouts.add(TABLE_JUNGLE.get());
        cullouts.add(TABLE_DARK.get());
        cullouts.add(TABLE_CRIMSON.get());
        cullouts.add(TABLE_WARPED.get());
        cullouts.add(TABLE_STONE.get());
        cullouts.add(STOOL_OAK.get());
        cullouts.add(STOOL_SPRUCE.get());
        cullouts.add(STOOL_JUNGLE.get());
        cullouts.add(STOOL_ACACIA.get());
        cullouts.add(STOOL_BIRCH.get());
        cullouts.add(STOOL_DARK.get());
        cullouts.add(STOOL_CRIMSON.get());
        cullouts.add(STOOL_WARPED.get());
        cullouts.add(SMALL_MUG_BLOCK.get());
        cullouts.add(STOOL_PLAID.get());
        cullouts.add(TABLE_PLAID.get());
        
        cullouts.add(CREST.get());
        cullouts.add(GEAR.get());

        cullouts.add(SMALL_CACTUS.get());
        cullouts.add(ROSEBUSH.get());
        cullouts.add(BUSH.get());
        cullouts.add(LILACBUSH.get());
        cullouts.add(PEONYBUSH.get());
        cullouts.add(FERNBUSH.get());
        cullouts.add(TAPROOTS.get());
        cullouts.add(REED_BLOCK.get());
        cullouts.add(BUSH_ALIVE.get());
        cullouts.add(HERBS.get());
        cullouts.add(WILD_BEET.get());
        cullouts.add(WILD_POTATO.get());
        cullouts.add(WILD_CARROT.get());
        cullouts.add(WILD_WHEAT.get());
        cullouts.add(WEAPING_SWAMP_WILLOW.get());
        cullouts.add(REDWOOD_SORREL.get());
        cullouts.add(DANDELION_PUFF.get());
        cullouts.add(ROCK_PILE.get());
        cullouts.add(RED_PILE.get());
        cullouts.add(MINER_BUSH.get());
        cullouts.add(ONION.get());
        cullouts.add(SNOW_BUSH.get());
        cullouts.add(SNOW_ROCK_PILE.get());
        cullouts.add(MOSSY_VINE.get());
        cullouts.add(MOSSY_VINE_PLANT.get());
        cullouts.add(JUNGLE_BUSH.get());
        cullouts.add(SWAMP_BUSH.get());
        cullouts.add(JUNGLE_CAP.get());
        cullouts.add(SPROUT.get());
        cullouts.add(SWAMP_RIBBON.get());
        cullouts.add(BLACK_DAHLIA.get());
        cullouts.add(LAVENDER.get());
        cullouts.add(LAVENDER_SPRIG.get());
        cullouts.add(ROSE_SPRIG.get());
        cullouts.add(ICE_ROSE.get());
        cullouts.add(ORANGE_FERN.get());
        cullouts.add(ORANGE_BEAUTY.get());
        cullouts.add(APPLE_LEAVES.get());
        cullouts.add(APPLE_SAPLING.get());
        cullouts.add(CROCUS.get());
        cullouts.add(MOREL.get());
        cullouts.add(HEDGE.get());

        cullouts.add(POTTED_ROSE_SPRIG.get());
        //Seed Type Crops
        cullouts.add(PUFF_CROP_BLOCK.get());
        cullouts.add(GB_CROP_BLOCK.get());
        cullouts.add(MANDRAKE_CROP_BLOCK.get());
        cullouts.add(CRYSTAL_CROP_BLOCK.get());

        translucents.add(HANGING.get());
        cullouts.add(HANGING_D.get());
        cullouts.add(HANGING_A.get());
        cullouts.add(HANGING_E.get());

        translucents.add(CRYSTAL.get());

        cullouts.add(ROPE_BRIDGE.get());
        cullouts.add(ROPE_BRIDGE_ANCHOR.get());

        cullouts.add(SCREEN.get());
        cullouts.add(NET.get());
        cullouts.add(IRON_LADDER.get());
        cullouts.add(IRON_LADDER.get());
        cullouts.add(BAMBOO_LADDER.get());
        cullouts.add(OAK_LADDER.get());
        cullouts.add(BIRCH_LADDER.get());
        cullouts.add(DARK_LADDER.get());
        cullouts.add(WARPED_LADDER.get());
        cullouts.add(CRIMSON_LADDER.get());
        cullouts.add(ACACIA_LADDER.get());
        cullouts.add(JUNGLE_LADDER.get());
        cullouts.add(SPRUCE_LADDER.get());

        cullouts.add(ANCHOR.get());

        cullouts.add(SCARE.get());
        cullouts.add(SCARE_HAT.get());
        cullouts.add(SCARE_GLOW.get());
        cullouts.add(SCARE_HAT_GLOW.get());
        cullouts.add(SCARE_HAT_SOUL.get());
        cullouts.add(SCARE_SOUL.get());

        cullouts.add(SCARE_TARGET.get());
        cullouts.add(RARE_MELON.get());
        cullouts.add(RARE_SKELETON.get());
        cullouts.add(RARE_ZOMBIE.get());

        cullouts.add(SNOW.get());

        cullouts.add(SCARE_COPPER.get());
        cullouts.add(SCARE_HAT_COPPER.get());

        cullouts.add(STEW_POT_CAMPFIRE.get());

        cullouts.add(BEVELED_PANE.get());
        cullouts.add(BEVELED_PANE_COPPER.get());
        cullouts.add(BEVELED_PANE_GOLD.get());
        cullouts.add(BEVELED_PANE_NETHERITE.get());
        
        //Amethyst
        translucents.add(BEVELED_PANE_A.get());
        translucents.add(BEVELED_PANE_A_C.get());
        translucents.add(BEVELED_PANE_A_G.get());
        translucents.add(BEVELED_PANE_A_N.get());

        //translucents.add(CAMPFIRE_POT_BLOCK_NORM);
        //translucents.add(CAMPFIRE_POT_BLOCK_SOUL);
        cullouts.add(BRAZIER.get());
        cullouts.add(SOUL_BRAZIER.get());
        cullouts.add(COPPER_BRAZIER.get());

        cullouts.add(STUMP_BROWN.get());
        cullouts.add(STUMP_RED.get());
        cullouts.add(STUMP_MOREL.get());

        cullouts.add(APPLE_LEAVES_EMPTY.get());
        cullouts.add(KEG.get());

        cullouts.add(STUFFY_BROWN.get());
        cullouts.add(STUFFY_WHITE.get());

        cullouts.add(CHAIN_C.get());
        cullouts.add(CHAIN_G.get());
        cullouts.add(CHAIN_N.get());
        
        cullouts.add(GOLEM_R.get());
        cullouts.add(GOLEM_W.get());
        cullouts.add(GOLEM_I.get());
        
        cullouts.add(CAMPFIRE_RING.get());
        
        translucents.add(LOGPILE.get());

        translucents.add(SPIDER_EGG_BLOCK.get());

        // Remapping block's render layer.
        RenderTypeRegistry.register(RenderLayer.getCutout(), cullouts.toArray());
        RenderTypeRegistry.register(RenderLayer.getTranslucent(), translucents.toArray());
    }
}