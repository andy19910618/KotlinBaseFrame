package com.kotlin.usercenter.repository

import com.kotlin.baselibrary.data.net.RetrofitFactory
import com.kotlin.baselibrary.data.protocol.BaseResponse
import com.kotlin.usercenter.data.api.UserApi
import com.kotlin.usercenter.protocol.RegisterReq
import rx.Observable
import javax.inject.Inject

/**
 *@创建者 andy
 *@创建时间 2019/7/18 17:11
 *@描述 这是一个
 */
class UserRepository @Inject constructor() {

    fun register(mobile: String, verifyCode: String, pwd: String): Observable<BaseResponse<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
            .register(RegisterReq(mobile, pwd, verifyCode))
    }
}