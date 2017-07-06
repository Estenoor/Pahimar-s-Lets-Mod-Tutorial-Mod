package com.SamzFerg.letsmodreboot.handler;

import java.io.File;

import com.SamzFerg.letsmodreboot.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static Configuration configuration;

	public static boolean TestValue = false;

	public static void init(File configFile)
	{
		//Create the configuration object from giving configuration file
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
		}

	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}



	public void loadConfiguration()
	{
		//Read in properties from configuration file
		TestValue = configuration.getBoolean(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value");

		//Save the configuration file
		if(configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
