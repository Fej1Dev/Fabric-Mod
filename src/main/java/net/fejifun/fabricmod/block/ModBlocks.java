package net.fejifun.fabricmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fejifun.fabricmod.FabricMod;
import net.fejifun.fabricmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PANZIN_BLOCK = registerBlock("panzin_block",
            new Block(FabricBlockSettings.of(Material.METAL).luminance(3).strength(4f).requiresTool()), ModItemGroup.PANZIN);
    public static final Block PANZIN_ORE = registerBlock("panzin_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).luminance(1).strength(4f).requiresTool(), UniformIntProvider.create(5,9)), ModItemGroup.PANZIN);


    public static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK, new Identifier(FabricMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(FabricMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        FabricMod.LOGGER.debug("Registering ModBlocks For " + FabricMod.MOD_ID);
    }
}
