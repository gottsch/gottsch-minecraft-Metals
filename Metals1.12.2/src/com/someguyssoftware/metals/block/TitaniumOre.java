/**
 * 
 */
package com.someguyssoftware.metals.block;

import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Mark Gottschling on Jan 13, 2015
 *
 */
public class TitaniumOre extends Block {
	public static final String NAME = "titanium_ore";
	
	/**
	 * 
	 * @param materialIn
	 */
	public TitaniumOre(Material materialIn) {
		super(materialIn);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 2);
		this.setUnlocalizedName(NAME);
		this.setRegistryName(MetalsConfig.titaniumOreId);

	}

	/**
	 * This is required to process alpha channels in block textures
	 */
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
//        
//    	if (Minecraft.isFancyGraphicsEnabled()) {
//    		return BlockRenderLayer.TRANSLUCENT;
//    	}
//    	else {
    		return BlockRenderLayer.CUTOUT_MIPPED;
//    	}
    }
    
    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
    	return false;
    }
    
    /*
     * (non-Javadoc)
     * @see net.minecraft.block.Block#isFullCube(net.minecraft.block.state.IBlockState)
     */    
//    @Override
//    public boolean isFullCube(IBlockState state) {
//    	return false; // TODO was true
//    }
}
