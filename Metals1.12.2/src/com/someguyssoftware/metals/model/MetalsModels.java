package com.someguyssoftware.metals.model;


import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.block.MetalsBlocks;
import com.someguyssoftware.metals.item.MetalsItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Metals.MODID, value =  Side.CLIENT)
public class MetalsModels {	
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		// TAB
		registerItemModel(MetalsItems.METALS_TAB);
		// AUTIUM		
		registerItemModel(Item.getItemFromBlock(MetalsBlocks.AUTIUM_BLOCK));
		registerItemModel(MetalsItems.AUTIUM_INGOT);
		registerItemModel(MetalsItems.AUTIUM_SWORD);		
		registerItemModel(MetalsItems.AUTIUM_BOOTS);
		registerItemModel(MetalsItems.AUTIUM_CHESTPLATE);
		registerItemModel(MetalsItems.AUTIUM_HELMET);
		registerItemModel(MetalsItems.AUTIUM_LEGGINGS);		
		registerItemModel(MetalsItems.AUTIUM_AXE);
		registerItemModel(MetalsItems.AUTIUM_HOE);
		registerItemModel(MetalsItems.AUTIUM_PICKAXE);
		registerItemModel(MetalsItems.AUTIUM_SPADE);
		// BONE
		registerItemModel(MetalsItems.BONE_SWORD);		
		registerItemModel(MetalsItems.BONE_BOOTS);
		registerItemModel(MetalsItems.BONE_CHESTPLATE);
		registerItemModel(MetalsItems.BONE_HELMET);
		registerItemModel(MetalsItems.BONE_LEGGINGS);
		// BONESTEEL
		registerItemModel(Item.getItemFromBlock(MetalsBlocks.BONESTEEL_BLOCK));
		registerItemModel(MetalsItems.BONESTEEL_INGOT);
		registerItemModel(MetalsItems.BONESTEEL_SWORD);		
		registerItemModel(MetalsItems.BONESTEEL_BOOTS);
		registerItemModel(MetalsItems.BONESTEEL_CHESTPLATE);
		registerItemModel(MetalsItems.BONESTEEL_HELMET);
		registerItemModel(MetalsItems.BONESTEEL_LEGGINGS);
		// STEEL
		registerItemModel(Item.getItemFromBlock(MetalsBlocks.STEEL_BLOCK));
		registerItemModel(MetalsItems.STEEL_INGOT);
		registerItemModel(MetalsItems.STEEL_SWORD);		
		registerItemModel(MetalsItems.STEEL_BOOTS);
		registerItemModel(MetalsItems.STEEL_CHESTPLATE);
		registerItemModel(MetalsItems.STEEL_HELMET);
		registerItemModel(MetalsItems.STEEL_LEGGINGS);		
		registerItemModel(MetalsItems.STEEL_AXE);
		registerItemModel(MetalsItems.STEEL_HOE);
		registerItemModel(MetalsItems.STEEL_PICKAXE);
		registerItemModel(MetalsItems.STEEL_SPADE);
		// TITANIUM
		registerItemModel(Item.getItemFromBlock(MetalsBlocks.TITANIUM_ORE));
		registerItemModel(Item.getItemFromBlock(MetalsBlocks.TITANIUM_BLOCK));
		registerItemModel(MetalsItems.TITANIUM_INGOT);
		registerItemModel(MetalsItems.TITANIUM_SWORD);		
		registerItemModel(MetalsItems.TITANIUM_BOOTS);
		registerItemModel(MetalsItems.TITANIUM_CHESTPLATE);
		registerItemModel(MetalsItems.TITANIUM_HELMET);
		registerItemModel(MetalsItems.TITANIUM_LEGGINGS);		
		registerItemModel(MetalsItems.TITANIUM_AXE);
		registerItemModel(MetalsItems.TITANIUM_HOE);
		registerItemModel(MetalsItems.TITANIUM_PICKAXE);
		registerItemModel(MetalsItems.TITANIUM_SPADE);
	}
	
	/**
	 * Register the default model for an {@link Item}.
	 *
	 * @param item The item
	 */
	private static void registerItemModel(Item item) {
		final ModelResourceLocation location = new ModelResourceLocation(item.getRegistryName(), "inventory");
		ModelLoader.setCustomMeshDefinition(item, MeshDefinitionFix.create(stack -> location));
			
	}
}
