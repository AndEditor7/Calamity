package net.linkle.valley.forge;

import dev.architectury.platform.forge.EventBuses;
import net.linkle.valley.ValleyMain;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ValleyMain.MOD_ID)
public class ValleyForge {
    public ValleyForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ValleyMain.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ValleyMain.init();
    }
}
