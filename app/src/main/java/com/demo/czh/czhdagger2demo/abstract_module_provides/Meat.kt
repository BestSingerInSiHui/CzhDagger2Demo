package com.demo.czh.czhdagger2demo.abstract_module_provides

import javax.inject.Inject

/**
 * Created by hasee on 2017/12/5.
 */
class Meat {
    private var food: Food

    @Inject
    constructor(food: Food) {
        this.food = food
    }

    fun getFood(): String {
        return food.meat()
    }
}