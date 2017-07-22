/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;

/**
 * 
 * @author Mark Gottschling on Dec 28, 2016
 *
 */
public class MetalsIngot extends Item {
	
	/**
	 * 
	 */
	public MetalsIngot(String id) {
		super();
		setMaxStackSize(64);
		setUnlocalizedName(Metals.MODID + "." + id);
		setRegistryName(id);
		setCreativeTab(Metals.METALS_TAB);
	}

}
