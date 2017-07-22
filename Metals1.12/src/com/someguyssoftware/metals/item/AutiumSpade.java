/**
 * 
 */
package com.someguyssoftware.metals.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

/**
 * 
 * @author Mark Gottschling on Mar 25, 2014
 *
 */
public class AutiumSpade extends ItemSpade {
	
	public final static String NAME = "autium_spade";
	
	/**
	 * 
	 */
	public AutiumSpade(Item.ToolMaterial material)  {
		super(material);
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.autiumSpadeId);
	}

    /**
     * Return whether this item is repairable in an anvil.
     */
	@Override
	public boolean getIsRepairable(ItemStack itemToRepair, ItemStack resourceItem)
    {
		if (itemToRepair.isItemDamaged()) {
			if (resourceItem.getItem().getUnlocalizedName().equals(MetalsItems.AUTIUM_INGOT.getUnlocalizedName())) {
				return true;
			}       
		}
		return false;
    }
}
