package com.kotlin.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.kotlin.baselibrary.injection.ActivityScope
import com.kotlin.baselibrary.injection.module.ActivityModule
import com.kotlin.baselibrary.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 *@创建者 andy
 *@创建时间 2019/7/19 15:29
 *@描述 这是一个
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),
    modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun activity(): Activity
}