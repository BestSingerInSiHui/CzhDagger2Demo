package com.demo.czh.czhdagger2demo.singleton

import dagger.Component
import javax.inject.Singleton

/**
 * Created by hasee on 2017/12/6.
 */
@Singleton
@Component(modules = arrayOf(SingletonModule::class))
interface SingletonActicityComponent {
    fun inject(acitivity: SingletonActivity)
    fun inject(acitivity: Singleton2Activity)
}