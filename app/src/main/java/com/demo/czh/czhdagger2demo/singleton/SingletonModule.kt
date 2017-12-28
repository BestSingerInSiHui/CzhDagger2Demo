package com.demo.czh.czhdagger2demo.singleton

import com.demo.czh.czhdagger2demo.inject_component.Fruits
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by hasee on 2017/12/6.
 */
@Module
class SingletonModule {
    @Provides
    @Singleton
    fun fruits(): Fruits {
        return Fruits()
    }
}