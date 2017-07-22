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
	
	public final static String NAME = "steel_axe";
	
	/**
	 * 
	 */
	public SteelAxe(Item.ToolMaterial material)  {
		super(material);
		this.damageVsEntity = 8F;
		this.attackSpeed = -3.1F;
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.steelAxeId);
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
