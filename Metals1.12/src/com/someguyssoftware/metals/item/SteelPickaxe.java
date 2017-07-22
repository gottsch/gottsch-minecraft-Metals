/**
 * 
 */
package com.someguyssoftware.metals.item;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * 
 * @author Mark Gottschling on Jan 5, 2015
 *
 */
public class SteelPickaxe extends ItemPickaxe {
	
	public final static String NAME = "steel_pickaxe";
	
	/**
	 * 
	 */
	public SteelPickaxe(Item.ToolMaterial material)  {
		super(material);
		this.setUnlocalizedName(NAME);
		setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.steelPickaxeId);
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
