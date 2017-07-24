/**
 * 
 */
package com.someguyssoftware.metals.block;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.base.Preconditions;
import com.someguyssoftware.gottschcore.AbstractModObjectHolder;
import com.someguyssoftware.gottschcore.block.ModBlock;
import com.someguyssoftware.gottschcore.block.ModBlockBuilder;
import com.someguyssoftware.metals.Metals;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * @author Mark Gottschling on Jul 19, 2017
 *
 */
//@ObjectHolder(Metals.MODID)
public class MetalsBlocks extends AbstractModObjectHolder {

	// blocks
	public static Block STEEL_BLOCK;
	public static Block BONESTEEL_BLOCK;
	public static Block TITANIUM_ORE;
	public static Block TITANIUM_BLOCK;
	public static Block AUTIUM_BLOCK;

	static {
//		BONESTEEL_BLOCK = new BoneSteelBlock(Material.IRON).setCreativeTab(Metals.METALS_TAB);
//		STEEL_BLOCK = new SteelBlock(Material.IRON).setCreativeTab(Metals.METALS_TAB);
//		TITANIUM_ORE = new TitaniumOre(Material.ROCK).setCreativeTab(Metals.METALS_TAB);
//		TITANIUM_BLOCK = new TitaniumBlock(Material.IRON, Metals.METALS_TAB);
//		AUTIUM_BLOCK = new AutiumBlock(Material.IRON, Metals.METALS_TAB);
		
		initBlocks();
	}
	
	/**
	 * 
	 */
	public static void initBlocks() {
		final List<Pair<String, Object[]>> props = new ArrayList<>();
		
		props.add(Pair.of("BONESTEEL_BLOCK", 
				new Object[] {MetalsConfig.boneSteelBlockId, Material.IRON, 3F, "pickaxe", 2, SoundType.METAL}));
		props.add(Pair.of("STEEL_BLOCK", 
				new Object[] {MetalsConfig.steelBlockId, Material.IRON, 3F, "pickaxe", 2, SoundType.METAL}));
		props.add(Pair.of("TITANIUM_ORE", 
				new Object[] {MetalsConfig.titaniumOreId, Material.IRON, 3F, "pickaxe", 2, SoundType.STONE}));
		props.add(Pair.of("TITANIUM_BLOCK", 
				new Object[] {MetalsConfig.titaniumBlockId, Material.IRON, 3F, "pickaxe", 2, SoundType.METAL}));
		props.add(Pair.of("AUTIUM_BLOCK", 
				new Object[] {MetalsConfig.autiumBlockId, Material.IRON, 3F, "pickaxe", 2, SoundType.METAL}));
		
		// initialize all the hoes
		ModBlockBuilder builder = new ModBlockBuilder();
		for (Pair<String, Object[]> pair : props) {	
			Object[] values = pair.getRight();
			
			// build the armor
			ModBlock block = builder
				.withModID(Metals.MODID)
				.withName((String)values[0])
				.withMaterial((Material)values[1])
				.withHardness((float)values[2])
				.withHarvestLevel((String)values[3], (int)values[4])
				.withSoundType((SoundType)values[5])
				.withCreativeTab(Metals.METALS_TAB)
				.build();
			
			setPropertyWithReflection(MetalsBlocks.class, pair.getLeft(), block);
		}
		
		// set additional property for titanium ore
		TITANIUM_ORE.setResistance(5F);
		
		// clear the props lsit
		props.clear();
	}

	/**
	 * TODO move to abstract AbstractModObjectInitializer
	 */
//	private static void setPropertyWithReflection(String name, Object value) {
//		// get the field by reflection
//		Field f = null;
//		try {
//			f = MetalsItems.class.getField(name);
//		} catch (NoSuchFieldException e) {
//			Metals.logger.warn(String.format("No such field [%s] for class", name, MetalsItems.class.getSimpleName()));
//		} catch (SecurityException e) {
//			Metals.logger.warn("Security violation: ", e);
//		}
//		
//		// set the field property
//		try {
//			if (f != null) {
//				f.set(null, value);
//			}
//		} catch (IllegalArgumentException e) {
//			Metals.logger.warn(String.format("IllegalArguementException for field [%s] using argument [%s]", f.getName(), value));
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			Metals.logger.warn(String.format("IllegalAccessException for field [%s]", f.getName(), value));
//		}
//	}
	
	/**
	 * 
	 * @author Mark Gottschling on Jul 22, 2017
	 *
	 */
	@Mod.EventBusSubscriber(modid = Metals.MODID)
	public static class RegistrationHandler {
		public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();
		
		/**
		 * Register this mod's {@link Block}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			final IForgeRegistry<Block> registry = event.getRegistry();
	
			final Block[] blocks = {
				BONESTEEL_BLOCK,
				STEEL_BLOCK,
				TITANIUM_BLOCK,
				TITANIUM_ORE,
				AUTIUM_BLOCK
			};
			registry.registerAll(blocks);			
		}
		
		/**
		 * Register this mod's {@link ItemBlock}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
			final IForgeRegistry<Item> registry = event.getRegistry();
			
			final ItemBlock[] items = {
					new ItemBlock(BONESTEEL_BLOCK),
					new ItemBlock(STEEL_BLOCK),
					new ItemBlock(TITANIUM_BLOCK),
					new ItemBlock(TITANIUM_ORE),
					new ItemBlock(AUTIUM_BLOCK)
			};
			
			for (final ItemBlock item : items) {
				final Block block = item.getBlock();
				final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
				registry.register(item.setRegistryName(registryName));
				ITEM_BLOCKS.add(item);
			}
		}
	}
}
