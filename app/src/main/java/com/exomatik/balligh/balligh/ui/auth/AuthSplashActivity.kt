package com.exomatik.balligh.balligh.ui.auth

import com.exomatik.balligh.balligh.R
import com.exomatik.balligh.balligh.base.BaseActivity
import com.exomatik.balligh.balligh.databinding.AuthSplashMainBinding

class AuthSplashActivity : BaseActivity<AuthSplashMainBinding>() {
    lateinit var viewModel: AuthSplashViewModel
    override fun getThemeResources(): Int = R.style.CustomMB
    override fun getLayoutResource(): Int = R.layout.auth_splash_main

    override fun onClick() {

    }

    override fun onFirstRun() {
        bind.lifecycleOwner = this
        viewModel = AuthSplashViewModel()
        bind.viewModel = viewModel

        bind.test = "Coba"
    }

}
