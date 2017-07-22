/**
 * 
 */
package com.someguyssoftware.metals.armor;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;
import com.someguyssoftware.metals.item.MetalsItems;

/**
 * @author Mark Gottschling on Mar 25, 2014
 *
 */
public class AutiumBoots extends ItemArmor {
	
	public final static String NAME = "autium_boots";
	
	/**
	 * @param material
	 * @param renderIndex Used on RenderPlayer to select the correspondent armor to be rendered on the player: 0 is cloth, 1 is chain, 2 is iron, 3 is diamond and 4 is gold.
	 * @param armourType Stores the armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots
	 */
	public AutiumBoots(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armourType) {
		super(material, renderIndex, armourType);
		this.setUnlocalizedName(NAME);
		this.setCreativeTab(Metals.METALS_TAB);
		setRegistryName(MetalsConfig.autiumBootsId);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Metals.MODID + ":textures/models/armor/autium_layer_1.png";
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
