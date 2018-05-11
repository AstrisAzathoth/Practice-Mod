package com.AstrisAzathoth.PracticeMod.util.handlers;

import net.minecraft.util.IStringSerializable;
import net.minecraft.util.text.TextFormatting;

public class ColorEnumHandler 
{
	public static enum EnumType implements IStringSerializable
	{
		BLACK(0, "black"),
		RED(1, "red"),
		GREEN(2, "green"),
		BROWN(3, "brown"),
		BLUE(4, "blue"),
		PURPLE(5, "purple"),
		CYAN(6, "cyan"),
		SILVER(7, "silver"),
		GRAY(8, "gray"),
		PINK(9, "pink"),
		LIME(10, "lime"),
		YELLOW(11, "yellow"),
		LIGHT_BLUE(12, "light_blue"),
		MAGENTA(13, "magenta"),
		ORANGE(14, "orange"),
		WHITE(15, "white");
		
		
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name)
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocalizedName)
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		public int getMeta()
		{
			return this.meta;
		}
		
		public String getUnlocalizedName()
		{
			return this.unlocalizedName;
		}
		@Override
		public String toString()
		{
			return this.name;
		}
		
		public static EnumType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumType enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}
