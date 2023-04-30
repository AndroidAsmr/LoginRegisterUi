package com.hadirahimi.loginregisterui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class RegisterActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
    }
}