package com.commandoduck.modTest;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="modTest",name = "modTest", version = "1.7.2-1.0" )

public class modTest {
	
	@Mod.Instance("modTest")
	public static modTest instance;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void posinit(FMLPostInitializationEvent event)
	{
		
	}
}
