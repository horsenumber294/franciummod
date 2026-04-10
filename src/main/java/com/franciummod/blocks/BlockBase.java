package com.franciummod.blocks;

import com.franciummod.FranciumMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockBase extends Block {

    private final String registryName;

    public BlockBase(String registryName, String displayName, Material material,
                     float hardness, float resistance) {
        super(material);
        this.registryName = registryName;
        setBlockName(FranciumMod.MODID + "." + registryName);
        setBlockTextureName(FranciumMod.MODID + ":" + registryName);
        setCreativeTab(FranciumMod.CREATIVE_TAB);
        setHardness(hardness);
        setResistance(resistance);
    }

    public BlockBase(String registryName, String displayName) {
        this(registryName, displayName, Material.iron, 5.0f, 2000.0f);
    }

    public String getModRegistryName() {
        return registryName;
    }

    public void registerSelf() {
        GameRegistry.registerBlock(this, ItemBlock.class, registryName);
    }
}
