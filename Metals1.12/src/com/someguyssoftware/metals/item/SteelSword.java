/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * 
 * @author Mark Gottschling on Jan 5, 2015
 *
 */
public class SteelSword extends ItemSword {
	
	public final static String NAME = "steel_sword";
	/**
	 * 
	 */
	public SteelSword(Item.ToolMaterial material)  {
		super(material);
		this.setUnlocalizedName(NAME);
		setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.steelSwordId);
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
