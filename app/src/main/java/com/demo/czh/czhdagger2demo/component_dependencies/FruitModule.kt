package com.demo.czh.czhdagger2demo.component_dependencies

import com.demo.czh.czhdagger2demo.inject_component.Fruits
import dagger.Module
import dagger.Provides

/**
 * Created by hasee on 2017/12/20.
 */
@Module
class FruitModule {
    @Provides
    fun provideFruit(): String {
        return "草莓"
    }
}