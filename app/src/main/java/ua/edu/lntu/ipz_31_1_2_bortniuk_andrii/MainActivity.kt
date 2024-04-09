package ua.edu.lntu.ipz_31_1_2_bortniuk_andrii

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val userEmail: EditText = findViewById(R.id.user_email)
            val userPass: EditText = findViewById(R.id.user_pass)
            val button: Button = findViewById(R.id.buttonin)

        button.setOnClickListener {
            val email = userEmail.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if(email == "" || pass == "")
                Toast.makeText(this, "Помилка", Toast.LENGTH_SHORT).show()
            else {
                Toast.makeText(this, "Успішно", Toast.LENGTH_SHORT).show()

            }


        }
    }
}