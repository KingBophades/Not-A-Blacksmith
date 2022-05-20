package net.bophades.nab.item;

import net.bophades.nab.NotABlacksmith;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item KATANA_BLADE = registerItem("katana_blade",
            new Item(new FabricItemSettings().group(ModItemGroup.NAB)));

    public static final Item KATANA_GUARD = registerItem("katana_guard",
            new Item(new FabricItemSettings().group(ModItemGroup.NAB)));

    public static final Item KATANA_HANDLE = registerItem("katana_handle",
            new Item(new FabricItemSettings().group(ModItemGroup.NAB)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(NotABlacksmith.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NotABlacksmith.LOGGER.info("Registering Mod Items for " + NotABlacksmith.MOD_ID);
    }

}
