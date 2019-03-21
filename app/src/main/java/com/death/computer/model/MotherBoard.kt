package com.death.computer.model

import com.death.computer.model.processor.Processor
import com.death.computer.model.ram.Ram
import javax.inject.Inject

class MotherBoard @Inject constructor(val processor: Processor,
                                      val ram: Ram){
    fun start(){

    }

    fun stop(){

    }
}