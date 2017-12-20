/**
 * 
 */
package com.someguyssoftware.metals;

import com.someguyssoftware.metals.block.MetalsBlocks;
import com.someguyssoftware.metals.item.MetalsItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * 
 * @author Mark Gottschling on Dec 28, 2016
 *
 */
public class MetalsCrafting {
	
	/**
	 * 
	 */
	public MetalsCrafting() {
		
	}
	
	/**
	 * 
	 */
	public static void loadRecipes() {
//
//		// recipe(s) ingredients
//		ItemStack coalStack = new ItemStack(Items.COAL);
//		ItemStack ironIngotStack = new ItemStack(Items.IRON_INGOT);
//		ItemStack stickStack = new ItemStack(Items.STICK);
//		
//		// BONE recipes
//		// boots recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(MetalsItems.BONE_BOOTS, true, new Object[] {"   ", "x x", "x x",
//				'x', "bone"}));	
//		
//		// chestplate recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(MetalsItems.BONE_CHESTPLATE, true, new Object[] {"x x", "xxx", "xxx",
//				'x', "bone"}));
//		
//		// helmet
//		GameRegistry.addRecipe(new ShapedOreRecipe(MetalsItems.BONE_HELMET, true, new Object[] {"xxx", "x x", "   ",
//				'x', "bone"}));
//		
//		// leggings
//		GameRegistry.addRecipe(new ShapedOreRecipe(MetalsItems.BONE_LEGGINGS, true, new Object[] {"xxx", "x x", "x x",
//				'x', "bone"}));
//		
//		// sword recipe		
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.boneSword, true, new Object[] {"x", "x", "y",
//				'x', "bone", 'y', stickStack}));
//		
//		// steel ingot recipe
//		GameRegistry.addShapelessRecipe(new ItemStack(MetalsItems.STEEL_INGOT), 
//				new Object[] {
//					coalStack,
//					coalStack,
//					ironIngotStack,
//					ironIngotStack
//		});
//		
//		// block recipes
//		GameRegistry.addRecipe(new ShapelessOreRecipe(Metals.steelBlock,
//				new Object[] {
//					"ingotSteel",
//					"ingotSteel",
//					"ingotSteel",
//					"ingotSteel",
//					"ingotSteel",
//					"ingotSteel",
//					"ingotSteel",
//					"ingotSteel",
//					"ingotSteel"
//				}
//		));
//		
//		// don't change block to ingot recipe to use ore dictionary - use vanilla
//		GameRegistry.addShapelessRecipe(new ItemStack(MetalsItems.STEEL_INGOT, 9), 
//				new Object[] {
//					new ItemStack(Metals.steelBlock)
//		});
//
//		
//		// axe recipes
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelAxe, true, new Object[] {" xx", " xy", " y ",
//				'x', "ingotSteel", 'y', stickStack}));
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelAxe, true, new Object[] {" xx", " yx", " y ",
//				'x', "ingotSteel", 'y', stickStack}));
//		
//		// hoe recipes
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelHoe, true, new Object[] {"xx ", " y ", " y ",
//				'x', "ingotSteel", 'y', stickStack}));
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelHoe, true, new Object[] {" xx", " y ", " y ",
//				'x', "ingotSteel", 'y', stickStack}));	
//		
//		// pickaxe recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelPickaxe, true, new Object[] {"xxx", " y ", " y ",
//				'x', "ingotSteel", 'y', stickStack}));
//		
//		// spade recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelSpade, true, new Object[] {"x", "y", "y",
//				'x', "ingotSteel", 'y', stickStack}));
//		
//		
//		// boots recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelBoots, true, new Object[] {"   ", "x x", "x x",
//				'x', "ingotSteel"}));	
//		
//		// chestplate recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelChestplate, true, new Object[] {"x x", "xxx", "xxx",
//				'x', "ingotSteel"}));
//		
//		// helmet
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelHelmet, true, new Object[] {"xxx", "x x", "   ",
//				'x', "ingotSteel"}));
//		
//		// leggings
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelLeggings, true, new Object[] {"xxx", "x x", "x x",
//				'x', "ingotSteel"}));
//		
//		// sword recipe		
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.steelSword, true, new Object[] {"x", "x", "y",
//				'x', "ingotSteel", 'y', stickStack}));
//
//			
//		// BONE STEEL recipes
//		// steel ingot recipe
//		GameRegistry.addShapelessRecipe(new ItemStack(Metals.boneSteelIngot), 
//				new Object[] {
//					new ItemStack(MetalsItems.STEEL_INGOT),
//					new ItemStack(Items.BONE)
//		});
//		
//		// block recipes
//		GameRegistry.addRecipe(new ShapelessOreRecipe(Metals.boneSteelBlock, 
//				new Object[] {
//					"ingotBoneSteel",
//					"ingotBoneSteel",
//					"ingotBoneSteel",
//					"ingotBoneSteel",
//					"ingotBoneSteel",
//					"ingotBoneSteel",
//					"ingotBoneSteel",
//					"ingotBoneSteel",
//					"ingotBoneSteel"
//		}));
//		
//		// vanilla recipe
//		GameRegistry.addShapelessRecipe(new ItemStack(Metals.boneSteelIngot, 9), 
//				new Object[] {
//					new ItemStack(Metals.boneSteelBlock)
//		});
//		
//		// boots recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.boneSteelBoots, true, new Object[] {"   ", "x x", "x x",
//				'x', "ingotBoneSteel"}));	
//		
//		// chestplate recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.boneSteelChestplate, true, new Object[] {"x x", "xxx", "xxx",
//				'x', "ingotBoneSteel"}));
//		
//		// helmet
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.boneSteelHelmet, true, new Object[] {"xxx", "x x", "   ",
//				'x', "ingotBoneSteel"}));
//		
//		// leggings
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.boneSteelLeggings, true, new Object[] {"xxx", "x x", "x x",
//				'x', "ingotBoneSteel"}));
//		
//		// sword recipe		
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.boneSteelSword, true, new Object[] {"x", "x", "y",
//				'x', "ingotBoneSteel", 'y', stickStack}));
//		
//		// recipe(s) ingredients
////		ItemStack goldIngotStack = new ItemStack(Items.gold_ingot);
////		ItemStack titaniumIngotStack = new ItemStack(ModItems.TITANIUM_INGOT);	
//		ItemStack autiumIngotStack = new ItemStack(MetalsItems.AUTIUM_INGOT);
//		
		// smelting recipe
		GameRegistry.addSmelting(MetalsBlocks.TITANIUM_ORE, new ItemStack(MetalsItems.TITANIUM_INGOT), 5);
//		
//		// block recipes
//		GameRegistry.addRecipe(new ShapelessOreRecipe(Metals.titaniumBlock, 
//				new Object[] {
//					"ingotTitanium",
//					"ingotTitanium",
//					"ingotTitanium",
//					"ingotTitanium",
//					"ingotTitanium",
//					"ingotTitanium",
//					"ingotTitanium",
//					"ingotTitanium",
//					"ingotTitanium"
//		}));
//		
//		// vanilla recipe
//		GameRegistry.addShapelessRecipe(new ItemStack(MetalsItems.TITANIUM_INGOT, 9), 
//				new Object[] {
//					new ItemStack(Metals.titaniumBlock)
//		});		
//		
//		// axe recipes
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumAxe, true, new Object[] {"xx ", "xy ", " y ",
//				'x', "ingotTitanium", 'y', stickStack}));
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumAxe, true, new Object[] {" xx", " yx", " y ",
//				'x', "ingotTitanium", 'y', stickStack}));
//		
//		// hoe recipes
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumHoe, true, new Object[] {"xx ", " y ", " y ",
//				'x', "ingotTitanium", 'y', stickStack}));
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumHoe, true, new Object[] {" xx", " y ", " y ",
//				'x', "ingotTitanium", 'y', stickStack}));	
//		
//		// pickaxe recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumPickaxe, true, new Object[] {"xxx", " y ", " y ",
//				'x', "ingotTitanium", 'y', stickStack}));
//		
//		// spade recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumSpade, true, new Object[] {"x", "y", "y",
//				'x', "ingotTitanium", 'y', stickStack}));
//		
//		
//		// boots recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumBoots, true, new Object[] {"   ", "x x", "x x",
//				'x', "ingotTitanium"}));	
//		
//		// chestplate recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumChestplate, true, new Object[] {"x x", "xxx", "xxx",
//				'x', "ingotTitanium"}));
//		
//		// helmet
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumHelmet, true, new Object[] {"xxx", "x x", "   ",
//				'x', "ingotTitanium"}));
//		
//		// leggings
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumLeggings, true, new Object[] {"xxx", "x x", "x x",
//				'x', "ingotTitanium"}));
//		
//		// sword recipe		
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.titaniumSword, true, new Object[] {"x", "x", "y",
//				'x', "ingotTitanium", 'y', stickStack}));
//		
//		// autium ingot recipe
//		GameRegistry.addRecipe(new ShapelessOreRecipe(MetalsItems.AUTIUM_INGOT,
//				new Object[] {
//					"ingotGold",
//					"ingotTitanium"
//		}));
//		
//		// block recipes
//		GameRegistry.addRecipe(new ShapelessOreRecipe(Metals.autiumBlock, 
//				new Object[] {
//					"ingotAutium",
//					"ingotAutium",
//					"ingotAutium",
//					"ingotAutium",
//					"ingotAutium",
//					"ingotAutium",
//					"ingotAutium",
//					"ingotAutium",
//					"ingotAutium"
//		}));
//		
//		// vanilla recipe
//		GameRegistry.addShapelessRecipe(new ItemStack(MetalsItems.AUTIUM_INGOT, 9), 
//				new Object[] {
//					new ItemStack(Metals.autiumBlock)
//		});	
//		
//		// axe recipes
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumAxe, true, new Object[] {"xx ", "xy ", " y ",
//				'x', autiumIngotStack, 'y', stickStack}));
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumAxe, true, new Object[] {" xx", " yx", " y ",
//				'x', autiumIngotStack, 'y', stickStack}));	
//		
//		// hoe recipes
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumHoe, true, new Object[] {"xx ", " y ", " y ",
//				'x', autiumIngotStack, 'y', stickStack}));
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumHoe, true, new Object[] {" xx", " y ", " y ",
//				'x', autiumIngotStack, 'y', stickStack}));	
//		
//		// pickaxe recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumPickaxe, true, new Object[] {"xxx", " y ", " y ",
//				'x', autiumIngotStack, 'y', stickStack}));
//		
//		// spade recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumSpade, true, new Object[] {"x", "y", "y",
//				'x', autiumIngotStack, 'y', stickStack}));
//		
//		
//		// boots recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumBoots, true, new Object[] {"   ", "x x", "x x",
//				'x', autiumIngotStack}));	
//		
//		// chestplate recipe
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumChestplate, true, new Object[] {"x x", "xxx", "xxx",
//				'x', autiumIngotStack}));
//		
//		// helmet
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumHelmet, true, new Object[] {"xxx", "x x", "   ",
//				'x', autiumIngotStack}));;
//		
//		// leggings
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumLeggings, true, new Object[] {"xxx", "x x", "x x",
//				'x', autiumIngotStack}));
//		
//		// sword recipe		
//		GameRegistry.addRecipe(new ShapedOreRecipe(Metals.autiumSword, true, new Object[] {"x", "x", "y",
//				'x', autiumIngotStack, 'y', stickStack}));
//	}
	}
}
