package com.death.computer.di.component

import android.app.Activity
import com.death.computer.di.module.ActivityModule
import com.death.computer.di.module.SpecializedComputerModule
import com.death.computer.di.qualifier.SpecializedComputer
import com.death.computer.di.scope.ActivityScope
import com.death.computer.model.Computer
import com.death.computer.ui.MainActivity
import dagger.Component


@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [
        ActivityModule::class,
        SpecializedComputerModule::class
    ]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    @SpecializedComputer
    fun getComputer(): Computer

    fun getActivity(): Activity
}