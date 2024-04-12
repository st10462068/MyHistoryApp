package com.example.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myhistoryapp.R.*

class MainActivity() : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        //this is where the code starts

        // declaration

        val proceedButton = findViewById<Button>(R.id.proceedButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val numTextNumber = findViewById<EditText>(R.id.numTextNumber)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)

        proceedButton.setOnClickListener {


            /* if else statement */
            val age = numTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                displayTextView.text = "Please enter a valid age"


            } else {

                if (age < 20 || age > 100) {
                    displayTextView.text = "please enter a valid age between 20 to 100"
                    numTextNumber.text.clear()
                } else {
                    /* 10 Dead Famous People */
                    val result = when (age) {
                        95 -> "Nelson Mandela was a South African anti-apartheid activist, politician, and statesman who served as the first black president of South Africa from 1994 to 1999."
                        30 -> "Steve Biko was a medical student, he founded a black student organisation in 1969 and created a national 'black consciousness' movement."
                        81 -> "Winnie Mandela was a South African anti-apartheid activist and Politician, and the second wife of Nelson Mandela."
                        75 -> "Oliver Tambo was a South African anti-apartheid politician and activist who served as President of the African National Congress from 1967 to 1991."
                        39 -> "Martin Lluther King Jr was an American Christian minister, activist, and political philosopher who was one of the most prominent leaders in the civil rights movement from 1955 to 1968."
                        65 -> "Frederik Williem de Klerk was a South African politican who served as a state president of South Africa from 1989 to 1994 and as deputy from 1994 to 1996."
                        53 -> "Robert Sobukwe was a South African anti-apartheid revolutionary and founding member of the PAN Africanist Congress."
                        55 -> "Sol Plaatje was a South African intellectual, journalist, linguist, politician, translator, and writter."
                        12 -> "Nkosi Johnson was a South African child with HIV and AIDS who greatly influenced public perception of the pandenic and its effects before his death."
                        75 -> "Mahatma Ghandi was an Indian lawyer, anti-colonial nationalist and political ethicist who employed nonviolent resistance to lead the successful campaign for India's independance from British rule."

                        else -> "No one Died at this age, try a different one!"
                    }


                    displayTextView.text = result

                }

            }
            clearButton.setOnClickListener {
                numTextNumber.text.clear()
                displayTextView.text = ""

            }

        }
    }
    }