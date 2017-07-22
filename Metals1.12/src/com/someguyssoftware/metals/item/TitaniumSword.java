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
 * @author Mark
 *
 */
public class TitaniumSword extends ItemSword {
	
	public final static String NAME = "titanium_sword";
	/**
	 * 
	 */
	public TitaniumSword(Item.ToolMaterial material)  {
		super(material);
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.titaniumSwordId);
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
