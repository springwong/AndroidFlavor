package com.spring.flavorsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "FlavorSample";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Build Config Value :" + BuildConfig.env);
        Log.d(TAG,"Gradle Resource Value 1:" + getString(R.string.resValue));
        Log.d(TAG,"Gradle Resource Value 2:" + getString(R.string.resFunction));
        Log.d(TAG,"Local Properties Value:" + BuildConfig.localPropertiesValue);
        Log.d(TAG,"Gradle Properties Value:" + BuildConfig.gradlePropertiesValue);
        Log.d(TAG,"Local Define Value:" + BuildConfig.localDefineValue);
    }
}
