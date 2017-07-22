/**
 * 
 */
package com.someguyssoftware.metals.armor;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;
import com.someguyssoftware.metals.item.MetalsItems;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * @author Mark Gottschling on Mar 25, 2014
 *
 */
public class SteelHelmet extends ItemArmor {
	
	public final static String NAME = "steel_helmet";
	
	/**
	 * @param material
	 * @param renderIndex Used on RenderPlayer to select the correspondent armor to be rendered on the player: 0 is cloth, 1 is chain, 2 is iron, 3 is diamond and 4 is gold.
	 * @param armourType Stores the armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots
	 */
	public SteelHelmet(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armourType) {
		super(material, renderIndex, armourType);
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.steelHelmetId);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Metals.MODID + ":textures/models/armor/steel_layer_1.png";
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
