package net.linkle.valley.Registry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.linkle.valley.ValleyMain;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

public class Registies {
    private static final Map<Class<?>, DeferredRegister<?>> MAP = new LinkedHashMap<>();

    public static void start() {
        create(Registry.BLOCK_KEY, Block.class);
        create(Registry.ITEM_KEY, Item.class);
        create(Registry.SOUND_EVENT_KEY, SoundEvent.class);
    }

    public static void end() {
        MAP.values().forEach(DeferredRegister::register);
    }

    @SuppressWarnings("unchecked")
    public static <T> RegistrySupplier<T> register(String ID, Supplier<T> value, Class<T> clazz) {
        var reg = (DeferredRegister<T>) MAP.get(clazz);
        return reg.register(ID, value);
    }

    private static <T> DeferredRegister<T> create(RegistryKey<Registry<T>> registry, Class<T> clazz) {
        var reg = DeferredRegister.create(ValleyMain.MOD_ID, registry);
        MAP.put(clazz, reg);
        return reg;
    }
}
