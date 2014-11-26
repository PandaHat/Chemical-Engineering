package com.pandahat.chemengi.minerals;

import com.pandahat.chemengi.creativetab.ChemicalEngineeringCreativeTab;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

public final class MineralLoader {
	
	private final static Block bauxite = new GenericMineral(Material.rock, "bauxite");
	private final static Block gibbsite = new GenericMineral(Material.rock, "gibbsite");
	
	// Load blocks into Minecraft
	public static void setupMinerals () {
		GameRegistry.registerBlock(bauxite, "bauxite");
		GameRegistry.registerBlock(gibbsite, "gibbsite");
	}
	
}
