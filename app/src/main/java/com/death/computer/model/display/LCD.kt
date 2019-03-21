package com.death.computer.model.display

import android.graphics.Picture

class LCD constructor(
    override val pixelDensity: Int,
    override val widthPixels: Int,
    override val heightPixels: Int
) : Display {

    override fun turnOn(): Picture {
        // do something
        return Picture()
    }

    override fun turnOff() {
        // do something
    }
}