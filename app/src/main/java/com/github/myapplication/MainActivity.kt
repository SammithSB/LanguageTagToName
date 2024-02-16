package com.github.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.langtagtoname.LanguageNameHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val languageCode = "en"
        val languageName = LanguageNameHelper.getLanguageName(languageCode)
        Log.d("TAG", languageName.toString())
        Log.d("TAG", languageCode)
        LanguageNameHelper
    }
}