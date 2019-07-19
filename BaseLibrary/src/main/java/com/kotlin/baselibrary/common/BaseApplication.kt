package com.kotlin.baselibrary.common

import android.app.Application
import com.kotlin.baselibrary.injection.component.AppComponent
import com.kotlin.baselibrary.injection.component.DaggerActivityComponent
import com.kotlin.baselibrary.injection.component.DaggerAppComponent
import com.kotlin.baselibrary.injection.module.AppModule

/**
 *@创建者 andy
 *@创建时间 2019/7/19 15:31
 *@描述 这是一个
 */
class BaseApplication : Application(){

    lateinit var mAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppInjection()
    }

    private fun initAppInjection() {
        mAppComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()

    }
}