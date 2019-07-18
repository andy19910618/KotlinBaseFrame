package com.kotlin.baselibrary.ui.activity

import com.kotlin.baselibrary.presenter.view.BasePresenter
import com.kotlin.baselibrary.presenter.view.BaseView

/**
 *@创建者 andy
 *@创建时间 2019/7/18 11:02
 *@描述 这是一个
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(),BaseView{
    lateinit var mPresenter: T

    override fun hideLoding() {

    }

    override fun onError() {

    }

    override fun showLoding() {

    }
}