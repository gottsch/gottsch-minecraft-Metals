/**
 * 
 */
package com.someguyssoftware.metals.potion;

import net.minecraft.potion.Potion;

/**
 * @author Mark Gottschling on Dec 28, 2016
 *
 */
public class MetalsPotion extends Potion {

	/**
	 * @param isBadEffectIn
	 * @param liquidColorIn
	 */
	public MetalsPotion(boolean isBadEffectIn, int liquidColorIn) {
		super(isBadEffectIn, liquidColorIn);
	}

	/* (non-Javadoc)
	 * @see net.minecraft.potion.Potion#setIconIndex(int, int)
	 */
	@Override
	public MetalsPotion setIconIndex(int p_76399_1_, int p_76399_2_) {
		return (MetalsPotion) super.setIconIndex(p_76399_1_, p_76399_2_);
	}
	
	/* (non-Javadoc)
	 * @see net.minecraft.potion.Potion#setPotionName(java.lang.String)
	 */
	@Override
	public MetalsPotion setPotionName(String nameIn) {
		return (MetalsPotion) super.setPotionName(nameIn);
	}
}
