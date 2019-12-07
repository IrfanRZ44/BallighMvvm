package com.exomatik.balligh.balligh.ui.auth

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.exomatik.balligh.balligh.base.BaseViewModel
import com.exomatik.balligh.balligh.data.model.ModelUser
import com.exomatik.balligh.balligh.utils.FirebaseUtils
import com.google.firebase.database.*

/**
 **********************************************
 * Created by ukietux on 2019-12-07 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/ukieTux <(’_’<)
 **********************************************
 * © 2019 | All Right Reserved
 */

class AuthSplashViewModel : BaseViewModel() {


    fun setLogin(noHp: String, password: String): LiveData<Boolean> {
        isShowLoading.value = true

        Log.e("test", noHp)

        val isSuccessLogin = MutableLiveData<Boolean>()
        val eventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (snapshot in dataSnapshot.children) {
                        val data: ModelUser? = snapshot.getValue(ModelUser::class.java)
                        data?.apply {
                            Log.e("test", email.toString())

                            message.value = email.toString()
                        }
//                        prosesLogin(data, password)
                    }
                    isShowLoading.value = false
                } else {
                    Log.e("test", "No Hape tidak ditemukan")
                    message.value = "No Hape tidak ditemukan"
                    isShowLoading.value = false
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                isShowLoading.value = false
                message.value = databaseError.message
            }
        }

        FirebaseUtils.query(
            linkedMapOf(
                "reference" to "users",
                "child" to "noHp",
                "equal" to noHp
            ), eventListener
        )
        return isSuccessLogin
    }
}