package com.johnnynguyenn21.equilox;

import com.johnnynguyenn21.equilox.items.EquiloxItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		EquiloxItems.init();
	}
	
	public void init(FMLInitializationEvent e) {
	}
	
	public void postInit(FMLPostInitializationEvent e) {
	}
}
