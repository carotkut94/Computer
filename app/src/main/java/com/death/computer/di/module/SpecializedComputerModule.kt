package com.death.computer.di.module

import com.death.computer.di.qualifier.*
import com.death.computer.model.Computer
import com.death.computer.model.display.Display
import com.death.computer.model.display.LCD
import com.death.computer.model.processor.ARMProcessor
import com.death.computer.model.processor.Processor
import com.death.computer.model.ram.DDR5Ram
import com.death.computer.model.ram.Ram
import dagger.Module
import dagger.Provides

@Module
class SpecializedComputerModule {

    @Provides
    @ComputerName
    fun provideComputerName() = "Dell XPS"

    @Provides
    @ProcessorName
    fun provideProcessorName() = "arm_64"

    @Provides
    @ProcessorGeneration
    fun provideProcessorGeneration() = "2th"

    @Provides
    @RamManufacturer
    fun provideRamManufacturer() = "Corsair"

    @Provides
    @RamType
    fun provideRamType() = "DDR5"

    @Provides
    @KeyboardName
    fun provideKeyboard() = "Dell"

    @Provides
    fun provideDisplay(): Display = LCD(300, 2400, 1600)

    @Provides
    fun provideProcessor(processor: ARMProcessor): Processor = processor

    @Provides
    fun provideRam(ram: DDR5Ram): Ram = ram

    @Provides
    @SpecializedComputer
    fun provideComputer(computer: Computer) = computer
}