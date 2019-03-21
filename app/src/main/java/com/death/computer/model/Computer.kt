package com.death.computer.model

import com.death.computer.di.qualifier.ComputerName
import com.mindorks.bootcamp.mindorksdaggerexample.model.display.Display
import javax.inject.Inject

class Computer @Inject constructor(@ComputerName val name:String,
                                   val motherboard:MotherBoard,
                                   val keyboard:Keyboard,
                                   val display: Display
                                   )