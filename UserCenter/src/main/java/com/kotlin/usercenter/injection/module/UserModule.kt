package com.kotlin.usercenter.injection.module

import com.kotlin.usercenter.service.UserService
import com.kotlin.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 *@创建者 andy
 *@创建时间 2019/7/19 14:45
 *@描述 这是一个
 */
@Module
class UserModule {

    @Provides
    fun providesUserService(service: UserServiceImpl) : UserService{
        return service
    }

}