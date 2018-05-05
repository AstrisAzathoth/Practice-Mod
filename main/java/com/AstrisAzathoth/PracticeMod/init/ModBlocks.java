package com.AstrisAzathoth.PracticeMod.init;

import java.util.ArrayList;
import java.util.List;

import com.AstrisAzathoth.PracticeMod.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SHALE_BLOCK = new BlockBase("shale_block", Material.ROCK);
}