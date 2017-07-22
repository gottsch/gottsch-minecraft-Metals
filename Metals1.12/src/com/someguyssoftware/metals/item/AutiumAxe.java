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
 * @author Mark Gottschling on Mar 27, 2014
 *
 */
public class AutiumAxe extends MetalsAxe {
	
	public final static String NAME = "autium_axe";
	
	/**
	 * 
	 */
	public AutiumAxe(Item.ToolMaterial material)  {
		super(material);
		this.damageVsEntity = 8F;
		this.attackSpeed = -3F;
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.autiumAxeId);
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
