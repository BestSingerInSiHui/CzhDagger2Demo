package com.demo.czh.czhdagger2demo.example.view

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.czh.czhdagger2demo.R
import com.demo.czh.czhdagger2demo.ToastUtil
import com.demo.czh.czhdagger2demo.example.app.App
import com.demo.czh.czhdagger2demo.example.di.ActivityModule
import com.demo.czh.czhdagger2demo.example.di.DaggerUserComponent
import com.demo.czh.czhdagger2demo.example.di.UserModule
import com.demo.czh.czhdagger2demo.mvp.contract.UserContract
import com.demo.czh.czhdagger2demo.mvp.entity.User
import com.demo.czh.czhdagger2demo.mvp.presenter.UserPresenter
import kotlinx.android.synthetic.main.activity_fruits.*
import javax.inject.Inject

/**
 * Created by hasee on 2017/12/25.
 */
class UserFragment : Fragment() {
    @Inject
    lateinit var mPresenter: UserPresenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view = inflater!!.inflate(R.layout.activity_fruits, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var mActivity = activity as UserActivity
        mActivity.getUserComponent().userFragmentComponent().inject(this)
        textview.setText(mPresenter.getName())
    }
}