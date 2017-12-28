package com.demo.czh.czhdagger2demo.qualifier

import dagger.Component

/**
 * Created by hasee on 2017/12/6.
 */
@Component(modules = arrayOf(ColorModule::class))
interface ColorActivityComponent {
    fun inject(activity: ColorActivity)
}