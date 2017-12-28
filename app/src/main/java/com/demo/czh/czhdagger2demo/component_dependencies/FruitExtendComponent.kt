package com.demo.czh.czhdagger2demo.component_dependencies

import dagger.Component

/**
 * Created by hasee on 2017/12/21.
 */
@Component(modules = arrayOf(FruitModule::class))
interface FruitExtendComponent : FruitComponent {
    fun inject(dependenciesActivity: DependenciesActivity)
}