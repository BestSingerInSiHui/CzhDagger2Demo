package com.demo.czh.czhdagger2demo.qualifier

import javax.inject.Inject

/**
 * Created by hasee on 2017/12/6.
 */
class Color {
    private var color: Int

    @Inject
    constructor(@Blue color: Int) {
        this.color = color
    }

    fun getColor(): Int {
        return color
    }
}