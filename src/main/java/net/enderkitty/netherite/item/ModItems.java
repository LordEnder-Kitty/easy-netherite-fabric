package net.enderkitty.netherite.item;

import net.enderkitty.netherite.Netherite;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Netherite.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Netherite.LOGGER.debug("Registering Mod Items for " + Netherite.MOD_ID);
    }
}
