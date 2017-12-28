package com.demo.czh.czhdagger2demo.named

import dagger.Component

/**
 * Created by hasee on 2017/12/6.
 */
@Component(modules = arrayOf(PetsModule::class))
interface PetsActivityComponent {
    fun inject(activity: PetsActivity)
}