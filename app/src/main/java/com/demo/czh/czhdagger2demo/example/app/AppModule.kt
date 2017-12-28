package com.demo.czh.czhdagger2demo.example.app

import android.content.Context
import com.demo.czh.czhdagger2demo.ToastUtil
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by hasee on 2017/12/18.
 */

@Module
class AppModule {
    private var context: Context

    constructor(context: Context) {
        this.context = context
    }

    @Provides
    @Singleton
    fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    fun provideToastUtil(): ToastUtil {
        return ToastUtil(context)
    }
}