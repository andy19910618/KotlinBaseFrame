package com.kotlin.baselibrary.injection.module

import android.content.Context
import com.kotlin.baselibrary.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *@创建者 andy
 *@创建时间 2019/7/19 15:30
 *@描述 这是一个
 */
@Module
class AppModule(private val context: BaseApplication) {

    @Provides
    @Singleton
    fun providesContext(): Context {
        return context
    }
}