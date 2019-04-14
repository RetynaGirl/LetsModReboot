package com.teknoserval.letsmodreboot.creativetab;

import com.teknoserval.letsmodreboot.init.ModItems;
import com.teknoserval.letsmodreboot.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabLMRB {

	public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

		@Override
		public ItemStack getTabIconItem() {

			return new ItemStack(ModItems.green_poop);
		}
		
		

	};

}
