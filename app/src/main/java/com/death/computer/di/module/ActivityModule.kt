package com.death.computer.di.module

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule (val activity: AppCompatActivity) {
    @Provides
    fun provideActivity(): Activity = activity
}