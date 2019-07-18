package com.kotlin.usercenter.service.impl

import com.kotlin.baselibrary.data.protocol.BaseResponse
import com.kotlin.baselibrary.rx.BaseException
import com.kotlin.usercenter.repository.UserRepository
import com.kotlin.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1

/**
 *@创建者 andy
 *@创建时间 2019/7/18 14:28
 *@描述 这是一个
 */
class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        val repository = UserRepository()
        return repository.register(mobile, verifyCode, pwd)
            .flatMap(object : Func1<BaseResponse<String>, Observable<Boolean>> {
                override fun call(t: BaseResponse<String>): Observable<Boolean> {
                    if (t.status != 0) {
                        return Observable.error(BaseException(t.status,t.message))
                    }
                    return Observable.just(true)
                }

            })

        return Observable.just(true)
    }
}