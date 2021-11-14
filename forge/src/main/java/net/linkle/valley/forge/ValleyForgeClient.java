package net.linkle.valley.forge;

import net.linkle.valley.ValleyClient;
import net.linkle.valley.ValleyMain;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = ValleyMain.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ValleyForgeClient {
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(ValleyClient::init);
    }
}
