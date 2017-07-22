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
 * @author Mark Gottschling on Mar 26, 2014
 *
 */
@Deprecated
public class TitaniumIngot extends Item {

	public final static String NAME = "titanium_ingot";
	
	public TitaniumIngot() {
		super();		
		setMaxStackSize(64);
		setUnlocalizedName(MetalsConfig.titaniumIngotId);
		setRegistryName(MetalsConfig.titaniumIngotId);		
		setCreativeTab(Metals.METALS_TAB);
	}

    /**
     * Return whether this item is repairable in an anvil.
     */
	@Override
	public boolean getIsRepairable(ItemStack itemToRepair, ItemStack resourceItem)
    {
		if (itemToRepair.isItemDamaged()) {
			if (resourceItem.getItem().getUnlocalizedName().equals(MetalsItems.TITANIUM_INGOT.getUnlocalizedName())) {
				return true;
			}       
		}
		return false;
    }
}
