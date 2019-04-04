package com.teknoserval.letsmodreboot.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static void init(File configFile) {
		
		//Create the configuration object from the given config file
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		
		try {
			
			// Load confg file
			configuration.load();
			
			//Read in properties from configuration file
			configValue = configuration.get(configuration.CATEGORY_GENERAL, "configValue", true, "This is an example of config value").getBoolean();
			
		} catch (Exception e) {
			
			//Log exception
			
		} finally {
			
			//Save config file
			configuration.save();
			
		}
		
		System.out.println(configValue);
		
	}

}
