/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.gottschcore.item.ModAxe;
import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;


/**
 * 
 * @author Mark Gottschling on Mar 25, 2014
 *
 */
public class TitaniumAxe extends ModAxe {

	/**
	 * 
	 * @param material
	 * @param repairItem
	 */
	public TitaniumAxe(Item.ToolMaterial material, Item repairItem) {
		super(material, repairItem);
		this.attackDamage = 8F;
		this.attackSpeed = -3.1F;
		setCreativeTab(Metals.METALS_TAB);
		setItemName(Metals.MODID, MetalsConfig.titaniumAxeId);
	}
	
	/**
	 * 
	 * @param modID
	 * @param name
	 * @param material
	 * @param repairItem
	 */
	public TitaniumAxe(String modID, String name, Item.ToolMaterial material, Item repairItem) {
		super(modID, name, material, repairItem);
		this.attackDamage = 8F;
		this.attackSpeed = -3.1F;
		setCreativeTab(Metals.METALS_TAB);
	}

}
