package com.camopass.cheese.registry

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.BlockItem
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ModItems {

    val CHEESE: Item = Item(
        Item.Settings().group(ItemGroup.FOOD).food(FoodComponent.Builder().hunger(8).saturationModifier(12.0f).build())
    )

    // Blocks

    val CHEESE_WHEEL: BlockItem = BlockItem(ModBlocks().CHEESE_WHEEL, FabricItemSettings().group(ItemGroup.FOOD))

    fun registerItems() {
        Registry.register(Registry.ITEM, Identifier("cheese", "cheese"), CHEESE)
        Registry.register(Registry.ITEM, Identifier("cheese", "cheese_wheel"), CHEESE_WHEEL)
    }
}