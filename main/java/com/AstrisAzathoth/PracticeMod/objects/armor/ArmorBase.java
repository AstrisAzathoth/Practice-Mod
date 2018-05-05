package com.AstrisAzathoth.PracticeMod.objects.armor;

import com.AstrisAzathoth.PracticeMod.Main;
import com.AstrisAzathoth.PracticeMod.init.ModItems;
import com.AstrisAzathoth.PracticeMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() 
	{		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
