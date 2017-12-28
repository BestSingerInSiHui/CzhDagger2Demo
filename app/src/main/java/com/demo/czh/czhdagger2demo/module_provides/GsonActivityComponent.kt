package com.demo.czh.czhdagger2demo.module_provides

import dagger.Component

/**
 * Created by hasee on 2017/12/5.
 */
@Component(modules = arrayOf(GsonModule::class))
interface GsonActivityComponent {
    fun inject(activity: GsonActivity)
}