package com.demo.czh.czhdagger2demo.component_dependencies

import dagger.Component

/**
 * Created by hasee on 2017/12/20.
 */
@Component(modules = arrayOf(FruitModule::class))
interface FruitComponent {
    fun getFruit(): String

    fun fruitSubComponent(): FruitSubComponent
}