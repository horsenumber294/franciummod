package com.franciummod;

import com.franciummod.blocks.ModBlocks;
import com.franciummod.items.ModItems;
import com.franciummod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FranciumMod.MODID, name = FranciumMod.NAME, version = FranciumMod.VERSION,
     dependencies = "required-after:hbm")
public class FranciumMod {

    public static final String MODID   = "franciummod";
    public static final String NAME    = "Francium Mod";
    public static final String VERSION = "1.0.0";

    @Instance(MODID)
    public static FranciumMod instance;

    @SidedProxy(
        clientSide = "com.franciummod.proxy.ClientProxy",
        serverSide = "com.franciummod.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    public static CreativeTabs CREATIVE_TAB = null;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.register();
        ModBlocks.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }
}
