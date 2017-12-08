/**
 * 
 */
package com.someguyssoftware.metals.proxy;

import com.someguyssoftware.gottschcore.config.IConfig;
import com.someguyssoftware.gottschcore.proxy.AbstractClientProxy;
import com.someguyssoftware.metals.block.MetalsBlocks;
import com.someguyssoftware.metals.config.MetalsConfig;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * 
 * @author Mark Gottschling on Jul 20, 2017
 *
 */
public class ClientProxy extends AbstractClientProxy {

	@Override
	public void registerRenderers(IConfig config) {
		registerItemRenderers((MetalsConfig) config);
	}
	
	/**
	 * 
	 * @param config
	 */
	public void registerItemRenderers(MetalsConfig config) {
		// register item renderers
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.FAST_LADDER), 0, new ModelResourceLocation(FastLadder.MODID + ":" + config.getFastLadderBlockId(), "inventory"));
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.FASTER_LADDER), 0, new ModelResourceLocation(FastLadder.MODID + ":" + config.getFasterLadderBlockId(), "inventory"));
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.FASTEST_LADDER), 0, new ModelResourceLocation(FastLadder.MODID + ":" + config.getFastestLadderBlockId(), "inventory"));

	}
}
