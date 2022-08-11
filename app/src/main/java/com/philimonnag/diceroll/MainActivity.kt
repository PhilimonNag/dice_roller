package com.philimonnag.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbrn: Button =findViewById<Button>(R.id.roll_btn)
        val textView:TextView=findViewById(R.id.textView)
        val imageView:ImageView=findViewById(R.id.imageView)
       rollbrn.setOnClickListener {
//           val toast =Toast.makeText(this,"Hallelujha",Toast.LENGTH_SHORT)
//           toast.show()
           textView.text=roll().toString()
           val drawableResources =when(roll()){
               1->R.drawable.dice_1
               2->R.drawable.dice_2
               3->R.drawable.dice_3
               4->R.drawable.dice_4
               5->R.drawable.dice_5
               else->R.drawable.dice_6

           }
           imageView.setImageResource(drawableResources)
           imageView.contentDescription=roll().toString()
       }

    }

    fun roll():Int{
        val dice=Dice(6)
        val roll=dice.roll()
        return roll

    }
    class Dice(val numSide :Int){
        fun roll():Int{
            return (1..numSide).random()
        }

    }
}