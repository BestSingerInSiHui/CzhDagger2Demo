package com.demo.czh.czhdagger2demo.named

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by hasee on 2017/12/5.
 */
@Module
class PetsModule {
    @Provides
    @Named("cats")
    fun cats(): String {
        return "猫"
    }

    @Provides
    @Named("dogs")
    fun dogs(): String {
        return "狗"
    }
}