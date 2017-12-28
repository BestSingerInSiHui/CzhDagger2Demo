package com.demo.czh.czhdagger2demo.example.di

import android.app.Activity
import com.demo.czh.czhdagger2demo.example.app.AppComponent
import com.demo.czh.czhdagger2demo.example.di.scope.ActivityScope
import dagger.Component

/**
 * Created by hasee on 2017/12/18.
 */
@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun getActivity(): Activity
}