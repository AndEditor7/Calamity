package io.github.linkle.valleycraft.init.features;

import io.github.linkle.valleycraft.blocks.AppleLeavesBlock;
import io.github.linkle.valleycraft.init.Plants;
import io.github.linkle.valleycraft.utils.SimpleConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class Trees {
	private static final BeehiveTreeDecorator BEES_0002 = new BeehiveTreeDecorator(0.002F);
	private static final BeehiveTreeDecorator BEES_005 = new BeehiveTreeDecorator(0.05F);

	private static final TreeFeatureConfig APPLE_TREE_CONFIG = appleTree().build();
	private static final TreeFeatureConfig APPLE_TREE_BEE_HIVE_005_CONFIG = appleTree().decorators(List.of(BEES_005)).build();

	private static final TreeFeatureConfig FANCY_APPLE_TREE_CONFIG = fancyAppleTree().decorators(List.of()).build();
	private static final TreeFeatureConfig FANCY_APPLE_TREE_BEE_HIVE_0002_CONFIG = fancyAppleTree().decorators(List.of(BEES_0002)).build();
	private static final TreeFeatureConfig FANCY_APPLE_TREE_BEE_HIVE_005_CONFIG = fancyAppleTree().decorators(List.of(BEES_005)).build();
	
	public static ConfiguredFeature<TreeFeatureConfig, ?> APPLE_TREE = Feature.TREE.configure(APPLE_TREE_CONFIG);
	public static ConfiguredFeature<TreeFeatureConfig, ?> APPLE_TREE_BEE_HIVE_005 = Feature.TREE.configure(APPLE_TREE_BEE_HIVE_005_CONFIG);

	public static ConfiguredFeature<TreeFeatureConfig, ?> FANCY_APPLE_TREE = Feature.TREE.configure(FANCY_APPLE_TREE_CONFIG);
	public static ConfiguredFeature<TreeFeatureConfig, ?> FANCY_APPLE_TREE_BEE_HIVE_0002 = Feature.TREE.configure(FANCY_APPLE_TREE_BEE_HIVE_0002_CONFIG);
	public static ConfiguredFeature<TreeFeatureConfig, ?> FANCY_APPLE_TREE_BEE_HIVE_005 = Feature.TREE.configure(FANCY_APPLE_TREE_BEE_HIVE_005_CONFIG);

	public static PlacedFeature APPLE_TREE_CHECKED = APPLE_TREE.withWouldSurviveFilter(Plants.APPLE_SAPLING);
	public static PlacedFeature FANCY_APPLE_TREE_CHECKED = FANCY_APPLE_TREE.withWouldSurviveFilter(Plants.APPLE_SAPLING);
	public static PlacedFeature FANCY_APPLE_TREE_BEE_HIVE_0002_CHECKED = FANCY_APPLE_TREE_BEE_HIVE_0002.withWouldSurviveFilter(Plants.APPLE_SAPLING);

	public static final ConfiguredFeature<RandomFeatureConfig, ?> APPLE_TREES_WINDSWEPT_HILLS = ConfiguredFeatures.register("apple_trees_windswept_hills", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(FANCY_APPLE_TREE_CHECKED, 0.1f)), APPLE_TREE_CHECKED)));
	public static final ConfiguredFeature<RandomFeatureConfig, ?> APPLE_TREES_WATER = ConfiguredFeatures.register("apple_trees_water", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(FANCY_APPLE_TREE_CHECKED, 0.1f)), APPLE_TREE_CHECKED)));
	public static final ConfiguredFeature<RandomFeatureConfig, ?> APPLE_TREES_OAK = ConfiguredFeatures.register("apple_trees_oak", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of( new RandomFeatureEntry(FANCY_APPLE_TREE_BEE_HIVE_0002_CHECKED, 0.1f)), FANCY_APPLE_TREE_BEE_HIVE_0002_CHECKED)));
	public static final ConfiguredFeature<RandomFeatureConfig, ?> APPLE_TREES_PLAINS = ConfiguredFeatures.register("apple_trees_plains", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(FANCY_APPLE_TREE_BEE_HIVE_005.withPlacement(), 0.33333334f)), APPLE_TREE_BEE_HIVE_005.withPlacement())));

	public static final PlacementModifier NOT_IN_SURFACE_WATER_MODIFIER = SurfaceWaterDepthFilterPlacementModifier.of(0);
	public static final PlacedFeature TREES_WINDSWEPT_FOREST = PlacedFeatures.register("apple_trees_windswept_hills_pf", APPLE_TREES_WINDSWEPT_HILLS.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(3, 0.1f, 1))));
	public static final PlacedFeature TREES_WATER_PF = PlacedFeatures.register("apple_trees_water_pf", APPLE_TREES_WATER.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(0, 0.1f, 1))));
	public static final PlacedFeature APPLE_TREES_OAK_PF = PlacedFeatures.register("apple_trees_oak_pf", APPLE_TREES_OAK.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(10, 0.1f, 1))));
	public static final PlacedFeature APPLE_TREES_PLAINS_PF = PlacedFeatures.register("apple_trees_plains_pf", APPLE_TREES_PLAINS.withPlacement(PlacedFeatures.createCountExtraModifier(0, 0.05f, 1), SquarePlacementModifier.of(), NOT_IN_SURFACE_WATER_MODIFIER, PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.getDefaultState(), BlockPos.ORIGIN)), BiomePlacementModifier.of()));
	
	public static void initialize(SimpleConfig config) {
	    if (config.get("disable-features-gen", false)) {
	        return;
	    }

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, BuiltinRegistries.PLACED_FEATURE.getKey(APPLE_TREES_PLAINS_PF).get());
	}

	private static TreeFeatureConfig.Builder appleTree() {
		return new TreeFeatureConfig.Builder(
				BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
				new StraightTrunkPlacer(4, 2, 0),
				new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
						.add(Plants.APPLE_LEAVES.getDefaultState().with(AppleLeavesBlock.HAS_APPLES, false), 3)
						.add(Plants.APPLE_LEAVES.getDefaultState().with(AppleLeavesBlock.HAS_APPLES, true), 1)
				), new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
				new TwoLayersFeatureSize(1, 0, 1)
		);
	}

	private static TreeFeatureConfig.Builder fancyAppleTree() {
		return new TreeFeatureConfig.Builder(
				BlockStateProvider.of(Blocks.OAK_LOG.getDefaultState()),
				new LargeOakTrunkPlacer(3, 11, 0),
				new WeightedBlockStateProvider(new DataPool.Builder<BlockState>()
						.add(Plants.APPLE_LEAVES.getDefaultState().with(AppleLeavesBlock.HAS_APPLES, false), 3)
						.add(Plants.APPLE_LEAVES.getDefaultState().with(AppleLeavesBlock.HAS_APPLES, true), 1)
				), new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
				new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
		);
	}

}