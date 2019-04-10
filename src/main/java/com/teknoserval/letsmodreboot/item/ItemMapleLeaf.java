
package com.teknoserval.letsmodreboot.item;

import com.teknoserval.letsmodreboot.LetsModReboot;
import com.teknoserval.letsmodreboot.creativetab.CreativeTabLMRB;
import com.teknoserval.letsmodreboot.init.ModItems;
import com.teknoserval.letsmodreboot.utility.IHasModel;

import net.minecraft.creativetab.CreativeTabs;

public class ItemMapleLeaf extends ItemLMRB implements IHasModel {

	public ItemMapleLeaf() {

		setUnlocalizedName("maple_leaf");
		setRegistryName("maple_leaf");
		setCreativeTab(CreativeTabLMRB.LMRB_TAB);
		
		ModItems.ITEMS.add(this);

	}
	
	@Override
	public void registerModels() {

		LetsModReboot.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
