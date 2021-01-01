package com.vimal.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vimal.pinview.OnPinEnteredListener
import com.vimal.pinview.PinEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<PinEditText>(R.id.pin_view).setOnPinEnteredListener(object :
            OnPinEnteredListener{
            override fun onPinEntered(str: CharSequence?) {
                Toast.makeText(this@MainActivity,"Pin : $str",Toast.LENGTH_SHORT).show()
            }

        })
    }
}