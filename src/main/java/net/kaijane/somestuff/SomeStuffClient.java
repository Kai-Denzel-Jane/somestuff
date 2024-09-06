package net.kaijane.somestuff;


import net.fabricmc.api.ClientModInitializer;

public class SomeStuffClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SomeStuff.LOGGER.info("Hello Fabric world! (client)");
    }
}
