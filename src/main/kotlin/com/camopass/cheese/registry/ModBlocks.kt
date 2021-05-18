package com.camopass.cheese.registry

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ModBlocks {

    val CHEESE_WHEEL: Block = Block(FabricBlockSettings
        .of(Material.ORGANIC_PRODUCT)
        .breakByHand(true)
        .collidable(true)
        .strength(0.4f, 2.0f)
        .sounds(BlockSoundGroup.FUNGUS)
    )

    fun registerBlocks() {
        Registry.register(Registry.BLOCK, Identifier("cheese", "cheese_wheel"), CHEESE_WHEEL)
    }

}