package com.AstrisAzathoth.PracticeMod.init;

import java.util.ArrayList;
import java.util.List;

import com.AstrisAzathoth.PracticeMod.objects.armor.ArmorBase;
import com.AstrisAzathoth.PracticeMod.objects.items.ItemBase;
import com.AstrisAzathoth.PracticeMod.objects.tools.ToolAxe;
import com.AstrisAzathoth.PracticeMod.objects.tools.ToolHoe;
import com.AstrisAzathoth.PracticeMod.objects.tools.ToolPickaxe;
import com.AstrisAzathoth.PracticeMod.objects.tools.ToolShovel;
import com.AstrisAzathoth.PracticeMod.objects.tools.ToolSword;
import com.AstrisAzathoth.PracticeMod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_SHALE = EnumHelper.addToolMaterial("tool_shale", 2, 375, 6.0F, 2.0F, 22);
	public static final ArmorMaterial ARMOR_SHALE = EnumHelper.addArmorMaterial("armor_shale", Reference.MOD_ID + ":shale", 30, new int[]{2, 5, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Items
	public static final Item SHALE = new ItemBase("shale");
	public static final Item SHALE_SHARDS = new ItemBase("shale_shards");
	//Tools
	public static final Item SHALE_AXE = new ToolAxe("shale_axe", TOOL_SHALE);
	public static final Item SHALE_HOE = new ToolHoe("shale_hoe", TOOL_SHALE);
	public static final Item SHALE_PICKAXE = new ToolPickaxe("shale_pickaxe", TOOL_SHALE);
	public static final Item SHALE_SHOVEL = new ToolShovel("shale_shovel", TOOL_SHALE);
	public static final Item SHALE_SWORD = new ToolSword("shale_sword", TOOL_SHALE);
	//Armor
	public static final Item SHALE_HELMET = new ArmorBase("shale_helmet", ARMOR_SHALE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SHALE_CHESTPLATE = new ArmorBase("shale_chestplate", ARMOR_SHALE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SHALE_LEGGINGS = new ArmorBase("shale_leggings", ARMOR_SHALE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SHALE_BOOTS = new ArmorBase("shale_boots", ARMOR_SHALE, 1, EntityEquipmentSlot.FEET);
}