package com.AstrisAzathoth.PracticeMod.objects.fluids;

import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidEssence extends Fluid{

	public FluidEssence(String fluidName, ResourceLocation still, ResourceLocation flowing, Color blue) {
		super("essence", still, flowing);
		setLuminosity(5);
		setDensity(1100);
		setTemperature(300);
		setViscosity(1000);
		setBlock(null);
		setColor(0255255);
	}
	

}
