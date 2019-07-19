package com.kotlin.baselibrary.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.kotlin.baselibrary.common.BaseApplication
import com.kotlin.baselibrary.injection.component.ActivityComponent
import com.kotlin.baselibrary.injection.component.DaggerActivityComponent
import com.kotlin.baselibrary.injection.module.ActivityModule
import com.kotlin.baselibrary.presenter.view.BasePresenter
import com.kotlin.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 *@创建者 andy
 *@创建时间 2019/7/18 11:02
 *@描述 这是一个
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    @Inject
    lateinit var mPresenter: T

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
    }

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
            .appComponent((application as BaseApplication).mAppComponent)
            .activityModule(
                ActivityModule(this)
            ).build()
    }

    override fun hideLoding() {

    }

    override fun onError() {

    }

    override fun showLoding() {

    }
}