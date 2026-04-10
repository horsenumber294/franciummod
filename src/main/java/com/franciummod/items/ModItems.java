package com.franciummod.items;

import com.franciummod.FranciumMod;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item tungstenHexachloride    = new ItemBase("tungsten_hexachloride",     "Tungsten Hexachloride");
    public static Item tungstenCarbyneChloride = new ItemBase("tungsten_carbyne_chloride", "Tungsten Carbyne Chloride");
    public static Item tungstenCarbyneFluoride = new ItemBase("tungsten_carbyne_fluoride", "Tungsten Carbyne Fluoride");
    public static Item ptcfcSheet              = new ItemBase("ptcfc_sheet",               "PTCFC Polymer Sheet");
    public static Item ptcfcPlate              = new ItemBase("ptcfc_plate",               "PTCFC Coated Plate");

    // public static Item stellite100Ingot     = new ItemBase("stellite100_ingot",        "Stellite-100 Ingot");
    // public static Item incoloy908Ingot      = new ItemBase("incoloy908_ingot",         "Incoloy-908 Ingot");

    private static final Item[] ALL_ITEMS = {
        tungstenHexachloride,
        tungstenCarbyneChloride,
        tungstenCarbyneFluoride,
        ptcfcSheet,
        ptcfcPlate,
    };

    public static void register() {
        for (Item item : ALL_ITEMS) {
            String name = ((ItemBase) item).getRegistryName();
            GameRegistry.registerItem(item, name);
        }
    }
}
