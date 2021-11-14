package net.linkle.valley.Registry.Initializers;

import net.linkle.valley.ValleyMain;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;

import static net.linkle.valley.Registry.Initializers.Plants.ROSE_SPRIG;
import static net.linkle.valley.Registry.Utils.Util.registerBlock;
import static net.minecraft.block.Blocks.POTTED_POPPY;

import dev.architectury.registry.registries.RegistrySupplier;

public class PotBlock {

    public static final RegistrySupplier<Block> POTTED_ROSE_SPRIG = registerBlock("potted_single_rose", () -> new FlowerPotBlock(ROSE_SPRIG.get(), Block.Settings.copy(POTTED_POPPY)));

    public static void initialize() {
        ValleyMain.LOGGER.info("PotBlock blocks has been initialized");
    }
}
