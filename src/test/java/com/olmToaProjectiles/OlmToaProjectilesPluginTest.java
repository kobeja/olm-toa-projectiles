package com.olmToaProjectiles;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class OlmToaProjectilesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(OlmToaProjectilesPlugin.class);
		RuneLite.main(args);
	}
}