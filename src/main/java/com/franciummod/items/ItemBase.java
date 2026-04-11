package com.franciummod.items;

import com.franciummod.FranciumMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ItemBase extends Item {

    public final String regName;

    public ItemBase(String registryName, String displayName) {
        super();
        this.regName = registryName;
    }

    @SideOnly(Side.CLIENT)
    public void func_94581_a(IIconRegister iconRegister) {
        try {
            Method m = iconRegister.getClass().getMethod("func_94245_a", String.class);
            IIcon icon = (IIcon) m.invoke(iconRegister, "franciummod:" + regName);
            for (Field f : Item.class.getDeclaredFields()) {
                if (f.getType().getName().contains("IIcon") || f.getType().getName().equals("rf")) {
                    f.setAccessible(true);
                    f.set(this, icon);
                }
            }
        } catch (Exception e) {
            System.out.println("FRANCIUMMOD: icon error: " + e);
        }
    }

    // getUnlocalizedName() - obfuscated as func_77658_a
    public String func_77658_a() {
        return "item." + FranciumMod.MODID + "." + regName;
    }

    // getUnlocalizedName(ItemStack) - obfuscated as func_77667_c
    public String func_77667_c(ItemStack stack) {
        return "item." + FranciumMod.MODID + "." + regName;
    }

    @Override
    public String getUnlocalizedName() {
        return "item." + FranciumMod.MODID + "." + regName;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + FranciumMod.MODID + "." + regName;
    }

    public String getRegistryName() {
        return regName;
    }
}
