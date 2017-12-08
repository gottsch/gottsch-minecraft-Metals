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
public class SteelBlock extends Block {

	public final static String NAME = "steel_block";
	
	/**
	 * @param material
	 */
	public SteelBlock(Material material) {
		super(material);		
		this.setUnlocalizedName(NAME);
		this.setRegistryName(MetalsConfig.steelBlockId);
		this.setHardness(3F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);
		
	}
	
	/**
	 * @param material
	 */
	public SteelBlock(Material material, CreativeTabs tab) {
		super(material);		
		this.setUnlocalizedName(NAME);
		this.setRegistryName(MetalsConfig.steelBlockId);
		this.setCreativeTab(tab);
		this.setHardness(3F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);
	}

}
