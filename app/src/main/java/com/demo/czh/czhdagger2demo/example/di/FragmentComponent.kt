package com.demo.czh.czhdagger2demo.example.di

import android.app.Fragment
import com.demo.czh.czhdagger2demo.example.di.scope.FragmentScope
import dagger.Component

/**
 * Created by hasee on 2017/12/25.
 */
@FragmentScope
@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {
    fun getFragment(): Fragment
}