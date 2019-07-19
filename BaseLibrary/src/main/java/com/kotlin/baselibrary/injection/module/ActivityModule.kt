package com.kotlin.baselibrary.injection.module

import android.app.Activity
import android.content.Context
import com.kotlin.baselibrary.common.BaseApplication
import com.kotlin.baselibrary.injection.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *@创建者 andy
 *@创建时间 2019/7/19 15:30
 *@描述 这是一个
 */
@Module
class ActivityModule(private val activity: Activity) {

    @ActivityScope
    @Provides
    fun providesActivity(): Activity {
        return activity
    }
}