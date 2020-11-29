package com.applantic.bordeauxsport.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.com.applantic.bordeauxsport.androidApp.R
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Firebase.firestore
    }
}
