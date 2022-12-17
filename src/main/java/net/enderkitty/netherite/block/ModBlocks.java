package net.enderkitty.netherite.block;

import net.enderkitty.netherite.Netherite;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block BLOCK_OF_REINFORCED_CRYSTAL = registerBlock("block_of_reinforced_crystal",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(8.0f).requiresTool()
                    .sounds(BlockSoundGroup.COPPER), UniformIntProvider.create(1, 10)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Netherite.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Netherite.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Netherite.LOGGER.debug("Registering ModBlocks for " + Netherite.MOD_ID);
    }
}
