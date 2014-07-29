package com.amadornes.techquake.init;

import net.minecraft.block.Block;

import com.amadornes.lib.util.AmaUtils;
import com.amadornes.techquake.block.BlockTest;
import com.amadornes.techquake.ref.ModInfo;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ModInfo.MODID)
public class TQBlocks {
	
	public static Block test;
	
	public static void init(){
		test = AmaUtils.registerBlock(new BlockTest());
	}

}
