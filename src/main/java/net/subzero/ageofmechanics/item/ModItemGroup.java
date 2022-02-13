package net.subzero.ageofmechanics.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.subzero.ageofmechanics.AgeOfMechanics;

public class ModItemGroup {
    public static final ItemGroup STEEL = FabricItemGroupBuilder.build(new Identifier(AgeOfMechanics.MOD_ID,
            "steel"), () -> new ItemStack(ModItems.STEEL_INGOT));
}
