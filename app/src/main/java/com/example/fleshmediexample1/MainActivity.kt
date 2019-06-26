package com.example.fleshmediexample1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username.text
        password.text

        button.setOnClickListener {
            if (username.text!!.toString().isNotEmpty() && password.text!!.isNotEmpty()) {
                var intent = Intent(this, NavigationDrawerActivity::class.java)
                startActivity(intent)
            } else if(username.text!!.toString().isEmpty()) {
                Toast.makeText(this, "Сначала введите имя пользователя", Toast.LENGTH_LONG).show()
            }
            else if (password.text!!.isEmpty()){
                Toast.makeText(this, "Введите пароль", Toast.LENGTH_LONG).show()
            }
        }
    }
}
