package com.demo.czh.czhdagger2demo.abstract_module_provides

import dagger.Component

/**
 * Created by hasee on 2017/12/5.
 */
@Component(modules = arrayOf(FoodModule::class))
interface FoodActivityComponent {
    fun inject(activity: FoodActivity)
}