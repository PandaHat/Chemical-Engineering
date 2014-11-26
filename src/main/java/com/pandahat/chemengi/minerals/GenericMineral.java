package com.pandahat.chemengi.minerals;

import com.pandahat.chemengi.creativetab.ChemicalEngineeringCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GenericMineral extends Block{

	public GenericMineral (Material material, String name) {
		super(material);
		setHardness(0.5f);
		setStepSound(Block.soundTypeStone);
		setBlockName(name);
		setCreativeTab(ChemicalEngineeringCreativeTab.mineralTab);
		setHarvestLevel("pickaxe", 2);
	}
	
}
