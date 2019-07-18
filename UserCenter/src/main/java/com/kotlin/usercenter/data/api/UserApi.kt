package com.kotlin.usercenter.data.api

import com.kotlin.baselibrary.data.protocol.BaseResponse
import com.kotlin.usercenter.protocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable
import java.util.*

/**
 *@创建者 andy
 *@创建时间 2019/7/18 16:06
 *@描述 这是一个
 */
interface UserApi {

    @POST("userCenter/register")
    fun register(@Body req: RegisterReq) : Observable<BaseResponse<String>>
}