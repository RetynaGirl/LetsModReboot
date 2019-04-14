package com.teknoserval.letsmodreboot;

import com.teknoserval.letsmodreboot.handler.ConfigHandler;
import com.teknoserval.letsmodreboot.handler.KeyInputEventHandler;
import com.teknoserval.letsmodreboot.init.ModRecipes;
import com.teknoserval.letsmodreboot.proxy.CommonProxy;
import com.teknoserval.letsmodreboot.reference.Reference;
import com.teknoserval.letsmodreboot.utility.LogHelper;

import net.minecraftforge.common.MinecraftForge;
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
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {

		ConfigHandler.init(event.getSuggestedConfigurationFile());
		MinecraftForge.EVENT_BUS.register(new ConfigHandler());

		proxy.registerKeyBindings();

		LogHelper.debug("Preinitialization Complete");

	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {

		ModRecipes.init();

		MinecraftForge.EVENT_BUS.register(new KeyInputEventHandler());

		LogHelper.debug("Initialization Complete");

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

		LogHelper.debug("Postinitialization Complete");

	}

}
