package com.kotlin.baselibrary.data.net

import com.kotlin.baselibrary.common.BaseConstant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 *@创建者 andy
 *@创建时间 2019/7/18 15:31
 *@描述 这是一个 网络请求工厂
 */
class RetrofitFactory private constructor() {
    companion object {
        val instance: RetrofitFactory by lazy {
            RetrofitFactory()
        }
    }

    private var retrofit: Retrofit
    private val interceptor: Interceptor

    init {
        interceptor = Interceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader("Content_Type", "application/json")
                .addHeader("charset", "UTF-8")
//                .addHeader("token",AppPrefsUtils.getString(BaseConstant.KEY_SP_TOKEN))
                .build()
            chain.proceed(request)
        }


        retrofit = Retrofit.Builder()
            .baseUrl(BaseConstant.serverUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .client(initClient())
            .build()
    }

    private fun initClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .addInterceptor(initLogInterceptor())
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .build()
    }

    /**
     * 初始化 日志拦截器
     */
    private fun initLogInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        return interceptor
    }


    fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }

}