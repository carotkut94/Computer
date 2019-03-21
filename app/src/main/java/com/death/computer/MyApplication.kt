package com.death.computer

import android.app.Application
import android.util.Log

class MyApplication:Application(){

    override fun onCreate() {
        super.onCreate()
        Log.e("APPLICATION", "CREATED")
    }

}