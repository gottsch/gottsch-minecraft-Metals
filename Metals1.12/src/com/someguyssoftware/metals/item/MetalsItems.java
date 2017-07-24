/**
 * 
 */
package com.someguyssoftware.metals.item;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import com.someguyssoftware.gottschcore.armor.ModArmor;
import com.someguyssoftware.gottschcore.armor.ModArmorBuilder;
import com.someguyssoftware.gottschcore.item.ModHoe;
import com.someguyssoftware.gottschcore.item.ModHoeBuilder;
import com.someguyssoftware.gottschcore.item.ModItem;
import com.someguyssoftware.gottschcore.item.ModItemBuilder;
import com.someguyssoftware.gottschcore.item.ModPickaxe;
import com.someguyssoftware.gottschcore.item.ModPickaxeBuilder;
import com.someguyssoftware.gottschcore.item.ModSpade;
import com.someguyssoftware.gottschcore.item.ModSpadeBuilder;
import com.someguyssoftware.gottschcore.item.ModSword;
import com.someguyssoftware.gottschcore.item.ModSwordBuilder;
import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * @author Mark Gottschling on Jul 19, 2017
 *
 */
//@ObjectHolder(Metals.MODID)
public class MetalsItems {
	/*
	 * TOOL MATERIAL CHEAT SHEET
	 * WOOD(0, 59, 2.0F, 0.0F, 15),
     *  STONE(1, 131, 4.0F, 1.0F, 5),
     *  IRON(2, 250, 6.0F, 2.0F, 14),
     *  BONE(2, 200, 6.25F, 2.0F, 16),
     *  STEEL(2, 600, 6.5F, 2.25F, 15),
     *  BONESTEEL(2, 550, 7.0F, 2.25F, 17),
     *  TITANIUM(2, 1300, 7.0F, 2.5F, 12),
     *  AUTIUM(2, 1200, 11.0F, 2.25F, 20),
     *  DIAMOND(3, 1561, 8.0F, 3.0F, 10),
     *  GOLD(0, 32, 12.0F, 0.0F, 22);
	 */
	
	/*
	 * ARMOR MATERIAL CHEAT SHEET
	 * LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
     * CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
     * IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
     * BONE("bone", 17, new int[] { 2, 5, 6, 2 }, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F),
     * STEEL("steel", 22, new int[] { 2, 5, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F),
     * BONESTEEL("bonesteel", 24, new int[] { 2, 6, 6, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F),
     * TITANIUM("titanium", 27, new int[] { 3, 6, 8, 3 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F),
     * AUTIUM("autium", 22, new int[] { 2, 5, 8, 2 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
     * GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
     * DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	 */
	
	/*
	 * DAMAGE REDUCTION INDEXES
	 * FEET(EntityEquipmentSlot.Type.ARMOR, 0, 1, "feet"),
     * LEGS(EntityEquipmentSlot.Type.ARMOR, 1, 2, "legs"),
     * CHEST(EntityEquipmentSlot.Type.ARMOR, 2, 3, "chest"),
     * HEAD(EntityEquipmentSlot.Type.ARMOR, 3, 4, "head");
	 */
	
	/**
	 * NOTE All the {@link Item} properties should be treated as constants as indicated by the uppercase, underscored names,
	 * however, they are not declared {@code final} as true constants should. This is because of the way they are being initialized
	 * ie. a initializer method called from the {@code static} block.
	 */
	
	/*
	 * BONE
	 */
	// weapons/armor
	public static Item BONE_BOOTS;
	public static Item BONE_CHESTPLATE;
	public static Item BONE_HELMET;
	public static Item BONE_LEGGINGS;
	public static Item BONE_SWORD;
	
	/*
	 * STEEL
	 */
	// ingots
	public static Item STEEL_INGOT;

	// tools
	public static Item STEEL_PICKAXE;
	public static Item STEEL_AXE;
	public static Item STEEL_SPADE;
	public static Item STEEL_HOE;

	// weapons/armor
	public static Item STEEL_SWORD;
	public static Item STEEL_BOOTS;
	public static Item STEEL_CHESTPLATE;
	public static Item STEEL_HELMET;
	public static Item STEEL_LEGGINGS;
	
	/*
	 * BONESTEEL
	 */
	// ingots
	public static Item BONESTEEL_INGOT;
	
	// weapons/armor
	public static Item BONESTEEL_BOOTS;
	public static Item BONESTEEL_CHESTPLATE;
	public static Item BONESTEEL_HELMET;
	public static Item BONESTEEL_LEGGINGS;
	public static Item BONESTEEL_SWORD;
	
	/*
	 * TITANIUM
	 */
	// ingots
	public static Item TITANIUM_INGOT;

	// tools
	public static Item TITANIUM_PICKAXE;
	public static Item TITANIUM_AXE;
	public static Item TITANIUM_SPADE;
	public static Item TITANIUM_HOE;

	// armor
	public static ModArmor TITANIUM_BOOTS;
	public static ModArmor TITANIUM_CHESTPLATE;
	public static ModArmor TITANIUM_HELMET;
	public static ModArmor TITANIUM_LEGGINGS;

	// weapons
	public static Item TITANIUM_SWORD;
	
	/*
	 * AUTIUM
	 */
	// ingots
	public static Item AUTIUM_INGOT;

	// tools
	public static Item AUTIUM_PICKAXE;
	public static Item AUTIUM_AXE;
	public static Item AUTIUM_SPADE;
	public static Item AUTIUM_HOE;

	// armor
	public static Item AUTIUM_BOOTS;
	public static Item AUTIUM_CHESTPLATE;
	public static Item AUTIUM_HELMET;
	public static Item AUTIUM_LEGGINGS;

	// weapons
	public static Item AUTIUM_SWORD;	
	
	// tab
	public static Item METALS_TAB;
	
	private static final String BONE_ARMOR_TEXTURE_LAYER1 = "textures/models/armor/bone_layer_1.png";
	private static final String BONE_ARMOR_TEXTURE_LAYER2 = "textures/models/armor/bone_layer_2.png";
	
	private static final String STEEL_ARMOR_TEXTURE_LAYER1 = "textures/models/armor/steel_layer_1.png";
	private static final String STEEL_ARMOR_TEXTURE_LAYER2 = "textures/models/armor/steel_layer_2.png";
	
	private static final String BONESTEEL_ARMOR_TEXTURE_LAYER1 = "textures/models/armor/bone_steel_layer_1.png";
	private static final String BONESTEEL_ARMOR_TEXTURE_LAYER2 = "textures/models/armor/bone_steel_layer_2.png";
	
	private static final String TITANIUM_ARMOR_TEXTURE_LAYER1 = "textures/models/armor/titanium_layer_1.png";
	private static final String TITANIUM_ARMOR_TEXTURE_LAYER2 = "textures/models/armor/titanium_layer_2.png";

	private static final String AUTIUM_ARMOR_TEXTURE_LAYER1 = "textures/models/armor/autium_layer_1.png";
	private static final String AUTIUM_ARMOR_TEXTURE_LAYER2 = "textures/models/armor/autium_layer_2png";
	
	/*
	 * Materials
	 */
	// BONE //
	public static final ToolMaterial BONE_TOOL_MATERIAL = EnumHelper.addToolMaterial("BONE", 2, 200, 6.25F, 2.15F, 15);
	public static final ArmorMaterial BONE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("BONE", Metals.MODID + ":bone", 22,
			new int[] { 2, 5, 6, 2 }, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	// STEEL //
	public static final ToolMaterial STEEL_TOOL_MATERIAL = EnumHelper.addToolMaterial("STEEL", 2, 600, 6.5F, 2.25F, 15);
	public static final ArmorMaterial STEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("STEEL", Metals.MODID + ":steel", 22,
			new int[] { 2, 5, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	
	// BONESTEEL //
	public static final ToolMaterial BONESTEEL_TOOL_MATERIAL = EnumHelper.addToolMaterial("BONESTEEL", 2, 550, 7.0F, 2.25F, 17);
	public static final ArmorMaterial BONESTEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("BONESTEEL", Metals.MODID + ":bonesteel", 24,
			new int[] { 2, 6, 6, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	
	// TITANIUM //
	public static final ToolMaterial TITANIUM_TOOL_MATERIAL = EnumHelper.addToolMaterial("TITANIUM", 2, 1300, 7F, 2.5F, 12);
	public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("TITANIUM", Metals.MODID + ":titanium", 27,
			new int[] { 3, 6, 8, 3 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	
	// AUTIUM //
	public static final ToolMaterial AUTIUM_TOOL_MATERIAL = EnumHelper.addToolMaterial("AUTIUM", 2, 1200, 11.0F, 2.25F, 20);
	public static final ArmorMaterial AUTIUM_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("AUTIUM", Metals.MODID + ":autium", 22,
			new int[] { 2, 5, 8, 2 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
		
	static {		
		/*
		 * Axes have special properties that require their own concrete classes
		 */
		STEEL_AXE = new SteelAxe(STEEL_TOOL_MATERIAL);
		TITANIUM_AXE = new TitaniumAxe(TITANIUM_TOOL_MATERIAL);
		AUTIUM_AXE = new AutiumAxe(AUTIUM_TOOL_MATERIAL);
		
		// TAB
		METALS_TAB = new ModItem().setItemName(Metals.MODID, MetalsConfig.METALS_TAB_ID);
		
		initItems();
		initSwords();
		initTools();
		initArmor();
	}
	
	/**
	 * 
	 */
	public static void initItems() {
		final List<Pair<String, Object[]>> props = new ArrayList<>();
		
		/*
		 *  build item list with properties
		 */
		
		// INGOTS
		props.add(Pair.of("STEEL_INGOT", new Object[] {MetalsConfig.steelIngotId, 64}));
		props.add(Pair.of("BONESTEEL_INGOT", new Object[] {MetalsConfig.boneSteelIngotId, 64}));
		props.add(Pair.of("TITANIUM_INGOT", new Object[] {MetalsConfig.titaniumIngotId, 64}));
		props.add(Pair.of("AUTIUM_INGOT", new Object[] {MetalsConfig.autiumIngotId, 64}));

		// initialize all the items
		ModItemBuilder builder = new ModItemBuilder();
		for (Pair<String, Object[]> pair : props) {	
			Object[] values = pair.getRight();
			
			// build the armor
			ModItem item = builder
				.withModID(Metals.MODID)
				.withName((String)values[0])
				.withStackSize((int)values[1])
				.withCreativeTab(Metals.METALS_TAB)
				.build();
			setPropertyWithReflection(pair.getLeft(), item);
		}
		
		// clear the props lsit
		props.clear();
	}
	
	/**
	 * 
	 */
	public static void initSwords() {
		final List<Pair<String, Object[]>> props = new ArrayList<>();
		
		props.add(Pair.of("BONE_SWORD", new Object[] {MetalsConfig.boneSwordId, BONE_TOOL_MATERIAL, Items.BONE}));
		props.add(Pair.of("STEEL_SWORD", new Object[] {MetalsConfig.steelSwordId, STEEL_TOOL_MATERIAL, STEEL_INGOT}));
		props.add(Pair.of("BONESTEEL_SWORD", new Object[] {MetalsConfig.boneSteelSwordId, BONESTEEL_TOOL_MATERIAL, BONESTEEL_INGOT}));
		props.add(Pair.of("TITANIUM_SWORD", new Object[] {MetalsConfig.titaniumSwordId, TITANIUM_TOOL_MATERIAL, TITANIUM_INGOT}));
		props.add(Pair.of("AUTIUM_SWORD", new Object[] {MetalsConfig.autiumSwordId, AUTIUM_TOOL_MATERIAL, AUTIUM_INGOT}));
		
		// initialize all the items
		ModSwordBuilder builder = new ModSwordBuilder();
		for (Pair<String, Object[]> pair : props) {	
			Object[] values = pair.getRight();
			
			// build the armor
			ModSword sword = builder
				.withModID(Metals.MODID)
				.withName((String)values[0])
				.withMaterial((ToolMaterial)values[1])
				.withRepairItem((Item)values[2])
				.withCreativeTab(Metals.METALS_TAB)
				.build();
			
			setPropertyWithReflection(pair.getLeft(), sword);
		}
		
		// clear the props lsit
		props.clear();
	}
	
	/**
	 * 
	 */
	public static void initTools() {
		final List<Pair<String, Object[]>> props = new ArrayList<>();
		
		props.add(Pair.of("STEEL_HOE", new Object[] {MetalsConfig.steelHoeId, STEEL_TOOL_MATERIAL, STEEL_INGOT}));
		props.add(Pair.of("TITANIUM_HOE", new Object[] {MetalsConfig.titaniumHoeId, TITANIUM_TOOL_MATERIAL, TITANIUM_INGOT}));
		props.add(Pair.of("AUTIUM_HOE", new Object[] {MetalsConfig.autiumHoeId, AUTIUM_TOOL_MATERIAL, AUTIUM_INGOT}));
		
		// initialize all the hoes
		ModHoeBuilder builder = new ModHoeBuilder();
		for (Pair<String, Object[]> pair : props) {	
			Object[] values = pair.getRight();
			
			// build the armor
			ModHoe hoe = builder
				.withModID(Metals.MODID)
				.withName((String)values[0])
				.withMaterial((ToolMaterial)values[1])
				.withRepairItem((Item)values[2])
				.withCreativeTab(Metals.METALS_TAB)
				.build();
			
			setPropertyWithReflection(pair.getLeft(), hoe);
		}
		
		// clear the props lsit
		props.clear();
		
		// setup the props for pickaxes
		props.add(Pair.of("STEEL_PICKAXE", new Object[] {MetalsConfig.steelPickaxeId, STEEL_TOOL_MATERIAL, STEEL_INGOT}));
		props.add(Pair.of("TITANIUM_PICKAXE", new Object[] {MetalsConfig.titaniumPickaxeId, TITANIUM_TOOL_MATERIAL, TITANIUM_INGOT}));
		props.add(Pair.of("AUTIUM_PICKAXE", new Object[] {MetalsConfig.autiumPickaxeId, AUTIUM_TOOL_MATERIAL, AUTIUM_INGOT}));
		
		// initialize all the hoes
		ModPickaxeBuilder builder2 = new ModPickaxeBuilder();
		for (Pair<String, Object[]> pair : props) {	
			Object[] values = pair.getRight();
			
			// build the armor
			ModPickaxe pickaxe = builder2
				.withModID(Metals.MODID)
				.withName((String)values[0])
				.withMaterial((ToolMaterial)values[1])
				.withRepairItem((Item)values[2])
				.withCreativeTab(Metals.METALS_TAB)
				.build();
			
			setPropertyWithReflection(pair.getLeft(), pickaxe);
		}
		
		// clear the props lsit
		props.clear();
		
		// setup the props for spades
		props.add(Pair.of("STEEL_SPADE", new Object[] {MetalsConfig.steelSpadeId, STEEL_TOOL_MATERIAL, STEEL_INGOT}));
		props.add(Pair.of("TITANIUM_SPADE", new Object[] {MetalsConfig.titaniumSpadeId, TITANIUM_TOOL_MATERIAL, TITANIUM_INGOT}));
		props.add(Pair.of("AUTIUM_SPADE", new Object[] {MetalsConfig.autiumSpadeId, AUTIUM_TOOL_MATERIAL, AUTIUM_INGOT}));
		
		// initialize all the hoes
		ModSpadeBuilder builder3 = new ModSpadeBuilder();
		for (Pair<String, Object[]> pair : props) {	
			Object[] values = pair.getRight();
			
			// build the armor
			ModSpade spade = builder3
				.withModID(Metals.MODID)
				.withName((String)values[0])
				.withMaterial((ToolMaterial)values[1])
				.withRepairItem((Item)values[2])
				.withCreativeTab(Metals.METALS_TAB)
				.build();
			
			setPropertyWithReflection(pair.getLeft(), spade);
		}
		
		// clear the props lsit
		props.clear();
	}
	
	/**
	 * 
	 */
	public static void initArmor() {
		final List<Pair<String, Object[]>> props = new ArrayList<>();

		/*
		 *  build armor item list with properties
		 */
		// BONE
		props.add(Pair.of("BONE_CHESTPLATE", new Object[] {MetalsConfig.boneChestplateId, BONE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, BONE_ARMOR_TEXTURE_LAYER1, Items.BONE}));
		props.add(Pair.of("BONE_BOOTS", new Object[] {MetalsConfig.boneBootsId, BONE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET, BONE_ARMOR_TEXTURE_LAYER1, Items.BONE}));
		props.add(Pair.of("BONE_HELMET", new Object[] {MetalsConfig.boneHelmetId, BONE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD, BONE_ARMOR_TEXTURE_LAYER1, Items.BONE}));
		props.add(Pair.of("BONE_LEGGINGS", new Object[] {MetalsConfig.boneLeggingsId, BONE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS, BONE_ARMOR_TEXTURE_LAYER2, Items.BONE}));
		
		// STEEL
		props.add(Pair.of("STEEL_CHESTPLATE", new Object[] {MetalsConfig.steelChestplateId, STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, STEEL_ARMOR_TEXTURE_LAYER1, STEEL_INGOT}));
		props.add(Pair.of("STEEL_BOOTS", new Object[] {MetalsConfig.steelBootsId, STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET, STEEL_ARMOR_TEXTURE_LAYER1, STEEL_INGOT}));
		props.add(Pair.of("STEEL_HELMET", new Object[] {MetalsConfig.steelHelmetId, STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD, STEEL_ARMOR_TEXTURE_LAYER1, STEEL_INGOT}));
		props.add(Pair.of("STEEL_LEGGINGS", new Object[] {MetalsConfig.steelLeggingsId, STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS, STEEL_ARMOR_TEXTURE_LAYER2, STEEL_INGOT}));
				
		// BONESTEEL
		props.add(Pair.of("BONESTEEL_CHESTPLATE", new Object[] {MetalsConfig.boneSteelChestplateId, BONESTEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, BONESTEEL_ARMOR_TEXTURE_LAYER1, BONESTEEL_INGOT}));
		props.add(Pair.of("BONESTEEL_BOOTS", new Object[] {MetalsConfig.boneSteelBootsId, BONESTEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET, BONESTEEL_ARMOR_TEXTURE_LAYER1, BONESTEEL_INGOT}));
		props.add(Pair.of("BONESTEEL_HELMET", new Object[] {MetalsConfig.boneSteelHelmetId, BONESTEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD, BONESTEEL_ARMOR_TEXTURE_LAYER1, BONESTEEL_INGOT}));
		props.add(Pair.of("BONESTEEL_LEGGINGS", new Object[] {MetalsConfig.boneSteelLeggingsId, BONESTEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS, BONESTEEL_ARMOR_TEXTURE_LAYER2, BONESTEEL_INGOT}));
		
		// TITANIUM
		props.add(Pair.of("TITANIUM_CHESTPLATE", new Object[] {MetalsConfig.titaniumChestplateId, TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, TITANIUM_ARMOR_TEXTURE_LAYER1, TITANIUM_INGOT}));
		props.add(Pair.of("TITANIUM_BOOTS", new Object[] {MetalsConfig.titaniumBootsId, TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET, TITANIUM_ARMOR_TEXTURE_LAYER1, TITANIUM_INGOT}));
		props.add(Pair.of("TITANIUM_HELMET", new Object[] {MetalsConfig.titaniumHelmetId, TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD, TITANIUM_ARMOR_TEXTURE_LAYER1, TITANIUM_INGOT}));
		props.add(Pair.of("TITANIUM_LEGGINGS", new Object[] {MetalsConfig.titaniumLeggingsId, TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS, TITANIUM_ARMOR_TEXTURE_LAYER2, TITANIUM_INGOT}));
		
		// AUTIUM
		props.add(Pair.of("AUTIUM_CHESTPLATE", new Object[] {MetalsConfig.autiumChestplateId, AUTIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, AUTIUM_ARMOR_TEXTURE_LAYER1, AUTIUM_INGOT}));
		props.add(Pair.of("AUTIUM_BOOTS", new Object[] {MetalsConfig.autiumBootsId, AUTIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET, AUTIUM_ARMOR_TEXTURE_LAYER1, AUTIUM_INGOT}));
		props.add(Pair.of("AUTIUM_HELMET", new Object[] {MetalsConfig.autiumHelmetId, AUTIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD, AUTIUM_ARMOR_TEXTURE_LAYER1, AUTIUM_INGOT}));
		props.add(Pair.of("AUTIUM_LEGGINGS", new Object[] {MetalsConfig.autiumLeggingsId, AUTIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS, AUTIUM_ARMOR_TEXTURE_LAYER2, AUTIUM_INGOT}));
			
		// initialize all the items
		ModArmorBuilder builder = new ModArmorBuilder();
		for (Pair<String, Object[]> pair : props) {	
			Object[] values = pair.getRight();
			
			// build the armor
			ModArmor armor = builder
				.withModID(Metals.MODID)
				.withName((String)values[0])
				.withMaterial((ArmorMaterial)values[1])
				.withRenderIndex((int)values[2])
				.withSlot((EntityEquipmentSlot)values[3])
				.withTexture((String)values[4])
				.withRepairItem((Item)values[5])
				.withCreativeTab(Metals.METALS_TAB)
				.build();
			
			setPropertyWithReflection(pair.getLeft(), armor);
		}
		
		// clear the props lsit
		props.clear();
	}
	
	/**
	 * 
	 */
	private static void setPropertyWithReflection(String name, Object value) {
		// get the field by reflection
		Field f = null;
		try {
			f = MetalsItems.class.getField(name);
		} catch (NoSuchFieldException e) {
			Metals.logger.warn(String.format("No such field [%s] for class", name, MetalsItems.class.getSimpleName()));
		} catch (SecurityException e) {
			Metals.logger.warn("Security violation: ", e);
		}
		
		// set the field property
		try {
			if (f != null) {
				f.set(null, value);
			}
		} catch (IllegalArgumentException e) {
			Metals.logger.warn(String.format("IllegalArguementException for field [%s] using argument [%s]", f.getName(), value));
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			Metals.logger.warn(String.format("IllegalAccessException for field [%s]", f.getName(), value));
		}
	}

	@Mod.EventBusSubscriber(modid = Metals.MODID)
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			
			final IForgeRegistry<Item> registry = event.getRegistry();
	
			final Item[] items = {
					BONE_BOOTS,
					BONE_CHESTPLATE,
					BONE_HELMET,
					BONE_LEGGINGS,
					BONE_SWORD,

					BONESTEEL_INGOT,
					BONESTEEL_BOOTS,
					BONESTEEL_CHESTPLATE,
					BONESTEEL_HELMET,					
					BONESTEEL_LEGGINGS,
					BONESTEEL_SWORD,
					
					STEEL_INGOT,
					STEEL_AXE,
					STEEL_HOE,
					STEEL_PICKAXE,
					STEEL_SPADE,
					STEEL_BOOTS,
					STEEL_CHESTPLATE,
					STEEL_HELMET,					
					STEEL_LEGGINGS,				
					STEEL_SWORD,
					
					TITANIUM_INGOT,
					TITANIUM_AXE,
					TITANIUM_HOE,
					TITANIUM_PICKAXE,
					TITANIUM_SPADE,
					TITANIUM_BOOTS,
					TITANIUM_CHESTPLATE,
					TITANIUM_HELMET,					
					TITANIUM_LEGGINGS,					
					TITANIUM_SWORD,
					
					AUTIUM_INGOT,
					AUTIUM_AXE,
					AUTIUM_HOE,
					AUTIUM_PICKAXE,
					AUTIUM_SPADE,
					AUTIUM_BOOTS,
					AUTIUM_CHESTPLATE,
					AUTIUM_HELMET,					
					AUTIUM_LEGGINGS,					
					AUTIUM_SWORD,					
					
					METALS_TAB
			};
			registry.registerAll(items);			
		}
	}
}
