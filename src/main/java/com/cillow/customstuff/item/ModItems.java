package com.cillow.customstuff.item;

import com.cillow.customstuff.CustomStuff;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LampBlock = registerItem("lamp",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CustomStuff.MOD_ID, name), item);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
                content -> content.addAfter(item, LampBlock));
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(LampBlock);
    }

    public static void registerModItems() {
        CustomStuff.LOGGER.info("Registering Mod Items for " + CustomStuff.MOD_ID);
        addItemsToItemGroup();
    }
}
