package com.example.jetpack_androidarchitecture

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.security.acl.Owner

class MainActivity : AppCompatActivity() {
    private val TAG: String = "MyApp"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "Owner onCreate")
        lifecycle.addObserver(MainActivityObserver())
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Owner onStart")
        lifecycle.addObserver(MainActivityObserver())
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Owner onResume")
        lifecycle.addObserver(MainActivityObserver())
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Owner onPause")
        lifecycle.addObserver(MainActivityObserver())
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Owner onStop")
        lifecycle.addObserver(MainActivityObserver())
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Observer Removed")
        lifecycle.removeObserver(MainActivityObserver())
    }
}