package com.demo.czh.czhdagger2demo.named

import javax.inject.Inject
import javax.inject.Named

/**
 * Created by hasee on 2017/12/5.
 */
class Pets {
    private var cats: String
    private var dogs: String

    @Inject
    constructor(@Named("cats") cats: String, @Named("dogs") dogs: String) {
        this.cats = cats
        this.dogs = dogs
    }

    fun getPets(): String {
        return cats + dogs
    }
}