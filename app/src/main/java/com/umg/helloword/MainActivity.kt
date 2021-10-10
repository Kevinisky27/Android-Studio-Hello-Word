package com.umg.helloword

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText as makeText1

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtView: TextView = findViewById(R.id.txtSaludo)
        txtView.setOnClickListener(this)


    }

    fun onClickBtnEnviar(view: View) {
        var txtNombre: EditText = findViewById(R.id.txtNombre)
        val nombre: String = txtNombre.text.toString()

        Toast.makeText(this,"Hola ${nombre}", Toast.LENGTH_LONG).show()

    }

    override fun onClick(p0: View?) {
        Toast.makeText(this, "Bienvenid@ al sistema :)", Toast.LENGTH_LONG).show()
    }
}