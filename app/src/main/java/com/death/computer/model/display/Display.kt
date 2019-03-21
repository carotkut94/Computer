package com.mindorks.bootcamp.mindorksdaggerexample.model.display

import android.graphics.Picture

interface Display {
    val pixelDensity: Int
    val widthPixels: Int
    val heightPixels: Int

    fun turnOn(): Picture

    fun turnOff()
}