package net.linkle.valley.fabric;

import net.fabricmc.api.ModInitializer;
import net.linkle.valley.ValleyMain;

public class ValleyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ValleyMain.init();
    }
}
