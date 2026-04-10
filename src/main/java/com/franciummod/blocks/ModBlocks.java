package com.franciummod.blocks;

import net.minecraft.block.material.Material;

public class ModBlocks {

    public static BlockBase ptcfcLinedBlock = new BlockBase(
        "ptcfc_lined_block",
        "PTCFC Lined Block",
        Material.iron,
        6.0f,
        3000.0f
    );

    private static final BlockBase[] ALL_BLOCKS = {
        ptcfcLinedBlock,
    };

    public static void register() {
        for (BlockBase block : ALL_BLOCKS) {
            block.registerSelf();
        }
    }
}
