package com.pandahat.chemengi.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class ChemicalEngineeringCreativeTab {
	
	public static CreativeTabs mineralTab = new CreativeTabs("Minerals") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.iron_ore);
		}
	};
	
}
