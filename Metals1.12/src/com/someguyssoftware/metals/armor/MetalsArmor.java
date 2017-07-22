/**
 * 
 */
package com.someguyssoftware.metals.armor;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.world.World;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Mark Gottschling on Dec 28, 2016
 *
 */
public class MetalsArmor extends ItemArmor {
	private String texture;
	private String repairUnlocalizedName;
	
	/**
	 * @param material
	 * @param renderIndex Used on RenderPlayer to select the correspondent armor to be rendered on the player: 0 is cloth, 1 is chain, 2 is iron, 3 is diamond and 4 is gold.
	 * @param armourType Stores the armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots
	 */
	public MetalsArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armourType,
			String id, String texture, String repairUnlocalizedName) {
		
		super(material, renderIndex, armourType);
		setUnlocalizedName(Metals.MODID + "." + id);
		setRegistryName(id);
		setTexture(texture);
		setRepairUnlocalizedName(repairUnlocalizedName);
		setCreativeTab(Metals.METALS_TAB);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Metals.MODID + ":" + this.texture;
	}
	
    /**
     * Return whether this item is repairable in an anvil.
     */
	@Override
	public boolean getIsRepairable(ItemStack itemToRepair, ItemStack resourceItem) {
		if (itemToRepair.isItemDamaged()) {
			if (resourceItem.getItem().getUnlocalizedName().equals(this.repairUnlocalizedName)) {
				return true;
			}       
		}
		return false;
    }
	
	/**
	 * @return the texture
	 */
	public String getTexture() {
		return texture;
	}

	/**
	 * @param texture the texture to set
	 */
	private void setTexture(String texture) {
		this.texture = texture;
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
