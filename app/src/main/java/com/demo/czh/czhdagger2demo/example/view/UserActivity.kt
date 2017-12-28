package com.demo.czh.czhdagger2demo.example.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demo.czh.czhdagger2demo.R
import com.demo.czh.czhdagger2demo.ToastUtil
import com.demo.czh.czhdagger2demo.example.di.DaggerUserComponent
import com.demo.czh.czhdagger2demo.example.di.UserComponent
import com.demo.czh.czhdagger2demo.example.di.UserModule
import com.demo.czh.czhdagger2demo.mvp.contract.UserContract
import com.demo.czh.czhdagger2demo.example.di.ActivityModule
import com.demo.czh.czhdagger2demo.example.app.App
import com.demo.czh.czhdagger2demo.mvp.entity.User
import com.demo.czh.czhdagger2demo.mvp.presenter.UserPresenter
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/18.
 */
class UserActivity : AppCompatActivity(), UserContract.View {
    @Inject
    lateinit var toastUtil: ToastUtil
    @Inject
    lateinit var mPresenter: UserPresenter

    private lateinit var daggerComponent: UserComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        daggerComponent = DaggerUserComponent.builder().appComponent(App.instance.getAppComponent()).activityModule(ActivityModule(this)).userModule(UserModule(this)).build()
        daggerComponent.inject(this)
        mPresenter.getUser()
    }

    fun getUserComponent(): UserComponent {
        return daggerComponent
    }

    override fun returnUser(user: User) {
        toastUtil.showToast("${user.getName()}")
    }

}