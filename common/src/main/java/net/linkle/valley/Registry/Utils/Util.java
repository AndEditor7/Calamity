package net.linkle.valley.Registry.Utils;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import dev.architectury.registry.registries.RegistrySupplier;
import net.linkle.valley.Registry.Registies;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;

public class Util {
    public static RegistrySupplier<Item> registerItem(String ID, Supplier<Item> item) {
        return Registies.register(ID, item, Item.class);
    }
    
    public static RegistrySupplier<Block> registerBlock(String ID, Supplier<Block> block) {
        return Registies.register(ID, block, Block.class);
    }
    
    public static RegistrySupplier<Block> registerWithItem(String ID, Supplier<Block> block, Item.Settings settings) {
        var supplier = registerBlock(ID, block);
        if (settings == null) {
            System.out.println("Null found!");
        }
        registerItem(ID, () -> new BlockItem(supplier.get(), settings));
        return supplier;
    }
    
    public static boolean inWater(ItemPlacementContext context) {
        var state = context.getWorld().getFluidState(context.getBlockPos());
        return state.getFluid() == Fluids.WATER;
    }
    
    public static ToIntFunction<BlockState> toInt(int a) {
        return s -> a;
    }
}
