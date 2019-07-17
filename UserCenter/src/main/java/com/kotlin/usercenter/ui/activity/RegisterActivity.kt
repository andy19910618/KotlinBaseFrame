package com.kotlin.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnLogin.setOnClickListener {
//            Toast.makeText(this,"!!!!",Toast.LENGTH_SHORT).show()
            toast("登录")
        }
    }
}
