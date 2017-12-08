/**
 * 
 */
package com.someguyssoftware.metals.block;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * 
 * @author Mark Gottschling on Dec 31, 2016
 *
 */
public class BoneSteelBlock extends Block {
	
	/**
	 * @param material
	 */
	public BoneSteelBlock(Material material) {
		super(material);		
		this.setUnlocalizedName(Metals.MODID + "." + MetalsConfig.boneSteelBlockId);
		this.setRegistryName(MetalsConfig.boneSteelBlockId);
		this.setHardness(3F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);
		
	}
	
	/**
	 * @param material
	 */
	public BoneSteelBlock(Material material, CreativeTabs tab) {
		super(material);		
		this.setUnlocalizedName(Metals.MODID + "." + MetalsConfig.boneSteelBlockId);
		this.setRegistryName(MetalsConfig.steelBlockId);
		this.setCreativeTab(tab);
		this.setHardness(3F);
		this.setSoundType(SoundType.METAL);
		this.setHarvestLevel("pickaxe", 2);
	}

}
