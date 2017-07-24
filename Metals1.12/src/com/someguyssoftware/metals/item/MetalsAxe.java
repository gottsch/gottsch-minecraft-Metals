/**
 * 
 */
package com.someguyssoftware.metals.item;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

/**
 * @author Mark Gottschling on Jul 8, 2016
 *
 */
public class MetalsAxe extends ItemTool {
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] { Blocks.PLANKS, Blocks.BOOKSHELF,
			Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK,
			Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});

	/**
	 * 
	 * @param material
	 */
	public MetalsAxe(Item.ToolMaterial material) {
		super(material, EFFECTIVE_ON);
	}

	/**
	 * 
	 */
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
				? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
	}
	
	/**
	 * Set the registry name of {@code this ItemArmor} to {@code name} and the unlocalised name to the full registry name.
	 * @param modID
	 * @param name
	 */
	public void setItemName(String modID, String name) {
		setRegistryName(modID, name);
		setUnlocalizedName(getRegistryName().toString());
	}
}
