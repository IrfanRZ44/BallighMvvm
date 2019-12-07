package com.exomatik.balligh.ui.auth

import android.os.Handler
import com.exomatik.balligh.R
import com.exomatik.balligh.base.BaseActivity
import com.exomatik.balligh.featured.makeSnackbar
import com.exomatik.balligh.featured.makeToast
import kotlinx.android.synthetic.main.auth_splash_main.*

class AuthSplashActivity : BaseActivity() {
    override fun getThemeResources(): Int = R.style.CustomMB
    override fun getLayoutResource(): Int = R.layout.auth_splash_main

    override fun onClick() {

    }

    override fun onFirstRun() {
        Handler().postDelayed({

        }, 2000L)

        btn_sign.setOnClickListener {
            makeToast("Tess", this)
            makeSnackbar("Tess", R.drawable.snakbar_red, it)
        }


    }
}
