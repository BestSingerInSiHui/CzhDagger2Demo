package com.demo.czh.czhdagger2demo.mvp.model

import com.demo.czh.czhdagger2demo.mvp.entity.User
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/25.
 */
class UserModel {

    @Inject
    constructor()

    fun getUser(): User {
        var user = User()
        user.setName("czh")
        user.setAge("23")
        user.setSex("man")
        return user
    }
}