/**
 * 
 */
package com.someguyssoftware.metals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.someguyssoftware.gottschcore.annotation.Credits;
import com.someguyssoftware.gottschcore.command.ShowVersionCommand;
import com.someguyssoftware.gottschcore.config.IConfig;
import com.someguyssoftware.gottschcore.mod.AbstractMod;
import com.someguyssoftware.gottschcore.mod.IMod;
import com.someguyssoftware.gottschcore.proxy.IProxy;
import com.someguyssoftware.gottschcore.version.BuildVersion;
import com.someguyssoftware.metals.block.MetalsBlocks;
import com.someguyssoftware.metals.config.MetalsConfig;
import com.someguyssoftware.metals.eventhandler.EntityEventHandler;
import com.someguyssoftware.metals.item.MetalsItems;
import com.someguyssoftware.metals.potion.MetalsPotion;
import com.someguyssoftware.metals.worldgen.MetalsWorldGenerator;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

/**
 * 
 * @author Mark Gottschling on Dec 28, 2016
 *
 */
@Mod(
		modid = Metals.MODID,
		name = Metals.NAME,
		version = Metals.VERSION,
		dependencies = "required-after:gottschcore@[1.1.0,)",
		acceptedMinecraftVersions = "[1.12]",
		updateJSON = Metals.UPDATE_JSON_URL)
@Credits(values={"SGS Metals was first developed by Mark Gottschling on Aug 27, 2014. Credits to Mason for ideas and debugging."})
public class Metals extends AbstractMod {
	// constants
	public static final String MODID = "sgs_metals";
	protected static final String NAME = "Metals";
	protected static final String VERSION = "3.0.0";
	protected static final String UPDATE_JSON_URL = "https://raw.githubusercontent.com/gottsch/gottsch-minecraft-Metals/master/Metals1.12/update.json";

	private static final String VERSION_URL = "https://www.dropbox.com/s/at0n9db2a3sifl4/metals-versions.json?dl=1";
	private static final BuildVersion MINECRAFT_VERSION = new BuildVersion(1, 12, 0);

	private static final String METALS_CONFIG_DIR = "metals";
	public static MetalsConfig config;
	
	// latest version
	public static BuildVersion latestVersion;

	// logger
	public static Logger logger = LogManager.getLogger(Metals.NAME);

	@Instance(value = Metals.MODID)
	public static Metals instance;

	@SidedProxy(clientSide = "com.someguyssoftware.metals.client.ClientProxy", serverSide = "com.someguyssoftware.metals.proxy.ServerProxy")
	public static IProxy proxy;

	// potion/effects
	public static Potion boneFireResistancePotion;
	
	// tab
	
	public static CreativeTabs METALS_TAB;

	/**
	 * 
	 */
	public Metals() {	}

	@EventHandler
	public void preInt(FMLPreInitializationEvent event) {
		super.preInt(event);
		// register additional events
		MinecraftForge.EVENT_BUS.register(new EntityEventHandler());

		// create and load the config file		
		config = new MetalsConfig(this, event.getModConfigurationDirectory(), METALS_CONFIG_DIR, "general.cfg");
				
		// configure logging
		addRollingFileAppenderToLogger(Metals.NAME, Metals.NAME + "Appender", config);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		// register item renderers
		// registerItemRenderers();

		// register tile entities
		registerTileEntities();

		// register ores
		OreDictionary.registerOre("bone", new ItemStack(Items.BONE));
		OreDictionary.registerOre("ingotSteel", new ItemStack(MetalsItems.STEEL_INGOT));
		OreDictionary.registerOre("ingotBoneSteel", new ItemStack(MetalsItems.BONESTEEL_INGOT));
		// OreDictionary.registerOre("oreTitanium", new ItemStack(titaniumOre));
		OreDictionary.registerOre("oreTitanium", MetalsBlocks.TITANIUM_ORE);
		OreDictionary.registerOre("ingotTitanium", new ItemStack(MetalsItems.TITANIUM_INGOT));
		OreDictionary.registerOre("ingotAutium", new ItemStack(MetalsItems.AUTIUM_INGOT));

		// load recipes
		MetalsCrafting.loadRecipes();

		// world generators
		GameRegistry.registerWorldGenerator(new MetalsWorldGenerator(), 50);

		// register client renderers
		proxy.registerRenderers(Metals.config);
		
		METALS_TAB = new CreativeTabs(CreativeTabs.getNextID(), MetalsConfig.metalsTabId) {
			@SideOnly(Side.CLIENT)
			public ItemStack getTabIconItem() {
				return new ItemStack(MetalsItems.METALS_TAB, 1);
			}
		};
		
		// init potion effects
		boneFireResistancePotion = new MetalsPotion(false, 14981695).setPotionName("bone.fireResistance").setIconIndex(7, 1).setBeneficial();
	}
	
	/**
	 * 
	 * @param event
	 */
    @EventHandler
    public void serverStarted(FMLServerStartingEvent event) {
    	// add a show version command
    	event.registerServerCommand(new ShowVersionCommand(this));
    }

    /**
     * 
     */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		if (!getConfig().isModEnabled()) return;	
		super.postInit(event);		
	}


	/**
	 * 
	 */
	private void registerTileEntities() {
		//GameRegistry.registerTileEntity(TitaniumOreTileEntity.class, "titanium_ore_tile_entity");
	}

	@Override
	public String getId() {
		return Metals.MODID;
	}

	@Override
	public String getName() {
		return Metals.NAME;
	}

	@Override
	public IMod getInstance() {
		return Metals.instance;
	}

	@Override
	public BuildVersion getModLatestVersion() {
		return Metals.latestVersion;
	}

	@Override
	public IConfig getConfig() {
		return Metals.config;
	}

	@Override
	public void setModLatestVersion(BuildVersion version) {
		Metals.latestVersion = version;
	}

	@Override
	public BuildVersion getMinecraftVersion() {
		return Metals.MINECRAFT_VERSION;
	}

	@Override
	public String getVerisionURL() {
		return Metals.VERSION_URL;
	}

	@Override
	public String getVersion() {
		return Metals.VERSION;
	}
}
