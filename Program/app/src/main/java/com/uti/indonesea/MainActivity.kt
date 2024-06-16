package com.uti.indonesea

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.uti.indonesea.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var usernameInpute : EditText
    lateinit var passwordInpute : EditText
    lateinit var loginBtn : Button

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        usernameInpute = findViewById(R.id.username_input)
        passwordInpute = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val username = usernameInpute.text.toString()
            val password = passwordInpute.text.toString()
            Log.i("Test Credentials", "Username : $username and Password $password")

        }


        binding.btnMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.category -> replaceFragment(CategoryFragment())
                R.id.profile -> replaceFragment(ProfileFragment())

                else ->{

                }
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frm_lay,fragment)
        fragmentTransaction.commit()
    }

}