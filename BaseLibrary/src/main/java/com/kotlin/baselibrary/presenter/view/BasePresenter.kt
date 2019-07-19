package com.kotlin.baselibrary.presenter.view

import com.trello.rxlifecycle.LifecycleProvider
import javax.inject.Inject

/**
 *@创建者 andy
 *@创建时间 2019/7/18 10:51
 *@描述 这是一个
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView : T
    @Inject
    lateinit var activity: LifecycleProvider<*>
}