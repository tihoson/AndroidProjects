package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener {
            try {
                val first = num1.text.toString().toDouble()
                val second = num2.text.toString().toDouble()

                ans.text = (first + second).toString()
            } catch (e: NumberFormatException) {
                ans.text = ""
                showSnackbar("Error! Enter number in both fields")
            }
        }

        buttonDiff.setOnClickListener {
            try {
                val first = num1.text.toString().toDouble()
                val second = num2.text.toString().toDouble()

                ans.text = (first - second).toString()
            } catch (e: NumberFormatException) {
                ans.text = ""
                showSnackbar("Error! Enter number in both fields")
            }
        }

        buttonMul.setOnClickListener {
            try {
                val first = num1.text.toString().toDouble()
                val second = num2.text.toString().toDouble()

                ans.text = (first * second).toString()
            } catch (e: NumberFormatException) {
                ans.text = ""
                showSnackbar("Error! Enter number in both fields")
            }
        }

        buttonDiv.setOnClickListener {
            try {
                val first = num1.text.toString().toDouble()
                val second = num2.text.toString().toDouble()

                if (second == 0.0) {
                    ans.text = ""
                    showSnackbar("Error! Division by zero")
                    return@setOnClickListener
                }

                ans.text = (first / second).toString()
            } catch (e: NumberFormatException) {
                ans.text = ""
                showSnackbar("Error! Enter number in both fields")
            }
        }
    }

    private fun showSnackbar(message: String) =
        Snackbar.make(layout, message, Snackbar.LENGTH_LONG).show()
}
