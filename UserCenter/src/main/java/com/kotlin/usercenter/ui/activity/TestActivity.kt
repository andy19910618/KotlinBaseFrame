package com.kotlin.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.usercenter.R
import org.jetbrains.anko.editText
import org.jetbrains.anko.padding
import org.jetbrains.anko.toast
import org.jetbrains.anko.verticalLayout

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

//        verticalLayout{
//            padding =30
//            editText{
//                hint = "name"
//                textSize = 24F
//            }
//        }


//        toast("${intent.getIntExtra("id",-1)}")
    }
}
