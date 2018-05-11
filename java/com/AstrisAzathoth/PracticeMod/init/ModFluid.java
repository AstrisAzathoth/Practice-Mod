package com.AstrisAzathoth.PracticeMod.init;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

	public class ModFluid extends BlockFluidClassic
	{
		public ModFluid(String name, Fluid fluid, Material material) {
			super(fluid, material);
			this.setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.MISC);
	}
		public void setLuminosity(int luminosity) {}
}