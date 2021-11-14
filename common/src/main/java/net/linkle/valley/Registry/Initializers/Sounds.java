package net.linkle.valley.Registry.Initializers;

import dev.architectury.registry.registries.RegistrySupplier;
import net.linkle.valley.ValleyMain;
import net.linkle.valley.Registry.Registies;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class Sounds {
    public static final RegistrySupplier<SoundEvent> DUCK_QUACK = newSound("duck_quack");
    
    public static void initialize() {
        ValleyMain.LOGGER.info("Sounds has been initialized");
    }
    
    private static RegistrySupplier<SoundEvent> newSound(String ID) {
        return Registies.register(ID, () -> new SoundEvent(new Identifier(ValleyMain.MOD_ID, ID)), SoundEvent.class);
    }
}
