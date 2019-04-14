package com.teknoserval.letsmodreboot.proxy;

import com.teknoserval.letsmodreboot.client.settings.Keybindings;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

	public void registerItemRenderer(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(item.getRegistryName(), string));

	}

	@Override
	public void registerKeyBindings() {
		
		ClientRegistry.registerKeyBinding(Keybindings.charge);
		ClientRegistry.registerKeyBinding(Keybindings.release);
		
	}
	


}
