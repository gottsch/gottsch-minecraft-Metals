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
public class SteelAxe extends ModAxe {

	/**
	 * 
	 * @param material
	 * @param repairItem
	 */
	public SteelAxe(Item.ToolMaterial material, Item repairItem) {
		super(material, repairItem);
		this.attackDamage = 8F;
		this.attackSpeed = -3.1F;
		setCreativeTab(Metals.METALS_TAB);
		setItemName(Metals.MODID, MetalsConfig.steelAxeId);
	}
	
	/**
	 * 
	 * @param modID
	 * @param name
	 * @param material
	 * @param repairItem
	 */
	public SteelAxe(String modID, String name, Item.ToolMaterial material, Item repairItem) {
		super(modID, name, material, repairItem);
		this.attackDamage = 8F;
		this.attackSpeed = -3.1F;
		setCreativeTab(Metals.METALS_TAB);
	}
}
