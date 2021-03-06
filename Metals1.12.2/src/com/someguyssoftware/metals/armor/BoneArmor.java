/**
 * 
 */
package com.someguyssoftware.metals.armor;

import java.util.List;

import com.someguyssoftware.gottschcore.armor.ModArmor;
import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.item.MetalsItems;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

/**
 * @author Mark Gottschling on Dec 28, 2016
 *
 */
public class BoneArmor extends ModArmor {

	/**
	 * 
	 * @param modID
	 * @param name
	 * @param material
	 * @param renderIndex
	 * @param armourType
	 * @param id
	 * @param texture
	 * @param repairItem
	 */
	public BoneArmor(String modID, String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armourType,
			String texture, Item repairItem) {
		super(modID, name, material, renderIndex, armourType, texture, repairItem);
	}

	/**
	 * 
	 */
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		// if wearing a full set of bone armor
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == MetalsItems.BONE_HELMET
		        && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == MetalsItems.BONE_CHESTPLATE
		        && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == MetalsItems.BONE_LEGGINGS
		        && player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == MetalsItems.BONE_BOOTS) {
			// add fire resistance
			if ((player.getActivePotionEffect(Metals.boneFireResistancePotion) == null ||
					player.getActivePotionEffect(Metals.boneFireResistancePotion).getDuration() <= 1)) {
				player.addPotionEffect(new PotionEffect(Metals.boneFireResistancePotion, 3600, 0, false, false));
			}
		}
		else {
			if (player.getActivePotionEffect(Metals.boneFireResistancePotion) != null) {
				// remove potion effect
				player.removeActivePotionEffect(Metals.boneFireResistancePotion);
			}
		}		
	}

	/**
	 * 
	 */
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		// TODO Auto-generated method stub
		super.addInformation(stack, worldIn, tooltip, flagIn);
		StringBuilder builder = new StringBuilder();
		builder
			.append(TextFormatting.WHITE)
			.append("Full set enables ")
			.append(TextFormatting.DARK_RED)
			.append("Fire Resistence Level I.");			
			tooltip.add(builder.toString());
	}
}
