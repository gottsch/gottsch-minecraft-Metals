/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.gottschcore.item.ModAxe;
import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * 
 * @author Mark Gottschling on Mar 27, 2014
 *
 */
public class AutiumAxe extends ModAxe {

	/**
	 * 
	 * @param material
	 * @param repairItem
	 */
	public AutiumAxe(Item.ToolMaterial material, Item repairItem) {
		super(material, repairItem);
		this.attackDamage = 8F;
		this.attackSpeed = -3F;
		setCreativeTab(Metals.METALS_TAB);
		setItemName(Metals.MODID, MetalsConfig.autiumAxeId);
	}
	
	/**
	 * 
	 * @param modID
	 * @param name
	 * @param material
	 * @param repairItem
	 */
	public AutiumAxe(String modID, String name, Item.ToolMaterial material, Item repairItem) {
		super(modID, name, material, repairItem);
		this.attackDamage = 8F;
		this.attackSpeed = -3F;
		setCreativeTab(Metals.METALS_TAB);
	}
}
