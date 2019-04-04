package com.teknoserval.letsmodreboot;

import com.teknoserval.letsmodreboot.handler.ConfigHandler;
import com.teknoserval.letsmodreboot.proxy.IProxy;
import com.teknoserval.letsmodreboot.reference.Reference;
import com.teknoserval.letsmodreboot.utility.LogHelper;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {
	
	@Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		
		LogHelper.debug("Preinitialization Complete");

	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		LogHelper.debug("Initialization Complete");

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
		LogHelper.debug("Postinitialization Complete");

	}

}
