package com.kotlin.usercenter.presenter

import com.kotlin.baselibrary.ext.execute
import com.kotlin.baselibrary.presenter.view.BasePresenter
import com.kotlin.baselibrary.rx.BaseSubsciber
import com.kotlin.usercenter.presenter.view.RegisterView
import com.kotlin.usercenter.service.UserService
import com.kotlin.usercenter.service.impl.UserServiceImpl
import rx.Scheduler
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

/**
 *@创建者 andy
 *@创建时间 2019/7/18 11:28
 *@描述 这是一个
 */
class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {

    @Inject
    lateinit var userService: UserService

    fun register(mobile: String, verifCode: String, pwd: String) {
        /**
         * 业务逻辑
         */
        userService.register(mobile, verifCode, pwd)
            .execute(object : BaseSubsciber<Boolean>(){
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }
            })

    }
}