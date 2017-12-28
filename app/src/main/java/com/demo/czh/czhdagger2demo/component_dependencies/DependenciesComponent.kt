package com.demo.czh.czhdagger2demo.component_dependencies

import com.demo.czh.czhdagger2demo.inject_component.FruitsActivityComponent
import dagger.Component
import dagger.Subcomponent

/**
 * Created by hasee on 2017/12/20.
 */
@Component(dependencies = arrayOf(FruitComponent::class))
interface DependenciesComponent {
    fun inject(dependenciesActivity: DependenciesActivity)
}