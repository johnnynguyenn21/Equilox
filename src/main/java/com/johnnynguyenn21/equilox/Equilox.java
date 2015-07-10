package com.johnnynguyenn21.equilox; // Shows where the class location is
// Ctrl+Shift+O to import all missing classes

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = Equilox.MODID,
		name = Equilox.MODNAME,
		version = Equilox.VERSION
	)
public class Equilox {

	public static final String MODID = "equilox";
	public static final String MODNAME = "Equilox";
	public static final String VERSION = "1.0";
	
	@Mod.Instance(Equilox.MODID)
	public static Equilox instance;
	
	@SidedProxy(clientSide = "com.johnnynguyenn21.equilox.ClientProxy", serverSide = "com.johnnynguyenn21.equilox.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
