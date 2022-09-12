package net.enderkitty.netherite;

import net.enderkitty.netherite.block.ModBlocks;
import net.enderkitty.netherite.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Netherite implements ModInitializer {
	public static final String MOD_ID = "netehrite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
