package com.death.computer.model

import com.death.computer.di.qualifier.KeyboardName
import javax.inject.Inject

class Keyboard @Inject constructor(@KeyboardName val name: String){
    fun keyPress(){

    }
}