package com.cillow.customstuff.blocks;

import com.cillow.customstuff.CustomStuff;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static final Block LAMP = new Block(FabricBlockSettings.create().luminance(100));

    private static void registerBlockItems() {
        Registry.register(Registries.BLOCK, new Identifier(CustomStuff.MOD_ID, "lamp"), LAMP);
        Registry.register(Registries.ITEM, new Identifier(CustomStuff.MOD_ID, "lamp"),
                new BlockItem(LAMP, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CustomStuff.LOGGER.info("Registering ModBlocks for " + CustomStuff.MOD_ID);
        registerBlockItems();
    }
}
