package com.teknoserval.letsmodreboot.init;

import java.util.ArrayList;
import java.util.List;

import com.teknoserval.letsmodreboot.block.BlockLMRB;
import com.teknoserval.letsmodreboot.block.GreenPoopBlock;
import com.teknoserval.letsmodreboot.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static final List<BlockLMRB> BLOCKS = new ArrayList<BlockLMRB>();
	
	public static final BlockLMRB GREEN_POOP_BLOCK = new GreenPoopBlock(Material.GRASS);

}
