package io.github.linkle.valleycraft.blocks.sapling;

import io.github.linkle.valleycraft.init.features.Trees;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;

public class AppleSaplingGen extends SaplingGenerator {
	
    @Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
		if (random.nextInt(10) == 0) {
			return bees ? Trees.FANCY_APPLE_TREE_BEE_HIVE_005 : Trees.FANCY_APPLE_TREE;
		} else {
			return bees ? Trees.APPLE_TREE_BEE_HIVE_005 : Trees.APPLE_TREE;
		}
	}

}