package com.death.computer.model

import com.death.computer.di.qualifier.ComputerName
import com.death.computer.model.display.Display
import javax.inject.Inject

class Computer @Inject constructor(@ComputerName val name:String,
                                   val motherboard:MotherBoard,
                                   val keyboard:Keyboard,
                                   val display: Display
                                   )