package com.teknoserval.letsmodreboot.item;

import com.teknoserval.letsmodreboot.LetsModReboot;
import com.teknoserval.letsmodreboot.creativetab.CreativeTabLMRB;
import com.teknoserval.letsmodreboot.init.ModItems;
import com.teknoserval.letsmodreboot.utility.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGreenPoop extends ItemLMRB implements IHasModel {

	public ItemGreenPoop() {
		
		String name = "green_poop";

		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabLMRB.LMRB_TAB);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {

		LetsModReboot.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	

}