package com.demo.czh.czhdagger2demo.abstract_module_provides

import dagger.Module
import dagger.Provides

/**
 * Created by hasee on 2017/12/5.
 */
@Module
class FoodModule {
    @Provides
    fun provideFood(): Food {
        return Beef()
    }
}