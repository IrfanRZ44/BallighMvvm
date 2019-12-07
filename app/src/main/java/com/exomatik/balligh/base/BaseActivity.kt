package com.exomatik.balligh.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){
    protected abstract fun onClick()
    protected abstract fun onFirstRun()
    protected abstract fun getThemeResources(): Int
    protected abstract fun getLayoutResource(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(getThemeResources())
        setContentView(getLayoutResource())
        init()
        onFirstRun()
        onClick()
    }

    private fun init(){
    }


}