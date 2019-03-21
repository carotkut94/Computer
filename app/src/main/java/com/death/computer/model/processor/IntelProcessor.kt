package com.death.computer.model.processor

import com.death.computer.di.qualifier.ProcessorGeneration
import com.death.computer.di.qualifier.ProcessorName
import javax.inject.Inject

class IntelProcessor @Inject constructor(
    @ProcessorName override val type:String,
    @ProcessorGeneration override val generation: String):Processor{

    private val GPIOPins = 40

    override fun process(vararg tasks: Any): Any {
        return byteArrayOf(GPIOPins.toByte())
    }
}