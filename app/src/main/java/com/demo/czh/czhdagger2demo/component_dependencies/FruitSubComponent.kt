package com.demo.czh.czhdagger2demo.component_dependencies

import dagger.Subcomponent

/**
 * Created by hasee on 2017/12/21.
 */
@Subcomponent
interface FruitSubComponent {
    fun inject(dependenciesActivity: DependenciesActivity)
}