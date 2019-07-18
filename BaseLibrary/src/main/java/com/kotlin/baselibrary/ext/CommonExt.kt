package com.kotlin.baselibrary.ext

import com.kotlin.baselibrary.rx.BaseSubsciber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.*

/**
 *@创建者 andy
 *@创建时间 2019/7/18 12:24
 *@描述 这是一个
 */

fun <T> Observable<T>.execute(subsciber: BaseSubsciber<T>) {
    this.observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .subscribe(subsciber)
}