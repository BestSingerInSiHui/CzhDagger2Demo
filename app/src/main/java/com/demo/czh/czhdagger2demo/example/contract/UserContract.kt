package com.demo.czh.czhdagger2demo.mvp.contract

import com.demo.czh.czhdagger2demo.mvp.entity.User

/**
 * Created by hasee on 2017/12/25.
 */
interface UserContract {
    interface View {
        fun returnUser(user: User)
    }

    interface Presenter {
        fun getUser()
        fun getName():String
    }
}