package com.franciummod.items;

import com.franciummod.FranciumMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    private final String registryName;

    public ItemBase(String registryName, String displayName) {
        this.registryName = registryName;
        setUnlocalizedName(FranciumMod.MODID + "." + registryName);
        setTextureName(FranciumMod.MODID + ":" + registryName);
        setCreativeTab(FranciumMod.CREATIVE_TAB);
    }

    public String getRegistryName() {
        return registryName;
    }
}
