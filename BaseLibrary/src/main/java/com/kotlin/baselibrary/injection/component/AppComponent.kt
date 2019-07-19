package com.kotlin.baselibrary.injection.component

import android.content.Context
import com.kotlin.baselibrary.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 *@创建者 andy
 *@创建时间 2019/7/19 15:29
 *@描述 这是一个
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun context(): Context
}