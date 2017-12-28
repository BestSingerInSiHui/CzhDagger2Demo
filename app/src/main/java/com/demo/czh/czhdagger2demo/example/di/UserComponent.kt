package com.demo.czh.czhdagger2demo.example.di


import com.demo.czh.czhdagger2demo.example.di.scope.ActivityScope
import com.demo.czh.czhdagger2demo.example.app.AppComponent
import com.demo.czh.czhdagger2demo.example.view.UserActivity
import dagger.Component

/**
 * Created by hasee on 2017/12/19.
 */

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(UserModule::class, ActivityModule::class))
interface UserComponent : ActivityComponent {
    fun inject(activity: UserActivity)
    fun userFragmentComponent(): UserFramentComponent
}