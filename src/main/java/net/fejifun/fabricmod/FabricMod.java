package net.fejifun.fabricmod;

import net.fabricmc.api.ModInitializer;
import net.fejifun.fabricmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricMod implements ModInitializer {

    public static final String MOD_ID = "fabric-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
