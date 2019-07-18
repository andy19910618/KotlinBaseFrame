package com.kotlin.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import com.kotlin.baselibrary.ui.activity.BaseMvpActivity
import com.kotlin.usercenter.R
import com.kotlin.usercenter.presenter.RegisterPresenter
import com.kotlin.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnLogin.setOnClickListener {
//            Toast.makeText(this,"!!!!",Toast.LENGTH_SHORT).show()
//            toast("注册成功")
//            startActivity(intentFor<TestActivity>("id" to 5))
//            startActivity<TestActivity>("id" to 10)
            mPresenter = RegisterPresenter()
            mPresenter.mView = this
            mPresenter.register("13900009999","123456","123456")
        }
    }


    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }
}
