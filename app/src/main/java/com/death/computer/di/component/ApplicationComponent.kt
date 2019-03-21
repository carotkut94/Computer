package com.death.computer.di.component

import com.death.computer.MyApplication
import com.death.computer.di.module.ApplicationModule
import com.death.computer.di.module.GeneralComputerModule
import com.death.computer.di.qualifier.GeneralComputer
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        GeneralComputerModule::class
    ]
)
interface ApplicationComponent{
    fun inject(application: MyApplication)

    @GeneralComputer
    fun getComputer()

    fun getContext()
}