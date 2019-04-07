package com.teknoserval.letsmodreboot.proxy;

import com.teknoserval.letsmodreboot.item.ItemLMRB;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

	public void registerItemRenderer(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(item.getRegistryName(), string));

	}
	


}
