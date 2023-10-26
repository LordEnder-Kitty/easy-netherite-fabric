package net.enderkitty;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class EasierNetherite implements ModInitializer {
    public static final String MOD_ID = "netherite";

	public static Block BLOCK_OF_REINFORCED_CRYSTAL_BLOCK;

	public static Item PLATED_DIAMOND;
	public static Item REINFORCED_CRYSTAL;
	public static Item CELESTIAL_CRYSTAL;
	public static Item CRACKED_CELESTIAL_CRYSTAL;
	public static Item HARD_CRYSTAL_FRAGMENT;
	public static Item LIQUIDIZED_END_CRYSTAL;
	public static Item NETHER_FRAGMENT;
	public static Item NETHERITE_SCRAP_PIECE;
	public static Item REINFORCED_CRYSTAL_DUST;
	public static Item UPGRADE_TEMPLATE_FRAGMENT;
	public static Item BLOCK_OF_REINFORCED_CRYSTAL_ITEM;


	@Override
	public void onInitialize() {

		PLATED_DIAMOND = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "plated_diamond"), new Item(new FabricItemSettings()));
		REINFORCED_CRYSTAL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "reinforced_crystal"), new Item(new FabricItemSettings()));
		CELESTIAL_CRYSTAL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_crystal"), new Item(new FabricItemSettings()));
		CRACKED_CELESTIAL_CRYSTAL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cracked_celestial_crystal"), new Item(new FabricItemSettings()));
		HARD_CRYSTAL_FRAGMENT = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "hard_crystal_fragment"), new Item(new FabricItemSettings()));
		LIQUIDIZED_END_CRYSTAL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "liquidized_end_crystal"), new Item(new FabricItemSettings()));
		NETHER_FRAGMENT = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "nether_fragment"), new Item(new FabricItemSettings()));
		NETHERITE_SCRAP_PIECE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "netherite_scrap_piece"), new Item(new FabricItemSettings()));
		REINFORCED_CRYSTAL_DUST = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "reinforced_crystal_dust"), new Item(new FabricItemSettings()));
		UPGRADE_TEMPLATE_FRAGMENT = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "upgrade_template_fragment"), new Item(new FabricItemSettings()));

		BLOCK_OF_REINFORCED_CRYSTAL_BLOCK = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "block_of_reinforced_crystal"),
				new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_RED).instrument(Instrument.XYLOPHONE)
						.strength(8.0f).requiresTool().sounds(BlockSoundGroup.COPPER), UniformIntProvider.create(1, 10)));
		BLOCK_OF_REINFORCED_CRYSTAL_ITEM = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "block_of_reinforced_crystal"),
				new BlockItem(BLOCK_OF_REINFORCED_CRYSTAL_BLOCK, new FabricItemSettings()));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.add(PLATED_DIAMOND);
			entries.add(REINFORCED_CRYSTAL);
			entries.add(CELESTIAL_CRYSTAL);
			entries.add(CRACKED_CELESTIAL_CRYSTAL);
			entries.add(HARD_CRYSTAL_FRAGMENT);
			entries.add(LIQUIDIZED_END_CRYSTAL);
			entries.add(NETHER_FRAGMENT);
			entries.add(NETHERITE_SCRAP_PIECE);
			entries.add(REINFORCED_CRYSTAL_DUST);
			entries.add(UPGRADE_TEMPLATE_FRAGMENT);
			entries.add(BLOCK_OF_REINFORCED_CRYSTAL_ITEM);
		});
	}
}
