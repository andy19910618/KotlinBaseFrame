package com.kotlin.baselibrary.ext

import com.kotlin.baselibrary.rx.BaseSubsciber
import com.trello.rxlifecycle.LifecycleProvider
import com.trello.rxlifecycle.kotlin.bindToLifecycle
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.*

/**
 *@创建者 andy
 *@创建时间 2019/7/18 12:24
 *@描述 这是一个
 */

fun <T> Observable<T>.execute(subsciber: BaseSubsciber<T>,
                              activity: LifecycleProvider<*>) {
    this.observeOn(AndroidSchedulers.mainThread())
        .compose(activity.bindToLifecycle())
        .subscribeOn(Schedulers.io())
        .subscribe(subsciber)
}