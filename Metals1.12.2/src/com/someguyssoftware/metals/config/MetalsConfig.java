package com.someguyssoftware.metals.config;

import java.io.File;

import com.someguyssoftware.gottschcore.config.AbstractConfig;
import com.someguyssoftware.gottschcore.mod.IMod;

import net.minecraftforge.common.config.Configuration;

/**
 * 
 * @author Mark Gottschling on Jul 20, 2017
 *
 */
public class MetalsConfig extends AbstractConfig {

	public static final String METALS_TAB_ID = "metals_tab";
	
	/*
	 *  NOTE should all these properties be static or not? what if the mod requires multiple configs
	 *  for different situations? - Very rare and if so, then change to getter/setters according to need.
	 */
	
	// generation
	public static int minChunksPerTitaniumOreVein;
	public static int titaniumOreVeinSize;
	public static int titaniumOreVeinsPerChunk;
	public static int titaniumOreMinY;
	public static int titaniumOreMaxY;
	
	// ids
	public static String steelBlockId;
	public static String steelIngotId;
	public static String steelAxeId;
	public static String steelHoeId;
	public static String steelPickaxeId;
	public static String steelSpadeId;
	public static String steelHelmetId;
	public static String steelChestplateId;
	public static String steelLeggingsId;
	public static String steelBootsId;
	public static String steelSwordId;
	
	public static String titaniumBlockId;
	public static String titaniumIngotId;
	public static String titaniumOreId;
	public static String titaniumAxeId;
	public static String titaniumHoeId;
	public static String titaniumPickaxeId;
	public static String titaniumSpadeId;
	public static String titaniumHelmetId;
	public static String titaniumChestplateId;
	public static String titaniumLeggingsId;
	public static String titaniumBootsId;
	public static String titaniumSwordId;
	
	public static String autiumBlockId;
	public static String autiumIngotId;
	public static String autiumAxeId;
	public static String autiumHoeId;
	public static String autiumPickaxeId;
	public static String autiumSpadeId;
	public static String autiumHelmetId;
	public static String autiumChestplateId;
	public static String autiumLeggingsId;
	public static String autiumBootsId;
	public static String autiumSwordId;
	
	public static String boneHelmetId;
	public static String boneChestplateId;
	public static String boneLeggingsId;
	public static String boneBootsId;
	public static String boneSwordId;
	
	public static String boneSteelIngotId;
	public static String boneSteelHelmetId;
	public static String boneSteelChestplateId;
	public static String boneSteelLeggingsId;
	public static String boneSteelBootsId;
	public static String boneSteelSwordId;
	public static String boneSteelBlockId;
	
	/**
	 * 
	 * @param mod
	 * @param configDir
	 * @param modDir
	 * @param filename
	 */
	public MetalsConfig(IMod mod, File configDir, String modDir, String filename) {
		super(mod, configDir, modDir, filename);
	}

	@Override
	public Configuration load(File file) {
		// load the config file
		Configuration config = super.load(file);

        config.setCategoryComment("04-world-gen", "General Metals mod properties.");    
        minChunksPerTitaniumOreVein = config.getInt("minChunksPerTitaniumOreVein", "04-world-gen", 1, 1, 32000, "The minimun number of chunks between ore generations. 1 = every chunk.");
        titaniumOreVeinSize = config.getInt("titaniumOreVeinSize", "04-world-gen", 10, 0, 100, "Amount of ore blocks per vein.");
        titaniumOreVeinsPerChunk = config.getInt("titaniumOreVeinsPerChunk", "04-world-gen", 3, 0, 10, "Number of veins per chunk.");
        titaniumOreMinY = config.getInt("titaniumOreMinY", "04-world-gen", 7, 1, 255, "The lowest Y value where the ore can spawn.");
        titaniumOreMaxY = config.getInt("titaniumOreMaxY", "04-world-gen", 53, 1, 255, "The highest Y value where the ore can spawn.");
        
        // ids
        boneChestplateId = config.getString("boneChestplateId", "99-ids", "bone_chestplate", "");
        boneHelmetId = config.getString("boneHelmetId", "99-ids", "bone_helmet", "");
        boneLeggingsId = config.getString("boneLeggingsId", "99-ids", "bone_leggings", "");
        boneBootsId = config.getString("boneBootsId", "99-ids", "bone_boots", "");
        boneSwordId = config.getString("boneSwordId", "99-ids", "bone_sword", "");      
        
        steelBlockId = config.getString("steelBlockId", "99-ids", "steel_block", "");
        steelIngotId = config.get("99-ids", "steelIngotId", "steel_ingot").getString();
        steelAxeId = config.get("99-ids", "steelAxeId", "steel_axe").getString();
        steelHoeId = config.get("99-ids", "steelHoeId", "steel_hoe").getString();
        steelPickaxeId = config.get("99-ids", "steelPickaxeId", "steel_pickaxe").getString();
        steelSpadeId = config.get("99-ids", "steelSpadeId", "steel_spade").getString();
        steelHelmetId = config.get("99-ids", "steelHelmetId", "steel_helmet").getString();
        steelChestplateId = config.get("99-ids", "steelChestplateId", "steel_chestplate").getString();
        steelLeggingsId = config.get("99-ids", "steelLeggingsId", "steel_leggings").getString();
        steelBootsId = config.get("99-ids", "steelBootsId", "steel_boots").getString();
        steelSwordId = config.get("99-ids", "steelSwordId", "steel_sword").getString();
        
        boneSteelBlockId = config.getString("boneSteelBlockId", "99-ids", "bone_steel_block", "");
        boneSteelIngotId = config.getString("boneSteelIngot", "99-ids", "bone_steel_ingot", "");
        boneSteelChestplateId = config.getString("boneSteelChestplateId", "99-ids", "bone_steel_chestplate", "");
        boneSteelHelmetId = config.getString("boneSteelHelmetId", "99-ids", "bone_steel_helmet", "");
        boneSteelLeggingsId = config.getString("boneSteelLeggingsId", "99-ids", "bone_steel_leggings", "");
        boneSteelBootsId = config.getString("boneSteelBootsId", "99-ids", "bone_steel_boots", "");
        boneSteelSwordId = config.getString("boneSteelSwordId", "99-ids", "bone_steel_sword", "");
        
        titaniumBlockId = config.get("99-ids", "titaniumBlockId", "titanium_block").getString();
        titaniumIngotId = config.get("99-ids", "titaniumIngotId", "titanium_ingot").getString();
        titaniumOreId = config.get("99-ids", "titaniumOreId", "titanium_ore").getString();
        titaniumAxeId = config.get("99-ids", "titaniumAxeId", "titanium_axe").getString();
        titaniumHoeId = config.get("99-ids", "titaniumHoeId", "titanium_hoe").getString();
        titaniumPickaxeId = config.get("99-ids", "titaniumPickaxeId", "titanium_pickaxe").getString();
        titaniumSpadeId = config.get("99-ids", "titaniumSpadeId", "titanium_spade").getString();
        titaniumHelmetId = config.get("99-ids", "titaniumHelmetId", "titanium_helmet").getString();
        titaniumChestplateId = config.get("99-ids", "titaniumChestplateId", "titanium_chestplate").getString();
        titaniumLeggingsId = config.get("99-ids", "titaniumLeggingsId", "titanium_leggings").getString();
        titaniumBootsId = config.get("99-ids", "titaniumBootsId", "titanium_boots").getString();
        titaniumSwordId = config.get("99-ids", "titaniumSwordId", "titanium_sword").getString();
        
        autiumBlockId = config.get("99-ids", "autiumBlockId", "autium_block").getString();
        autiumIngotId = config.get("99-ids", "autiumIngotId", "autium_ingot").getString();
        autiumAxeId = config.get("99-ids", "autiumAxeId", "autium_axe").getString();
        autiumHoeId = config.get("99-ids", "autiumHoeId", "autium_hoe").getString();
        autiumPickaxeId = config.get("99-ids", "autiumPickaxeId", "autium_pickaxe").getString();
        autiumSpadeId = config.get("99-ids", "autiumSpadeId", "autium_spade").getString();
        autiumHelmetId = config.get("99-ids", "autiumHelmetId", "autium_helmet").getString();
        autiumChestplateId = config.get("99-ids", "autiumChestplateId", "autium_chestplate").getString();
        autiumLeggingsId = config.get("99-ids", "autiumLeggingsId", "autium_leggings").getString();
        autiumBootsId = config.get("99-ids", "autiumBootsId", "autium_boots").getString();
        autiumSwordId = config.get("99-ids", "autiumSwordId", "autium_sword").getString();
                
        // the the default values
       if(config.hasChanged()) {
    	   config.save();
       }
       
		return config;		
	}

}
