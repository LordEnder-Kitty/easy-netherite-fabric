package net.enderkitty.netherite;

import net.enderkitty.netherite.block.ModBlocks;
import net.enderkitty.netherite.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class Netherite implements ModInitializer {
	public static final String MOD_ID = "netherite";

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
