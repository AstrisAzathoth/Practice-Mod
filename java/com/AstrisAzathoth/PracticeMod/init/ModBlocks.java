package com.AstrisAzathoth.PracticeMod.init;

import java.util.ArrayList;
import java.util.List;

import com.AstrisAzathoth.PracticeMod.objects.blocks.BlockBase;
import com.AstrisAzathoth.PracticeMod.objects.blocks.BlockIce;
import com.AstrisAzathoth.PracticeMod.objects.blocks.BlockPlank;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
//Building Blocks
	public static final Block SHALE_BLOCK = new BlockBase("shale_block", Material.ROCK);
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block STAINED_ICE = new BlockIce("stained_ice");
	
}
