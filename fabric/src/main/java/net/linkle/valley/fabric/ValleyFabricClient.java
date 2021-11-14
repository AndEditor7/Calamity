package net.linkle.valley.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.linkle.valley.ValleyClient;

@Environment(EnvType.CLIENT)
public class ValleyFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ValleyClient.init();
    }
}
