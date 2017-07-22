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
import com.someguyssoftware.gottschcore.armor.ModItemBuilder;
import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.armor.AutiumBoots;
import com.someguyssoftware.metals.armor.AutiumChestplate;
import com.someguyssoftware.metals.armor.AutiumHelmet;
import com.someguyssoftware.metals.armor.AutiumLeggings;
import com.someguyssoftware.metals.armor.BoneArmor;
import com.someguyssoftware.metals.armor.BoneSteelArmor;
import com.someguyssoftware.metals.armor.SteelBoots;
import com.someguyssoftware.metals.armor.SteelChestplate;
import com.someguyssoftware.metals.armor.SteelHelmet;
import com.someguyssoftware.metals.armor.SteelLeggings;
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
@Mod.EventBusSubscriber(modid = Metals.MODID)
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
	
	private static final String boneArmorTextureLayer1 = "textures/models/armor/bone_layer_1.png";
	private static final String boneArmorTextureLayer2 = "textures/models/armor/bone_layer_2.png";
	
	private static final String boneSteelArmorTextureLayer1 = "textures/models/armor/bone_steel_layer_1.png";
	private static final String boneSteelArmorTextureLayer2 = "textures/models/armor/bone_steel_layer_2.png";
	
	// BONE //
	public static ToolMaterial BONE_TOOL_MATERIAL = EnumHelper.addToolMaterial("BONE", 2, 200, 6.25F, 2.15F, 15);
	public static ArmorMaterial BONE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("BONE", Metals.MODID + ":bone", 22,
			new int[] { 2, 5, 6, 2 }, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	// STEEL //
	public static ToolMaterial STEEL_MATERIAL = EnumHelper.addToolMaterial("STEEL", 2, 600, 6.5F, 2.25F, 15);
	public static ArmorMaterial STEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("STEEL", Metals.MODID + ":steel", 22,
			new int[] { 2, 5, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	
	// BONESTEEL //
	public static ToolMaterial BONESTEEL_TOOL_MATERIAL = EnumHelper.addToolMaterial("BONESTEEL", 2, 550, 7.0F, 2.25F, 17);
	public static ArmorMaterial BONESTEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("BONESTEEL", Metals.MODID + ":bonesteel", 24,
			new int[] { 2, 6, 6, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	
	// TITANIUM //
	public static ToolMaterial TITANIUM_TOOL_MATERIAL = EnumHelper.addToolMaterial("TITANIUM", 2, 1300, 7F, 2.5F, 12);
	public static ArmorMaterial TITANIUM_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("TITANIUM", Metals.MODID + ":titanium", 27,
			new int[] { 3, 6, 8, 3 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	
	// AUTIUM //
	public static ToolMaterial AUTIUM_TOOL_MATERIAL = EnumHelper.addToolMaterial("AUTIUM", 2, 1200, 11.0F, 2.25F, 20);
	public static ArmorMaterial AUTIUM_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("AUTIUM", Metals.MODID + ":autium", 22,
			new int[] { 2, 5, 8, 2 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
		
	static {		
		// BONE items
		BONE_BOOTS = new BoneArmor(BONE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET,
				MetalsConfig.boneBootsId, boneArmorTextureLayer1, Items.BONE.getUnlocalizedName());
		BONE_CHESTPLATE = new BoneArmor(BONE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST,
				MetalsConfig.boneChestplateId, boneArmorTextureLayer1, Items.BONE.getUnlocalizedName());
		BONE_HELMET = new BoneArmor(BONE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD,
				MetalsConfig.boneHelmetId, boneArmorTextureLayer1, Items.BONE.getUnlocalizedName());
		BONE_LEGGINGS = new BoneArmor(BONE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS,
				MetalsConfig.boneLeggingsId, boneArmorTextureLayer2, Items.BONE.getUnlocalizedName());
		BONE_SWORD = new MetalsSword(BONE_TOOL_MATERIAL, MetalsConfig.boneSwordId, Items.BONE.getUnlocalizedName());	

		// STEEL items
		STEEL_INGOT = new SteelIngot().setCreativeTab(Metals.METALS_TAB);

		STEEL_AXE = new SteelAxe(STEEL_MATERIAL);
		STEEL_HOE = new SteelHoe(STEEL_MATERIAL);
		STEEL_PICKAXE = new SteelPickaxe(STEEL_MATERIAL);
		STEEL_SPADE = new SteelSpade(STEEL_MATERIAL);

		STEEL_BOOTS = new SteelBoots(STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET);
		STEEL_CHESTPLATE = new SteelChestplate(STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST);
		STEEL_HELMET = new SteelHelmet(STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD);
		STEEL_LEGGINGS = new SteelLeggings(STEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
		STEEL_SWORD = new SteelSword(STEEL_MATERIAL);
		
		// BONESTEEL items
		BONESTEEL_INGOT = new MetalsIngot(MetalsConfig.boneSteelIngotId).setMaxStackSize(64);
		BONESTEEL_BOOTS = new BoneSteelArmor(BONESTEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET,
				MetalsConfig.boneSteelBootsId, boneSteelArmorTextureLayer1, BONESTEEL_INGOT.getUnlocalizedName());
		BONESTEEL_CHESTPLATE = new BoneSteelArmor(BONESTEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST,
				MetalsConfig.boneSteelChestplateId, boneSteelArmorTextureLayer1, BONESTEEL_INGOT.getUnlocalizedName());
		BONESTEEL_HELMET = new BoneSteelArmor(BONESTEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD,
				MetalsConfig.boneSteelHelmetId, boneSteelArmorTextureLayer1, BONESTEEL_INGOT.getUnlocalizedName());
		BONESTEEL_LEGGINGS = new BoneSteelArmor(BONESTEEL_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS,
				MetalsConfig.boneSteelLeggingsId, boneSteelArmorTextureLayer2, BONESTEEL_INGOT.getUnlocalizedName());
		BONESTEEL_SWORD = new MetalsSword(BONESTEEL_TOOL_MATERIAL, MetalsConfig.boneSteelSwordId, BONESTEEL_INGOT.getUnlocalizedName());
		
		// TITANIUM items
//		TITANIUM_INGOT = //new TitaniumIngot();
//				new Item()
//				.setMaxStackSize(64)
//				.setUnlocalizedName(MetalsConfig.titaniumIngotId)
//				.setRegistryName(MetalsConfig.titaniumIngotId)
//				.setCreativeTab(Metals.metalsTab);
		
		ModItemBuilder itemBuilder = new ModItemBuilder();
		TITANIUM_INGOT = itemBuilder
				.withModID(Metals.MODID)
				.withName(MetalsConfig.titaniumIngotId)
				.withStackSize(64)
				.withTab(Metals.METALS_TAB)
				.build();

		TITANIUM_AXE = new TitaniumAxe(TITANIUM_TOOL_MATERIAL);
		TITANIUM_HOE = new TitaniumHoe(TITANIUM_TOOL_MATERIAL);
		TITANIUM_PICKAXE = new TitaniumPickaxe(TITANIUM_TOOL_MATERIAL);
		TITANIUM_SPADE = new TitaniumSpade(TITANIUM_TOOL_MATERIAL);

//		TITANIUM_BOOTS = new ModArmor(Metals.MODID, Metals.config.getTitaniumBootsID(),
//				TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET,
//				"textures/models/armor/titanium_layer_1.png", TITANIUM_INGOT);
		
		// create a new build
//		ModArmorBuilder builder = new ModArmorBuilder();
//		builder.withModID(Metals.MODID)		;
//		
//		// set default values for titanium
//		builder.withMaterial(TITANIUM_ARMOR_MATERIAL);
		
//		TITANIUM_CHESTPLATE = builder
//				.withName(Metals.config.getTitaniumChestplateId())
//				.withRenderIndex(2)
//				.withSlot(EntityEquipmentSlot.CHEST)
//				.withTexture("textures/models/armor/titanium_layer_1.png")
//				.withRepairItem(TITANIUM_INGOT)
//				.build();

		// TODO now can add a List of arrays of properties and set each armors properties
		
//		new TitaniumBoots(titaniumArmorMaterial, 2, EntityEquipmentSlot.FEET);		
//		TITANIUM_CHESTPLATE = new MetalsArmor(TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST,
//				MetalsConfig.titaniumChestplateId, "textures/models/armor/titanium_layer_1.png", TITANIUM_INGOT.getUnlocalizedName());
//		TITANIUM_HELMET = new TitaniumHelmet(TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD);
//		TITANIUM_LEGGINGS = new TitaniumLeggings(TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
		TITANIUM_SWORD = new TitaniumSword(TITANIUM_TOOL_MATERIAL);

		// AUTIUM
		AUTIUM_INGOT = new AutiumIngot();

		AUTIUM_AXE = new AutiumAxe(AUTIUM_TOOL_MATERIAL);
		AUTIUM_HOE = new AutiumHoe(AUTIUM_TOOL_MATERIAL);
		AUTIUM_PICKAXE = new AutiumPickaxe(AUTIUM_TOOL_MATERIAL);
		AUTIUM_SPADE = new AutiumSpade(AUTIUM_TOOL_MATERIAL);

		AUTIUM_BOOTS = new AutiumBoots(AUTIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET);
		AUTIUM_CHESTPLATE = new AutiumChestplate(AUTIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST);
		AUTIUM_HELMET = new AutiumHelmet(AUTIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD);
		AUTIUM_LEGGINGS = new AutiumLeggings(AUTIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
		AUTIUM_SWORD = new AutiumSword(AUTIUM_TOOL_MATERIAL);
		
		// TAB
		METALS_TAB = new MetalsTabItem().setUnlocalizedName(MetalsConfig.metalsTabId);
	}
	
	/**
	 * 
	 */
	public static void initializeItems() {
		final List<Pair<String, Object[]>> props = new ArrayList<>();

		// build armor item list with properties
		props.add(Pair.of("TITANIUM_CHESTPLATE", new Object[] {MetalsConfig.titaniumChestplateId, TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, "textures/models/armor/titanium_layer_1.png", TITANIUM_INGOT}));
		props.add(Pair.of("TITANIUM_BOOTS", new Object[] {MetalsConfig.titaniumBootsId, TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.FEET, "textures/models/armor/titanium_layer_1.png", TITANIUM_INGOT}));
		props.add(Pair.of("TITANIUM_HELMET", new Object[] {MetalsConfig.titaniumHelmetId, TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.HEAD, "textures/models/armor/titanium_layer_1.png", TITANIUM_INGOT}));
		props.add(Pair.of("TITANIUM_LEGGINGS", new Object[] {MetalsConfig.titaniumLeggingsId, TITANIUM_ARMOR_MATERIAL, 2, EntityEquipmentSlot.LEGS, "textures/models/armor/titanium_layer_2.png", TITANIUM_INGOT}));
		
		// TODO create a Abstract method to run this (and for each type of Item - ie. ModItem, ModArmor, etc)
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
			
			// get the field by reflection
			Field f = null;
			try {
				f = MetalsItems.class.getField(pair.getLeft());
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// set the field property
			try {
				f.set(null, armor);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// clear the props lsit
		props.clear();
	}
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		initializeItems();
		
		final IForgeRegistry<Item> registry = event.getRegistry();

		final Item[] items = {
				AUTIUM_AXE,
				AUTIUM_BOOTS,
				AUTIUM_CHESTPLATE,
				
				TITANIUM_AXE,
				TITANIUM_HOE,
				TITANIUM_INGOT,
				TITANIUM_PICKAXE,
				TITANIUM_SPADE,
				TITANIUM_SWORD,
				
				TITANIUM_CHESTPLATE

		};
		registry.registerAll(items);			
	}
}
