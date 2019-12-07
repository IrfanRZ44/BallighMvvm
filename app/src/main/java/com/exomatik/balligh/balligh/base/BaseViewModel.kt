package com.exomatik.balligh.balligh.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 **********************************************
 * Created by ukietux on 2019-12-07 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/ukieTux <(’_’<)
 **********************************************
 * © 2019 | All Right Reserved
 */
open class BaseViewModel : ViewModel (){
    val isShowLoading = MutableLiveData<Boolean>()
    val message = MutableLiveData<String>()
}