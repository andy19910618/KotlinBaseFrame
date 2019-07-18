package com.kotlin.baselibrary.presenter.view

/**
 *@创建者 andy
 *@创建时间 2019/7/18 10:51
 *@描述 这是一个
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView : T
}