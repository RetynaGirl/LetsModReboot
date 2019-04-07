package com.teknoserval.letsmodreboot.block;

import com.teknoserval.letsmodreboot.LetsModReboot;
import com.teknoserval.letsmodreboot.init.ModBlocks;
import com.teknoserval.letsmodreboot.init.ModItems;
import com.teknoserval.letsmodreboot.item.ItemLMRB;
import com.teknoserval.letsmodreboot.utility.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockLMRB extends Block implements IHasModel {

	public BlockLMRB(Material material) {

		super(material);
/*
		String name = "";

		setUnlocalizedName(name);
		setRegistryName(name);
*/		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

//		ModBlocks.BLOCKS.add(this);
//		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}

	

	@Override
	public void registerModels() {

		LetsModReboot.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

	}

}
