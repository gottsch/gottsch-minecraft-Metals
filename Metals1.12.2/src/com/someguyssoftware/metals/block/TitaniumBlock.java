/**
 * 
 */
package com.someguyssoftware.metals.block;

import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author Mark Gottschling on Mar 26, 2014
 *
 */
public class TitaniumBlock extends Block {

	public final static String NAME = "titanium_block";
	
	/**
	 * @param material
	 */
	public TitaniumBlock(Material material) {
		super(material);
		this.setHardness(3F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);				
		this.setUnlocalizedName(NAME);
		this.setRegistryName(MetalsConfig.titaniumBlockId);
	}
	
	/**
	 * 
	 * @param material
	 * @param tab
	 */
	public TitaniumBlock(Material material, CreativeTabs tab) {
		super(material);		
		this.setCreativeTab(tab);
		this.setHardness(3F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);				
		this.setUnlocalizedName(NAME);
		this.setRegistryName(MetalsConfig.titaniumBlockId);
	}

}
