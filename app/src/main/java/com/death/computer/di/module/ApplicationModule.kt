package com.death.computer.di.module

import android.content.Context
import com.death.computer.MyApplication
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(var application: MyApplication){
    @Provides
    fun provideContext(): Context = application
}