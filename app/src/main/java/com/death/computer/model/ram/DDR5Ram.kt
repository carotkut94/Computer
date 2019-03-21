package com.death.computer.model.ram

import com.death.computer.di.qualifier.RamManufacturer
import com.death.computer.di.qualifier.RamType
import javax.inject.Inject

class DDR5Ram @Inject constructor(
    @RamManufacturer override val manufacturer: String,
    @RamType override val type:String) : Ram{


    private val bufferMemory = 1024*1024*1024 // in Bytes

    override fun store(byteArray: ByteArray) {
        
    }

    override fun clear() {

    }

}