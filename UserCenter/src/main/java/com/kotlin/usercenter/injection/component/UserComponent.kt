package com.kotlin.usercenter.injection.component

import com.kotlin.baselibrary.injection.PreComponentSocpe
import com.kotlin.baselibrary.injection.component.ActivityComponent
import com.kotlin.baselibrary.ui.activity.BaseMvpActivity
import com.kotlin.usercenter.injection.module.UserModule
import com.kotlin.usercenter.ui.activity.RegisterActivity
import dagger.Component

/**
 *@创建者 andy
 *@创建时间 2019/7/19 14:56
 *@描述 这是一个
 */
@PreComponentSocpe
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(UserModule::class))
interface UserComponent{
    fun  inject (activity: RegisterActivity)
}