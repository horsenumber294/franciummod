package com.franciummod.proxy;

import com.franciummod.blocks.ModBlocks;
import com.franciummod.items.ModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        ModItems.tungstenHexachloride.setTextureName("franciummod:tungsten_hexachloride");
        ModItems.tungstenCarbyneChloride.setTextureName("franciummod:tungsten_carbyne_chloride");
        ModItems.tungstenCarbyneFluoride.setTextureName("franciummod:tungsten_carbyne_fluoride");
        ModItems.ptcfcSheet.setTextureName("franciummod:ptcfc_sheet");
        ModItems.ptcfcPlate.setTextureName("franciummod:ptcfc_plate");
        ModBlocks.ptcfcLinedBlock.setBlockTextureName("franciummod:ptcfc_lined_block");
    }
}
