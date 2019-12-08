package com.exomatik.balligh.balligh.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.exomatik.balligh.balligh.utils.FirebaseUtils

abstract class BaseActivity<B : ViewDataBinding> : AppCompatActivity(){
    protected lateinit var bind: B
    protected abstract fun onClick()
    protected abstract fun onFirstRun()
    protected abstract fun getThemeResources(): Int
    protected abstract fun getLayoutResource(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(getThemeResources())
        bind = DataBindingUtil.setContentView(this, getLayoutResource())
        init()
        onFirstRun()
        onClick()
    }

    private fun init(){
    }

    override fun onDestroy() {
        super.onDestroy()
        FirebaseUtils.cancelQuery()
    }
}