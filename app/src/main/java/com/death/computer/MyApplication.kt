package com.death.computer

import android.app.Application
import android.util.Log
import com.death.computer.di.component.ApplicationComponent
import com.death.computer.di.component.DaggerApplicationComponent
import com.death.computer.di.module.ApplicationModule
import com.death.computer.di.qualifier.GeneralComputer
import com.death.computer.model.Computer
import javax.inject.Inject

class MyApplication:Application(){

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    @field:GeneralComputer
    lateinit var generalComputer: Computer

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)

        Log.e("MyApplication", "${generalComputer.hashCode()} : ${generalComputer.name}")
    }

}