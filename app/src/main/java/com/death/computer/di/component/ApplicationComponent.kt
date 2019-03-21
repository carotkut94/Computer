package com.death.computer.di.component

import android.content.Context
import com.death.computer.MyApplication
import com.death.computer.di.module.ApplicationModule
import com.death.computer.di.module.GeneralComputerModule
import com.death.computer.di.qualifier.GeneralComputer
import com.death.computer.model.Computer
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        GeneralComputerModule::class
    ]
)
interface ApplicationComponent {

    fun inject(application: MyApplication)

    // this should be written with qualifier for it to be available in sub graph
    @GeneralComputer
    fun getComputer(): Computer

    fun getContext(): Context
}