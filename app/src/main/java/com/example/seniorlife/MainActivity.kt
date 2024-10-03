package com.example.seniorlife

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)

        val name = findViewById<TextView>(R.id.fieldName)
        val surname = findViewById<TextView>(R.id.fieldSurname)
        val email = findViewById<TextView>(R.id.fieldEmail)
        val phoneNumber = findViewById<TextView>(R.id.fieldPhoneNumber)
        val cep = findViewById<TextView>(R.id.fieldCEP)
        val street = findViewById<TextView>(R.id.fieldStreet)
        val number = findViewById<TextView>(R.id.fieldNumber)
        val district = findViewById<TextView>(R.id.fieldDistrict)
        val city = findViewById<TextView>(R.id.fieldCity)
        val state = findViewById<TextView>(R.id.fieldState)
        val gender = findViewById<Spinner>(R.id.fieldGender)

        gender.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            listOf(
                "Male", "Female"
            )
        )

        val buttonAddress = findViewById<Button>(R.id.buttonGetAddress)

        fun getAddress(cep: String): String {
            TODO()
            // val client = HttpClient()
            // val response = client.get<String>("https://viacep.com.br/ws/$cep/json/")
            //
            // return response
        }

        buttonAddress.setOnClickListener {
            val address = getAddress(cep.text.toString())
            // val addressJson = JSONObject(address)

            // street.text = addressJson.getString("logradouro")
            // district.text = addressJson.getString("bairro")
            // city.text = addressJson.getString("localidade")
            // state.text = addressJson.getString("uf")
        }



    }
}