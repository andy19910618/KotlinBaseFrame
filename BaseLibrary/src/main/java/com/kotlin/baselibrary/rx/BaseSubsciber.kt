package com.kotlin.baselibrary.rx

import rx.Subscriber

/**
 *@创建者 andy
 *@创建时间 2019/7/18 14:42
 *@描述 这是一个
 */
open class BaseSubsciber<T> : Subscriber<T>() {
    override fun onNext(t: T) {

    }

    override fun onCompleted() {

    }

    override fun onError(e: Throwable?) {

    }
}