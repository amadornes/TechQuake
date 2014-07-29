package com.amadornes.techquake;

import java.util.logging.Logger;

import com.amadornes.techquake.init.TQBlocks;
import com.amadornes.techquake.proxy.CommonProxy;
import com.amadornes.techquake.ref.ModInfo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME)
public class TechQuake {

	@Instance(ModInfo.MODID)
	public static TechQuake instance;

	@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy", serverSide = ModInfo.PROXY_LOCATION
			+ ".CommonProxy")
	public static CommonProxy proxy;

	public static Logger log = Logger.getLogger(ModInfo.NAME);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		TQBlocks.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
