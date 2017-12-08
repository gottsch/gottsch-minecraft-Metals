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
					if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == MetalsItems.BONE_HELMET
					        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == MetalsItems.BONE_CHESTPLATE
					        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == MetalsItems.BONE_LEGGINGS
					        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == MetalsItems.BONE_BOOTS) {
						
						Metals.logger.debug("Attempting to reduce damage by 25%");
						event.setAmount(event.getAmount() - event.getAmount()*0.25F);
					}
					else if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == MetalsItems.BONESTEEL_HELMET
					        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == MetalsItems.BONESTEEL_CHESTPLATE
					        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == MetalsItems.BONESTEEL_LEGGINGS
					        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == MetalsItems.BONESTEEL_BOOTS) {

						Metals.logger.debug("Attempting to reduce damage by 50%");
						event.setAmount(event.getAmount() - event.getAmount()*0.5F);
					}
				}
			}			
		}
	}
}
