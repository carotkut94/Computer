package com.death.computer.di.module

import com.death.computer.di.qualifier.*
import com.death.computer.model.Computer
import com.death.computer.model.display.Display
import com.death.computer.model.display.LCD
import com.death.computer.model.processor.IntelProcessor
import com.death.computer.model.processor.Processor
import com.death.computer.model.ram.DDR3Ram
import com.death.computer.model.ram.Ram
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class GeneralComputerModule{

    @Provides
    @ComputerName
    fun provideComputerName() = "Dell Inspiron"

    @Provides
    @ProcessorName
    fun provideProcessorName() = "x86_64"

    @Provides
    @ProcessorGeneration
    fun provideProcessorGeneration() = "9th"

    @Provides
    @RamManufacturer
    fun provideRamManufacturer() = "Samsung"

    @Provides
    @RamType
    fun provideRamType() = "DDR3"

    @Provides
    @KeyboardName
    fun provideKeyboard() = "Apple"

    @Provides
    fun provideDisplay(): Display = LCD(200, 1920, 1080)

    @Provides
    fun provideProcessor(processor: IntelProcessor): Processor = processor

    @Provides
    fun provideRam(ram: DDR3Ram): Ram = ram

    @Singleton
    @Provides
    @GeneralComputer
    fun provideComputer(computer: Computer) = computer


}