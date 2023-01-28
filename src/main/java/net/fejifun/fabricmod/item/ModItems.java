package net.fejifun.fabricmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fejifun.fabricmod.FabricMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_PANZIN = registerItem("raw_panzin",
            new Item(new FabricItemSettings().group(ModItemGroup.PANZIN)));
    public static final Item PANZIN = registerItem("panzin",
            new Item(new FabricItemSettings().group(ModItemGroup.PANZIN)));
    public static final Item HEATED_PANZIN = registerItem("heated_panzin",
            new Item(new FabricItemSettings().group(ModItemGroup.PANZIN)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FabricMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FabricMod.LOGGER.debug("Registering Mod Items for " + FabricMod.MOD_ID);
    }

}
