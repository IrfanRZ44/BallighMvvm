package com.exomatik.balligh.balligh.ui.auth

import android.os.Handler
import android.util.Log
import androidx.lifecycle.Observer
import com.exomatik.balligh.balligh.R
import com.exomatik.balligh.balligh.base.BaseActivity
import com.exomatik.balligh.balligh.featured.makeSnackbar
import com.exomatik.balligh.balligh.featured.makeToast
import kotlinx.android.synthetic.main.auth_splash_main.*

class AuthSplashActivity : BaseActivity() {
    lateinit var viewModel: AuthSplashViewModel
    override fun getThemeResources(): Int = R.style.CustomMB
    override fun getLayoutResource(): Int = R.layout.auth_splash_main

    override fun onClick() {

    }

    override fun onFirstRun() {
        viewModel = AuthSplashViewModel();
        Handler().postDelayed({

        }, 2000L)

        btn_login.setOnClickListener {
//            makeToast("Tess", this)
//            makeSnackbar("Tess", R.drawable.snakbar_red, it)

            viewModel.setLogin(et_nohp.text.toString(), et_password.text.toString())
                .observe(this, Observer { isSuccess ->
                    makeToast(if (isSuccess) "Berhasil" else "Gagal", this)
                })
            viewModel.message.observe(this, Observer { message ->
                makeSnackbar(message, R.drawable.snakbar_green, it)
            })
            viewModel.isShowLoading.observe(this, Observer { isLoading ->
                Log.e("test", if (isLoading) "Show Loading" else "Loading dismiss")
            })
        }
    }

}
