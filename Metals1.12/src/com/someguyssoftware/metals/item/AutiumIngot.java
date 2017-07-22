/**
 * 
 */
package com.someguyssoftware.metals.item;

import net.minecraft.item.Item;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

/**
 * 
 * @author Mark Gottschling on Mar 27, 2014
 *
 */
public class AutiumIngot extends Item {

	public final static String NAME = "autium_ingot";
	
	public AutiumIngot() {
		super();
		
		// Constructor configuration
		setMaxStackSize(64);
		setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.autiumIngotId);
	}

}
