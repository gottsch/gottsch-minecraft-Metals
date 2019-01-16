/**
 * 
 */
package com.someguyssoftware.metals.eventhandler;

import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.item.MetalsItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author Mark Gottschling on Dec 30, 2016
 *
 */
@Mod.EventBusSubscriber(modid=Metals.MODID)
public class EntityEventHandler {

	@SubscribeEvent
	public static void onPlayerHurtEvent(LivingHurtEvent event) {
		if (!event.getEntityLiving().getEntityWorld().isRemote) {
			// if the player is being hurt
			if (event.getEntityLiving() instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.getEntityLiving();
				Entity attacker = event.getSource().getTrueSource();
				// if the attacker is a skeleton
				if (attacker instanceof EntitySkeleton || attacker instanceof EntitySkeletonHorse) {
					// if the player is wearing a full set of bone armor
					if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == MetalsItems.BONE_HELMET
					        && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == MetalsItems.BONE_CHESTPLATE
					        && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == MetalsItems.BONE_LEGGINGS
					        && player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == MetalsItems.BONE_BOOTS) {
						
						Metals.logger.debug("Attempting to reduce damage by 25%");
						event.setAmount(event.getAmount() - event.getAmount()*0.25F);
					}
					else if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == MetalsItems.BONESTEEL_HELMET
					        && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == MetalsItems.BONESTEEL_CHESTPLATE
					        && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == MetalsItems.BONESTEEL_LEGGINGS
					        && player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == MetalsItems.BONESTEEL_BOOTS) {

						Metals.logger.debug("Attempting to reduce damage by 50%");
						event.setAmount(event.getAmount() - event.getAmount()*0.5F);
					}
				}
			}			
		}
	}
}
