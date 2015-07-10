package com.johnnynguyenn21.equilox.items;

import com.johnnynguyenn21.equilox.Equilox;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class EquiloxItems {

	public static Item itemDarkIgnot;
	
	public static final void init() {
		itemDarkIgnot = new Item().setUnlocalizedName("itemDarkIgnot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Equilox.MODID + ":item_dark_ignot");
		GameRegistry.registerItem(itemDarkIgnot, "itemDarkIgnot");
	}
}
