package com.demo.czh.czhdagger2demo.example.di

import com.demo.czh.czhdagger2demo.mvp.contract.UserContract
import com.demo.czh.czhdagger2demo.mvp.entity.User
import com.demo.czh.czhdagger2demo.mvp.model.UserModel
import com.demo.czh.czhdagger2demo.mvp.presenter.UserPresenter
import dagger.Module
import dagger.Provides


/**
 * Created by hasee on 2017/12/19.
 */
@Module
class UserModule(var mView: UserContract.View) {
    @Provides
    fun provideView(): UserContract.View {
        return mView
    }
}