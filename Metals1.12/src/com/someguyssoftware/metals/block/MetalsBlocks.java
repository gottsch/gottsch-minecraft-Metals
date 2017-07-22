/**
 * 
 */
package com.someguyssoftware.metals.block;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.someguyssoftware.metals.Metals;

import net.minecraft.block.Block;
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
@Mod.EventBusSubscriber(modid = Metals.MODID)
public class MetalsBlocks {

	// blocks
	public static Block STEEL_BLOCK;
	public static Block BONESTEEL_BLOCK;
	public static Block TITANIUM_ORE;
	public static Block TITANIUM_BLOCK;
	public static Block AUTIUM_BLOCK;

	static {
		BONESTEEL_BLOCK = new BoneSteelBlock(Material.IRON).setCreativeTab(Metals.METALS_TAB);
		STEEL_BLOCK = new SteelBlock(Material.IRON).setCreativeTab(Metals.METALS_TAB);
		TITANIUM_ORE = new TitaniumOre(Material.ROCK).setCreativeTab(Metals.METALS_TAB);
		TITANIUM_BLOCK = new TitaniumBlock(Material.IRON, Metals.METALS_TAB);
		AUTIUM_BLOCK = new AutiumBlock(Material.IRON, Metals.METALS_TAB);
	}

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
