package com.example.customalertboxes

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import com.example.customalertboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var customDialog : Dialog
    lateinit var view : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        customDialog = Dialog(this)
        customDialog.setContentView(R.layout.custom_dialogue_box)
        customDialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alertbox))

        val positivedialogbtn = customDialog.findViewById<Button>(R.id.Positivebtn)
        val negativedialogbtn = customDialog.findViewById<Button>(R.id.Negativebtn)

        positivedialogbtn.setOnClickListener {
            customDialog.dismiss()
        }
        negativedialogbtn.setOnClickListener {
            Toast.makeText(this, "Thank you for providing feedback.\n We will try our best to improve", Toast.LENGTH_SHORT).show()
            customDialog.dismiss()
        }
        view.btnclickme.setOnClickListener {
            customDialog.show()
        }

    }
}
