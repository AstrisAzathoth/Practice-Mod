package com.AstrisAzathoth.PracticeMod.objects.blocks;

import com.AstrisAzathoth.PracticeMod.Main;
import com.AstrisAzathoth.PracticeMod.init.ModBlocks;
import com.AstrisAzathoth.PracticeMod.init.ModItems;
import com.AstrisAzathoth.PracticeMod.objects.blocks.item.ItemBlockVariants;
import com.AstrisAzathoth.PracticeMod.util.IHasModel;
import com.AstrisAzathoth.PracticeMod.util.IMetaName;
import com.AstrisAzathoth.PracticeMod.util.handlers.ColorEnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockIce extends Block implements IMetaName, IHasModel
{
	public static final PropertyEnum<ColorEnumHandler.EnumType> VARIANT = PropertyEnum.<ColorEnumHandler.EnumType>create("variant", ColorEnumHandler.EnumType.class);
	
	private String name;
	
	public BlockIce(String name) 
	{
		super(Material.PACKED_ICE);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.GLASS);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, ColorEnumHandler.EnumType.WHITE));
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		this.slipperiness = 0.98F;
		this.name = name;
        this.translucent = true;

		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	
	}
	
    private void initBlockProperties() 
    {
        this.setDefaultSlipperiness(.98F); 
        this.setHardness(0.5F);            
        this.setLightOpacity(3);
    }

	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((ColorEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(ColorEnumHandler.EnumType customblockplanks$enumtype : ColorEnumHandler.EnumType.values())
		{
			items.add(new ItemStack(this, 1, customblockplanks$enumtype.getMeta()));
		}
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, ColorEnumHandler.EnumType.byMetadata(meta));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((ColorEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}

	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return ColorEnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() 
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	   @SideOnly(Side.CLIENT)
	    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
	        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
	        Block block = iblockstate.getBlock();

	        return block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
}

	@Override
	public void registerModels() 
	{
		for(int i = 0; i < ColorEnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "stained_ice_" + ColorEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
}
