/**
 * 
 */
package com.someguyssoftware.metals.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

/**
 * 
 * @author Mark Gottschling on Mar 27, 2014
 *
 */
public class AutiumSword extends ItemSword {
		
	public final static String NAME = "autium_sword";
	/**
	 * 
	 */
	public AutiumSword(Item.ToolMaterial material)  {
		super(material);
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.autiumSwordId);
	}


    /**
     * Return whether this item is repairable in an anvil.
     */
	@Override
	public boolean getIsRepairable(ItemStack itemToRepair, ItemStack resourceItem)
    {
		// return this.field_150933_b.func_150995_f() == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
		//return resourceItem.isItemEqual(new ItemStack(Autium.autiumIngot, 3)) || super.getIsRepairable(itemToRepair, resourceItem);
		
		if (itemToRepair.isItemDamaged()) {
			if (resourceItem.getItem().getUnlocalizedName().equals(MetalsItems.AUTIUM_INGOT.getUnlocalizedName())) {
				return true;
			}       
		}
		return false;
    }
}
