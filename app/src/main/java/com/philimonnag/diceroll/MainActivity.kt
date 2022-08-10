package com.philimonnag.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbrn: Button =findViewById<Button>(R.id.roll_btn)
        val textView:TextView=findViewById(R.id.textView)
       rollbrn.setOnClickListener {
           val toast =Toast.makeText(this,"Hallelujha",Toast.LENGTH_SHORT)
           toast.show()
       }
    }
}