package com.example.app01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.lang.String
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  btn_mutou = findViewById(R.id.radioButton) as RadioButton;
        var  btn_sukoshi = findViewById(R.id.radioButton2) as RadioButton;
        var  btn_gojyu = findViewById(R.id.radioButton3) as RadioButton;

        var  btn_aisunai = findViewById(R.id.radioButton5) as RadioButton;
        var  btn_sukoshiaisu = findViewById(R.id.radioButton6) as RadioButton;
        var  btn_aisu = findViewById(R.id.radioButton7) as RadioButton;
        var  btn_mora = findViewById(R.id.button) as Button;
        var  tv_mmora = findViewById(R.id.editTextTextPersonName) as TextView;
        btn_mora.setOnClickListener{

            if(btn_mutou.isChecked)tv_mmora.text ="無糖" else if (btn_sukoshi.isChecked)tv_mmora.text ="微糖" else if (btn_gojyu.isChecked)tv_mmora.text ="半糖" else tv_mmora.text ="全糖"
            if(btn_aisunai.isChecked)tv_mmora.text =tv_mmora.text.toString()+"去冰" else if (btn_sukoshiaisu.isChecked)tv_mmora.text =tv_mmora.text.toString()+"微冰" else if (btn_aisu.isChecked)tv_mmora.text =tv_mmora.text.toString()+"少冰" else tv_mmora.text =tv_mmora.text.toString()+"正常冰"
            tv_mmora.text = String.format("%s", tv_mmora.text.toString())
        }
    }
}