package net.fejifun.fabricmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fejifun.fabricmod.FabricMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PANZIN = FabricItemGroupBuilder.build(
            new Identifier(FabricMod.MOD_ID,"panzin"),() -> new ItemStack(ModItems.PANZIN));
}
