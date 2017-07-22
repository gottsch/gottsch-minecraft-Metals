/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;

/**
 * 
 * @author Mark Gottschling on Oct 3, 2014
 *
 */
public class MetalsTabItem extends Item {
	
	public MetalsTabItem() {
		super();
		setRegistryName(MetalsConfig.metalsTabId);
	}
}
