package com.camopass.cheese

import com.camopass.cheese.registry.ModBlocks
import com.camopass.cheese.registry.ModItems

@Suppress("unused")

fun init() {
    println("Hello, World!")

    ModItems().registerItems()
    ModBlocks().registerBlocks()
}