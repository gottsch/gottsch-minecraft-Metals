/**
 * 
 */
package com.someguyssoftware.metals.armor;

import java.util.List;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.item.MetalsItems;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

/**
 * @author Mark Gottschling on Dec 28, 2016
 *
 */
public class BoneArmor extends MetalsArmor {

	/**
	 * @param material
	 * @param renderIndex Used on RenderPlayer to select the correspondent armor to be rendered on the player: 0 is cloth, 1 is chain, 2 is iron, 3 is diamond and 4 is gold.
	 * @param armourType Stores the armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots
	 */
	public BoneArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armourType,
			String id, String texture, String repairUnlocalizedName) {
		super(material, renderIndex, armourType, id, texture, repairUnlocalizedName);
	}

	/**
	 * 
	 */
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		// if wearing a full set of bone armor
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == MetalsItems.BONE_HELMET
		        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == MetalsItems.BONE_CHESTPLATE
		        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == MetalsItems.BONE_LEGGINGS
		        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == MetalsItems.BONE_BOOTS) {
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
