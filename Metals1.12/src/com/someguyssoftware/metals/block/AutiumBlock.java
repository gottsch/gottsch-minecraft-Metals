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
 * @author Mark Gottschling on Mar 27, 2014
 *
 */
public class AutiumBlock extends Block {

	public final static String NAME = "autium_block";

	/**
	 * 
	 * @param material
	 */
	public AutiumBlock(Material material) {
		super(material);
		this.setHardness(3F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);
				
		this.setUnlocalizedName(NAME);
		this.setRegistryName(MetalsConfig.autiumBlockId);
	}
	
	/**
	 * De-coupled from @mod class.
	 * @param material
	 * @param tab
	 */
	public AutiumBlock(Material material, CreativeTabs tab) {
		super(material);
		
		this.setCreativeTab(tab);
		this.setHardness(3F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);
				
		this.setUnlocalizedName(NAME);
		this.setRegistryName(MetalsConfig.autiumBlockId);
	}

}
