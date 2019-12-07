package com.exomatik.balligh.featured

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.R
import com.google.android.material.snackbar.Snackbar


    fun Context.makeSnackbar(message: String, background: Int, view : View) {
        val snackbar = Snackbar.make(view!!, "", Snackbar.LENGTH_LONG)
        val v = snackbar.view
        v.background = ContextCompat.getDrawable(view.context, background)
        val tv =
            v.findViewById<View>(R.id.snackbar_text) as TextView
        tv.setTextColor(Color.parseColor("#FFFFFF"))
        snackbar.setText(message)
        snackbar.show()
    }

    fun Context.makeProgress(message: String?, context: Context): ProgressDialog? {
        val progress = ProgressDialog(context)
        progress.setMessage(message)
        progress.setCancelable(false)
        return progress
    }

    fun Context.makeToast(message: String?, context: Context){
        Toast.makeText(context, message!!, Toast.LENGTH_LONG).show()
    }
