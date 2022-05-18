package net.bophades.nab.item;

import net.bophades.nab.NotABlacksmith;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NAB = FabricItemGroupBuilder.build(new Identifier(NotABlacksmith.MOD_ID, "nab"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));
}
