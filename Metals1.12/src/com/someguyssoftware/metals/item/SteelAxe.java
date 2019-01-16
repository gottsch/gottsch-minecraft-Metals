/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * 
 * @author Mark Gottschling on Mar 25, 2014
 *
 */
public class SteelAxe extends MetalsAxe {

	/**
	 * 
	 */
	public SteelAxe(Item.ToolMaterial material)  {
		super(material);
		this.attackDamage = 8F;
		this.attackSpeed = -3.1F;
		setCreativeTab(Metals.METALS_TAB);
		setItemName(Metals.MODID, MetalsConfig.steelAxeId);
	}

    /**
     * Return whether this item is repairable in an anvil.
     */
	@Override
	public boolean getIsRepairable(ItemStack itemToRepair, ItemStack resourceItem)
    {
		if (itemToRepair.isItemDamaged()) {
			if (resourceItem.getItem().getUnlocalizedName().equals(MetalsItems.STEEL_INGOT.getUnlocalizedName())) {
				return true;
			}       
		}
		return false;
    }
}
