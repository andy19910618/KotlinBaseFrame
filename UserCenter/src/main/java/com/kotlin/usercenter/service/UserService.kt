package com.kotlin.usercenter.service

import rx.Observable
import java.util.*

/**
 *@创建者 andy
 *@创建时间 2019/7/18 14:26
 *@描述 这是一个
 */
interface UserService {
    fun register(mobile: String, verifyCode: String, pwd: String) :Observable<Boolean>
}