package com.demo.czh.czhdagger2demo.mvp.entity

import javax.inject.Inject
import kotlin.math.sign

/**
 * Created by hasee on 2017/12/25.
 */

class User {
    private lateinit var name: String
    private lateinit var age: String
    private lateinit var sex: String

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAge(): String? {
        return age
    }

    fun setAge(age: String) {
        this.age = age
    }

    fun getSex(): String? {
        return sex
    }

    fun setSex(sex: String) {
        this.sex = sex
    }
}



