package com.death.computer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.death.computer.MyApplication
import com.death.computer.R
import com.death.computer.di.component.DaggerActivityComponent
import com.death.computer.di.module.ActivityModule
import com.death.computer.di.qualifier.GeneralComputer
import com.death.computer.di.qualifier.SpecializedComputer
import com.death.computer.model.Computer
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    @field:GeneralComputer
    lateinit var generalComputer: Computer

    @Inject
    @field:SpecializedComputer
    lateinit var specialisedComputer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .applicationComponent((application as MyApplication).applicationComponent)
            .build()
            .inject(this)


        Log.e("Main", "${generalComputer.hashCode()} : ${generalComputer.name}")
        Log.e("Main", "${specialisedComputer.hashCode()} : ${specialisedComputer.name}")
    }
}

