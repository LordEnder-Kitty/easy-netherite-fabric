package net.enderkitty.netherite.item;

import net.enderkitty.netherite.Netherite;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PLATED_DIAMOND = registerItem("plated_diamond",
            new Item(new FabricItemSettings()));
    public static final Item REINFORCED_CRYSTAL = registerItem("reinforced_crystal",
            new Item(new FabricItemSettings()));
    public static final Item CELESTIAL_CRYSTAL = registerItem("celestial_crystal",
            new Item(new FabricItemSettings()));
    public static final Item CRACKED_CELESTIAL_CRYSTAL = registerItem("cracked_celestial_crystal",
            new Item(new FabricItemSettings()));
    public static final Item HARD_CRYSTAL_FRAGMENT = registerItem("hard_crystal_fragment",
            new Item(new FabricItemSettings()));
    public static final Item LIQUIDIZED_END_CRYSTAL = registerItem("liquidized_end_crystal",
            new Item(new FabricItemSettings()));
    public static final Item NETHER_FRAGMENT = registerItem("nether_fragment",
            new Item(new FabricItemSettings()));
    public static final Item NETHERITE_SCRAP_PIECE = registerItem("netherite_scrap_piece",
            new Item(new FabricItemSettings()));
    public static final Item REINFORCED_CRYSTAL_DUST = registerItem("reinforced_crystal_dust",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Netherite.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Netherite.LOGGER.debug("Registering Mod Items for " + Netherite.MOD_ID);
    }
}
