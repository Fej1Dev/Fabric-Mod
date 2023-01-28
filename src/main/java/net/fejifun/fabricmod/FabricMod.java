package net.fejifun.fabricmod;

import net.fabricmc.api.ModInitializer;
import net.fejifun.fabricmod.block.ModBlocks;
import net.fejifun.fabricmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricMod implements ModInitializer {

    public static final String MOD_ID = "fabricmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
