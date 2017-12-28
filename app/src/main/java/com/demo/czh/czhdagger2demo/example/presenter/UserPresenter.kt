package com.demo.czh.czhdagger2demo.mvp.presenter

import com.demo.czh.czhdagger2demo.mvp.contract.UserContract
import com.demo.czh.czhdagger2demo.mvp.model.UserModel
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/25.
 */
class UserPresenter : UserContract.Presenter {
    private var mModel: UserModel
    private var mView: UserContract.View

    @Inject
    constructor(mModel: UserModel, mView: UserContract.View) {
        this.mModel = mModel
        this.mView = mView
    }

    override fun getUser() {
        mView.returnUser(mModel.getUser())
    }

    override fun getName(): String {
        return "${mModel.getUser().getName()}"
    }
}