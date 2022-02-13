package net.subzero.ageofmechanics.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.subzero.ageofmechanics.AgeOfMechanics;
import net.subzero.ageofmechanics.item.ModItems;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.STEEL)));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new Item(new FabricItemSettings().group(ModItemGroup.STEEL)));

    public static final Item STEEL_PICKAXE = registerItem( "steel_pickaxe",
            new Item(new FabricItemSettings().group(ModItemGroup.STEEL)));

    public static final Item STEEL_AXE = registerItem("steel_axe",
            new Item(new FabricItemSettings().group(ModItemGroup.STEEL)));

    public static final Item RAW_STEEL = registerItem("raw_steel",
            new Item(new FabricItemSettings().group(ModItemGroup.STEEL)));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new Item(new FabricItemSettings().group(ModItemGroup.STEEL)));

    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new Item(new FabricItemSettings().group(ModItemGroup.STEEL)));

    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.STEEL)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(AgeOfMechanics.MOD_ID, name), item);
    }

    public static void registerModItems(){
        AgeOfMechanics.LOGGER.info("Registering Mod Items for " + AgeOfMechanics.MOD_ID);
    }
}
