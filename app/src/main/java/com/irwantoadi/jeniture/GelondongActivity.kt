package com.irwantoadi.jeniture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView

class GelondongActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gelondong)

        val edit_text_dropdown: EditText = findViewById(R.id.edit_text_dropdown)
        val list_view: ListView = findViewById(R.id.list_view)
        val array_list = listOf("Kayu Jati", "Kayu Mahoni", "Kayu Sengon", "Kayu Nangka", "Kayu Trembesi")
        list_view.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, array_list)

        edit_text_dropdown.setOnClickListener {
            if (list_view.visibility == View.GONE){
                list_view.visibility = View.VISIBLE
            }else{
                list_view.visibility = View.GONE
            }
        }

        list_view.setOnItemClickListener { parent, view, position, id ->
            edit_text_dropdown.setText(parent.getItemAtPosition(position) as String)
            list_view.visibility = View.GONE
        }
    }
}