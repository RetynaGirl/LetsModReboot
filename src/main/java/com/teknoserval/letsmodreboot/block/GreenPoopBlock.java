package com.teknoserval.letsmodreboot.block;

import com.teknoserval.letsmodreboot.LetsModReboot;
import com.teknoserval.letsmodreboot.creativetab.CreativeTabLMRB;
import com.teknoserval.letsmodreboot.init.ModBlocks;
import com.teknoserval.letsmodreboot.init.ModItems;
import com.teknoserval.letsmodreboot.item.ItemLMRB;
import com.teknoserval.letsmodreboot.utility.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class GreenPoopBlock extends BlockLMRB implements IHasModel {
	
	public GreenPoopBlock(Material material) {
		
	super(material);
		
		String name = "green_poop_block";
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabLMRB.LMRB_TAB);
		
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	

	@Override
	public void registerModels() {
		
		LetsModReboot.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
