package com.exomatik.balligh.balligh.utils

import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.Query
import com.google.firebase.database.ValueEventListener

/**
 **********************************************
 * Created by ukietux on 2019-12-07 with ♥
 * (>’_’)> email : ukie.tux@gmail.com
 * github : https://www.github.com/ukieTux <(’_’<)
 **********************************************
 * © 2019 | All Right Reserved
 */

object FirebaseUtils {
    lateinit var query: Query
    lateinit var eventListener: ValueEventListener

    fun query(params: LinkedHashMap<String, String>, eventListener: ValueEventListener): Query {
        this.eventListener = eventListener
        Log.e("test",params.toString())
        query = FirebaseDatabase.getInstance()
            .getReference(params["reference"].toString())
            .orderByChild(params["child"].toString())
            .equalTo(params["equal"].toString())

        query.addValueEventListener(eventListener)
        return query
    }

    fun cancelQuery() {
        try {
            query.removeEventListener(eventListener)
            Log.e("test","cancelQuery")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}