package net.linkle.valley.forge;

import java.util.ArrayList;
import java.util.List;

import dev.architectury.platform.forge.EventBuses;
import net.linkle.valley.ValleyMain;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ValleyMain.MOD_ID)
public class ValleyForge {
    public static final List<Runnable> RUNS = new ArrayList<>(100);
    
    public ValleyForge() {
        var event = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(ValleyMain.MOD_ID, event);
        ValleyMain.init();
        event.addListener(ValleyForge::run);
    }
    
    private static void run(FMLCommonSetupEvent event) {
        RUNS.forEach(event::enqueueWork);
    }
}
