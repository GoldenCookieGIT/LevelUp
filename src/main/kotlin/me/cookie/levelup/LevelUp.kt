package me.cookie.levelup

import net.minestom.server.extensions.Extension

class LevelUp: Extension() {
    override fun initialize() {
        println("LevelUp extension loaded!")
    }

    override fun terminate() {
        println("LevelUp extension unloaded!")
    }
}