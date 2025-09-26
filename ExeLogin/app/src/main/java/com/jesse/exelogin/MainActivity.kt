package com.jesse.exelogin

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jesse.exelogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setContentView(binding.root)
        binding.buttonLogin.setOnClickListener { clickLogin() }
    }



    fun clickLogin(){
        val email = binding.username.text.toString()
        val password = binding.password.text.toString()

        if(email == "cice@gmail.com" && password == "amour"){
            goNextview()
        }else if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "preencha os dados corretamente", Toast.LENGTH_SHORT).show()
        }else{
            AlertDialog.Builder(this)
                .setTitle("Opss")
                .setMessage("Usuário ou senha inválidos")
                .setPositiveButton("OK"){ dialog, which ->
                    dialog.dismiss()
                }
                .show()
        }
    }

    fun goNextview(){
        val intent = android.content.Intent(this, Second_View::class.java)
        startActivity(intent)
    }
}