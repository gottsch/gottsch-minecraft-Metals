/**
 * 
 */
package com.someguyssoftware.metals.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

/**
 * 
 * @author Mark Gottschling on Mar 27, 2014
 *
 */
public class AutiumPickaxe extends ItemPickaxe {
	
	public final static String NAME = "autium_pickaxe";
	
	/**
	 * 
	 */
	public AutiumPickaxe(Item.ToolMaterial material)  {
		super(material);
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.autiumPickaxeId);
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
