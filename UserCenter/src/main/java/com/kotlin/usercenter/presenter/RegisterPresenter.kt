package com.kotlin.usercenter.presenter

import com.kotlin.baselibrary.presenter.view.BasePresenter
import com.kotlin.usercenter.presenter.view.RegisterView

/**
 *@创建者 andy
 *@创建时间 2019/7/18 11:28
 *@描述 这是一个
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile : String, verifCode:String){
        /**
         * 业务逻辑
         */
        mView.onRegisterResult(true)
    }
}