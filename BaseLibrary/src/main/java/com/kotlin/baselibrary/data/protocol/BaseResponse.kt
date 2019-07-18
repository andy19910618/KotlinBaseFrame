package com.kotlin.baselibrary.data.protocol

/**
 *@创建者 andy
 *@创建时间 2019/7/18 16:03
 *@描述 这是一个
 */
class BaseResponse<T>(val status: Int, val message: String, val data: T)