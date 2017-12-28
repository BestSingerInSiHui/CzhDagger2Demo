package com.demo.czh.czhdagger2demo.inject_component

import dagger.Component

/**
 * Created by hasee on 2017/12/5.
 */
@Component
interface FruitsActivityComponent {
    fun inject(activity: FruitsActivity)
}