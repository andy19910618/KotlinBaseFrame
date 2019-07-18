package com.kotlin.usercenter.protocol

import com.kotlin.baselibrary.data.protocol.BaseResponse

/**
 *@创建者 andy
 *@创建时间 2019/7/18 16:10
 *@描述 这是一个
 */
data class RegisterReq(val mobile : String, val pwd:String ,val verityCode : String)