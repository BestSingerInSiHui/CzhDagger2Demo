package com.demo.czh.czhdagger2demo.qualifier

import android.graphics.Color
import dagger.Module
import dagger.Provides

/**
 * Created by hasee on 2017/12/6.
 */
@Module
class ColorModule {
    @Provides
    @Yellow
    fun yellow(): Int {
        return Color.YELLOW
    }

    @Provides
    @Blue
    fun blue(): Int {
        return Color.BLUE
    }
}