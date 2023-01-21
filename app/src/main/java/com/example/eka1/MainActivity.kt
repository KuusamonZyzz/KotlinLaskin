package com.example.eka1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

  class MainActivity : AppCompatActivity() {

  lateinit var eka : EditText
  lateinit var buPlus : Button
  lateinit var buMiinus : Button
  lateinit var buTulo : Button
  lateinit var buJako : Button
  lateinit var toka : EditText
  lateinit var tulos : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      eka = findViewById(R.id.eka)
      buPlus = findViewById(R.id.buPlus)
      buMiinus = findViewById(R.id.buMiinus)
      buTulo = findViewById(R.id.buTulo)
      buJako = findViewById(R.id.buJako)
      toka = findViewById(R.id.toka)
      tulos = findViewById(R.id.tulos)

      val luku1 = eka.text.toString().toInt()
      val luku2 = toka.text.toString().toInt()

      buPlus.setOnClickListener {

          summa(luku1, luku2)
      }

      buMiinus.setOnClickListener {

          erotus(luku1, luku2)
      }

      buTulo.setOnClickListener {

          tulo(luku1, luku2)
      }

      buJako.setOnClickListener {

        osamaara(luku1, luku2)
      }
    }
    private fun osamaara(luku1: Int, luku2: Int)
    {
      val result = luku1 / luku2
      tulos.text = result.toString()
    }

    private fun tulo(luku1: Int, luku2: Int)
    {
      val result = luku1 * luku2
      tulos.text = result.toString()
    }

    private fun summa(luku1: Int, luku2: Int)
    {
      val result = luku1 + luku2
      tulos.text = result.toString()
    }

    private fun erotus(luku1: Int, luku2: Int)
    {
      val result = luku1 - luku2
      tulos.text = result.toString()
    }
}