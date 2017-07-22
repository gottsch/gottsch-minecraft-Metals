/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;

/**
 * 
 * @author Mark Gottschling on Jan 5, 2015
 *
 */
public class SteelIngot extends Item {

	public final static String NAME = "steel_ingot";
	
	public SteelIngot() {
		super();
		
		// Constructor configuration
		setMaxStackSize(64);
		setCreativeTab(Metals.METALS_TAB);
		setUnlocalizedName(NAME);
		setRegistryName(MetalsConfig.steelIngotId);
	}

}
