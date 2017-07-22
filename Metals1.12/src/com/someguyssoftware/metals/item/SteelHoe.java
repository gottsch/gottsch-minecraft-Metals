/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

/**
 * 
 * @author Mark Gottschling on Mar 25, 2014
 *
 */
public class SteelHoe extends ItemHoe {
	
	public final static String NAME = "steel_hoe";
	
	/**
	 * 
	 */
	public SteelHoe(Item.ToolMaterial material)  {
		super(material);
		this.setUnlocalizedName( NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.steelHoeId);
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
