package com.teknoserval.letsmodreboot.init;

import java.util.ArrayList;
import java.util.List;

import com.teknoserval.letsmodreboot.item.ItemGreenPoop;
import com.teknoserval.letsmodreboot.item.ItemLMRB;
import com.teknoserval.letsmodreboot.item.ItemMapleLeaf;

import net.minecraft.item.Item;

public class ModItems {

	
	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final ItemLMRB maple_leaf = new ItemMapleLeaf();
	public static final ItemLMRB green_poop = new ItemGreenPoop();

}
