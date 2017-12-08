 /**
 * 
 */
package com.someguyssoftware.metals.worldgen;

import java.util.Random;

import com.someguyssoftware.metals.block.MetalsBlocks;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

/**
 * @author Mark Gottschling on Mar 26, 2014
 *
 */
public class MetalsWorldGenerator implements IWorldGenerator {
	
	private  WorldGenMinable generator;
	private int chunksSinceLastOre = 0;
	
	
	/**
	 * 
	 */
	public MetalsWorldGenerator(){		
		 generator = new WorldGenMinable(MetalsBlocks.TITANIUM_ORE.getDefaultState(), MetalsConfig.titaniumOreVeinSize);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()){
		case 0:
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		    break;
	    default:
	    	break;
		}
	}		


	/**
	 * 
	 * @param world
	 * @param random
	 * @param i
	 * @param j
	 */
	private void generateSurface(World world, Random random, int i, int j) {
		
		// increment the chunk count
		chunksSinceLastOre++;
		
		if (chunksSinceLastOre >= MetalsConfig.minChunksPerTitaniumOreVein) {
			for (int veinIndex = 0; veinIndex < MetalsConfig.titaniumOreVeinsPerChunk -1; veinIndex++) {
				int titaniumXCoord = i + random.nextInt(16);
				int titaniumYCoord = random.nextInt(MetalsConfig.titaniumOreMaxY) + MetalsConfig.titaniumOreMinY; // generates between level 7 and 77
				int titaniumZCoord = j + random.nextInt(16);
	 
				generator.generate(world, random, new BlockPos(titaniumXCoord, titaniumYCoord, titaniumZCoord));
			}
			// reset count
			chunksSinceLastOre = 0;
		}
	}
	
	/**
	 * 
	 * @param world
	 * @param random
	 * @param i
	 * @param j
	 */
	@SuppressWarnings("unused")
	private void generateNether(World world, Random random, int i, int j) {}
	
	/**
	 * 
	 * @param world
	 * @param random
	 * @param i
	 * @param j
	 */
	@SuppressWarnings("unused")
	private void generateEnd(World world, Random random, int i, int j) {}


}
