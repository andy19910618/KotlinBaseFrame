package com.kotlin.usercenter.service.impl

import com.kotlin.usercenter.service.UserService
import rx.Observable

/**
 *@创建者 andy
 *@创建时间 2019/7/18 14:28
 *@描述 这是一个
 */
class UserServiceImpl : UserService{
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }
}