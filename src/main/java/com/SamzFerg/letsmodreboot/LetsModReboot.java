package com.SamzFerg.letsmodreboot;

import com.SamzFerg.letsmodreboot.proxy.IProxy;
import com.SamzFerg.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class LetsModReboot 
{
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = "com.SamzFerg.letsmodreboot.proxy.ClientProxy", serverSide = "com.SamzFerg.letsmodreboot.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
