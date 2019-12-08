package com.exomatik.balligh.balligh.utils

import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter

/**
 **********************************************
 * Created by ukietux on 2019-12-08 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/ukieTux <(’_’<)
 **********************************************
 * © 2019 | All Right Reserved
 */

@BindingAdapter("app:setVisibility")
fun setVisibility(view: View?, isVisible: Boolean?) {
    if (isVisible != null)
        if (isVisible)
            view?.visibility = View.VISIBLE
        else
            view?.visibility = View.GONE
}

@BindingAdapter("app:toast")
fun showMessage(view:View? , message:String?){
    if(message!=null){
        Toast.makeText(view?.context,message,Toast.LENGTH_LONG).show()
    }
}