package net.enderkitty.netherite;

import net.enderkitty.netherite.block.ModBlocks;
import net.enderkitty.netherite.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Netherite implements ModInitializer {
	public static final String MOD_ID = "netherite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
			content.addAfter(Items.NETHERITE_INGOT, ModItems.PLATED_DIAMOND);
			content.addAfter(ModItems.PLATED_DIAMOND, ModItems.REINFORCED_CRYSTAL);
			content.addAfter(ModItems.REINFORCED_CRYSTAL, ModItems.CELESTIAL_CRYSTAL);
			content.addAfter(ModItems.CELESTIAL_CRYSTAL, ModItems.CRACKED_CELESTIAL_CRYSTAL);
			content.addAfter(ModItems.CRACKED_CELESTIAL_CRYSTAL, ModItems.HARD_CRYSTAL_FRAGMENT);
			content.addAfter(ModItems.HARD_CRYSTAL_FRAGMENT, ModItems.LIQUIDIZED_END_CRYSTAL);
			content.addAfter(ModItems.LIQUIDIZED_END_CRYSTAL, ModItems.NETHER_FRAGMENT);
			content.addAfter(ModItems.NETHER_FRAGMENT, ModItems.NETHERITE_SCRAP_PIECE);
			content.addAfter(ModItems.NETHERITE_SCRAP_PIECE, ModItems.REINFORCED_CRYSTAL_DUST);
			content.addAfter(ModItems.REINFORCED_CRYSTAL_DUST, ModBlocks.BLOCK_OF_REINFORCED_CRYSTAL);
		});
	}
}
