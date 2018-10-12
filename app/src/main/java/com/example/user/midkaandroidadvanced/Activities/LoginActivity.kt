package com.example.user.midkaandroidadvanced.Activities

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import com.example.user.midkaandroidadvanced.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var login:String
    lateinit var passwords:String
    var pref: SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        pref = PreferenceManager.getDefaultSharedPreferences(this)
        login = email_login.toString()
        passwords = password.toString()
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            pref!!.edit().putString("username", emailValue.text.toString()).apply()
            pref!!.edit().putString("password", password.editText!!.text.toString()).apply()

            startActivity(intent)
            //finish()
        }

    }
}
