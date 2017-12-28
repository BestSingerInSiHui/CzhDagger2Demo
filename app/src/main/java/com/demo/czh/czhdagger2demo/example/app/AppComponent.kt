package com.demo.czh.czhdagger2demo.example.app

import com.demo.czh.czhdagger2demo.ToastUtil
import dagger.Component
import javax.inject.Singleton

/**
 * Created by hasee on 2017/12/18.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun getToastUtil(): ToastUtil
}