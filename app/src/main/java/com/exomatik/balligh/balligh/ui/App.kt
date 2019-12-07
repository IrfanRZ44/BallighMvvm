package com.exomatik.balligh.balligh.ui

import android.app.Application
import com.google.firebase.FirebaseApp

/**
 **********************************************
 * Created by ukietux on 2019-12-07 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/ukieTux <(’_’<)
 **********************************************
 * © 2019 | All Right Reserved
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}