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
 * @author Mark Gottschling on Dec 28, 2016
 *
 */
public class MetalsSword extends ItemSword {
	private String repairUnlocalizedName;

	/**
	 * 
	 * @param material
	 * @param id
	 * @param repairName
	 */
	public MetalsSword(Item.ToolMaterial material, String id, String repairName)  {
		super(material);
		this.setUnlocalizedName(Metals.MODID + "." + id);
		this.setRegistryName(id);
		this.setRepairUnlocalizedName(repairName);
		this.setCreativeTab(Metals.METALS_TAB);
	}

    /**
     * Return whether this item is repairable in an anvil.
     */
	@Override
	public boolean getIsRepairable(ItemStack itemToRepair, ItemStack resourceItem)
    {
		if (itemToRepair.isItemDamaged()) {
			if (resourceItem.getItem().getUnlocalizedName().equals(getRepairUnlocalizedName())) {
				return true;
			}       
		}
		return false;
    }
	
	/**
	 * @return the repairUnlocalizedName
	 */
	public String getRepairUnlocalizedName() {
		return repairUnlocalizedName;
	}

	/**
	 * @param repairUnlocalizedName the repairUnlocalizedName to set
	 */
	private void setRepairUnlocalizedName(String repairUnlocalizedName) {
		this.repairUnlocalizedName = repairUnlocalizedName;
	}
}
